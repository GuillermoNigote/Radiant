package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

public class TensionShovelDiamondToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double damage = 0;
		ItemStack uninfuseditem = ItemStack.EMPTY;
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("tensiontimer") == 0) {
			damage = itemstack.getDamageValue();
			uninfuseditem = new ItemStack(Items.DIAMOND_SHOVEL).copy();
			uninfuseditem.setDamageValue((int) damage);
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = uninfuseditem.copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			{
				final String _tagName = "tensiontimer";
				final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("tensiontimer") - 1);
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
	}
}
