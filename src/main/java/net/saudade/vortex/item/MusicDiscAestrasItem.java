
package net.saudade.vortex.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscAestrasItem extends RecordItem {
	public MusicDiscAestrasItem() {
		super(8, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vortex:music_disc.aestras")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3050);
	}
}
