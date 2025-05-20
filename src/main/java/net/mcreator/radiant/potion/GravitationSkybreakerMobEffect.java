
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.radiant.procedures.GravitationOnEffectActiveTickProcedure;
import net.mcreator.radiant.procedures.GravitationEffectStartedappliedProcedure;
import net.mcreator.radiant.init.RadiantModParticleTypes;

public class GravitationSkybreakerMobEffect extends MobEffect {
	public GravitationSkybreakerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -11317671);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return (SimpleParticleType) (RadiantModParticleTypes.INVISIBLE_RADIANT_PARTICLE.get());
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
