package lemon_juice.scalarutilsagricultureaddon.util;

import lemon_juice.scalarutilsagricultureaddon.item.ScalarUtilsAgrAddItems;
import lemon_juice.scalarutilsagricultureaddon.item.seed_items.AbstractBaseSeedItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class ScalarUtilsAgrAddCompostables {

    public static void setup(final FMLCommonSetupEvent event) {
        float quantity = 0.2F; //Starts at 0.3F as this gets incremented in the loop
        for (int i = 1; i <= 5; i++) {
            quantity += 0.1F;
            for(RegistryObject<Item> item : ScalarUtilsAgrAddItems.ITEMS.getEntries())
                if(item.get() instanceof AbstractBaseSeedItem abstractBaseSeedItem && abstractBaseSeedItem.getTier() == i) {
                    add(quantity, abstractBaseSeedItem);
                }
        }
    }

    public static void add(float quantity, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), quantity);
    }
}
