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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.Advancement;

import net.mcreator.radiant.network.RadiantModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class FourthIdealProcedure {
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
		if (getEntityScore("Oath", entity) == 3) {
			if (("Dustbringers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (world instanceof Level _lvl2 && _lvl2.getServer() != null && _lvl2.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/summon_wither")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will not let fear of my power keep me from doing what must be done"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl6 && _lvl6.getServer() != null && _lvl6.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/overoverkill")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will not unleash my power in anger, but I will use it when it is needed"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl10 && _lvl10.getServer() != null && _lvl10.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:end/kill_dragon")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will not seek destruction, but when it is the only path, I will walk it without regret"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			} else if (("Edgedancers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (world instanceof Level _lvl15 && _lvl15.getServer() != null && _lvl15.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:story/cure_zombie_villager")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will save even those deemed hopeless"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancer_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl19 && _lvl19.getServer() != null && _lvl19.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/plant_any_sniffer_seed")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will bring back those forgotten by history"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancer_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			} else if (("Stonewards").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (world instanceof Level _lvl24 && _lvl24.getServer() != null && _lvl24.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/totem_of_undying")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will take care of myself as well as I take care of others."), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:stoneward_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl28 && _lvl28.getServer() != null && _lvl28.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/netherite_armor")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will take care of myself as well as I take care of others."), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:stoneward_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl32 && _lvl32.getServer() != null && _lvl32.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/balanced_diet")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will take care of myself as well as I take care of others."), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:stoneward_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			} else if (("Willshapers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (world instanceof Level _lvl37 && _lvl37.getServer() != null && _lvl37.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:end/enter_end_gateway")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will enjoy my own freedom"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:willshaper_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl41 && _lvl41.getServer() != null && _lvl41.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/adventuring_time")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will enjoy my own freedom"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:willshaper_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl45 && _lvl45.getServer() != null && _lvl45.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/explore_nether")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will enjoy my own freedom"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:willshaper_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			} else if (("Truthwatchers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (world instanceof Level _lvl50 && _lvl50.getServer() != null && _lvl50.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/find_bastion")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will seek the truth even if it is not pleasant"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl54 && _lvl54.getServer() != null && _lvl54.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:story/follow_ender_eye")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will seek the truth even if it is not pleasant"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl58 && _lvl58.getServer() != null && _lvl58.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/kill_mob_near_sculk_catalyst")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will pay the necessary price for knowledge"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl62 && _lvl62.getServer() != null && _lvl62.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/read_power_of_chiseled_bookshelf")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will seek the truth even if it is not pleasant"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl66 && _lvl66.getServer() != null && _lvl66.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/revaulting")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will seek the truth even if it is not pleasant"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl70 && _lvl70.getServer() != null && _lvl70.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/fast_travel")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will seek the truth even if it is not pleasant"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_fourth_ideal"));
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
				if ((entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString).equals("archer") && entity instanceof ServerPlayer _plr75 && _plr75.level() instanceof ServerLevel
						&& _plr75.getAdvancements().getOrStartProgress(_plr75.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/arbalistic"))).isDone() && entity instanceof ServerPlayer _plr76
						&& _plr76.level() instanceof ServerLevel && _plr76.getAdvancements().getOrStartProgress(_plr76.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/two_birds_one_arrow"))).isDone()
						&& entity instanceof ServerPlayer _plr77 && _plr77.level() instanceof ServerLevel
						&& _plr77.getAdvancements().getOrStartProgress(_plr77.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/sniper_duel"))).isDone() && entity instanceof ServerPlayer _plr78
						&& _plr78.level() instanceof ServerLevel && _plr78.getAdvancements().getOrStartProgress(_plr78.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/bullseye"))).isDone()) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will be the best archer"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if ((entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString).equals("smith") && entity instanceof ServerPlayer _plr82 && _plr82.level() instanceof ServerLevel
						&& _plr82.getAdvancements().getOrStartProgress(_plr82.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/obtain_armor"))).isDone() && entity instanceof ServerPlayer _plr83
						&& _plr83.level() instanceof ServerLevel && _plr83.getAdvancements().getOrStartProgress(_plr83.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/mine_diamond"))).isDone()
						&& entity instanceof ServerPlayer _plr84 && _plr84.level() instanceof ServerLevel
						&& _plr84.getAdvancements().getOrStartProgress(_plr84.server.getAdvancements().get(ResourceLocation.parse("minecraft:story/shiny_gear"))).isDone() && entity instanceof ServerPlayer _plr85
						&& _plr85.level() instanceof ServerLevel && _plr85.getAdvancements().getOrStartProgress(_plr85.server.getAdvancements().get(ResourceLocation.parse("minecraft:nether/obtain_ancient_debris"))).isDone()
						&& entity instanceof ServerPlayer _plr86 && _plr86.level() instanceof ServerLevel
						&& _plr86.getAdvancements().getOrStartProgress(_plr86.server.getAdvancements().get(ResourceLocation.parse("minecraft:nether/netherite_armor"))).isDone() && entity instanceof ServerPlayer _plr87
						&& _plr87.level() instanceof ServerLevel && _plr87.getAdvancements().getOrStartProgress(_plr87.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trim_with_any_armor_pattern"))).isDone()) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will be the best smith"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if ((entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString).equals("beekeeper") && entity instanceof ServerPlayer _plr91 && _plr91.level() instanceof ServerLevel
						&& _plr91.getAdvancements().getOrStartProgress(_plr91.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/safely_harvest_honey"))).isDone() && entity instanceof ServerPlayer _plr92
						&& _plr92.level() instanceof ServerLevel && _plr92.getAdvancements().getOrStartProgress(_plr92.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/honey_block_slide"))).isDone()
						&& entity instanceof ServerPlayer _plr93 && _plr93.level() instanceof ServerLevel
						&& _plr93.getAdvancements().getOrStartProgress(_plr93.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/wax_on"))).isDone() && entity instanceof ServerPlayer _plr94
						&& _plr94.level() instanceof ServerLevel && _plr94.getAdvancements().getOrStartProgress(_plr94.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/wax_off"))).isDone()
						&& entity instanceof ServerPlayer _plr95 && _plr95.level() instanceof ServerLevel
						&& _plr95.getAdvancements().getOrStartProgress(_plr95.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/silk_touch_nest"))).isDone()) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will make my bees happy"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if ((entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString).equals("collector") && entity instanceof ServerPlayer _plr99 && _plr99.level() instanceof ServerLevel
						&& _plr99.getAdvancements().getOrStartProgress(_plr99.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/froglights"))).isDone() && entity instanceof ServerPlayer _plr100
						&& _plr100.level() instanceof ServerLevel && _plr100.getAdvancements().getOrStartProgress(_plr100.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/trim_with_all_exclusive_armor_patterns"))).isDone()
						&& entity instanceof ServerPlayer _plr101 && _plr101.level() instanceof ServerLevel
						&& _plr101.getAdvancements().getOrStartProgress(_plr101.server.getAdvancements().get(ResourceLocation.parse("minecraft:end/dragon_egg"))).isDone() && entity instanceof ServerPlayer _plr102
						&& _plr102.level() instanceof ServerLevel && _plr102.getAdvancements().getOrStartProgress(_plr102.server.getAdvancements().get(ResourceLocation.parse("minecraft:nether/create_beacon"))).isDone()
						&& entity instanceof ServerPlayer _plr103 && _plr103.level() instanceof ServerLevel
						&& _plr103.getAdvancements().getOrStartProgress(_plr103.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/obtain_sniffer_egg"))).isDone() && entity instanceof ServerPlayer _plr104
						&& _plr104.level() instanceof ServerLevel && _plr104.getAdvancements().getOrStartProgress(_plr104.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/whole_pack"))).isDone()
						&& entity instanceof ServerPlayer _plr105 && _plr105.level() instanceof ServerLevel
						&& _plr105.getAdvancements().getOrStartProgress(_plr105.server.getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/complete_catalogue"))).isDone() && entity instanceof ServerPlayer _plr106
						&& _plr106.level() instanceof ServerLevel && _plr106.getAdvancements().getOrStartProgress(_plr106.server.getAdvancements().get(ResourceLocation.parse("minecraft:end/elytra"))).isDone() && entity instanceof ServerPlayer _plr107
						&& _plr107.level() instanceof ServerLevel && _plr107.getAdvancements().getOrStartProgress(_plr107.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/throw_trident"))).isDone()
						&& entity instanceof ServerPlayer _plr108 && _plr108.level() instanceof ServerLevel
						&& _plr108.getAdvancements().getOrStartProgress(_plr108.server.getAdvancements().get(ResourceLocation.parse("minecraft:nether/obtain_ancient_debris"))).isDone() && entity instanceof ServerPlayer _plr109
						&& _plr109.level() instanceof ServerLevel && _plr109.getAdvancements().getOrStartProgress(_plr109.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/overoverkill"))).isDone()) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will complete my collection"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_fourth_ideal"));
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
				if (world instanceof Level _lvl114 && _lvl114.getServer() != null && _lvl114.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:end/kill_dragon")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I will cleanse this land for those who seek to destroy its laws"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:skybreaker_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			} else if (("Lightweavers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (world instanceof Level _lvl119 && _lvl119.getServer() != null && _lvl119.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:husbandry/bred_all_animals")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I'm a pervert"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl123 && _lvl123.getServer() != null && _lvl123.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:adventure/very_very_frightening")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I'm a jerk"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl127 && _lvl127.getServer() != null && _lvl127.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/uneasy_alliance")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I'm a jerk"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_fourth_ideal"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				} else if (world instanceof Level _lvl131 && _lvl131.getServer() != null && _lvl131.getServer().getAdvancements().get(ResourceLocation.parse("minecraft:nether/all_potions")).value().equals(advancement)) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("Oath");
						if (_so == null)
							_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
						_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(4);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("I have a substance abuse problem"), false);
					if (entity instanceof ServerPlayer _player) {
						AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_fourth_ideal"));
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

	private static int getEntityScore(String score, Entity entity) {
		Scoreboard scoreboard = entity.level().getScoreboard();
		Objective scoreboardObjective = scoreboard.getObjective(score);
		if (scoreboardObjective != null)
			return scoreboard.getOrCreatePlayerScore(ScoreHolder.forNameOnly(entity.getScoreboardName()), scoreboardObjective).get();
		return 0;
	}
}
