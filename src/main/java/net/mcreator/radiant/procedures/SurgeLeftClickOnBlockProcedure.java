package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;
import net.mcreator.radiant.init.RadiantModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SurgeLeftClickOnBlockProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(RadiantModMobEffects.ILLUMINATION_LIGHTWEAVER) || entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RadiantModMobEffects.ILLUMINATION_TRUTHWATCHER))
					&& entity.isShiftKeyDown() && (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
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
			} else if ((entity instanceof LivingEntity _livEnt217 && _livEnt217.hasEffect(RadiantModMobEffects.DIVISION_SKYBREAKER) || entity instanceof LivingEntity _livEnt218 && _livEnt218.hasEffect(RadiantModMobEffects.DIVISION_DUSTBRINGER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLESTONE.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DEEPSLATE) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PUMPKIN) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.CARVED_PUMPKIN.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANVIL) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.CHIPPED_ANVIL.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHIPPED_ANVIL) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.DAMAGED_ANVIL.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COPPER_BLOCK) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.CUT_COPPER.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EXPOSED_COPPER) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.EXPOSED_CUT_COPPER.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WEATHERED_COPPER) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.WEATHERED_CUT_COPPER.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OXIDIZED_COPPER) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.OXIDIZED_CUT_COPPER.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SMOOTH_QUARTZ) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.CHISELED_QUARTZ_BLOCK.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHISELED_NETHER_BRICKS) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.CRACKED_NETHER_BRICKS.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SMOOTH_SANDSTONE) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.SANDSTONE.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SMOOTH_RED_SANDSTONE) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.RED_SANDSTONE.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_OAK_LOG.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_BIRCH_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_JUNGLE_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_ACACIA_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_DARK_OAK_LOG.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_STEM) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_WARPED_STEM.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_STEM) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_CRIMSON_STEM.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_MANGROVE_LOG.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_LOG) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_CHERRY_LOG.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PACKED_MUD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.MUD_BRICKS.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE_BRICKS) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.CRACKED_STONE_BRICKS.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BAMBOO_BLOCK) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_BAMBOO_BLOCK.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_OAK_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_SPRUCE_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_BIRCH_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_JUNGLE_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_ACACIA_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_DARK_OAK_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_HYPHAE) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_WARPED_HYPHAE.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_HYPHAE) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_CRIMSON_HYPHAE.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_MANGROVE_WOOD.defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_WOOD) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STRIPPED_CHERRY_WOOD.defaultBlockState();
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
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 1
					&& (entity instanceof LivingEntity _livEnt401 && _livEnt401.hasEffect(RadiantModMobEffects.COHESION_STONEWARD) || entity instanceof LivingEntity _livEnt402 && _livEnt402.hasEffect(RadiantModMobEffects.COHESION_WILLSHAPER))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.COAL).copy();
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(-(5));
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.STONE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.NETHERRACK.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.NETHERRACK.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.COBBLED_DEEPSLATE.defaultBlockState();
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
			} else if (entity.isShiftKeyDown() && (entity instanceof LivingEntity _livEnt512 && _livEnt512.hasEffect(RadiantModMobEffects.TRANSFORMATION_ELSECALLER)
					|| entity instanceof LivingEntity _livEnt513 && _livEnt513.hasEffect(RadiantModMobEffects.TRANSFORMATION_LIGHTWEAVER))) {
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
			}
		}
	}
}
