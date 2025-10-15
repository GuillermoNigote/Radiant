package net.mcreator.radiant.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SummoningShardplateSecondOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			SummonShardplateManagerProcedure.execute(world, x, y, z, entity);
		}
	}
}