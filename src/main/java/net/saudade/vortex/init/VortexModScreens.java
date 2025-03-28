
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.client.gui.PreservesJarGUIScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VortexModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(VortexModMenus.PRESERVES_JAR_GUI.get(), PreservesJarGUIScreen::new);
		});
	}
}
