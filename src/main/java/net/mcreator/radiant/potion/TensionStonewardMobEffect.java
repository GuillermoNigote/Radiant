
package net.mcreator.radiant.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

public class TensionStonewardMobEffect extends MobEffect {
	public TensionStonewardMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39410);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}
}
