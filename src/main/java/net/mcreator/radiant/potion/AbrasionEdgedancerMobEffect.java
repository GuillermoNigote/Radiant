
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.radiant.procedures.AbrasionOnEffectActiveTickProcedure;
import net.mcreator.radiant.procedures.AbrasionEffectStartedappliedProcedure;
import net.mcreator.radiant.init.RadiantModParticleTypes;
import net.mcreator.radiant.RadiantMod;

public class AbrasionEdgedancerMobEffect extends MobEffect {
	public AbrasionEdgedancerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -199183);
		this.addAttributeModifier(Attributes.STEP_HEIGHT, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.abrasion_edgedancer_0"), 1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return (SimpleParticleType) (RadiantModParticleTypes.INVISIBLE_RADIANT_PARTICLE.get());
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
