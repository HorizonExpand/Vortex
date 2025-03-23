
package net.saudade.vortex.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class KozinakItem extends Item {
	public KozinakItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationMod(3.3f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 20;
	}
}
