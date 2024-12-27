
package net.mcreator.radiant.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.radiant.procedures.GravitationOnEffectActiveTickProcedure;
import net.mcreator.radiant.procedures.GravitationEffectStartedappliedProcedure;

import java.util.Set;

public class GravitationWindrunnerMobEffect extends MobEffect {
	public GravitationWindrunnerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16764007);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
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
