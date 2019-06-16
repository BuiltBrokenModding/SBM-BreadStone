package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

public class EntityRegistry {

	@ObjectHolder(BreadStoneMod.MOD_ID+":breadstonearrowentity")
	public static EntityType<EntityBreadArrow> STALEBREAD_ARROW;

	@EventBusSubscriber(modid = BreadStoneMod.MOD_ID, bus = Bus.MOD)
	public static class RegistrationHandler {
		/**
		 * Register this mod's {@link EntityType}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<EntityType<?>> event) {

			event.getRegistry().register(			EntityType.Builder
							.create(EntityClassification.MISC)
							.setUpdateInterval(1)
							.setShouldReceiveVelocityUpdates(true)
							.setTrackingRange(128)
							.setCustomClientFactory(((spawnEntity, world) -> STALEBREAD_ARROW.create(world)))
							.build(BreadStoneMod.MOD_ID+":breadstonearrowentity")
							.setRegistryName(BreadStoneMod.MOD_ID+":breadstonearrowentity"));
		}
	}

}
