
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.outerendwilds.potion.EnsnaredMobEffect;
import net.mcreator.outerendwilds.potion.EnderiteSetBonusMobEffect;
import net.mcreator.outerendwilds.OuterEndWildsMod;

public class OuterEndWildsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, OuterEndWildsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ENSNARED = REGISTRY.register("ensnared", () -> new EnsnaredMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ENDERITE_SET_BONUS = REGISTRY.register("enderite_set_bonus", () -> new EnderiteSetBonusMobEffect());
}
