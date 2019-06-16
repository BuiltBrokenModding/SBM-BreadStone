package com.builtbroken.breadstone.init;

import java.util.HashSet;
import java.util.Set;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.block.BlockStaleBread;
import com.builtbroken.breadstone.common.block.BlockStaleBreadSlab;
import com.google.common.base.Preconditions;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(BreadStoneMod.MOD_ID)
public class BlockRegistry {

	public static BlockStaleBread stalebreadblock = new BlockStaleBread();
	public static BlockStaleBreadSlab stalebreadslabhalf = new BlockStaleBreadSlab.Half();
	public static BlockStaleBreadSlab stalebreadslabdouble = new BlockStaleBreadSlab.Double();

	@Mod.EventBusSubscriber(modid = BreadStoneMod.MOD_ID, bus = Bus.MOD)
	public static class RegistrationHandler {
		public static final Set<BlockItem> ITEM_BLOCKS = new HashSet<>();

		/**
		 * Register this mod's {@link Block}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			final IForgeRegistry<Block> registry = event.getRegistry();

			final Block[] blocks = {
					stalebreadblock, stalebreadslabhalf, stalebreadslabdouble
			};

			registry.registerAll(blocks);
		}

		/**
		 * Register this mod's {@link BlockItem}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
			final BlockItem[] items = {
					new BlockItem(stalebreadblock, ItemRegistry.getProps()), new BlockItem(stalebreadslabhalf, ItemRegistry.getProps()), new BlockItem(stalebreadslabdouble, ItemRegistry.getProps())
			};

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final BlockItem item : items) {
				final Block block = item.getBlock();
				final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
				registry.register(item.setRegistryName(registryName));
				ITEM_BLOCKS.add(item);
			}

		}
	}
}