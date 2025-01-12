
package net.saudade.vortex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UltimateRunestoneItem extends Item {
	public UltimateRunestoneItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
