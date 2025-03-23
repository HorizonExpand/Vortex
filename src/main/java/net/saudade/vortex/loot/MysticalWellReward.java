package net.saudade.vortex.loot;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.fml.ModList;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class MysticalWellReward {
    @SubscribeEvent
    public void onLootTableLoad(LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("vortex", "gameplay/mystical_well_reward"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1));

            // Предметы из Minecraft (всегда доступны)
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "amethyst_block"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "pufferfish"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "golden_apple"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "bee_spawn_egg"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "sniffer_egg"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "turtle_egg"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "bee_nest"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "skeleton_skull"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "saddle"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "rabbit_hide"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "emerald"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "phantom_membrane"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "obsidian"))));

            // Предметы из мода vortex (без проверки, так как мод всегда есть)
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("vortex", "bottle_with_oil"))));
            poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("vortex", "essence_of_nature"))));

            // Предметы из других модов с проверкой на наличие
            if (ModList.get().isLoaded("supplementaries")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("supplementaries", "soap"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("supplementaries", "sack"))));
            }
            if (ModList.get().isLoaded("duckling")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("duckling", "holiday_fruit_cake"))));
            }
            if (ModList.get().isLoaded("spelunkery")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("spelunkery", "cinnabar_block"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("spelunkery", "sulfur_block"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("spelunkery", "mineomite"))));
            }
            if (ModList.get().isLoaded("botania")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("botania", "mana_diamond"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("botania", "hydroangeas"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("botania", "endoflame"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("botania", "manasteel_ingot"))));
            }
            if (ModList.get().isLoaded("farmersdelight")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("farmersdelight", "melon_juice"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("farmersdelight", "barbecue_stick"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("farmersdelight", "canvas"))));
            }
            if (ModList.get().isLoaded("eidolon")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("eidolon", "pewter_blend"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("eidolon", "zombie_heart"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("eidolon", "raven_feather"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("eidolon", "tattered_cloth"))));
            }
            if (ModList.get().isLoaded("minecolonies")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecolonies", "ancienttome"))));
            }
            if (ModList.get().isLoaded("gnumus")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("gnumus", "grilled_juicy_meat"))));
            }
            if (ModList.get().isLoaded("epicsamurai")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("epicsamurai", "cloth"))));
            }
            if (ModList.get().isLoaded("naturalist")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("naturalist", "teddy_bear"))));
            }
            if (ModList.get().isLoaded("rats")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("rats", "block_of_cheese"))));
            }
            if (ModList.get().isLoaded("seeds")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("seeds", "sharp_leaf"))));
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("seeds", "medium_repairer"))));
            }
            if (ModList.get().isLoaded("ecologics")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("ecologics", "crab_claw"))));
            }
            if (ModList.get().isLoaded("vinery")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("vinery", "aegis_wine"))));
            }
            if (ModList.get().isLoaded("quark")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("quark", "gunpowder_sack"))));
            }
            if (ModList.get().isLoaded("aquamirae")) {
                poolBuilder.add(LootItem.lootTableItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation("aquamirae", "treasure_pouch"))));
            }

            event.getTable().addPool(poolBuilder.build());
        }
    }
}