package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = BreadStoneMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistry
{

    @ObjectHolder(BreadStoneMod.MOD_ID + ":breadstonearrowentity")
    public static EntityType<EntityBreadArrow> STALEBREAD_ARROW;

    /**
     * Register this mod's {@link EntityType}s.
     *
     * @param event The event
     */
    @SubscribeEvent
    public static void onEvent(final RegistryEvent.Register<EntityType<?>> event)
    {

        event.getRegistry().register(EntityType.Builder
                .create(EntityClassification.AMBIENT)
                .setUpdateInterval(1)
                .setShouldReceiveVelocityUpdates(true)
                .setTrackingRange(128)
                .size(0.5F, 0.5F)
                .setCustomClientFactory(((spawnEntity, world) -> STALEBREAD_ARROW.create(world)))
                .build(BreadStoneMod.MOD_ID + ":breadstonearrowentity")
                .setRegistryName(BreadStoneMod.MOD_ID + ":breadstonearrowentity"));
    }

}
