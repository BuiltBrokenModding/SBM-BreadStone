package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

public class ItemStaleBreadPickaxe extends PickaxeItem {

	public ItemStaleBreadPickaxe() {
		super(ItemTier.STONE, 1, -3.2F, ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadpickaxe");
	}

}
