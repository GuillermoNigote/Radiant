package net.mcreator.radiant.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;

public class AbrasionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0) {
			if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).RadiantCounter == 4) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(1));
			}
			if (entity.onGround()) {
				entity.setDeltaMovement(new Vec3((Math.abs(entity.getDeltaMovement().x()) < 3 ? entity.getDeltaMovement().x() * 1.8 : entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()),
						(Math.abs(entity.getDeltaMovement().z()) < 3 ? entity.getDeltaMovement().z() * 1.8 : entity.getDeltaMovement().z())));
				if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant != x || entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant != y || entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant != z) {
					if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER) && entity.isShiftKeyDown()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(30));
						DivisionSurgeOnBlockProcedure.execute(world, entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant, entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - 1, entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant);
						DivisionSurgeOnBlockProcedure.execute(world,
								Mth.nextInt(RandomSource.create(), 0, 1) != 0
										? entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant + Mth.nextInt(RandomSource.create(), 0, 1)
										: entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant - Mth.nextInt(RandomSource.create(), 0, 1),
								entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - 1,
								Mth.nextInt(RandomSource.create(), 0, 1) != 0
										? entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant + Mth.nextInt(RandomSource.create(), 0, 1)
										: entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant - Mth.nextInt(RandomSource.create(), 0, 1));
						DivisionSurgeOnBlockProcedure.execute(world,
								Mth.nextInt(RandomSource.create(), 0, 1) != 0
										? entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant + Mth.nextInt(RandomSource.create(), 0, 1)
										: entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant - Mth.nextInt(RandomSource.create(), 0, 1),
								entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - 1,
								Mth.nextInt(RandomSource.create(), 0, 1) != 0
										? entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant + Mth.nextInt(RandomSource.create(), 0, 1)
										: entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant - Mth.nextInt(RandomSource.create(), 0, 1));
					} else if (entity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER) && entity.isShiftKeyDown()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						if (world instanceof Level _level) {
							BlockPos _bp = BlockPos.containing(entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant, entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant, entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant);
							if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
								if (!_level.isClientSide())
									_level.levelEvent(2005, _bp, 0);
							}
						}
						if (world instanceof Level _level) {
							BlockPos _bp = BlockPos.containing(entity.getData(RadiantModVariables.PLAYER_VARIABLES).xant, entity.getData(RadiantModVariables.PLAYER_VARIABLES).yant - 1, entity.getData(RadiantModVariables.PLAYER_VARIABLES).zant);
							if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
								if (!_level.isClientSide())
									_level.levelEvent(2005, _bp, 0);
							}
						}
					}
				}
			} else if (entity.isInWater()) {
				entity.setDeltaMovement(new Vec3((Math.abs(entity.getDeltaMovement().x()) < 1.5 ? entity.getDeltaMovement().x() * 1.2 : entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()),
						(Math.abs(entity.getDeltaMovement().z()) < 1.5 ? entity.getDeltaMovement().z() * 1.2 : entity.getDeltaMovement().z())));
			}
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.xant = x;
				_vars.syncPlayerVariables(entity);
			}
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.yant = y;
				_vars.syncPlayerVariables(entity);
			}
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.zant = z;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ABRASION_DUSTBRINGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RadiantModMobEffects.ABRASION_EDGEDANCER);
		}
	}
}
