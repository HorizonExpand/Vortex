
package net.saudade.vortex.init;

import net.saudade.vortex.jei_recipes.PreservesJarJEICategoryRecipeCategory;
import net.saudade.vortex.jei_recipes.PreservesJarJEICategoryRecipe;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class VortexModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<PreservesJarJEICategoryRecipe> PreservesJarJEICategory_Type = new mezz.jei.api.recipe.RecipeType<>(PreservesJarJEICategoryRecipeCategory.UID, PreservesJarJEICategoryRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("vortex:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new PreservesJarJEICategoryRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<PreservesJarJEICategoryRecipe> PreservesJarJEICategoryRecipes = recipeManager.getAllRecipesFor(PreservesJarJEICategoryRecipe.Type.INSTANCE);
		registration.addRecipes(PreservesJarJEICategory_Type, PreservesJarJEICategoryRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(VortexModBlocks.PRESERVES_JAR.get().asItem()), PreservesJarJEICategory_Type);
	}
}
