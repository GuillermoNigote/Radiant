package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.radiant.init.RadiantModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SurgeHitEntityProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER) || sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.ABRASION_EDGEDANCER))
				&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem() && (sourceentity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1) {
			if (sourceentity instanceof Player _player)
				_player.giveExperiencePoints(-(5));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.ABRASION_SLIPPERY, 80, 0));
		} else if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(RadiantModMobEffects.ADHESION_WINDRUNNER) && entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER)
				&& (damagesource.is(DamageTypes.ARROW) || damagesource.is(DamageTypes.MOB_PROJECTILE)) && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(5));
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
		}
	}
}