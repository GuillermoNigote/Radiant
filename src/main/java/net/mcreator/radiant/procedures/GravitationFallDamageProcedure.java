package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.radiant.init.RadiantModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GravitationFallDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity) {
		execute(null, damagesource, entity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER))
				&& damagesource.is(DamageTypes.FALL)) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
		}
	}
}
