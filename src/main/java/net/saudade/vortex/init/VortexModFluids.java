
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.fluid.LiquidSolariteFluid;
import net.saudade.vortex.fluid.LiquidMagicGoldFluid;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class VortexModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, VortexMod.MODID);
	public static final RegistryObject<FlowingFluid> LIQUID_SOLARITE = REGISTRY.register("liquid_solarite", () -> new LiquidSolariteFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_SOLARITE = REGISTRY.register("flowing_liquid_solarite", () -> new LiquidSolariteFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LIQUID_MAGIC_GOLD = REGISTRY.register("liquid_magic_gold", () -> new LiquidMagicGoldFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_MAGIC_GOLD = REGISTRY.register("flowing_liquid_magic_gold", () -> new LiquidMagicGoldFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_SOLARITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_SOLARITE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUID_MAGIC_GOLD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_MAGIC_GOLD.get(), RenderType.translucent());
		}
	}
}
