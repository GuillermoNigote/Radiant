package net.mcreator.radiant.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.radiant.init.RadiantModParticleTypes;

public class DivisionDustbringerMobEffect extends MobEffect {
	public DivisionDustbringerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3470067);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return (SimpleParticleType) (RadiantModParticleTypes.INVISIBLE_RADIANT_PARTICLE.get());
	}
}