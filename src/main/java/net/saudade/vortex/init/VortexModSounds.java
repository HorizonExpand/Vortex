
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
	public static final RegistryObject<SoundEvent> MUSIC_DISC_AESTRAS = REGISTRY.register("music_disc.aestras", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vortex", "music_disc.aestras")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_CAVES = REGISTRY.register("music_disc.caves", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vortex", "music_disc.caves")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_STILL_DRIVING = REGISTRY.register("music_disc.still_driving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vortex", "music_disc.still_driving")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_TECHNO_MOUNTAIN = REGISTRY.register("music_disc.techno_mountain", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vortex", "music_disc.techno_mountain")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_TENSION = REGISTRY.register("music_disc.tension", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vortex", "music_disc.tension")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_TURN = REGISTRY.register("music_disc.turn", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("vortex", "music_disc.turn")));
}
