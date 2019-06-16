package com.builtbroken.breadstone.common.entity;

import com.builtbroken.breadstone.init.EntityRegistry;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class EntityBreadArrow extends AbstractArrowEntity {

	public EntityBreadArrow(World worldIn) {
		super(EntityRegistry.STALEBREAD_ARROW, worldIn);
	}

	public EntityBreadArrow(World world, LivingEntity shooter) {
		super(EntityRegistry.STALEBREAD_ARROW, shooter, world);
	}

	public EntityBreadArrow(World world, double x, double y, double z) {
		super(EntityRegistry.STALEBREAD_ARROW, x, y, z, world);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ItemRegistry.stalebreadarrow, 1);
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}

