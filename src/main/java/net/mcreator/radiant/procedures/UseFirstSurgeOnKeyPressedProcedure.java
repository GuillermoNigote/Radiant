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

public class UseFirstSurgeOnKeyPressedProcedure {
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
						if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:abrasion_dustbringer infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Edgedancers")) {
						if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(RadiantModMobEffects.ABRASION_EDGEDANCER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.ABRASION_EDGEDANCER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:abrasion_edgedancer infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Willshapers")) {
						if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.COHESION_WILLSHAPER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:cohesion_willshaper infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Stonewards")) {
						if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(RadiantModMobEffects.COHESION_STONEWARD)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.COHESION_STONEWARD);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:cohesion_stoneward infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Truthwatchers")) {
						if (entity instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION) && entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
						}
						if (entity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:illumination_truthwatcher infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Skybreakers")) {
						if (entity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:gravitation_skybreaker infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Windrunners")) {
						if (entity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:gravitation_windrunner infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Lightweavers")) {
						if (entity instanceof LivingEntity _livEnt38 && _livEnt38.hasEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION) && entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
						}
						if (entity instanceof LivingEntity _livEnt41 && _livEnt41.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:illumination_lightweaver infinite 0 false");
								}
							}
						}
					} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("Elsecallers")) {
						if (entity instanceof LivingEntity _livEnt45 && _livEnt45.hasEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER)) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER);
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect give @s radiant:transportation_elsecaller infinite 0 false");
								}
							}
						}
					}
				}
			} else {
				if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("Dustbringers")) {
					if (entity instanceof LivingEntity _livEnt49 && _livEnt49.hasEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER)) {
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
					if (entity instanceof LivingEntity _livEnt53 && _livEnt53.hasEffect(RadiantModMobEffects.ABRASION_EDGEDANCER)) {
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
					if (entity instanceof LivingEntity _livEnt57 && _livEnt57.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER)) {
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
					if (entity instanceof LivingEntity _livEnt61 && _livEnt61.hasEffect(RadiantModMobEffects.COHESION_STONEWARD)) {
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
					if (entity instanceof LivingEntity _livEnt65 && _livEnt65.hasEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION) && entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
					}
					if (entity instanceof LivingEntity _livEnt68 && _livEnt68.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER)) {
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
					if (entity instanceof LivingEntity _livEnt72 && _livEnt72.hasEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER)) {
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
					if (entity instanceof LivingEntity _livEnt76 && _livEnt76.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER)) {
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
					if (entity instanceof LivingEntity _livEnt80 && _livEnt80.hasEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION) && entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
					}
					if (entity instanceof LivingEntity _livEnt83 && _livEnt83.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER)) {
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
					if (entity instanceof LivingEntity _livEnt87 && _livEnt87.hasEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER)) {
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

	private static int getEntityScore(String score, Entity entity) {
		Scoreboard scoreboard = entity.level().getScoreboard();
		Objective scoreboardObjective = scoreboard.getObjective(score);
		if (scoreboardObjective != null)
			return scoreboard.getOrCreatePlayerScore(ScoreHolder.forNameOnly(entity.getScoreboardName()), scoreboardObjective).get();
		return 0;
	}
}
