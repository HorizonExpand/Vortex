package net.saudade.vortex.init;

import net.saudade.vortex.jei_recipes.PreservesJarJEICategoryRecipe;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

@Mod.EventBusSubscriber(modid = VortexMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VortexModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "vortex");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("preserves_jar_jei_category", () -> PreservesJarJEICategoryRecipe.Serializer.INSTANCE);
		});
	}
}
