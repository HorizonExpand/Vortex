
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.block.FarmersSunflowerBlock;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class VortexModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VortexMod.MODID);
	public static final RegistryObject<Block> FARMERS_SUNFLOWER = REGISTRY.register("farmers_sunflower", () -> new FarmersSunflowerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
