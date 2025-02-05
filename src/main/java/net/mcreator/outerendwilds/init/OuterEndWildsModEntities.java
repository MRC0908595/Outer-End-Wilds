
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

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

import net.mcreator.outerendwilds.entity.SnarelingEntity;
import net.mcreator.outerendwilds.entity.GoopProjectileEntity;
import net.mcreator.outerendwilds.OuterEndWildsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class OuterEndWildsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, OuterEndWildsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<SnarelingEntity>> SNARELING = register("snareling",
			EntityType.Builder.<SnarelingEntity>of(SnarelingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoopProjectileEntity>> GOOP_PROJECTILE = register("goop_projectile",
			EntityType.Builder.<GoopProjectileEntity>of(GoopProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		SnarelingEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SNARELING.get(), SnarelingEntity.createAttributes().build());
	}
}
