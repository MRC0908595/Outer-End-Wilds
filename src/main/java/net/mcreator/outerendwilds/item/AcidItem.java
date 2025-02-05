
package net.mcreator.outerendwilds.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.outerendwilds.init.OuterEndWildsModFluids;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(OuterEndWildsModFluids.ACID.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
