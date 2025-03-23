
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.saudade.vortex.init;

import net.saudade.vortex.block.entity.TraderHeadTileEntity;
import net.saudade.vortex.block.entity.PreservesJarBlockEntity;
import net.saudade.vortex.block.entity.OilRollBlockEntity;
import net.saudade.vortex.block.entity.FarmersSunflowerBlockEntity;
import net.saudade.vortex.block.entity.CrankTileEntity;
import net.saudade.vortex.block.entity.CasiwellBlockEntity;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class VortexModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, VortexMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FARMERS_SUNFLOWER = register("farmers_sunflower", VortexModBlocks.FARMERS_SUNFLOWER, FarmersSunflowerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CrankTileEntity>> CRANK = REGISTRY.register("crank", () -> BlockEntityType.Builder.of(CrankTileEntity::new, VortexModBlocks.CRANK.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> OIL_ROLL = register("oil_roll", VortexModBlocks.OIL_ROLL, OilRollBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PRESERVES_JAR = register("preserves_jar", VortexModBlocks.PRESERVES_JAR, PreservesJarBlockEntity::new);
	public static final RegistryObject<BlockEntityType<TraderHeadTileEntity>> TRADER_HEAD = REGISTRY.register("trader_head", () -> BlockEntityType.Builder.of(TraderHeadTileEntity::new, VortexModBlocks.TRADER_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> CASIWELL = register("casiwell", VortexModBlocks.CASIWELL, CasiwellBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
