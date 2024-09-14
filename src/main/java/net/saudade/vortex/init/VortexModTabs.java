
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class VortexModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VortexMod.MODID);
	public static final RegistryObject<CreativeModeTab> VORTEX_FARMING_TAB = REGISTRY.register("vortex_farming_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vortex.vortex_farming_tab")).icon(() -> new ItemStack(VortexModItems.FARMERS_SUNFLOWER_HEAD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VortexModBlocks.FARMERS_SUNFLOWER.get().asItem());
				tabData.accept(VortexModItems.FARMERS_SUNFLOWER_HEAD.get());
				tabData.accept(VortexModItems.BOTTLE_WITH_OIL.get());
				tabData.accept(VortexModItems.PEELED_FARMERS_SUNFLOWER_SEED.get());
				tabData.accept(VortexModItems.FRIED_FARMERS_SUNFLOWER_SEED.get());
				tabData.accept(VortexModBlocks.CRANK.get().asItem());
				tabData.accept(VortexModBlocks.OIL_ROLL.get().asItem());
				tabData.accept(VortexModBlocks.PRESERVES_JAR.get().asItem());
				tabData.accept(VortexModItems.BRINE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> VORTEX_ITEMS_TAB = REGISTRY.register("vortex_items_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vortex.vortex_items_tab")).icon(() -> new ItemStack(VortexModItems.DIVINE_RUNESTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VortexModItems.WEAK_RUNESTONE.get());
				tabData.accept(VortexModItems.COMMON_RUNESTONE.get());
				tabData.accept(VortexModItems.STRONG_RUNESTONE.get());
				tabData.accept(VortexModItems.ADVANCED_RUNESTONE.get());
				tabData.accept(VortexModItems.GREAT_RUNESTONE.get());
				tabData.accept(VortexModItems.POWERFUL_RUNESTONE.get());
				tabData.accept(VortexModItems.LEGENDARY_RUNESTONE.get());
				tabData.accept(VortexModItems.DIVINE_RUNESTONE.get());
				tabData.accept(VortexModItems.AGILITY_OF_THE_LYNX.get());
				tabData.accept(VortexModItems.ANCIENT_WRITINGS.get());
				tabData.accept(VortexModItems.CARTOGRAPHERS_NOTES.get());
				tabData.accept(VortexModItems.CODEX_OF_TRUTH.get());
				tabData.accept(VortexModItems.MYSTERIOUS_MANUSCRIPT.get());
				tabData.accept(VortexModItems.POWER_OF_THE_BUTTERFLY.get());
				tabData.accept(VortexModItems.SCROLL_OF_STRENGTH.get());
				tabData.accept(VortexModItems.TRAVELERS_DIARY.get());
				tabData.accept(VortexModItems.ENCHANTERS_CONTRACT.get());
				tabData.accept(VortexModItems.WARRIORS_CONTRACT.get());
				tabData.accept(VortexModItems.FARMERS_CONTRACT.get());
				tabData.accept(VortexModItems.INNOVATORS_CONTRACT.get());
				tabData.accept(VortexModItems.TRAVELERS_CONTRACT.get());
				tabData.accept(VortexModItems.TABLET_OF_CLEAR_SKY.get());
				tabData.accept(VortexModItems.TABLET_OF_BREATH_OF_WIND.get());
				tabData.accept(VortexModItems.TABLET_OF_SWINGING_MAPLE.get());
				tabData.accept(VortexModItems.TABLET_OF_TREMBLING_OF_EARTH.get());
				tabData.accept(VortexModItems.TABLET_OF_FAR_THUNDER.get());
				tabData.accept(VortexModItems.TABLET_OF_CATACLYSM.get());
				tabData.accept(VortexModItems.TABLET_OF_LOST_HOUSES.get());
				tabData.accept(VortexModItems.TABLET_OF_FALLEN_DESTINIES.get());
				tabData.accept(VortexModItems.TABLET_OF_ABANDONED_PLACES.get());
				tabData.accept(VortexModItems.TABLET_OF_STORM.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> VORTEX_ICONS_TAB = REGISTRY.register("vortex_icons_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vortex.vortex_icons_tab")).icon(() -> new ItemStack(VortexModItems.INFO_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VortexModItems.BOX_ICON.get());
				tabData.accept(VortexModItems.BREEZE_ICON.get());
				tabData.accept(VortexModItems.GEAR_ICON.get());
				tabData.accept(VortexModItems.HOME_ICON.get());
				tabData.accept(VortexModItems.INFO_ICON.get());
				tabData.accept(VortexModItems.POTION_ICON.get());
				tabData.accept(VortexModItems.STAR_ICON.get());
				tabData.accept(VortexModItems.SWORDAND_SHIELD_ICON.get());
				tabData.accept(VortexModItems.WHEAT_ICON.get());
				tabData.accept(VortexModItems.NEST_ICON.get());
				tabData.accept(VortexModItems.BOOK1_ICON.get());
				tabData.accept(VortexModItems.BOOK2_ICON.get());
				tabData.accept(VortexModItems.BOOK3_ICON.get());
				tabData.accept(VortexModItems.SCROLL_ICON.get());
				tabData.accept(VortexModItems.LIGHT_BLUE_SCROLL_ICON.get());
			})

					.build());
}
