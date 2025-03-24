
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.radiant.procedures.IlluminationOnEffectActiveTickProcedure;

public class IlluminationTruthwatcherMobEffect extends MobEffect {
	public IlluminationTruthwatcherMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -15908318);
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
