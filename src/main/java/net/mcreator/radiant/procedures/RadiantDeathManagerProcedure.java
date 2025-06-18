package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RadiantDeathManagerProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "").equals("Unoathed")) {
			if (!(entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardblade.getItem() == ItemStack.EMPTY.getItem())) {
				{
					final String _tagName = "bonded";
					final boolean _tagValue = false;
					CustomData.update(DataComponents.CUSTOM_DATA, entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardblade, tag -> tag.putBoolean(_tagName, _tagValue));
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.SummonedBlade = false;
					_vars.syncPlayerVariables(entity);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardblade);
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "team leave @s");
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER) || entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER))
				&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 10) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-(10));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(2);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ABRASION_EDGEDANCER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ADHESION_WINDRUNNER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TENSION_STONEWARD);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.COHESION_STONEWARD);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.COHESION_WILLSHAPER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.DIVISION_SKYBREAKER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_ANIMAL_ILUSION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER);
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.SummonedBlade = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
