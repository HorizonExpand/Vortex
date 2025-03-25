
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
				tabData.accept(VortexModItems.MAYO.get());
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
				tabData.accept(VortexModItems.ORCISH_QUIVER.get());
				tabData.accept(VortexModItems.ORCISH_MONOCLE.get());
				tabData.accept(VortexModItems.ORCISH_ARTIFACT.get());
				tabData.accept(VortexModItems.ORCISH_BOTTLE.get());
				tabData.accept(VortexModItems.ORCISH_DUST.get());
				tabData.accept(VortexModItems.DWARVEN_GEAR.get());
				tabData.accept(VortexModItems.ESSENCE_OF_MELTING.get());
				tabData.accept(VortexModItems.ESSENCE_OF_NATURE.get());
				tabData.accept(VortexModItems.ESSENCE_OF_MAGIC.get());
				tabData.accept(VortexModItems.ESSENCE_OF_EARTHQUAKE.get());
				tabData.accept(VortexModItems.ESSENCE_OF_THE_STORM.get());
				tabData.accept(VortexModItems.THE_ESSENCE_OF_A_DEMI_GOD.get());
				tabData.accept(VortexModItems.ROUGH_STONY_MIX.get());
				tabData.accept(VortexModItems.HEXAGONAL_MANA_STONE.get());
				tabData.accept(VortexModItems.THE_PEARL_OF_GNUMUSES.get());
				tabData.accept(VortexModItems.THE_PLAGUE_INGOT.get());
				tabData.accept(VortexModItems.OZGLOZ_INGOT.get());
				tabData.accept(VortexModItems.BLOOMING_STEEL_INGOT.get());
				tabData.accept(VortexModItems.INGOT_OF_SPROUTED_STEEL.get());
				tabData.accept(VortexModItems.RAW_RAT_TOKEN.get());
				tabData.accept(VortexModItems.OZGLOZ_MIXTURE.get());
				tabData.accept(VortexModBlocks.THE_BEACON_OF_DESTINY.get().asItem());
				tabData.accept(VortexModItems.GHOSTLY_SHARD.get());
				tabData.accept(VortexModItems.WILL_OF_THE_CHAOSBORN.get());
				tabData.accept(VortexModItems.TEAR_OF_THE_ALLFATHERS.get());
				tabData.accept(VortexModItems.ATOMIC_SUSPENSION.get());
				tabData.accept(VortexModItems.ESSENCE_OF_CATACLYSM.get());
				tabData.accept(VortexModItems.DYING_BREATH_OF_FORGOTTEN_TIMES.get());
				tabData.accept(VortexModItems.HEAT_OF_THE_SCORCHING_DESERT.get());
				tabData.accept(VortexModItems.HUM_OF_UNDERWATER_DEPTHS.get());
				tabData.accept(VortexModItems.WHISPER_OF_THE_ALLURING_ABYSS.get());
				tabData.accept(VortexModItems.CLANK_OF_TEMPERED_METALS.get());
				tabData.accept(VortexModItems.HOWL_OF_MERCILESS_FLAME.get());
				tabData.accept(VortexModItems.RIFT_OF_FORGOTTEN_CHAOS.get());
				tabData.accept(VortexModItems.VISAGE_OF_DEPARTED_RULERS.get());
				tabData.accept(VortexModItems.RAW_CHARGED_QUALADIUM.get());
				tabData.accept(VortexModItems.RAW_GEMINIUM.get());
				tabData.accept(VortexModItems.MATERIAL_ESSENCE.get());
				tabData.accept(VortexModItems.CORE_OF_MATTER.get());
				tabData.accept(VortexModItems.WHIRL_OF_EXISTENCE.get());
				tabData.accept(VortexModItems.RESONATING_CRYSTAL_HEART.get());
				tabData.accept(VortexModItems.CLAVADIUM_ROCK.get());
				tabData.accept(VortexModBlocks.CLAMOR_OF_DEATHS_EMISSARIES.get().asItem());
				tabData.accept(VortexModBlocks.CACKLE_OF_VEXING_BLIGHT.get().asItem());
				tabData.accept(VortexModItems.WANNABEGG.get());
				tabData.accept(VortexModItems.ENERGY_ROCK.get());
				tabData.accept(VortexModItems.ENERIUM_ROCK.get());
				tabData.accept(VortexModBlocks.ORCISH_SKULL.get().asItem());
			}).withTabsBefore(VORTEX_FARMING_TAB.getId()).build());
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
				tabData.accept(VortexModItems.ULTIMATE_RUNESTONE.get());
				tabData.accept(VortexModItems.INSANE_RUNESTONE.get());
				tabData.accept(VortexModItems.BELL.get());
				tabData.accept(VortexModBlocks.BANDIT_HEAD.get().asItem());
				tabData.accept(VortexModBlocks.ELDER_HEAD.get().asItem());
				tabData.accept(VortexModBlocks.ENCHANTRESS_HEAD.get().asItem());
				tabData.accept(VortexModBlocks.ENGINEER_HEAD.get().asItem());
				tabData.accept(VortexModBlocks.LIGHT_HEAD.get().asItem());
				tabData.accept(VortexModBlocks.PROTAGONIST_HEAD.get().asItem());
				tabData.accept(VortexModBlocks.TRADER_HEAD.get().asItem());
			}).withTabsBefore(VORTEX_RUNESTONES_TAB.getId()).build());
}
