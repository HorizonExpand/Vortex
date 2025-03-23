
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.block.WaterWellBlock;
import net.saudade.vortex.block.TraderHeadBlock;
import net.saudade.vortex.block.TheBeaconOfDestinyBlock;
import net.saudade.vortex.block.ProtagonistHeadBlock;
import net.saudade.vortex.block.PreservesJarBlock;
import net.saudade.vortex.block.OrcishSkullBlock;
import net.saudade.vortex.block.OilRollBlock;
import net.saudade.vortex.block.MysticalWellBlock;
import net.saudade.vortex.block.LiquidSolariteBlock;
import net.saudade.vortex.block.LiquidMagicGoldBlock;
import net.saudade.vortex.block.LightHeadBlock;
import net.saudade.vortex.block.FarmersSunflowerBlock;
import net.saudade.vortex.block.EngineerHeadBlock;
import net.saudade.vortex.block.EnchantressHeadBlock;
import net.saudade.vortex.block.ElderHeadBlock;
import net.saudade.vortex.block.CrankBlock;
import net.saudade.vortex.block.ClamorOfDeathsEmissariesBlock;
import net.saudade.vortex.block.CasiwellBlock;
import net.saudade.vortex.block.CackleOfVexingBlightBlock;
import net.saudade.vortex.block.BanditHeadBlock;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class VortexModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VortexMod.MODID);
	public static final RegistryObject<Block> FARMERS_SUNFLOWER = REGISTRY.register("farmers_sunflower", () -> new FarmersSunflowerBlock());
	public static final RegistryObject<Block> CRANK = REGISTRY.register("crank", () -> new CrankBlock());
	public static final RegistryObject<Block> OIL_ROLL = REGISTRY.register("oil_roll", () -> new OilRollBlock());
	public static final RegistryObject<Block> PRESERVES_JAR = REGISTRY.register("preserves_jar", () -> new PreservesJarBlock());
	public static final RegistryObject<Block> WATER_WELL = REGISTRY.register("water_well", () -> new WaterWellBlock());
	public static final RegistryObject<Block> MYSTICAL_WELL = REGISTRY.register("mystical_well", () -> new MysticalWellBlock());
	public static final RegistryObject<Block> THE_BEACON_OF_DESTINY = REGISTRY.register("the_beacon_of_destiny", () -> new TheBeaconOfDestinyBlock());
	public static final RegistryObject<Block> LIQUID_SOLARITE = REGISTRY.register("liquid_solarite", () -> new LiquidSolariteBlock());
	public static final RegistryObject<Block> LIQUID_MAGIC_GOLD = REGISTRY.register("liquid_magic_gold", () -> new LiquidMagicGoldBlock());
	public static final RegistryObject<Block> BANDIT_HEAD = REGISTRY.register("bandit_head", () -> new BanditHeadBlock());
	public static final RegistryObject<Block> ELDER_HEAD = REGISTRY.register("elder_head", () -> new ElderHeadBlock());
	public static final RegistryObject<Block> ENCHANTRESS_HEAD = REGISTRY.register("enchantress_head", () -> new EnchantressHeadBlock());
	public static final RegistryObject<Block> ENGINEER_HEAD = REGISTRY.register("engineer_head", () -> new EngineerHeadBlock());
	public static final RegistryObject<Block> LIGHT_HEAD = REGISTRY.register("light_head", () -> new LightHeadBlock());
	public static final RegistryObject<Block> PROTAGONIST_HEAD = REGISTRY.register("protagonist_head", () -> new ProtagonistHeadBlock());
	public static final RegistryObject<Block> TRADER_HEAD = REGISTRY.register("trader_head", () -> new TraderHeadBlock());
	public static final RegistryObject<Block> CASIWELL = REGISTRY.register("casiwell", () -> new CasiwellBlock());
	public static final RegistryObject<Block> CLAMOR_OF_DEATHS_EMISSARIES = REGISTRY.register("clamor_of_deaths_emissaries", () -> new ClamorOfDeathsEmissariesBlock());
	public static final RegistryObject<Block> CACKLE_OF_VEXING_BLIGHT = REGISTRY.register("cackle_of_vexing_blight", () -> new CackleOfVexingBlightBlock());
	public static final RegistryObject<Block> ORCISH_SKULL = REGISTRY.register("orcish_skull", () -> new OrcishSkullBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
