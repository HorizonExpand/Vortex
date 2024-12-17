
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.block.WaterWellBlock;
import net.saudade.vortex.block.TheBeaconOfDestinyBlock;
import net.saudade.vortex.block.PreservesJarBlock;
import net.saudade.vortex.block.OilRollBlock;
import net.saudade.vortex.block.MysticalWellBlock;
import net.saudade.vortex.block.LiquidSolariteBlock;
import net.saudade.vortex.block.LiquidMagicGoldBlock;
import net.saudade.vortex.block.FarmersSunflowerBlock;
import net.saudade.vortex.block.CrankBlock;
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
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
