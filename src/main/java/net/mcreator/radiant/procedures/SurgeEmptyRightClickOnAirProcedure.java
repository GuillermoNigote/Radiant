package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModMobEffects;
import net.mcreator.radiant.RadiantMod;

import javax.annotation.Nullable;

@EventBusSubscriber(value = {Dist.CLIENT})
public class SurgeEmptyRightClickOnAirProcedure {
	@SubscribeEvent
	public static void onRightClick(PlayerInteractEvent.RightClickEmpty event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		PacketDistributor.sendToServer(new SurgeEmptyRightClickOnAirMessage());
		execute(event.getEntity());
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
	public record SurgeEmptyRightClickOnAirMessage() implements CustomPacketPayload {
		public static final Type<SurgeEmptyRightClickOnAirMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "procedure_surge_empty_right_click_on_air"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SurgeEmptyRightClickOnAirMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SurgeEmptyRightClickOnAirMessage message) -> {
		}, (RegistryFriendlyByteBuf buffer) -> new SurgeEmptyRightClickOnAirMessage());

		@Override
		public Type<SurgeEmptyRightClickOnAirMessage> type() {
			return TYPE;
		}

		public static void handleData(final SurgeEmptyRightClickOnAirMessage message, final IPayloadContext context) {
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
			RadiantMod.addNetworkMessage(SurgeEmptyRightClickOnAirMessage.TYPE, SurgeEmptyRightClickOnAirMessage.STREAM_CODEC, SurgeEmptyRightClickOnAirMessage::handleData);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RadiantModMobEffects.GRAVITATION_SKYBREAKER) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RadiantModMobEffects.GRAVITATION_WINDRUNNER))
				&& entity.isNoGravity()) {
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.xant = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.yant = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
				_vars.zant = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
