
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class VortexModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VortexMod.MODID);
	public static final RegistryObject<SoundEvent> CRANK = REGISTRY.register("crank", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vortex", "crank")));
}
