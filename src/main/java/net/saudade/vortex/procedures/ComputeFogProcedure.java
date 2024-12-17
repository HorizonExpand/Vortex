package net.saudade.vortex.procedures;

import net.saudade.vortex.network.VortexModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.mojang.blaze3d.shaders.FogShape;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class ComputeFogProcedure {
	public static ViewportEvent.RenderFog provider = null;

	public static void setDistance(float start, float end) {
		provider.setNearPlaneDistance(start);
		provider.setFarPlaneDistance(end);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	public static void setShape(FogShape shape) {
		provider.setFogShape(shape);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void renderFog(ViewportEvent.RenderFog event) {
		provider = event;
		if (provider.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
			ClientLevel level = Minecraft.getInstance().level;
			Entity entity = provider.getCamera().getEntity();
			if (level != null && entity != null) {
				Vec3 pos = entity.getPosition((float) provider.getPartialTick());
				execute(provider, level, pos.x(), pos.y(), pos.z(), entity);
			}
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).DenseFog == true) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("vortex:calcite_jungle"))) {
				if (entity.isUnderWater()) {
					setDistance(0, 32);
				} else {
					setDistance(0, 192);
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("swamp"))) {
				if (entity.isUnderWater()) {
					setDistance(0, 16);
				} else {
					setDistance(0, 64);
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mangrove_swamp"))) {
				if (entity.isUnderWater()) {
					setDistance(0, 24);
				} else {
					setDistance(8, 96);
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("vortex:mixed_forest"))) {
				if (entity.isUnderWater()) {
					setDistance(0, 32);
				} else {
					if (world.dayTime() > 10500 && world.dayTime() < 13500) {
						setDistance(0, 160);
					} else {
						setDistance(0, 240);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_mountain")))) {
				if (entity.isUnderWater()) {
					setDistance(0, 32);
				} else {
					setDistance(48, 256);
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_ocean")))) {
				if (entity.isUnderWater()) {
					setDistance(8, 64);
				} else {
					setDistance(32, 320);
				}
			} else {
				if (entity.isUnderWater()) {
					setDistance(0, 32);
				} else {
					setDistance(128, 320);
				}
			}
		}
	}
}
