
package net.mcreator.outerendwilds.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.outerendwilds.OuterEndWildsMod;

import java.util.Set;

public class EnderiteSetBonusMobEffect extends MobEffect {
	public EnderiteSetBonusMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -7405344);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(OuterEndWildsMod.MODID, "effect.enderite_set_bonus_0"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(OuterEndWildsMod.MODID, "effect.enderite_set_bonus_1"), 0.1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}
}
