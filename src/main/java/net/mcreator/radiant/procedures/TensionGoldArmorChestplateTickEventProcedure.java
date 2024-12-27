package net.mcreator.radiant.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class TensionGoldArmorChestplateTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double damage = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.TENSION_STONEWARD))) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(2, new ItemStack(Items.GOLDEN_CHESTPLATE));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.GOLDEN_CHESTPLATE));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).setDamageValue((int) damage);
		}
	}
}
