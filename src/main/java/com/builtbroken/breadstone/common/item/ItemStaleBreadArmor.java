package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.BreadstoneArmorMaterial;
import com.builtbroken.breadstone.init.ItemRegistry;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class ItemStaleBreadArmor extends ArmorItem {

	public String nameExt;

	public ItemStaleBreadArmor(EquipmentSlotType slot, String nameExt) {
		super(BreadstoneArmorMaterial.getInstance(), slot, ItemRegistry.getProps());
		this.nameExt = nameExt;
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebread" + nameExt);
	}

}
