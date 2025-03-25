
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class VortexModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == VortexModItems.FARMERS_SUNFLOWER_HEAD.get())
			event.setBurnTime(50);
		else if (itemstack.getItem() == VortexModItems.ESSENCE_OF_MELTING.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == VortexModItems.ESSENCE_OF_MELTING.get())
			event.setBurnTime(1600);
	}
}
