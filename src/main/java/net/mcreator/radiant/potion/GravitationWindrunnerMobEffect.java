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

public class GravitationWindrunnerMobEffect extends MobEffect {
	public GravitationWindrunnerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16764007);
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