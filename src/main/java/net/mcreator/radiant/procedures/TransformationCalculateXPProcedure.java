package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;

public class TransformationCalculateXPProcedure {
	public static double execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return 0;
		return 7 + (entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant - x) * (entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant - x)
				+ (entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - y) * (entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - y)
				+ (entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant - z) * (entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant - z);
	}
}