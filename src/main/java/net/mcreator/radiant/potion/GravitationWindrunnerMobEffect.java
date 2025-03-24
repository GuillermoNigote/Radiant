
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.radiant.procedures.GravitationOnEffectActiveTickProcedure;
import net.mcreator.radiant.procedures.GravitationEffectStartedappliedProcedure;

public class GravitationWindrunnerMobEffect extends MobEffect {
	public GravitationWindrunnerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16764007);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		GravitationEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		GravitationOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
