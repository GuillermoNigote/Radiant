package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
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
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.init.RadiantModMobEffects;
import net.mcreator.radiant.RadiantMod;

import javax.annotation.Nullable;

@EventBusSubscriber(value = {Dist.CLIENT})
public class TransportationChangeDimensionProcedure {
	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickEmpty event) {
		PacketDistributor.sendToServer(new TransportationChangeDimensionMessage());
		execute(event.getEntity());
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
	public record TransportationChangeDimensionMessage() implements CustomPacketPayload {
		public static final Type<TransportationChangeDimensionMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "procedure_transportation_change_dimension"));
		public static final StreamCodec<RegistryFriendlyByteBuf, TransportationChangeDimensionMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, TransportationChangeDimensionMessage message) -> {
		}, (RegistryFriendlyByteBuf buffer) -> new TransportationChangeDimensionMessage());

		@Override
		public Type<TransportationChangeDimensionMessage> type() {
			return TYPE;
		}

		public static void handleData(final TransportationChangeDimensionMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.SERVERBOUND) {
				context.enqueueWork(() -> {
					if (!context.player().level().hasChunkAt(context.player().blockPosition()))
						return;
					execute(context.player());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			RadiantMod.addNetworkMessage(TransportationChangeDimensionMessage.TYPE, TransportationChangeDimensionMessage.STREAM_CODEC, TransportationChangeDimensionMessage::handleData);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(RadiantModMobEffects.TRANSPORTATION_WILLSHAPER) || entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RadiantModMobEffects.TRANSPORTATION_ELSECALLER))
					&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) > 29 && entity.isShiftKeyDown()) {
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-(30));
				if ((entity.level().dimension()) == Level.END) {
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
								_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
							_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
						}
					}
				} else {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = Level.END;
						if (_player.level().dimension() == destinationType)
							return;
						ServerLevel nextLevel = _player.server.getLevel(destinationType);
						if (nextLevel != null) {
							_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
							_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
							_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
							for (MobEffectInstance _effectinstance : _player.getActiveEffects())
								_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
							_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
						}
					}
				}
			}
		}
	}
}
