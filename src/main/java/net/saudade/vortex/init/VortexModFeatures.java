
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.world.features.MixedForestTallGrassFeature;
import net.saudade.vortex.world.features.CalcitePillarStructureFeature;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class VortexModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, VortexMod.MODID);
	public static final RegistryObject<Feature<?>> CALCITE_PILLAR_STRUCTURE = REGISTRY.register("calcite_pillar_structure", CalcitePillarStructureFeature::new);
	public static final RegistryObject<Feature<?>> MIXED_FOREST_TALL_GRASS = REGISTRY.register("mixed_forest_tall_grass", MixedForestTallGrassFeature::new);
}
