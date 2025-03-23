package net.saudade.vortex.procedures;

import net.saudade.vortex.init.VortexModItems;
import net.saudade.vortex.init.VortexModEntities;
import net.saudade.vortex.init.VortexModBlocks;
import net.saudade.vortex.entity.MysticalCoinEntityEntity;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DropMysticalCoinProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == VortexModItems.MYSTICAL_COIN.get() && blockstate.getBlock() == VortexModBlocks.MYSTICAL_WELL.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MysticalCoinEntityEntity(VortexModEntities.MYSTICAL_COIN_ENTITY.get(), _level);
				entityToSpawn.moveTo((x - (x - entity.getX()) / 2), (y - (y - entity.getY()) / 2), (z - (z - entity.getZ()) / 2), entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn) {
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
						_toTame.tame(_owner);
					}
				}
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.conduit.activate")), SoundSource.PLAYERS, 1, 1);
			VortexMod.queueServerWork(22, () -> {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.PLAYERS, 1, 1);
			});
			VortexMod.queueServerWork(40, () -> {
				if (!world.isClientSide() && world.getServer() != null) {
					BlockPos _bpLootTblWorld = BlockPos.containing(x, y, z);
					for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(new ResourceLocation("vortex:gameplay/mystical_well_reward"))
							.getRandomItems(new LootParams.Builder((ServerLevel) world).withParameter(LootContextParams.ORIGIN, Vec3.atCenterOf(_bpLootTblWorld)).withParameter(LootContextParams.BLOCK_STATE, world.getBlockState(_bpLootTblWorld))
									.withOptionalParameter(LootContextParams.BLOCK_ENTITY, world.getBlockEntity(_bpLootTblWorld)).create(LootContextParamSets.EMPTY))) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.2), (z + 0.5), itemstackiterator);
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			});
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("vortex:the_wishing_well"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
