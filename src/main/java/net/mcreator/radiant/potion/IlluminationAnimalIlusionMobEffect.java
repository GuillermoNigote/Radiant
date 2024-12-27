
package net.mcreator.radiant.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.radiant.procedures.IlluminationAnimalIlusionOnEffectActiveTickProcedure;

public class IlluminationAnimalIlusionMobEffect extends MobEffect {
	public IlluminationAnimalIlusionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -15908318);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		IlluminationAnimalIlusionOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
