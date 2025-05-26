package net.mcreator.radiant.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class TensionDiamondArmorLeggingsTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double damage = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.INFUSED_ARMOR))) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.TENSION_STONEWARD) && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 2) {
				damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getDamageValue();
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(Items.DIAMOND_LEGGINGS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
					}
				}
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).setDamageValue((int) damage);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RadiantModMobEffects.INFUSED_ARMOR, 2400, 0));
				TensionSurgeOnArmorProcedure.execute(world, entity, 1);
			} else {
				damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getDamageValue();
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(Items.DIAMOND_LEGGINGS));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
					}
				}
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).setDamageValue((int) damage);
			}
		}
	}
}
