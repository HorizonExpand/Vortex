
package net.saudade.vortex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawGeminiumItem extends Item {
	public RawGeminiumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
