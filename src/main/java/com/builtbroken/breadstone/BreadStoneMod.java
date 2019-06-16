package com.builtbroken.breadstone;

import com.builtbroken.breadstone.client.renderer.entity.RenderStaleBreadArrow;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod(BreadStoneMod.MOD_ID)
public class BreadStoneMod {

	public static final String MOD_ID = "breadstone";

	private static ItemGroup group;

	public static BreadStoneMod mod;

	public BreadStoneMod() {
		MinecraftForge.EVENT_BUS.addListener(this::onModelRegistry);
	}

	public static ItemGroup getItemGroup() {
		if (group == null) {
			group = new ItemGroup(MOD_ID) {
				@Override
				public ItemStack createIcon() {
					return new ItemStack(Items.BREAD);
				}
			};
		}
		return group;
	}

	public void onModelRegistry(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityBreadArrow.class, RenderStaleBreadArrow::new);
	}
}