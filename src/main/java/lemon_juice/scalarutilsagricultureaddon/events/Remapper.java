package lemon_juice.scalarutilsagricultureaddon.events;

import com.google.common.collect.ImmutableMap;
import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;

import java.util.Map;
import java.util.function.Supplier;

@Mod.EventBusSubscriber
public class Remapper {
    @SubscribeEvent
    public static void fixMissingMappings(MissingMappingsEvent event){
        Map<ResourceLocation, Supplier<Item>> itemsMap = (new ImmutableMap.Builder<ResourceLocation, Supplier<Item>>())
                .put(new ResourceLocation(ScalarUtilsAgricultureAddon.MOD_ID, "tiny_pile_of_glowstone_dust"), ModItems.GRAIN_OF_GLOWSTONE_DUST)
                .put(new ResourceLocation(ScalarUtilsAgricultureAddon.MOD_ID, "tiny_pile_of_redstone_dust"), ModItems.GRAIN_OF_REDSTONE_DUST)
                .build();

        for (MissingMappingsEvent.Mapping<Item> mapping : event.getMappings(ForgeRegistries.Keys.ITEMS, ScalarUtilsAgricultureAddon.MOD_ID)) {
            Supplier<Item> itemSupplier = itemsMap.get(mapping.getKey());
            if (itemSupplier != null) {
                Item item = itemSupplier.get();
                mapping.remap(item);
            }
        }
    }
}
