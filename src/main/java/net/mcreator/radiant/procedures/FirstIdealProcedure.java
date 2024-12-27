package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.ServerChatEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

import java.util.Random;

@EventBusSubscriber
public class FirstIdealProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer().level(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		double Random = 0;
		if (((text).equals("Vida antes que muerte, fuerza antes que debilidad, viaje antes que destino") || (text).equals("Life before death, strength before weakness, journey before destination")) && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
				return 0;
			}
		}.getScore("Oath", entity) == 0) {
			if (("Dustbringers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:ashspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Edgedancers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:cultivationspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Stonewards").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:peakspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Willshapers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:lightspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Truthwatchers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:mistspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Skybreakers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:highspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Windrunners").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:honorspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Lightweavers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:cryptic ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else if (("Elsecallers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon radiant:inkspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
				}
			} else {
				Random = Mth.nextInt(RandomSource.create(), 1, 9);
				if (Random == 1) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Dustbringers");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:ashspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 2) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Edgedancers");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:cultivationspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 3) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Stonewards");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:peakspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 4) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Willshapers");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:lightspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 5) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Truthwatchers");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:mistspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 6) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Skybreakers");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:highspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 7) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Windrunners");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:honorspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 8) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Elsecallers");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:inkspren ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				} else if (Random == 9) {
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:inmortal_words"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("Lightweavers");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon radiant:cryptic ~ ~1 ~ {Owner:" + (entity.getDisplayName().getString() + "}")));
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(1);
					}
				}
			}
		}
	}
}
