package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;

public class AbrasionEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
			_livingEntity0.getAttribute(Attributes.STEP_HEIGHT).setBaseValue(1);
		{
			RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
			_vars.xant = entity.getX();
			_vars.syncPlayerVariables(entity);
		}
		{
			RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
			_vars.yant = entity.getY();
			_vars.syncPlayerVariables(entity);
		}
		{
			RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
			_vars.zant = entity.getZ();
			_vars.syncPlayerVariables(entity);
		}
	}
}
