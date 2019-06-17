package com.builtbroken.breadstone;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;

@Mod(BreadStoneMod.MOD_ID)
public class BreadStoneMod
{

    public static final String MOD_ID = "breadstone";

    private static ItemGroup group;

    public static BreadStoneMod mod;

    public static ItemGroup getItemGroup()
    {
        if (group == null)
        {
            group = new ItemGroup(MOD_ID)
            {
                @Override
                public ItemStack createIcon()
                {
                    return new ItemStack(Items.BREAD);
                }
            };
        }
        return group;
    }
}