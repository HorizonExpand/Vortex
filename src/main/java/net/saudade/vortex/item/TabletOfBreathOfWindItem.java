
package net.saudade.vortex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TabletOfBreathOfWindItem extends Item {
	public TabletOfBreathOfWindItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
