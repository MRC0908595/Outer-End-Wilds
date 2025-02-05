package net.mcreator.outerendwilds.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.outerendwilds.init.OuterEndWildsModMobEffects;

public class GoopProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(OuterEndWildsModMobEffects.ENSNARED, 40, 0));
	}
}
