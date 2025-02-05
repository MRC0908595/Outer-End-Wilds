package net.mcreator.outerendwilds.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.outerendwilds.entity.SnarelingEntity;
import net.mcreator.outerendwilds.OuterEndWildsMod;

public class SnarelingEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof SnarelingEntity _datEntL0 && _datEntL0.getEntityData().get(SnarelingEntity.DATA_hurt))) {
			if (entity instanceof SnarelingEntity _datEntSetL)
				_datEntSetL.getEntityData().set(SnarelingEntity.DATA_hurt, true);
			OuterEndWildsMod.queueServerWork(20, () -> {
				if (entity instanceof SnarelingEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SnarelingEntity.DATA_hurt, false);
			});
		}
	}
}
