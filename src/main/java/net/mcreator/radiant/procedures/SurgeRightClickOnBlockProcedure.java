package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.world.inventory.TransformationSurgeGUIMenu;
import net.mcreator.radiant.init.RadiantModMobEffects;
import net.mcreator.radiant.init.RadiantModEntities;
import net.mcreator.radiant.init.RadiantModBlocks;
import net.mcreator.radiant.entity.IlluminationFakePlayerEntity;

import javax.annotation.Nullable;

import java.util.Comparator;

import io.netty.buffer.Unpooled;

@EventBusSubscriber
public class SurgeRightClickOnBlockProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(RadiantModMobEffects.DIVISION_SKYBREAKER) || entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RadiantModBlocks.ALUMINUM_BLOCK.get())) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(2));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					DivisionRightClickOnBlockProcedure.execute(world, x, y, z, entity);
				}
			}
			if ((entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER) || entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.VINE && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.VINE.defaultBlockState(), 3);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(RadiantModMobEffects.COHESION_STONEWARD) || entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1) {
				CohesionRightClickOnBlockProcedure.execute(world, x, y, z, entity);
			}
			if ((entity instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER) || entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER))
					&& entity.isShiftKeyDown() && (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = RadiantModEntities.ILLUMINATION_FAKE_PLAYER.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if ((findEntityInWorldRange(world, IlluminationFakePlayerEntity.class, x, y, z, 1)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
					_toTame.tame(_owner);
			}
			if ((entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER) || entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER))
					&& !entity.isShiftKeyDown()) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RadiantModBlocks.ALUMINUM_BLOCK.get())) {
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						_ent.openMenu(new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("TransformationSurgeGUI");
							}

							@Override
							public boolean shouldTriggerClientSideContainerClosingOnOpen() {
								return false;
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new TransformationSurgeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(RadiantModMobEffects.ADHESION_WINDRUNNER) && (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RadiantModBlocks.ALUMINUM_BLOCK.get())) {
					if (Direction.DOWN == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection())) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RadiantModEntities.ADHESION_INFUSE.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else if (Direction.UP == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection())) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RadiantModEntities.ADHESION_INFUSE.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else if (Direction.NORTH == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection())) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RadiantModEntities.ADHESION_INFUSE.get().spawn(_level, BlockPos.containing(x, y, z - 1), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else if (Direction.SOUTH == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection())) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RadiantModEntities.ADHESION_INFUSE.get().spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else if (Direction.WEST == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection())) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RadiantModEntities.ADHESION_INFUSE.get().spawn(_level, BlockPos.containing(x - 1, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else if (Direction.EAST == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getDirection())) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RadiantModEntities.ADHESION_INFUSE.get().spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}