
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.outerendwilds.client.gui.CanvasBlockStorageScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OuterEndWildsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(OuterEndWildsModMenus.CANVAS_BLOCK_STORAGE.get(), CanvasBlockStorageScreen::new);
	}
}
