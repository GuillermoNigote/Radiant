package net.mcreator.radiant.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

public class IlluminationAnimalIlusionOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0) {
			if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 4) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(1));
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tp @e[name=] @s");
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
		}
	}
}
