
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.outerendwilds.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.outerendwilds.world.inventory.CanvasBlockStorageMenu;
import net.mcreator.outerendwilds.OuterEndWildsMod;

public class OuterEndWildsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, OuterEndWildsMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CanvasBlockStorageMenu>> CANVAS_BLOCK_STORAGE = REGISTRY.register("canvas_block_storage", () -> IMenuTypeExtension.create(CanvasBlockStorageMenu::new));
}
