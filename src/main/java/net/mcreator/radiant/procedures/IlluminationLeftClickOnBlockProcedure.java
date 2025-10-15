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
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("radiant:dirt"))) && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIRT.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIRT.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OBSIDIAN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRYING_OBSIDIAN)
				&& !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_OBSIDIAN.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_OBSIDIAN.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_STONE.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_STONE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SAND && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_SAND.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_SAND.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_STONE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ENDSTONE.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ENDSTONE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHERRACK || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_QUARTZ_ORE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_GOLD_ORE) && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_NETHERRACK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_NETHERRACK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_BEDROCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_BEDROCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_BLOCK && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND_ORE.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_DIAMOND_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_IRON_ORE.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_IRON_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD_ORE.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD_ORE.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD_ORE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_BLOCK && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_GOLD.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_BLOCK && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_EMERALD.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANCIENT_DEBRIS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ANCIENT_DEBRIS.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BLOCK_ANCIENT_DEBRIS.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COBBLESTONE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLESTONE_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLESTONE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_ACACIA_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BIRCH_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BOOKSHELF && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_BOOKSHELF_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_BOOKSHELF_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CHERRY_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CLAY && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_CLAY_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CLAY_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COBBLED_DEEPSLATE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLED_DEEPSLATE_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_COBBLED_DEEPSLATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_CRIMSON_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_CRIMSON_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DARK_OAK_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_COAL_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_COAL_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_IRON_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_IRON_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_COPPER_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_COPPER_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_DIAMOND_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_DIAMOND_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_EMERALD_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSALTE_EMERALD_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_GOLD_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_GOLD_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_LAPISLAZULI_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_LAPISLAZULI_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_REDSTONE_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_DEEPSLATE_REDSTONE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_JUNGLE_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_LAPISLAZULI_ORE_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_LAPISLAZULI_ORE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_MANGROVE_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MUD && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_MUD_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_MUD_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_OAK_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_BLOCK && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_ORE_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_REDSTONE_ORE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.POWDER_SNOW
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SNOW) && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_SNOW_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_SNOW_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LOG && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_LOG_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_LOG_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_PLANKS && !hasEntityInInventory(entity, new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_PLANKS_BLOCK.get()))) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RadiantModBlocks.ILLUMINATION_SPRUCE_PLANKS_BLOCK.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}