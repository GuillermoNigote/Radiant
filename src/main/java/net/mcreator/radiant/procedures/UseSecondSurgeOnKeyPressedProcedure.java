package net.mcreator.radiant.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.radiant.init.RadiantModMobEffects;

import java.util.Comparator;

public class UseSecondSurgeOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean NearKnight = false;
		if (getEntityScore("Oath", entity) != -2) {
			if (getEntityScore("Oath", entity) == 0) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (getEntityScore("Oath", entityiterator) > 2
								&& (entityiterator instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
										? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
										: "")
										.equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
												? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
												: "")) {
							NearKnight = true;
							break;
						}
					}
				}
				if (NearKnight) {
					if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Dustbringers")) {
						if (getEntityScore("Oath", entity) >= 3) {
							if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER)) {
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER);
							} else {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"effect give @s radiant:division_dustbringer infinite 0 false");
									}
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Edgedancers")) {
						if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:progression_edgedancer infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Willshapers")) {
						if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transportation_willshaper infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Stonewards")) {
						if (entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(RadiantModMobEffects.TENSION_STONEWARD)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.TENSION_STONEWARD);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:tension_stoneward infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Truthwatchers")) {
						if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:progression_truthwatcher infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Skybreakers")) {
						if (getEntityScore("Oath", entity) >= 3) {
							if (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(RadiantModMobEffects.DIVISION_SKYBREAKER)) {
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(RadiantModMobEffects.DIVISION_SKYBREAKER);
							} else {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"effect give @s radiant:division_skybreaker infinite 0 false");
									}
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Windrunners")) {
						if (entity instanceof LivingEntity _livEnt33 && _livEnt33.hasEffect(RadiantModMobEffects.ADHESION_WINDRUNNER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.ADHESION_WINDRUNNER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:adhesion_windrunner infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Lightweavers")) {
						if (entity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transformation_lightweaver infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Elsecallers")) {
						if (entity instanceof LivingEntity _livEnt41 && _livEnt41.hasEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transformation_elsecaller infinite 0 false");
								}
							}
						}
					}
				}
			} else {
				if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Dustbringers")) {
					if (getEntityScore("Oath", entity) >= 3) {
						if (entity instanceof LivingEntity _livEnt46 && _livEnt46.hasEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:division_dustbringer infinite 0 false");
								}
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Edgedancers")) {
					if (entity instanceof LivingEntity _livEnt50 && _livEnt50.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER);
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:progression_edgedancer infinite 0 false");
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Willshapers")) {
					if (entity instanceof LivingEntity _livEnt54 && _livEnt54.hasEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER);
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transportation_willshaper infinite 0 false");
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Stonewards")) {
					if (entity instanceof LivingEntity _livEnt58 && _livEnt58.hasEffect(RadiantModMobEffects.TENSION_STONEWARD)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.TENSION_STONEWARD);
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:tension_stoneward infinite 0 false");
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Truthwatchers")) {
					if (entity instanceof LivingEntity _livEnt62 && _livEnt62.hasEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER);
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:progression_truthwatcher infinite 0 false");
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Skybreakers")) {
					if (getEntityScore("Oath", entity) >= 3) {
						if (entity instanceof LivingEntity _livEnt67 && _livEnt67.hasEffect(RadiantModMobEffects.DIVISION_SKYBREAKER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.DIVISION_SKYBREAKER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:division_skybreaker infinite 0 false");
								}
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Windrunners")) {
					if (entity instanceof LivingEntity _livEnt71 && _livEnt71.hasEffect(RadiantModMobEffects.ADHESION_WINDRUNNER)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.ADHESION_WINDRUNNER);
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:adhesion_windrunner infinite 0 false");
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Lightweavers")) {
					if (entity instanceof LivingEntity _livEnt75 && _livEnt75.hasEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER);
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transformation_lightweaver infinite 0 false");
							}
						}
					}
				} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Elsecallers")) {
					if (entity instanceof LivingEntity _livEnt79 && _livEnt79.hasEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER)) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER);
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transformation_elsecaller infinite 0 false");
							}
						}
					}
				}
			}
		}
	}

	private static int getEntityScore(String score, Entity entity) {
		Scoreboard scoreboard = entity.level().getScoreboard();
		Objective scoreboardObjective = scoreboard.getObjective(score);
		if (scoreboardObjective != null)
			return scoreboard.getOrCreatePlayerScore(ScoreHolder.forNameOnly(entity.getScoreboardName()), scoreboardObjective).get();
		return 0;
	}
}