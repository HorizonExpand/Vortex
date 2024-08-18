package net.saudade.vortex.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class BrinePriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData()
					.setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)
							+ ((ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("0"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
									? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("0"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
									: 0)
									+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("1"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
											? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("1"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
											: 0)
									+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("2"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
											? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("2"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
											: 0)
									+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("3"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
											? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("3"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
											: 0)
									+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("4"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
											? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("4"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
											: 0)
									+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("5"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
											? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("5"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
											: 0))
									* 1.5));
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("" + ((ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("0"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
					? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("0"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
					: 0)
					+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("1"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
							? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("1"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
							: 0)
					+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("2"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
							? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("2"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
							: 0)
					+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("3"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
							? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("3"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
							: 0)
					+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("4"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
							? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("4"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
							: 0)
					+ (ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("5"))).toLowerCase(java.util.Locale.ENGLISH))).isEdible()
							? ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("5"))).toLowerCase(java.util.Locale.ENGLISH))).getFoodProperties().getNutrition()
							: 0))
					* 1.5)), false);
	}
}
