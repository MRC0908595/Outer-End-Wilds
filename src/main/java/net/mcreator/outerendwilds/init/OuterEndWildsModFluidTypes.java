
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.outerendwilds.fluid.types.AcidFluidType;
import net.mcreator.outerendwilds.OuterEndWildsMod;

public class OuterEndWildsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, OuterEndWildsMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
}
