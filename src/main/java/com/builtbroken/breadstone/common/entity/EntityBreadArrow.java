package com.builtbroken.breadstone.common.entity;

import com.builtbroken.breadstone.init.EntityRegistry;
import com.builtbroken.breadstone.init.ItemRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityBreadArrow extends AbstractArrowEntity
{
    public EntityBreadArrow(World p_i50172_2_)
    {
        super(EntityRegistry.STALEBREAD_ARROW, p_i50172_2_);
    }

    public EntityBreadArrow(World p_i46757_1_, double p_i46757_2_, double p_i46757_4_, double p_i46757_6_)
    {
        super(EntityRegistry.STALEBREAD_ARROW, p_i46757_2_, p_i46757_4_, p_i46757_6_, p_i46757_1_);
    }

    public EntityBreadArrow(World p_i46758_1_, LivingEntity p_i46758_2_)
    {
        super(EntityRegistry.STALEBREAD_ARROW, p_i46758_2_, p_i46758_1_);
    }

    @Override
    protected ItemStack getArrowStack()
    {
        return new ItemStack(ItemRegistry.stalebreadarrow);
    }
}

