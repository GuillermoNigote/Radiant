package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.init.RadiantModBlocks;

public class CohesionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() && (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1 && (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("radiant:cohesionableblocks")))) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.COAL_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.COAL).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.IRON_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.RAW_IRON).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.REDSTONE_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GOLD_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAPIS_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIAMOND_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.EMERALD_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.COPPER_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.NETHER_QUARTZ_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.QUARTZ).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.NETHER_GOLD_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.COAL).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.RAW_IRON).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(5));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("radiant:dirt")))) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.STONE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.OBSIDIAN == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() || Blocks.CRYING_OBSIDIAN == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.NETHERRACK == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("radiant:granite")))) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (RadiantModBlocks.ILLUMINATION_BLOCK_SANDSTONE.get() == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.SAND == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.DIORITE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.BEDROCK == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.ANDESITE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.ANCIENT_DEBRIS == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.END_STONE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("radiant:deepcobblestone")))) {
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("radiant:cobblestone")))) {
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
			} else if (Blocks.DEEPSLATE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(10));
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
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
}
