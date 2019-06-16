package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class ItemStaleBreadSword extends SwordItem {

	public ItemStaleBreadSword() {
		super(ItemTier.STONE, 7, -3.2F, ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadsword");
	}

}
