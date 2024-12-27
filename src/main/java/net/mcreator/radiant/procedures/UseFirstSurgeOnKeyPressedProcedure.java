package net.mcreator.radiant.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class UseFirstSurgeOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
				return 0;
			}
		}.getScore("Oath", entity) >= 1) {
			if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Dustbringers")) {
				if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:abrasion_dustbringer infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Edgedancers")) {
				if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(RadiantModMobEffects.ABRASION_EDGEDANCER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ABRASION_EDGEDANCER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:abrasion_edgedancer infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Willshapers")) {
				if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.COHESION_WILLSHAPER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:cohesion_willshaper infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Stonewards")) {
				if (entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(RadiantModMobEffects.COHESION_STONEWARD)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.COHESION_STONEWARD);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:cohesion_stoneward infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Truthwatchers")) {
				if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION) && entity.isShiftKeyDown()) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
				}
				if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:illumination_truthwatcher infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Skybreakers")) {
				if (entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:gravitation_skybreaker infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Windrunners")) {
				if (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:gravitation_windrunner infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Lightweavers")) {
				if (entity instanceof LivingEntity _livEnt33 && _livEnt33.hasEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION) && entity.isShiftKeyDown()) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
				}
				if (entity instanceof LivingEntity _livEnt36 && _livEnt36.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:illumination_lightweaver infinite 0 false");
						}
					}
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("Elsecallers")) {
				if (entity instanceof LivingEntity _livEnt40 && _livEnt40.hasEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transportation_elsecaller infinite 0 false");
						}
					}
				}
			}
		}
	}
}
