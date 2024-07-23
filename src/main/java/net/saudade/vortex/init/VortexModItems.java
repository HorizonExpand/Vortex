
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.item.WheatIconItem;
import net.saudade.vortex.item.WeakRunestoneItem;
import net.saudade.vortex.item.TravelersDiaryItem;
import net.saudade.vortex.item.SwordandShieldIconItem;
import net.saudade.vortex.item.StrongRunestoneItem;
import net.saudade.vortex.item.StarIconItem;
import net.saudade.vortex.item.ScrollOfStrengthItem;
import net.saudade.vortex.item.ScrollIconItem;
import net.saudade.vortex.item.PowerfulRunestoneItem;
import net.saudade.vortex.item.PowerOfTheButterflyItem;
import net.saudade.vortex.item.PotionIconItem;
import net.saudade.vortex.item.NestIconItem;
import net.saudade.vortex.item.MysteriousManuscriptItem;
import net.saudade.vortex.item.LightBlueScrollIconItem;
import net.saudade.vortex.item.LegendaryRunestoneItem;
import net.saudade.vortex.item.InfoIconItem;
import net.saudade.vortex.item.HomeIconItem;
import net.saudade.vortex.item.GreatRunestoneItem;
import net.saudade.vortex.item.GearIconItem;
import net.saudade.vortex.item.FarmersSunflowerHeadItem;
import net.saudade.vortex.item.DivineRunestoneItem;
import net.saudade.vortex.item.CommonRunestoneItem;
import net.saudade.vortex.item.CodexOfTruthItem;
import net.saudade.vortex.item.CartographersNotesItem;
import net.saudade.vortex.item.BreezeIconItem;
import net.saudade.vortex.item.BoxIconItem;
import net.saudade.vortex.item.BottleWithUnrefinedOilItem;
import net.saudade.vortex.item.BottleWithRefinedOilItem;
import net.saudade.vortex.item.BookIconItem;
import net.saudade.vortex.item.Book3IconItem;
import net.saudade.vortex.item.Book2IconItem;
import net.saudade.vortex.item.AncientWritingsItem;
import net.saudade.vortex.item.AgilityoftheLynxItem;
import net.saudade.vortex.item.AdvancedRunestoneItem;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class VortexModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VortexMod.MODID);
	public static final RegistryObject<Item> FARMERS_SUNFLOWER = block(VortexModBlocks.FARMERS_SUNFLOWER);
	public static final RegistryObject<Item> BOX_ICON = REGISTRY.register("box_icon", () -> new BoxIconItem());
	public static final RegistryObject<Item> BREEZE_ICON = REGISTRY.register("breeze_icon", () -> new BreezeIconItem());
	public static final RegistryObject<Item> GEAR_ICON = REGISTRY.register("gear_icon", () -> new GearIconItem());
	public static final RegistryObject<Item> HOME_ICON = REGISTRY.register("home_icon", () -> new HomeIconItem());
	public static final RegistryObject<Item> INFO_ICON = REGISTRY.register("info_icon", () -> new InfoIconItem());
	public static final RegistryObject<Item> POTION_ICON = REGISTRY.register("potion_icon", () -> new PotionIconItem());
	public static final RegistryObject<Item> STAR_ICON = REGISTRY.register("star_icon", () -> new StarIconItem());
	public static final RegistryObject<Item> SWORDAND_SHIELD_ICON = REGISTRY.register("swordand_shield_icon", () -> new SwordandShieldIconItem());
	public static final RegistryObject<Item> WHEAT_ICON = REGISTRY.register("wheat_icon", () -> new WheatIconItem());
	public static final RegistryObject<Item> WEAK_RUNESTONE = REGISTRY.register("weak_runestone", () -> new WeakRunestoneItem());
	public static final RegistryObject<Item> COMMON_RUNESTONE = REGISTRY.register("common_runestone", () -> new CommonRunestoneItem());
	public static final RegistryObject<Item> STRONG_RUNESTONE = REGISTRY.register("strong_runestone", () -> new StrongRunestoneItem());
	public static final RegistryObject<Item> ADVANCED_RUNESTONE = REGISTRY.register("advanced_runestone", () -> new AdvancedRunestoneItem());
	public static final RegistryObject<Item> GREAT_RUNESTONE = REGISTRY.register("great_runestone", () -> new GreatRunestoneItem());
	public static final RegistryObject<Item> POWERFUL_RUNESTONE = REGISTRY.register("powerful_runestone", () -> new PowerfulRunestoneItem());
	public static final RegistryObject<Item> LEGENDARY_RUNESTONE = REGISTRY.register("legendary_runestone", () -> new LegendaryRunestoneItem());
	public static final RegistryObject<Item> DIVINE_RUNESTONE = REGISTRY.register("divine_runestone", () -> new DivineRunestoneItem());
	public static final RegistryObject<Item> NEST_ICON = REGISTRY.register("nest_icon", () -> new NestIconItem());
	public static final RegistryObject<Item> FARMERS_SUNFLOWER_HEAD = REGISTRY.register("farmers_sunflower_head", () -> new FarmersSunflowerHeadItem());
	public static final RegistryObject<Item> BOTTLE_WITH_REFINED_OIL = REGISTRY.register("bottle_with_refined_oil", () -> new BottleWithRefinedOilItem());
	public static final RegistryObject<Item> BOTTLE_WITH_UNREFINED_OIL = REGISTRY.register("bottle_with_unrefined_oil", () -> new BottleWithUnrefinedOilItem());
	public static final RegistryObject<Item> BOOK1_ICON = REGISTRY.register("book1_icon", () -> new BookIconItem());
	public static final RegistryObject<Item> BOOK2_ICON = REGISTRY.register("book2_icon", () -> new Book2IconItem());
	public static final RegistryObject<Item> BOOK3_ICON = REGISTRY.register("book3_icon", () -> new Book3IconItem());
	public static final RegistryObject<Item> SCROLL_ICON = REGISTRY.register("scroll_icon", () -> new ScrollIconItem());
	public static final RegistryObject<Item> LIGHT_BLUE_SCROLL_ICON = REGISTRY.register("light_blue_scroll_icon", () -> new LightBlueScrollIconItem());
	public static final RegistryObject<Item> AGILITY_OF_THE_LYNX = REGISTRY.register("agility_of_the_lynx", () -> new AgilityoftheLynxItem());
	public static final RegistryObject<Item> ANCIENT_WRITINGS = REGISTRY.register("ancient_writings", () -> new AncientWritingsItem());
	public static final RegistryObject<Item> CARTOGRAPHERS_NOTES = REGISTRY.register("cartographers_notes", () -> new CartographersNotesItem());
	public static final RegistryObject<Item> CODEX_OF_TRUTH = REGISTRY.register("codex_of_truth", () -> new CodexOfTruthItem());
	public static final RegistryObject<Item> MYSTERIOUS_MANUSCRIPT = REGISTRY.register("mysterious_manuscript", () -> new MysteriousManuscriptItem());
	public static final RegistryObject<Item> POWER_OF_THE_BUTTERFLY = REGISTRY.register("power_of_the_butterfly", () -> new PowerOfTheButterflyItem());
	public static final RegistryObject<Item> SCROLL_OF_STRENGTH = REGISTRY.register("scroll_of_strength", () -> new ScrollOfStrengthItem());
	public static final RegistryObject<Item> TRAVELERS_DIARY = REGISTRY.register("travelers_diary", () -> new TravelersDiaryItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
