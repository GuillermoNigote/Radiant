package net.mcreator.radiant.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.network.RadiantModVariables;

public class AshsprenOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 6) {
			world.levelEvent(2001, BlockPos.containing(x, y - 1, z), Block.getId((world.getBlockState(BlockPos.containing(x, y - 1, z)))));
		}
	}
}
