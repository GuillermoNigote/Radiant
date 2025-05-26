package net.mcreator.radiant.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.init.RadiantModBlocks;

public class IlluminationLeftClickOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("radiant:dirt")))
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIRT.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIRT.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OBSIDIAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRYING_OBSIDIAN)
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_OBSIDIAN.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_OBSIDIAN.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_STONE.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_STONE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SAND
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_SAND.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_SAND.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_STONE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ENDSTONE.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ENDSTONE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHERRACK || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_QUARTZ_ORE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_GOLD_ORE)
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_NETHERRACK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_NETHERRACK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_BEDROCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_BEDROCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_BLOCK
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND_ORE.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_IRON_ORE.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_IRON_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD_ORE.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD_ORE.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_BLOCK
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_BLOCK
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANCIENT_DEBRIS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ANCIENT_DEBRIS.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ANCIENT_DEBRIS.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COBBLESTONE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLESTONE_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLESTONE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BOOKSHELF
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_BOOKSHELF_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BOOKSHELF_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CLAY
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_CLAY_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CLAY_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COBBLED_DEEPSLATE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLED_DEEPSLATE_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLED_DEEPSLATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_CRIMSON_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CRIMSON_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_COAL_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_COAL_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_IRON_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_IRON_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_COPPER_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_COPPER_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_DIAMOND_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_DIAMOND_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_EMERALD_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_EMERALD_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_GOLD_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_GOLD_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_LAPISLAZULI_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_LAPISLAZULI_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_REDSTONE_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_REDSTONE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_LAPISLAZULI_ORE_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_LAPISLAZULI_ORE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MUD
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_MUD_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_MUD_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_BLOCK
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_ORE_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_ORE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.POWDER_SNOW
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SNOW)
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_SNOW_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_SNOW_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LOG
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_LOG_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_PLANKS
				&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_PLANKS_BLOCK.get())) : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
