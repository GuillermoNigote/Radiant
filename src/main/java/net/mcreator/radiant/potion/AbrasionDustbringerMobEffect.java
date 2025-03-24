
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.radiant.procedures.AbrasionOnEffectActiveTickProcedure;
import net.mcreator.radiant.procedures.AbrasionEffectStartedappliedProcedure;

public class AbrasionDustbringerMobEffect extends MobEffect {
	public AbrasionDustbringerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3600882);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		AbrasionEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		AbrasionOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
