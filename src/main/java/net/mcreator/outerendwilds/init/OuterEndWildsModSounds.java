
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.outerendwilds.OuterEndWildsMod;

public class OuterEndWildsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, OuterEndWildsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SNARELINGHURT = REGISTRY.register("snarelinghurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("outer_end_wilds", "snarelinghurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SNARELINGDIE = REGISTRY.register("snarelingdie", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("outer_end_wilds", "snarelingdie")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SNARELINGIDLE = REGISTRY.register("snarelingidle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("outer_end_wilds", "snarelingidle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SNARELING_TELEPORT = REGISTRY.register("snareling_teleport", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("outer_end_wilds", "snareling_teleport")));
}
