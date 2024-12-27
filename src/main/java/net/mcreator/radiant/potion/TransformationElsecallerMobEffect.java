
package net.mcreator.radiant.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

public class TransformationElsecallerMobEffect extends MobEffect {
	public TransformationElsecallerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16750951);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}
}
