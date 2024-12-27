package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.init.RadiantModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OnSurgeJumpProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.ABRASION_EDGEDANCER)) {
			entity.setDeltaMovement(new Vec3((2.5 * entity.getDeltaMovement().x()), 0.5, (2.5 * entity.getDeltaMovement().z())));
		}
		if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER) || entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER)) {
			entity.setNoGravity(true);
		}
	}
}
