
package net.mcreator.radiant.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.radiant.world.inventory.TransformationSurgeGUIMenu;
import net.mcreator.radiant.procedures.WoodEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.StoneEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.SmokeEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.OilEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.MetalEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.MeatEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.GlassEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.FireEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.BloodEssenceTransformationProcedure;
import net.mcreator.radiant.procedures.AirEssenceTransformationProcedure;
import net.mcreator.radiant.RadiantMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record TransformationSurgeGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<TransformationSurgeGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "transformation_surge_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, TransformationSurgeGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, TransformationSurgeGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new TransformationSurgeGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<TransformationSurgeGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final TransformationSurgeGUIButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = TransformationSurgeGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AirEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			SmokeEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			FireEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			GlassEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			WoodEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			BloodEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OilEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			MetalEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			StoneEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			MeatEssenceTransformationProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RadiantMod.addNetworkMessage(TransformationSurgeGUIButtonMessage.TYPE, TransformationSurgeGUIButtonMessage.STREAM_CODEC, TransformationSurgeGUIButtonMessage::handleData);
	}
}
