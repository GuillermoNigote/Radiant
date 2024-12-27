
package net.mcreator.radiant.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.radiant.init.RadiantModFluids;

public class BloodItem extends BucketItem {
	public BloodItem() {
		super(RadiantModFluids.BLOOD.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
