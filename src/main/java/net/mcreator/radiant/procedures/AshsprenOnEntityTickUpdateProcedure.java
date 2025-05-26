package net.mcreator.radiant.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class AshsprenOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("ashsprencounter") == 6) {
			entity.getPersistentData().putDouble("ashsprencounter", 0);
			world.levelEvent(2001, BlockPos.containing(x, y - 1, z), Block.getId((world.getBlockState(BlockPos.containing(x, y - 1, z)))));
		} else {
			entity.getPersistentData().putDouble("ashsprencounter", (entity.getPersistentData().getDouble("ashsprencounter") + 1));
		}
	}
}
