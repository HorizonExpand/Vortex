
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.block.PreservesJarBlock;
import net.saudade.vortex.block.OilRollBlock;
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
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
