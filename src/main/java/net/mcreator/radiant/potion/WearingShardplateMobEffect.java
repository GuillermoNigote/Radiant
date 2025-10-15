package net.mcreator.radiant.potion;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientMobEffectExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.radiant.procedures.WearingShardplateOnEffectActiveTickProcedure;
import net.mcreator.radiant.init.RadiantModParticleTypes;
import net.mcreator.radiant.init.RadiantModMobEffects;
import net.mcreator.radiant.RadiantMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WearingShardplateMobEffect extends MobEffect {
	public WearingShardplateMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
		this.addAttributeModifier(Attributes.SCALE, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_0"), 0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_1"), 2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_KNOCKBACK, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_2"), 1.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_3"), 0.75, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BLOCK_BREAK_SPEED, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_4"), 1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SAFE_FALL_DISTANCE, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_5"), 2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_6"), 0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_7"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.STEP_HEIGHT, ResourceLocation.fromNamespaceAndPath(RadiantMod.MODID, "effect.wearing_shardplate_8"), 1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return (SimpleParticleType) (RadiantModParticleTypes.INVISIBLE_RADIANT_PARTICLE.get());
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		WearingShardplateOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}

	@SubscribeEvent
	public static void registerMobEffectExtensions(RegisterClientExtensionsEvent event) {
		event.registerMobEffect(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		}, RadiantModMobEffects.WEARING_SHARDPLATE.get());
	}
}