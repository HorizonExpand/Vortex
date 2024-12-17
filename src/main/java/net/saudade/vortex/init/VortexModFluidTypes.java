
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.fluid.types.LiquidSolariteFluidType;
import net.saudade.vortex.fluid.types.LiquidMagicGoldFluidType;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class VortexModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, VortexMod.MODID);
	public static final RegistryObject<FluidType> LIQUID_SOLARITE_TYPE = REGISTRY.register("liquid_solarite", () -> new LiquidSolariteFluidType());
	public static final RegistryObject<FluidType> LIQUID_MAGIC_GOLD_TYPE = REGISTRY.register("liquid_magic_gold", () -> new LiquidMagicGoldFluidType());
}
