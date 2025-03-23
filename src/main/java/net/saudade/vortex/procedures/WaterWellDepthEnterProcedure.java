package net.saudade.vortex.procedures;

import net.saudade.vortex.VortexMod;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WaterWellDepthEnterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		VortexMod.queueServerWork(5, () -> {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("vortex", "water_well_depth"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 3, entity.getY() - 11, entity.getZ() - 9), BlockPos.containing(entity.getX() - 3, entity.getY() - 11, entity.getZ() - 9),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		});
	}
}
