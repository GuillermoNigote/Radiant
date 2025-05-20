
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.radiant.procedures.ProgressionOnEffectActiveTickProcedure;
import net.mcreator.radiant.init.RadiantModParticleTypes;

public class ProgressionTruthwatcherMobEffect extends MobEffect {
	public ProgressionTruthwatcherMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -15842268);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return (SimpleParticleType) (RadiantModParticleTypes.INVISIBLE_RADIANT_PARTICLE.get());
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
