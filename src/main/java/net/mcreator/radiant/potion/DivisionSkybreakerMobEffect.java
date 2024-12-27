
package net.mcreator.radiant.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

public class DivisionSkybreakerMobEffect extends MobEffect {
	public DivisionSkybreakerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -11317671);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}
}
