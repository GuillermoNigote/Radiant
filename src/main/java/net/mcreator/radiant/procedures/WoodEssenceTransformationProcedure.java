package net.mcreator.radiant.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.radiant.network.RadiantModVariables;

public class WoodEssenceTransformationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (entity instanceof Player _player)
			_player.giveExperiencePoints(-((int) (20 * Math.sqrt((entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant - x) * (entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant - x)
					+ (entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - y) * (entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - y)
					+ (entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant - z) * (entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant - z)))));
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("fill " + (((Math.round(entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant) + " ") + "" + (Math.round(entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant) + " ")) + ""
								+ ((Math.round(entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant) + "" + ((" " + Math.round(x)) + "" + (" " + Math.round(y)))) + ""
										+ ((" " + Math.round(z)) + "" + (" oak_wood replace " + BuiltInRegistries.BLOCK.getKey((world.getBlockState(
												BlockPos.containing(entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant, entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant, entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant)))
												.getBlock()).toString()))))));
			}
		}
	}
}
