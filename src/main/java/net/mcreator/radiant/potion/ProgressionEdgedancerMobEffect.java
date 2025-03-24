
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.radiant.procedures.ProgressionOnEffectActiveTickProcedure;

public class ProgressionEdgedancerMobEffect extends MobEffect {
	public ProgressionEdgedancerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -396305);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		ProgressionOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
