package net.mcreator.radiant.procedures;

import org.checkerframework.checker.units.qual.s;

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
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
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

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

import javax.annotation.Nullable;

import java.util.Comparator;

@EventBusSubscriber
public class SecondIdealProcedure {
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
		if (!(("Unoathed").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: ""))) {
			if ((text).equals("I will seek self-mastery") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringers_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringer_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will remember those who have been forgotten") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
					&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancers_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancer_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will seek freedom for those in bondage") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
					&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().get(ResourceLocation.parse("radiant:willshapers_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:willshaper_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will step forward when others fall back") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr26 && _plr26.level() instanceof ServerLevel
					&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().get(ResourceLocation.parse("radiant:stonewards_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:stoneward_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will seek truth") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr34 && _plr34.level() instanceof ServerLevel
					&& _plr34.getAdvancements().getOrStartProgress(_plr34.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatchers_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatcher_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will seek order") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr42 && _plr42.level() instanceof ServerLevel
					&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().get(ResourceLocation.parse("radiant:skybreakers_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:skybreaker_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will protect those who cannot protect themselves") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr50 && _plr50.level() instanceof ServerLevel
					&& _plr50.getAdvancements().getOrStartProgress(_plr50.server.getAdvancements().get(ResourceLocation.parse("radiant:windrunners_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:windrunner_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will speak my truth") && getEntityScore("Oath", entity) < 2 && !(entity instanceof ServerPlayer _plr58 && _plr58.level() instanceof ServerLevel
					&& _plr58.getAdvancements().getOrStartProgress(_plr58.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweavers_broken_oaths"))).isDone())) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = new java.text.DecimalFormat("##").format(Mth.nextInt(RandomSource.create(), 72000, 144000));
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.TRUTH_COOLDOWN, (int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString), 0));
			} else if ((text).equals("I follow youtube tutorials for my builds") && !(entity instanceof LivingEntity _livEnt67 && _livEnt67.hasEffect(RadiantModMobEffects.TRUTH_COOLDOWN))
					&& ("Lightweavers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = new java.text.DecimalFormat("##").format(Mth.nextInt(RandomSource.create(), 72000, 144000));
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.TRUTH_COOLDOWN, (int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString), 0));
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I am bad at pvp") && !(entity instanceof LivingEntity _livEnt74 && _livEnt74.hasEffect(RadiantModMobEffects.TRUTH_COOLDOWN))
					&& ("Lightweavers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = new java.text.DecimalFormat("##").format(Mth.nextInt(RandomSource.create(), 72000, 144000));
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.TRUTH_COOLDOWN, (int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString), 0));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I killed the wandering trader for his lamas") && !(entity instanceof LivingEntity _livEnt81 && _livEnt81.hasEffect(RadiantModMobEffects.TRUTH_COOLDOWN))
					&& ("Lightweavers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = new java.text.DecimalFormat("##").format(Mth.nextInt(RandomSource.create(), 72000, 144000));
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.TRUTH_COOLDOWN, (int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString), 0));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I dont like mining") && !(entity instanceof LivingEntity _livEnt88 && _livEnt88.hasEffect(RadiantModMobEffects.TRUTH_COOLDOWN))
					&& ("Lightweavers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = new java.text.DecimalFormat("##").format(Mth.nextInt(RandomSource.create(), 72000, 144000));
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.TRUTH_COOLDOWN, (int) new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantString), 0));
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(3);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweaver_third_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will renounce war and work for nonviolence")
					&& ("Skybreakers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.NO_VIOLENCE_DEDICATION_QUEST, 72000, 0));
			} else if ((text).equals("I wont consume or use animal products")
					&& ("Skybreakers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.VEGAN_DEDICATION_QUEST, 72000, 0));
			} else if ((text).equals("I will abide by the law of each land")
					&& ("Skybreakers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.LAW_DEDICATION_QUEST, 72000, 0));
			} else if ((text).equals("I swear to follow the will of ")
					&& ("Skybreakers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "")
					&& getEntityScore("Oath", entity) == 2) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof ServerPlayer && !(entityiterator == entity)) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.OTHERS_WILL_DEDICATION_QUEST, 72000, 0));
							entity.getPersistentData().putString("master", (entityiterator.getDisplayName().getString()));
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((entityiterator.getDisplayName().getString())), false);
							break;
						}
					}
				}
			} else if ((text).equals("I will become a master archer") && getEntityScore("Oath", entity) < 2) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = "archer";
					_vars.syncPlayerVariables(entity);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will become a master smith") && getEntityScore("Oath", entity) < 2) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = "smith";
					_vars.syncPlayerVariables(entity);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will become a master beekeeper") && getEntityScore("Oath", entity) < 2) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = "beekeeper";
					_vars.syncPlayerVariables(entity);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_second_ideal"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((text).equals("I will fill my collection") && getEntityScore("Oath", entity) < 2) {
				if (getEntityScore("Oath", entity) == 0) {
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
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = "collector";
					_vars.syncPlayerVariables(entity);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecaller_second_ideal"));
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

	private static int getEntityScore(String score, Entity entity) {
		Scoreboard scoreboard = entity.level().getScoreboard();
		Objective scoreboardObjective = scoreboard.getObjective(score);
		if (scoreboardObjective != null)
			return scoreboard.getOrCreatePlayerScore(ScoreHolder.forNameOnly(entity.getScoreboardName()), scoreboardObjective).get();
		return 0;
	}
}
