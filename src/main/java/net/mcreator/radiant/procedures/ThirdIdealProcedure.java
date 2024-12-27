package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.player.AdvancementEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import java.util.Random;

@EventBusSubscriber
public class ThirdIdealProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent.AdvancementEarnEvent event) {
		execute(event, event.getEntity().level(), event.getAdvancement().value(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Advancement advancement, Entity entity) {
		execute(null, world, advancement, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Advancement advancement, Entity entity) {
		if (advancement == null || entity == null)
			return;
		double Random = 0;
		if (("Dustbringers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
					return 0;
				}
			}.getScore("Oath", entity) == 2) {
				if (world instanceof Level _lvl2 && _lvl2.getServer() != null && _lvl2.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/explore_nether")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will know my surroundings as I know myself"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl6 && _lvl6.getServer() != null && _lvl6.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/adventuring_time")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will know my surroundings as I know myself"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl10 && _lvl10.getServer() != null && _lvl10.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/fall_from_world_height")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I won't allow my fear to control me"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl14 && _lvl14.getServer() != null && _lvl14.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/avoid_vibration")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I won't allow my fear to control me"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		} else if (("Edgedancers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
					return 0;
				}
			}.getScore("Oath", entity) == 2) {
				if (world instanceof Level _lvl20 && _lvl20.getServer() != null && _lvl20.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/salvage_sherd")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will remember those forgotten by history"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancer_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl24 && _lvl24.getServer() != null && _lvl24.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/craft_decorated_pot_using_only_sherds")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will remember those forgotten by history"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancer_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl28 && _lvl28.getServer() != null && _lvl28.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:story/cure_zombie_villager")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will save even those deemed hopeless"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancer_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		} else if (("Stonewards").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
					return 0;
				}
			}.getScore("Oath", entity) == 2) {
				if (world instanceof Level _lvl34 && _lvl34.getServer() != null && _lvl34.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/lightning_rod_with_villager_no_fire")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("If I can't be there, I'll make sure people have something to rely on"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:stoneward_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl38 && _lvl38.getServer() != null && _lvl38.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/summon_iron_golem")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("If I can't be there, I'll make sure people have something to rely on"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:stoneward_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl42 && _lvl42.getServer() != null && _lvl42.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/hero_of_the_village")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will not abandon those who need me"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:stoneward_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		} else if (("Willshapers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
					return 0;
				}
			}.getScore("Oath", entity) == 2) {
				if (world instanceof Level _lvl48 && _lvl48.getServer() != null && _lvl48.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:end/kill_dragon")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will resist tyranny and oppression"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:willshaper_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl52 && _lvl52.getServer() != null && _lvl52.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/hero_of_the_village")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will resist tyranny and oppression"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:willshaper_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		} else if (("Truthwatchers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
					return 0;
				}
			}.getScore("Oath", entity) == 2) {
				if (world instanceof Level _lvl58 && _lvl58.getServer() != null && _lvl58.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:end/find_end_city")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will unravel the truth of this world"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl62 && _lvl62.getServer() != null && _lvl62.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:story/follow_ender_eye")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will unravel the truth of this world"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl66 && _lvl66.getServer() != null && _lvl66.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/kill_mob_near_sculk_catalyst")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will unravel the truth of this world"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_third_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		} else if (("Windrunners").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (world instanceof Level _lvl71 && _lvl71.getServer() != null && _lvl71.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/hero_of_the_village")).value().equals(advancement)) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("I will protect even those I hate, so long as it is right"), false);
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:windrunners_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if (world instanceof Level _lvl75 && _lvl75.getServer() != null && _lvl75.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/totem_of_undying")).value().equals(advancement)) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("I will protect those I hate. Even if the one I hate most is myself."), false);
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:windrunners_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (("Elsecallers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (world instanceof Level _lvl80 && _lvl80.getServer() != null && _lvl80.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/netherite_armor")).value().equals(advancement)) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("I will be the best prepared"), false);
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if (world instanceof Level _lvl84 && _lvl84.getServer() != null && _lvl84.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/create_full_beacon")).value().equals(advancement)) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("I will be the best prepared"), false);
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (("Skybreakers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (world instanceof Level _lvl89 && _lvl89.getServer() != null && _lvl89.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trade")).value().equals(advancement)) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("I will respect the law of the land"), false);
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:skybreaker_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if (world instanceof Level _lvl93 && _lvl93.getServer() != null && _lvl93.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:end/respawn_dragon")).value().equals(advancement)) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("I will respect the law of the land"), false);
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:skybreaker_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
	}
}
