package com.builtbroken.breadstone.common.block;

import java.util.Random;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockStaleBreadSlab extends SlabBlock {

	public BlockStaleBreadSlab(String ext) {
		super(Block.Properties.create(Material.ROCK).hardnessAndResistance(4.0F).sound(SoundType.STONE));
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadslab" + ext);
	}

	public Item getItemDropped(BlockState state, Random rand, int fortune) {
		return BlockRegistry.stalebreadslabhalf.asItem();
	}

	public ItemStack getItem(World worldIn, BlockPos pos, BlockState state) {
		return new ItemStack(BlockRegistry.stalebreadslabhalf);
	}

	public static class Double extends BlockStaleBreadSlab {

		public Double() {
			super("double");
			setDefaultState(getDefaultState().with(TYPE, SlabType.DOUBLE));
		}

	}

	public static class Half extends BlockStaleBreadSlab {

		public Half() {
			super("half");
			setDefaultState(getDefaultState().with(TYPE, SlabType.BOTTOM));
		}

	}

}
