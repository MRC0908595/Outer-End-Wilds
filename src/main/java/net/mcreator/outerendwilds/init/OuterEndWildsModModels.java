
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.outerendwilds.client.model.Modelsnareling;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OuterEndWildsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsnareling.LAYER_LOCATION, Modelsnareling::createBodyLayer);
	}
}
