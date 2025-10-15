package net.mcreator.radiant.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModItems;

public class UnoathedWearingShardplateEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.WINDRUNNER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.WINDRUNNER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.WINDRUNNER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.WINDRUNNER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.SKYBREAKER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.SKYBREAKER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.SKYBREAKER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.SKYBREAKER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.DUSTBRINGER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.DUSTBRINGER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.DUSTBRINGER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.DUSTBRINGER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.EDGEDANCER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.EDGEDANCER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.EDGEDANCER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.EDGEDANCER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.TRUTHWATCHER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.TRUTHWATCHER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.TRUTHWATCHER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.TRUTHWATCHER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.LIGHTWEAVER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.LIGHTWEAVER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.LIGHTWEAVER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.LIGHTWEAVER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.ELSECALLER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.ELSECALLER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.ELSECALLER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.ELSECALLER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.WILLSHAPER_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.WILLSHAPER_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.WILLSHAPER_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.WILLSHAPER_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardplate.getItem() == RadiantModItems.STONEWARD_SHARDPLATE_BONDABLE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.STONEWARD_SHARDPLATE_BONDABLE_CHESTPLATE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.STONEWARD_SHARDPLATE_BONDABLE_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RadiantModItems.STONEWARD_SHARDPLATE_BONDABLE_BOOTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}