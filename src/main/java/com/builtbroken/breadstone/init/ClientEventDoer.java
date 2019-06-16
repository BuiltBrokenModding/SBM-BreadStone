package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.client.renderer.entity.RenderStaleBreadArrow;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = BreadStoneMod.MOD_ID, value = Dist.CLIENT, bus = Bus.FORGE)
public class ClientEventDoer {

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerEntityRenderers(final ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityBreadArrow.class, RenderStaleBreadArrow::new);
//		Minecraft.getInstance().getRenderManager().entityRenderMap.put(EntityBreadArrow.class, new RenderStaleBreadArrow(Minecraft.getInstance().getRenderManager()));
	}

}
