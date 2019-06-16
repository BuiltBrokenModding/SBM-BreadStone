package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemTier;

public class ItemStaleBreadHoe extends HoeItem {

	public ItemStaleBreadHoe() {
		super(ItemTier.STONE, -3.2F, ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadhoe");
	}

}
