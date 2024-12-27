
package net.mcreator.radiant.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.radiant.procedures.IlluminationOnEffectActiveTickProcedure;

import java.util.Set;

public class IlluminationTruthwatcherMobEffect extends MobEffect {
	public IlluminationTruthwatcherMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -15908318);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		IlluminationOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
