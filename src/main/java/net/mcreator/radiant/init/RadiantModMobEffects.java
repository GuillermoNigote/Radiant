
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.radiant.procedures.IlluminationEffectExpiresProcedure;
import net.mcreator.radiant.procedures.IlluminationAnimalIlusionEffectExpiresProcedure;
import net.mcreator.radiant.procedures.GravitationSkybreakersEffectExpiresProcedure;
import net.mcreator.radiant.procedures.AbrasionEffectExpiresProcedure;
import net.mcreator.radiant.potion.TransportationWillshaperMobEffect;
import net.mcreator.radiant.potion.TransportationElsecallerMobEffect;
import net.mcreator.radiant.potion.TransformationLightweaverMobEffect;
import net.mcreator.radiant.potion.TransformationElsecallerMobEffect;
import net.mcreator.radiant.potion.TensionStonewardMobEffect;
import net.mcreator.radiant.potion.ProgressionTruthwatcherMobEffect;
import net.mcreator.radiant.potion.ProgressionEdgedancerMobEffect;
import net.mcreator.radiant.potion.IlluminationTruthwatcherMobEffect;
import net.mcreator.radiant.potion.IlluminationLightweaverMobEffect;
import net.mcreator.radiant.potion.IlluminationAnimalIlusionMobEffect;
import net.mcreator.radiant.potion.GravitationWindrunnerMobEffect;
import net.mcreator.radiant.potion.GravitationSkybreakerMobEffect;
import net.mcreator.radiant.potion.DivisionSkybreakerMobEffect;
import net.mcreator.radiant.potion.DivisionDustbringerMobEffect;
import net.mcreator.radiant.potion.CohesionWillshaperMobEffect;
import net.mcreator.radiant.potion.CohesionStonewardMobEffect;
import net.mcreator.radiant.potion.AdhesionWindrunnerMobEffect;
import net.mcreator.radiant.potion.AbrasionEdgedancerMobEffect;
import net.mcreator.radiant.potion.AbrasionDustbringerMobEffect;
import net.mcreator.radiant.RadiantMod;

@EventBusSubscriber
public class RadiantModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, RadiantMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> DIVISION_DUSTBRINGER = REGISTRY.register("division_dustbringer", () -> new DivisionDustbringerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABRASION_DUSTBRINGER = REGISTRY.register("abrasion_dustbringer", () -> new AbrasionDustbringerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABRASION_EDGEDANCER = REGISTRY.register("abrasion_edgedancer", () -> new AbrasionEdgedancerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PROGRESSION_EDGEDANCER = REGISTRY.register("progression_edgedancer", () -> new ProgressionEdgedancerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PROGRESSION_TRUTHWATCHER = REGISTRY.register("progression_truthwatcher", () -> new ProgressionTruthwatcherMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ILLUMINATION_TRUTHWATCHER = REGISTRY.register("illumination_truthwatcher", () -> new IlluminationTruthwatcherMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TRANSPORTATION_WILLSHAPER = REGISTRY.register("transportation_willshaper", () -> new TransportationWillshaperMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> COHESION_WILLSHAPER = REGISTRY.register("cohesion_willshaper", () -> new CohesionWillshaperMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> COHESION_STONEWARD = REGISTRY.register("cohesion_stoneward", () -> new CohesionStonewardMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TENSION_STONEWARD = REGISTRY.register("tension_stoneward", () -> new TensionStonewardMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DIVISION_SKYBREAKER = REGISTRY.register("division_skybreaker", () -> new DivisionSkybreakerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> GRAVITATION_SKYBREAKER = REGISTRY.register("gravitation_skybreaker", () -> new GravitationSkybreakerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> GRAVITATION_WINDRUNNER = REGISTRY.register("gravitation_windrunner", () -> new GravitationWindrunnerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ADHESION_WINDRUNNER = REGISTRY.register("adhesion_windrunner", () -> new AdhesionWindrunnerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ILLUMINATION_ANIMAL_ILUSION = REGISTRY.register("illumination_animal_ilusion", () -> new IlluminationAnimalIlusionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TRANSPORTATION_ELSECALLER = REGISTRY.register("transportation_elsecaller", () -> new TransportationElsecallerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ILLUMINATION_LIGHTWEAVER = REGISTRY.register("illumination_lightweaver", () -> new IlluminationLightweaverMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TRANSFORMATION_ELSECALLER = REGISTRY.register("transformation_elsecaller", () -> new TransformationElsecallerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TRANSFORMATION_LIGHTWEAVER = REGISTRY.register("transformation_lightweaver", () -> new TransformationLightweaverMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(ABRASION_DUSTBRINGER)) {
			AbrasionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(ABRASION_EDGEDANCER)) {
			AbrasionEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(ILLUMINATION_TRUTHWATCHER)) {
			IlluminationEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(GRAVITATION_SKYBREAKER)) {
			GravitationSkybreakersEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(GRAVITATION_WINDRUNNER)) {
			GravitationSkybreakersEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(ILLUMINATION_ANIMAL_ILUSION)) {
			IlluminationAnimalIlusionEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effectInstance.getEffect().is(ILLUMINATION_LIGHTWEAVER)) {
			IlluminationEffectExpiresProcedure.execute(entity);
		}
	}
}
