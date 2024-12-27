package net.mcreator.radiant.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.radiant.network.RadiantModVariables;
import net.mcreator.radiant.init.RadiantModItems;
import net.mcreator.radiant.RadiantMod;

import javax.annotation.Nullable;

@EventBusSubscriber(value = {Dist.CLIENT})
public class SummonShardbladeOnKeyPressedProcedure {
	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickEmpty event) {
		PacketDistributor.sendToServer(new SummonShardbladeOnKeyPressedMessage());
		execute(event.getLevel(), event.getEntity());
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
	public record SummonShardbladeOnKeyPressedMessage() implements CustomPacketPayload {
		public static final Type<SummonShardbladeOnKeyPressedMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "procedure_summon_shardblade_on_key_pressed"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SummonShardbladeOnKeyPressedMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SummonShardbladeOnKeyPressedMessage message) -> {
		}, (RegistryFriendlyByteBuf buffer) -> new SummonShardbladeOnKeyPressedMessage());

		@Override
		public Type<SummonShardbladeOnKeyPressedMessage> type() {
			return TYPE;
		}

		public static void handleData(final SummonShardbladeOnKeyPressedMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.SERVERBOUND) {
				context.enqueueWork(() -> {
					if (!context.player().level().hasChunkAt(context.player().blockPosition()))
						return;
					execute(context.player().level(), context.player());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			RadiantMod.addNetworkMessage(SummonShardbladeOnKeyPressedMessage.TYPE, SummonShardbladeOnKeyPressedMessage.STREAM_CODEC, SummonShardbladeOnKeyPressedMessage::handleData);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getData(RadiantModVariables.PLAYER_VARIABLES).SummonedBlade) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()
					&& !((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) && new Object() {
						public int getScore(String score, Entity _ent) {
							Scoreboard _sc = _ent.level().getScoreboard();
							Objective _so = _sc.getObjective(score);
							if (_so != null)
								return _sc.getOrCreatePlayerScore(ScoreHolder.forNameOnly(_ent.getScoreboardName()), _so).get();
							return 0;
						}
					}.getScore("Oath", entity) > 2) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				for (int index0 = 0; index0 < 10; index0++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("execute as @p at @s anchored eyes run particle cloud ~" + ((1.9 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (1.9 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("execute as @p at @s anchored eyes run particle cloud ~" + ((2 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (2 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("execute as @p at @s anchored eyes run particle cloud ~" + ((2.5 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (2.5 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("execute as @p at @s anchored eyes run particle cloud ~" + ((3 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (3 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("execute as @p at @s anchored eyes run particle cloud ~" + ((3.5 * entity.getLookAngle().x + "" + (" ~1" + " ~")) + "" + (3.5 * entity.getLookAngle().z + " ^ ^ ^ 0 0"))));
				}
				{
					RadiantModVariables.PlayerVariables _vars = entity.getData(RadiantModVariables.PLAYER_VARIABLES);
					_vars.SummonedBlade = true;
					_vars.syncPlayerVariables(entity);
				}
				if (("Dustbringers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RadiantModItems.DUSTBRINGER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (("Edgedancers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RadiantModItems.EDGEDANCER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (("Stonewards").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RadiantModItems.STONEWARD_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (("Willshapers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RadiantModItems.WILLSHAPER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (("Truthwatchers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RadiantModItems.TRUTHWATCHER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (("Skybreakers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity.isNoGravity()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RadiantModItems.SKYBREAKER_LIVING_SHARDLANCE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RadiantModItems.SKYBREAKER_LIVING_SHARDBLADE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (("Windrunners").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity.isNoGravity()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RadiantModItems.WINDRUNNER_LIVING_SHARDLANCE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RadiantModItems.WINDRUNNER_LIVING_SHARDBLADE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (("Lightweavers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RadiantModItems.LIGHTWEAVER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (("Elsecallers").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RadiantModItems.ELSECALLER_LIVING_SHARDBLADE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (!(ItemStack.EMPTY.getItem() == entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardblade.getItem())) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = entity.getData(RadiantModVariables.PLAYER_VARIABLES).BondedShardblade.copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		}
	}
}
