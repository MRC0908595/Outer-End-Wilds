package net.mcreator.outerendwilds.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.outerendwilds.endbiomes.TheEndBiomes;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class OuterEndWildsModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("outer_end_wilds:end_wilds")), 2d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("outer_end_wilds:end_wilds")), ResourceKey.create(Registries.BIOME, ResourceLocation.parse("outer_end_wilds:end_wilds")), 2d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("outer_end_wilds:end_wilds")), ResourceKey.create(Registries.BIOME, ResourceLocation.parse("outer_end_wilds:end_wilds")), 2d);
		});
	}
}
