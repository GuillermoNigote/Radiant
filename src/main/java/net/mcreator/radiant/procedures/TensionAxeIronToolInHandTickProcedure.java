package net.mcreator.radiant.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.radiant.init.RadiantModMobEffects;

public class TensionAxeIronToolInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double damage = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.TENSION_STONEWARD))) {
			damage = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.IRON_AXE).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).setDamageValue((int) damage);
		}
	}
}
