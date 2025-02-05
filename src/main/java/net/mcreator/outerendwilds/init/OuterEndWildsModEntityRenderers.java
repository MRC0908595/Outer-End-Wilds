
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.outerendwilds.client.renderer.SnarelingRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OuterEndWildsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OuterEndWildsModEntities.SNARELING.get(), SnarelingRenderer::new);
		event.registerEntityRenderer(OuterEndWildsModEntities.GOOP_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
