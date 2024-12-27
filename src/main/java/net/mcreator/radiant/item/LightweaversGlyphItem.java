
package net.mcreator.radiant.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightweaversGlyphItem extends Item {
	public LightweaversGlyphItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
