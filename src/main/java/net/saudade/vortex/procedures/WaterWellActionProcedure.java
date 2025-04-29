package net.saudade.vortex.procedures;

import net.saudade.vortex.network.VortexModVariables;
import net.saudade.vortex.init.VortexModBlocks;
import net.saudade.vortex.VortexMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WaterWellActionProcedure {
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
		if (blockstate.getBlock() == VortexModBlocks.WATER_WELL.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
				VortexMod.queueServerWork(1, () -> {
					if (!new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.WATER_BUCKET).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (world instanceof Level _level) {
						ResourceLocation soundLocation = new ResourceLocation("minecraft", "item.bucket.fill");
						SoundEvent soundEvent = ForgeRegistries.SOUND_EVENTS.getValue(soundLocation);
						if (soundEvent != null) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), soundEvent, SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, soundEvent, SoundSource.BLOCKS, 1, 1, false);
							}
						} else {
							VortexMod.LOGGER.warn("Sound event {} not found, skipping sound playback.", soundLocation);
						}
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("vortex:well_according_to_all_standards"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				});
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ForgeRegistries.ITEMS.getValue(new ResourceLocation("ceramicbucket:ceramic_bucket"))
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getCompound("Fluid").getString("FluidName").isEmpty()) {
				VortexMod.queueServerWork(1, () -> {
					if (!new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("ceramicbucket:ceramic_bucket")));
						_setstack.setCount(1);
						_setstack.getOrCreateTagElement("Fluid").putString("FluidName", "minecraft:water");
						_setstack.getOrCreateTagElement("Fluid").putInt("Amount", 1000);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (world instanceof Level _level) {
						ResourceLocation soundLocation = new ResourceLocation("minecraft", "item.bucket.fill");
						SoundEvent soundEvent = ForgeRegistries.SOUND_EVENTS.getValue(soundLocation);
						if (soundEvent != null) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), soundEvent, SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, soundEvent, SoundSource.BLOCKS, 1, 1, false);
							}
						} else {
							VortexMod.LOGGER.warn("Sound event {} not found, skipping sound playback.", soundLocation);
						}
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("vortex:well_according_to_all_standards"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				});
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
				VortexMod.queueServerWork(1, () -> {
					if (!new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = PotionUtils.setPotion(Items.POTION.getDefaultInstance(), Potions.WATER).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (world instanceof Level _level) {
						ResourceLocation soundLocation = new ResourceLocation("minecraft", "item.bottle.fill");
						SoundEvent soundEvent = ForgeRegistries.SOUND_EVENTS.getValue(soundLocation);
						if (soundEvent != null) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), soundEvent, SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, soundEvent, SoundSource.BLOCKS, 1, 1, false);
							}
						} else {
							VortexMod.LOGGER.warn("Sound event {} not found, skipping sound playback.", soundLocation);
						}
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("vortex:well_according_to_all_standards"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				});
			} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("vortex:water_well_depth"))) {
				entity.teleportTo(((entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).WellInteractX),
						((entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).WellInteractY),
						((entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).WellInteractZ));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).WellInteractX),
							((entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).WellInteractY),
							((entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).WellInteractZ), entity.getYRot(), entity.getXRot());
				if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = Level.OVERWORLD;
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
		}
	}
}