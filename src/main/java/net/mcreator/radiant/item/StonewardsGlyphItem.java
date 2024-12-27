
package net.mcreator.radiant.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StonewardsGlyphItem extends Item {
	public StonewardsGlyphItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
