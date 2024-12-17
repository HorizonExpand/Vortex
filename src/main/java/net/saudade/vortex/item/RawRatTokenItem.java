
package net.saudade.vortex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawRatTokenItem extends Item {
	public RawRatTokenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
