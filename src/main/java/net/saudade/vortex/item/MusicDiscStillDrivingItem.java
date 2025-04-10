
package net.saudade.vortex.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscStillDrivingItem extends RecordItem {
	public MusicDiscStillDrivingItem() {
		super(13, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vortex:music_disc.still_driving")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3530);
	}
}
