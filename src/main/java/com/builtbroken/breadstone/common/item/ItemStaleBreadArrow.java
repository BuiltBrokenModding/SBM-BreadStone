package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;
import com.builtbroken.breadstone.init.ItemRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaleBreadArrow extends ArrowItem {

	public ItemStaleBreadArrow() {
		super(ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadarrow");
	}

	@Override
	public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		return new EntityBreadArrow(worldIn, shooter);
	}

}
