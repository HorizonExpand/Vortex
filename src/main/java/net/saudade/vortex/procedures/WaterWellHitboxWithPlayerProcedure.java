package net.saudade.vortex.procedures;

import net.saudade.vortex.network.VortexModVariables;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
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

public class WaterWellHitboxWithPlayerProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getX() - x)) > (0.3) && ((entity.getX() - x)) < (0.7) && entity.getY() - y == 0.5 && ((entity.getZ() - z)) > (0.3) && ((entity.getZ() - z)) < (0.7)) {
			if (!(entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VortexModVariables.PlayerVariables())).GoesToTheWaterWellDepth) {
				{
					boolean _setval = true;
					entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GoesToTheWaterWellDepth = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = x;
					entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.WellInteractX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = y;
					entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.WellInteractY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = z;
					entity.getCapability(VortexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.WellInteractZ = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("vortex:water_well_depth"));
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
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("vortex:secrets_of_the_little_well"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
