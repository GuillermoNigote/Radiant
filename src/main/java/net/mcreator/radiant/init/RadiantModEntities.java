
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.radiant.entity.PeaksprenEntity;
import net.mcreator.radiant.entity.MistsprenEntity;
import net.mcreator.radiant.entity.LightsprenEntity;
import net.mcreator.radiant.entity.InksprenEntity;
import net.mcreator.radiant.entity.IlluminationFakePlayerEntity;
import net.mcreator.radiant.entity.HonorsprenEntity;
import net.mcreator.radiant.entity.HighsprenEntity;
import net.mcreator.radiant.entity.FakeSpiderEntity;
import net.mcreator.radiant.entity.FakeCreeperEntity;
import net.mcreator.radiant.entity.CultivationsprenEntity;
import net.mcreator.radiant.entity.CrypticEntity;
import net.mcreator.radiant.entity.AshsprenEntity;
import net.mcreator.radiant.entity.AdhesionInfuseEntity;
import net.mcreator.radiant.RadiantMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RadiantModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, RadiantMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<PeaksprenEntity>> PEAKSPREN = register("peakspren",
			EntityType.Builder.<PeaksprenEntity>of(PeaksprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightsprenEntity>> LIGHTSPREN = register("lightspren",
			EntityType.Builder.<LightsprenEntity>of(LightsprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MistsprenEntity>> MISTSPREN = register("mistspren",
			EntityType.Builder.<MistsprenEntity>of(MistsprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CultivationsprenEntity>> CULTIVATIONSPREN = register("cultivationspren",
			EntityType.Builder.<CultivationsprenEntity>of(CultivationsprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AshsprenEntity>> ASHSPREN = register("ashspren",
			EntityType.Builder.<AshsprenEntity>of(AshsprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HighsprenEntity>> HIGHSPREN = register("highspren",
			EntityType.Builder.<HighsprenEntity>of(HighsprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HonorsprenEntity>> HONORSPREN = register("honorspren",
			EntityType.Builder.<HonorsprenEntity>of(HonorsprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<FakeCreeperEntity>> FAKE_CREEPER = register("fake_creeper",
			EntityType.Builder.<FakeCreeperEntity>of(FakeCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<FakeSpiderEntity>> FAKE_SPIDER = register("fake_spider",
			EntityType.Builder.<FakeSpiderEntity>of(FakeSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InksprenEntity>> INKSPREN = register("inkspren",
			EntityType.Builder.<InksprenEntity>of(InksprenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrypticEntity>> CRYPTIC = register("cryptic",
			EntityType.Builder.<CrypticEntity>of(CrypticEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IlluminationFakePlayerEntity>> ILLUMINATION_FAKE_PLAYER = register("illumination_fake_player",
			EntityType.Builder.<IlluminationFakePlayerEntity>of(IlluminationFakePlayerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AdhesionInfuseEntity>> ADHESION_INFUSE = register("adhesion_infuse",
			EntityType.Builder.<AdhesionInfuseEntity>of(AdhesionInfuseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		PeaksprenEntity.init(event);
		LightsprenEntity.init(event);
		MistsprenEntity.init(event);
		CultivationsprenEntity.init(event);
		AshsprenEntity.init(event);
		HighsprenEntity.init(event);
		HonorsprenEntity.init(event);
		FakeCreeperEntity.init(event);
		FakeSpiderEntity.init(event);
		InksprenEntity.init(event);
		CrypticEntity.init(event);
		IlluminationFakePlayerEntity.init(event);
		AdhesionInfuseEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PEAKSPREN.get(), PeaksprenEntity.createAttributes().build());
		event.put(LIGHTSPREN.get(), LightsprenEntity.createAttributes().build());
		event.put(MISTSPREN.get(), MistsprenEntity.createAttributes().build());
		event.put(CULTIVATIONSPREN.get(), CultivationsprenEntity.createAttributes().build());
		event.put(ASHSPREN.get(), AshsprenEntity.createAttributes().build());
		event.put(HIGHSPREN.get(), HighsprenEntity.createAttributes().build());
		event.put(HONORSPREN.get(), HonorsprenEntity.createAttributes().build());
		event.put(FAKE_CREEPER.get(), FakeCreeperEntity.createAttributes().build());
		event.put(FAKE_SPIDER.get(), FakeSpiderEntity.createAttributes().build());
		event.put(INKSPREN.get(), InksprenEntity.createAttributes().build());
		event.put(CRYPTIC.get(), CrypticEntity.createAttributes().build());
		event.put(ILLUMINATION_FAKE_PLAYER.get(), IlluminationFakePlayerEntity.createAttributes().build());
		event.put(ADHESION_INFUSE.get(), AdhesionInfuseEntity.createAttributes().build());
	}
}
