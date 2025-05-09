
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.entity.ReposedGaiaEntity;
import net.saudade.vortex.entity.MysticalCoinEntityEntity;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VortexModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VortexMod.MODID);
	public static final RegistryObject<EntityType<MysticalCoinEntityEntity>> MYSTICAL_COIN_ENTITY = register("mystical_coin_entity",
			EntityType.Builder.<MysticalCoinEntityEntity>of(MysticalCoinEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MysticalCoinEntityEntity::new)

					.sized(0.3f, 0.1f));
	public static final RegistryObject<EntityType<ReposedGaiaEntity>> REPOSED_GAIA = register("reposed_gaia",
			EntityType.Builder.<ReposedGaiaEntity>of(ReposedGaiaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReposedGaiaEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MysticalCoinEntityEntity.init();
			ReposedGaiaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MYSTICAL_COIN_ENTITY.get(), MysticalCoinEntityEntity.createAttributes().build());
		event.put(REPOSED_GAIA.get(), ReposedGaiaEntity.createAttributes().build());
	}
}
