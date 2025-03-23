
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.world.inventory.PreservesJarGUIMenu;
import net.saudade.vortex.world.inventory.CasiwellGUIMenu;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class VortexModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, VortexMod.MODID);
	public static final RegistryObject<MenuType<PreservesJarGUIMenu>> PRESERVES_JAR_GUI = REGISTRY.register("preserves_jar_gui", () -> IForgeMenuType.create(PreservesJarGUIMenu::new));
	public static final RegistryObject<MenuType<CasiwellGUIMenu>> CASIWELL_GUI = REGISTRY.register("casiwell_gui", () -> IForgeMenuType.create(CasiwellGUIMenu::new));
}
