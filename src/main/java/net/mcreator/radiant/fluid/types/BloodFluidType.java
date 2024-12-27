
package net.mcreator.radiant.fluid.types;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.BiomeColors;

import net.mcreator.radiant.init.RadiantModFluidTypes;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BloodFluidType extends FluidType {
	public BloodFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.0056D).density(2000).viscosity(2000).canConvertToSource(true)
				.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bucket.empty")))
				.sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("radiant:block/blood_still"), FLOWING_TEXTURE = ResourceLocation.parse("radiant:block/blood_flow");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public int getTintColor() {
				return -13083194;
			}

			@Override
			public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
				return BiomeColors.getAverageWaterColor(world, pos) | 0xFF000000;
			}
		}, RadiantModFluidTypes.BLOOD_TYPE.get());
	}
}
