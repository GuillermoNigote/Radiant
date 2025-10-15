package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.radiant.init.RadiantModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SurgeEntityInfuseProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof Player _plr ? _plr.experienceLevel : 0) > 1 && ItemStack.EMPTY.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (sourceentity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RadiantModMobEffects.DIVISION_SKYBREAKER) || sourceentity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER)) {
				if (sourceentity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 3, false, false));
			} else if (sourceentity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER) && sourceentity.isShiftKeyDown()) {
				if (sourceentity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.ABRASION_DUSTBRINGER, 200, 0, false, false));
			} else if (sourceentity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER)
					|| sourceentity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER)) {
				if (sourceentity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, false, false));
			} else if (sourceentity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER)
					|| sourceentity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER)) {
				if (sourceentity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 3, false, false));
			} else if (sourceentity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(RadiantModMobEffects.ABRASION_EDGEDANCER) && sourceentity.isShiftKeyDown()) {
				if (sourceentity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.ABRASION_EDGEDANCER, 200, 0, false, false));
			} else if (sourceentity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER) && sourceentity instanceof LivingEntity _livEnt30
					&& _livEnt30.hasEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER) && !(entity instanceof Player)) {
				if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 14) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 0, 0, 0);
					world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (entity.getX()), (entity.getY()), (entity.getZ()), 0, 0, 0);
					if (sourceentity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (!entity.level().isClientSide())
						entity.discard();
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt44 && _livEnt44.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER)
					|| sourceentity instanceof LivingEntity _livEnt45 && _livEnt45.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER)) && sourceentity.isShiftKeyDown()) {
				if (sourceentity instanceof LivingEntity _livEnt47 && _livEnt47.hasEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION)) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
				}
				DisguiseIlluminationProcedure.execute(entity, sourceentity);
			} else if (entity instanceof ServerPlayer && sourceentity instanceof ServerPlayer && entity.isShiftKeyDown() && !sourceentity.isShiftKeyDown() && getEntityScore("Oath", entity) == 0 && getEntityScore("Oath", sourceentity) > 2) {
				if (("Dustbringers")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr56 && _plr56.level() instanceof ServerLevel
								&& _plr56.getAdvancements().getOrStartProgress(_plr56.server.getAdvancements().get(ResourceLocation.parse("radiant:dustbringers_broken_oaths"))).isDone())) {
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
				} else if (("Edgedancers")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr59 && _plr59.level() instanceof ServerLevel
								&& _plr59.getAdvancements().getOrStartProgress(_plr59.server.getAdvancements().get(ResourceLocation.parse("radiant:edgedancers_broken_oaths"))).isDone())) {
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
				} else if (("Stonewards")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr62 && _plr62.level() instanceof ServerLevel
								&& _plr62.getAdvancements().getOrStartProgress(_plr62.server.getAdvancements().get(ResourceLocation.parse("radiant:stonewards_broken_oaths"))).isDone())) {
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
				} else if (("Willshapers")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr65 && _plr65.level() instanceof ServerLevel
								&& _plr65.getAdvancements().getOrStartProgress(_plr65.server.getAdvancements().get(ResourceLocation.parse("radiant:willshapers_broken_oaths"))).isDone())) {
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
				} else if (("Truthwatchers")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr68 && _plr68.level() instanceof ServerLevel
								&& _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements().get(ResourceLocation.parse("radiant:truthwatchers_broken_oaths"))).isDone())) {
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
				} else if (("Skybreakers")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr71 && _plr71.level() instanceof ServerLevel
								&& _plr71.getAdvancements().getOrStartProgress(_plr71.server.getAdvancements().get(ResourceLocation.parse("radiant:skybreakers_broken_oaths"))).isDone())) {
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
				} else if (("Windrunners")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr74 && _plr74.level() instanceof ServerLevel
								&& _plr74.getAdvancements().getOrStartProgress(_plr74.server.getAdvancements().get(ResourceLocation.parse("radiant:windrunners_broken_oaths"))).isDone())) {
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
				} else if (("Lightweavers")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr77 && _plr77.level() instanceof ServerLevel
								&& _plr77.getAdvancements().getOrStartProgress(_plr77.server.getAdvancements().get(ResourceLocation.parse("radiant:lightweavers_broken_oaths"))).isDone())) {
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
				} else if (("Elsecallers")
						.equals(sourceentity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "")
						&& !(entity instanceof ServerPlayer _plr80 && _plr80.level() instanceof ServerLevel
								&& _plr80.getAdvancements().getOrStartProgress(_plr80.server.getAdvancements().get(ResourceLocation.parse("radiant:elsecallers_broken_oaths"))).isDone())) {
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