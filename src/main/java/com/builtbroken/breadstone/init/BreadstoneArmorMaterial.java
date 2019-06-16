package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * @author p455w0rd
 *
 */
public class BreadstoneArmorMaterial implements IArmorMaterial {

	private static final BreadstoneArmorMaterial INSTANCE = new BreadstoneArmorMaterial();

	public static BreadstoneArmorMaterial getInstance() {
		return INSTANCE;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		switch (slot) {
		case CHEST:
			return 5;
		case FEET:
			return 1;
		case HEAD:
			return 2;
		case LEGS:
			return 4;
		default:
			return 0;
		}
	}

	@Override
	public int getEnchantability() {
		return 12;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromStacks(new ItemStack(ItemRegistry.stalebread));
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return BreadStoneMod.MOD_ID + ":stalebread";
	}

	@Override
	public float getToughness() {
		return 0.0f;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return 15;
	}

}
