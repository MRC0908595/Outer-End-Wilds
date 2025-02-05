package net.mcreator.outerendwilds.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.outerendwilds.entity.SnarelingEntity;

public class SnarelingHurtPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof SnarelingEntity _datEntL0 && _datEntL0.getEntityData().get(SnarelingEntity.DATA_hurt);
	}
}
