
package net.saudade.vortex.jei_recipes;

import net.saudade.vortex.init.VortexModJeiPlugin;
import net.saudade.vortex.init.VortexModBlocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class PreservesJarJEICategoryRecipeCategory implements IRecipeCategory<PreservesJarJEICategoryRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("vortex", "preserves_jar_jei_category");
	public final static ResourceLocation TEXTURE = new ResourceLocation("vortex", "textures/screens/preserves_jar_gui_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public PreservesJarJEICategoryRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 79);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(VortexModBlocks.PRESERVES_JAR.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<PreservesJarJEICategoryRecipe> getRecipeType() {
		return VortexModJeiPlugin.PreservesJarJEICategory_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Preserves Jar");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, PreservesJarJEICategoryRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 34, 0).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 52, 17).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 70, 17).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 34, 35).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.INPUT, 52, 35).addIngredients(recipe.getIngredients().get(4));
		builder.addSlot(RecipeIngredientRole.INPUT, 70, 35).addIngredients(recipe.getIngredients().get(5));
		builder.addSlot(RecipeIngredientRole.INPUT, 124, 17).addIngredients(recipe.getIngredients().get(6));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 124, 53).addItemStack(recipe.getResultItem(null));
	}
}
