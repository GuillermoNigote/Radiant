package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;

public class GravitationSkybreakersEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
			_vars.xant = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
			_vars.yant = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
			_vars.zant = 0;
			_vars.syncPlayerVariables(entity);
		}
		entity.setNoGravity(false);
	}
}
