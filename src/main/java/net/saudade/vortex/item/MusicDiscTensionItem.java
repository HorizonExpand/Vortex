
package net.saudade.vortex.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscTensionItem extends RecordItem {
	public MusicDiscTensionItem() {
		super(5, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vortex:music_disc.tension")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2290);
	}
}
