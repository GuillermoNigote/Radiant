package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class ShardplateBondableHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.UNOATHED_WEARING_SHARDPLATE))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.UNOATHED_WEARING_SHARDPLATE, (int) Double.POSITIVE_INFINITY, 0));
		}
	}
}
