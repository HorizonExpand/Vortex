
package net.saudade.vortex.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscCavesItem extends RecordItem {
	public MusicDiscCavesItem() {
		super(11, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vortex:music_disc.caves")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2370);
	}
}
