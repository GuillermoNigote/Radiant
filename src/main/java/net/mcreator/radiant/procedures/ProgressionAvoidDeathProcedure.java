package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.radiant.init.RadiantModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ProgressionAvoidDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER) || entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER)) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(1);
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.ABRASION_EDGEDANCER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.ADHESION_WINDRUNNER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.TENSION_STONEWARD);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.COHESION_STONEWARD);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.COHESION_WILLSHAPER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.DIVISION_SKYBREAKER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER);
			}
		}
	}
}
