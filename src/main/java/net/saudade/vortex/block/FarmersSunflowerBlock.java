
package net.saudade.vortex.block;

import org.checkerframework.checker.units.qual.s;

import net.saudade.vortex.procedures.FarmersSunflowerUsloviieUspieshnoghoPrimienieniiaKostnoiMukiProcedure;
import net.saudade.vortex.procedures.FarmersSunflowerUsloviieRazrieshieniiaIspolzovaniiaKostnoiMukiProcedure;
import net.saudade.vortex.procedures.FarmersSunflowerUsloviieRazmieshchieniiaBlokaProcedure;
import net.saudade.vortex.procedures.FarmersSunflowerPriObnovlieniiTikaProcedure;
import net.saudade.vortex.procedures.FarmersSunflowerPriIspolzovaniiKostnoiMukiProcedure;
import net.saudade.vortex.block.entity.FarmersSunflowerBlockEntity;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class FarmersSunflowerBlock extends Block implements EntityBlock, BonemealableBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 10);

	public FarmersSunflowerBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRASS).strength(0.1f, 0.5f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				if (s.getValue(BLOCKSTATE) == 7)
					return 0;
				if (s.getValue(BLOCKSTATE) == 8)
					return 0;
				if (s.getValue(BLOCKSTATE) == 9)
					return 0;
				if (s.getValue(BLOCKSTATE) == 10)
					return 0;
				return 0;
			}
		}.getLightLevel())).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return Shapes.or(box(7, 10, 6, 11, 13, 10), box(6, -1, 6, 10, 10, 10));
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return box(6, -1, 6, 10, 13, 10);
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return Shapes.or(box(5, 10, 6, 9, 13, 10), box(6, -1, 6, 10, 10, 10));
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return Shapes.or(box(6, -1, 6, 10, 21, 10), box(5, 17, 1, 11, 27, 15));
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return Shapes.or(box(6, -1, 6, 10, 21, 10), box(1, 21, 1, 15, 23, 15));
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return Shapes.or(box(6, -1, 6, 10, 21, 10), box(1, 21, 1, 15, 23, 15));
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return Shapes.or(box(6, -1, 6, 10, 21, 10), box(1, 21, 1, 15, 23, 15));
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return Shapes.or(box(6, -1, 6, 10, 21, 10), box(5, 17, 1, 11, 27, 15));
		}
		if (state.getValue(BLOCKSTATE) == 9) {
			return Shapes.or(box(6, -1, 6, 10, 21, 10), box(5, 17, 1, 11, 27, 15));
		}
		if (state.getValue(BLOCKSTATE) == 10) {
			return Shapes.or(box(6, -1, 6, 10, 21, 10), box(5, 17, 1, 11, 27, 15));
		}
		return box(6, -1, 6, 10, 9, 10);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BLOCKSTATE);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return FarmersSunflowerUsloviieRazmieshchieniiaBlokaProcedure.execute(world, x, y, z);
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		return !state.canSurvive(world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 20);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		FarmersSunflowerPriObnovlieniiTikaProcedure.execute(world, x, y, z, blockstate);
		world.scheduleTick(pos, this, 20);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
		if (worldIn instanceof LevelAccessor world) {
			return FarmersSunflowerUsloviieRazrieshieniiaIspolzovaniiaKostnoiMukiProcedure.execute(blockstate);
		}
		return false;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return FarmersSunflowerUsloviieUspieshnoghoPrimienieniiaKostnoiMukiProcedure.execute();
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
		FarmersSunflowerPriIspolzovaniiKostnoiMukiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new FarmersSunflowerBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof FarmersSunflowerBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof FarmersSunflowerBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
