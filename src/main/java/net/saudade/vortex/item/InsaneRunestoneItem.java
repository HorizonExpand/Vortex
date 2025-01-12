
package net.saudade.vortex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class InsaneRunestoneItem extends Item {
	public InsaneRunestoneItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
