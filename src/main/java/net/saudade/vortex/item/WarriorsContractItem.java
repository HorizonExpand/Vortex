
package net.saudade.vortex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WarriorsContractItem extends Item {
	public WarriorsContractItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
