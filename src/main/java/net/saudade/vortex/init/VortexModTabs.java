
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
				tabData.accept(VortexModItems.BRINE.get());
				tabData.accept(VortexModBlocks.CRANK.get().asItem());
				tabData.accept(VortexModBlocks.OIL_ROLL.get().asItem());
				tabData.accept(VortexModBlocks.PRESERVES_JAR.get().asItem());
				tabData.accept(VortexModBlocks.WATER_WELL.get().asItem());
				tabData.accept(VortexModBlocks.MYSTICAL_WELL.get().asItem());
			}).build());
	public static final RegistryObject<CreativeModeTab> VORTEX_ITEMS_TAB = REGISTRY.register("vortex_items_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vortex.vortex_items_tab")).icon(() -> new ItemStack(VortexModItems.MYSTICAL_COIN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VortexModItems.DEFAMED_CRYSTAL_OUTGROWTH_HELMET.get());
				tabData.accept(VortexModItems.THE_CURSED_HAND.get());
				tabData.accept(VortexModItems.MYSTICAL_COIN.get());
				tabData.accept(VortexModItems.ANCIENT_WRITINGS.get());
				tabData.accept(VortexModItems.CARTOGRAPHERS_NOTES.get());
				tabData.accept(VortexModItems.CODEX_OF_TRUTH.get());
				tabData.accept(VortexModItems.MYSTERIOUS_MANUSCRIPT.get());
				tabData.accept(VortexModItems.POWER_OF_THE_BUTTERFLY.get());
				tabData.accept(VortexModItems.TRAVELERS_DIARY.get());
				tabData.accept(VortexModItems.ENCHANTERS_CONTRACT.get());
				tabData.accept(VortexModItems.WARRIORS_CONTRACT.get());
				tabData.accept(VortexModItems.FARMERS_CONTRACT.get());
				tabData.accept(VortexModItems.INNOVATORS_CONTRACT.get());
				tabData.accept(VortexModItems.TRAVELERS_CONTRACT.get());
				tabData.accept(VortexModItems.DWARVEN_GEAR.get());
				tabData.accept(VortexModItems.ESSENCE_OF_MELTING.get());
				tabData.accept(VortexModItems.ESSENCE_OF_NATURE.get());
				tabData.accept(VortexModItems.ESSENCE_OF_MAGIC.get());
				tabData.accept(VortexModItems.ESSENCE_OF_EARTHQUAKE.get());
				tabData.accept(VortexModItems.ESSENCE_OF_THE_STORM.get());
				tabData.accept(VortexModItems.THE_ESSENCE_OF_A_DEMI_GOD.get());
				tabData.accept(VortexModItems.ROUGH_STONY_MIX.get());
				tabData.accept(VortexModItems.ORCISH_SKULL.get());
				tabData.accept(VortexModItems.ORCISH_QUIVER.get());
				tabData.accept(VortexModItems.ORCISH_MONOCLE.get());
				tabData.accept(VortexModItems.ORCISH_BOTTLE.get());
				tabData.accept(VortexModItems.ORCISH_ARTIFACT.get());
				tabData.accept(VortexModItems.HEXAGONAL_MANA_STONE.get());
				tabData.accept(VortexModItems.THE_PEARL_OF_GNUMUSES.get());
				tabData.accept(VortexModItems.THE_PLAGUE_INGOT.get());
				tabData.accept(VortexModItems.ORCISH_DUST.get());
				tabData.accept(VortexModItems.OZGLOZ_INGOT.get());
				tabData.accept(VortexModItems.BLOOMING_STEEL_INGOT.get());
				tabData.accept(VortexModItems.INGOT_OF_SPROUTED_STEEL.get());
				tabData.accept(VortexModItems.RAW_RAT_TOKEN.get());
				tabData.accept(VortexModItems.OZGLOZ_MIXTURE.get());
				tabData.accept(VortexModBlocks.THE_BEACON_OF_DESTINY.get().asItem());
				tabData.accept(VortexModItems.GHOSTLY_SHARD.get());
			}).withTabsBefore(VORTEX_FARMING_TAB.getId()).build());
	public static final RegistryObject<CreativeModeTab> VORTEX_TABLETS_TAB = REGISTRY.register("vortex_tablets_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vortex.vortex_tablets_tab")).icon(() -> new ItemStack(VortexModItems.TABLET_OF_STORM.get())).displayItems((parameters, tabData) -> {
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
			}).withTabsBefore(VORTEX_ITEMS_TAB.getId()).build());
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
				tabData.accept(VortexModItems.AGILITY_OF_THE_LYNX.get());
				tabData.accept(VortexModItems.SCROLL_OF_STRENGTH.get());
			}).withTabsBefore(VORTEX_TABLETS_TAB.getId()).build());
	public static final RegistryObject<CreativeModeTab> VORTEX_RUNESTONES_TAB = REGISTRY.register("vortex_runestones_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vortex.vortex_runestones_tab")).icon(() -> new ItemStack(VortexModItems.DIVINE_RUNESTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VortexModItems.WEAK_RUNESTONE.get());
				tabData.accept(VortexModItems.COMMON_RUNESTONE.get());
				tabData.accept(VortexModItems.STRONG_RUNESTONE.get());
				tabData.accept(VortexModItems.ADVANCED_RUNESTONE.get());
				tabData.accept(VortexModItems.GREAT_RUNESTONE.get());
				tabData.accept(VortexModItems.POWERFUL_RUNESTONE.get());
				tabData.accept(VortexModItems.LEGENDARY_RUNESTONE.get());
				tabData.accept(VortexModItems.DIVINE_RUNESTONE.get());
			}).withTabsBefore(VORTEX_ICONS_TAB.getId()).build());
}
