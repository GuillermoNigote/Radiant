package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
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
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
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
		if (event.getHand() != event.getEntity().getUsedItemHand())
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
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				DivisionSurgeOnBlockProcedure.execute(world, x, y, z);
			}
			if ((entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(RadiantModMobEffects.PROGRESSION_EDGEDANCER) || entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(RadiantModMobEffects.PROGRESSION_TRUTHWATCHER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.VINE && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.VINE.defaultBlockState(), 3);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
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
			if ((entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(RadiantModMobEffects.COHESION_STONEWARD) || entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("radiant:cohesionableblocks")))) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.COAL).copy();
							_setstack.setCount(2);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.RAW_IRON).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
							_setstack.setCount(3);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
							_setstack.setCount(3);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COPPER_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
							_setstack.setCount(2);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_QUARTZ_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.QUARTZ).copy();
							_setstack.setCount(2);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_NETHERRACK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_GOLD_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
							_setstack.setCount(2);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_NETHERRACK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.COAL).copy();
							_setstack.setCount(2);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.RAW_IRON).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
							_setstack.setCount(3);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
							_setstack.setCount(3);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
							_setstack.setCount(2);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(5));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("radiant:dirt")))) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.STONE == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_STONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.OBSIDIAN == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() || Blocks.CRYING_OBSIDIAN == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_OBSIDIAN.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.NETHERRACK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_NETHERRACK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("radiant:granite")))) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_GRANITE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (RadiantModBlocks.ILLUMINATION_BLOCK_SANDSTONE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_SANDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.SAND == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_SAND.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.DIORITE == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DIORITE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.BEDROCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_BEDROCK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.ANDESITE == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_ANDESITE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.ANCIENT_DEBRIS == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEBRIS.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if (Blocks.END_STONE == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_ENDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
					} else if (Blocks.COBBLED_DEEPSLATE == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE_C_OBBLESTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("radiant:cobblestone")))) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_COBBLESTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("radiant:deepcobblestone")))) {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_BLOCK_DEEPSLATE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else {
						if (entity instanceof Player _player)
							_player.giveExperiencePoints(-(10));
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = RadiantModBlocks.COHESION_LIQUID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt178 && _livEnt178.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER) || entity instanceof LivingEntity _livEnt179 && _livEnt179.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER))
					&& entity.isShiftKeyDown() && (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(20));
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = RadiantModEntities.ILLUMINATION_FAKE_PLAYER.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (((Entity) world.getEntitiesOfClass(IlluminationFakePlayerEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
					_toTame.tame(_owner);
			}
			if ((entity instanceof LivingEntity _livEnt186 && _livEnt186.hasEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER) || entity instanceof LivingEntity _livEnt187 && _livEnt187.hasEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER))
					&& !entity.isShiftKeyDown()) {
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
			if (entity instanceof LivingEntity _livEnt190 && _livEnt190.hasEffect(RadiantModMobEffects.ADHESION_WINDRUNNER) && (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
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
