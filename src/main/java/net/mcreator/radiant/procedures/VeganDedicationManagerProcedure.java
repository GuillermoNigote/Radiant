package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
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
import net.mcreator.radiant.init.RadiantModItems;
import net.mcreator.radiant.entity.HighsprenEntity;

import javax.annotation.Nullable;

import java.util.Comparator;

@EventBusSubscriber
public class VeganDedicationManagerProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.VEGAN_DEDICATION_QUEST) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.VEGAN_DEDICATION)) {
			if (itemstack.getItem() == Items.CAKE || itemstack.getItem() == Items.MILK_BUCKET || itemstack.getItem() == Items.HONEY_BOTTLE || itemstack.is(ItemTags.create(ResourceLocation.parse("minecraft:meat")))) {
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.RadiantString = "";
					_vars.syncPlayerVariables(entity);
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.SummonedBlade = false;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.VEGAN_DEDICATION);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RadiantModMobEffects.VEGAN_DEDICATION_QUEST);
				if (getEntityScore("Oath", entity) > 2) {
					for (int index0 = 0; index0 < 10; index0++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("execute as @p at @s anchored eyes run particle cloud ~" + ((1.9 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (1.9 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("execute as @p at @s anchored eyes run particle cloud ~" + ((2 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (2 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("execute as @p at @s anchored eyes run particle cloud ~" + ((2.5 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (2.5 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("execute as @p at @s anchored eyes run particle cloud ~" + ((3 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (3 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("execute as @p at @s anchored eyes run particle cloud ~" + ((3.5 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (3.5 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if ((entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) && entityiterator instanceof HighsprenEntity) {
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
							}
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RadiantModItems.SKYBREAKER_DEAD_SHARDBLADE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective("Oath");
					if (_so == null)
						_so = _sc.addObjective("Oath", ObjectiveCriteria.DUMMY, Component.literal("Oath"), ObjectiveCriteria.RenderType.INTEGER, true, null);
					_sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).set(-2);
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("radiant:skybreakers_broken_oaths"));
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
