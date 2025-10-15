package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class SummoningShardplateOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.SUMMONING_SHARDPLATE_FIRST);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.SUMMONING_SHARDPLATE_SECOND, 3, 0));
		}
	}
}