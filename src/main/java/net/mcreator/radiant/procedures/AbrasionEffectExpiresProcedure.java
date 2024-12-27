package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AbrasionEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
			_livingEntity0.getAttribute(Attributes.STEP_HEIGHT).setBaseValue(0);
	}
}
