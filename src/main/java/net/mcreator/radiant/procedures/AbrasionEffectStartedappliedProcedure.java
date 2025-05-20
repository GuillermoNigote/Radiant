package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;

public class AbrasionEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
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
