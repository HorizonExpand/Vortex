
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
				tabData.accept(VortexModItems.FARMERS_SUNFLOWER_HEAD.get());
				tabData.accept(VortexModBlocks.FARMERS_SUNFLOWER.get().asItem());
				tabData.accept(VortexModItems.BOTTLE_WITH_UNREFINED_OIL.get());
				tabData.accept(VortexModItems.BOTTLE_WITH_REFINED_OIL.get());
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
			})

					.build());
	public static final RegistryObject<CreativeModeTab> VORTEX_ICONS_TAB = REGISTRY.register("vortex_icons_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vortex.vortex_icons_tab")).icon(() -> new ItemStack(VortexModItems.INFO_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VortexModItems.INFO_ICON.get());
				tabData.accept(VortexModItems.STAR_ICON.get());
				tabData.accept(VortexModItems.WHEAT_ICON.get());
				tabData.accept(VortexModItems.HOME_ICON.get());
				tabData.accept(VortexModItems.NEST_ICON.get());
				tabData.accept(VortexModItems.SWORDAND_SHIELD_ICON.get());
				tabData.accept(VortexModItems.POTION_ICON.get());
				tabData.accept(VortexModItems.GEAR_ICON.get());
				tabData.accept(VortexModItems.BOX_ICON.get());
				tabData.accept(VortexModItems.BREEZE_ICON.get());
			})

					.build());
}