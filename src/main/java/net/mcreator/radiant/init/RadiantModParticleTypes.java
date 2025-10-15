/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radiant.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.radiant.RadiantMod;

public class RadiantModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, RadiantMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> INVISIBLE_RADIANT_PARTICLE = REGISTRY.register("invisible_radiant_particle", () -> new SimpleParticleType(false));
}