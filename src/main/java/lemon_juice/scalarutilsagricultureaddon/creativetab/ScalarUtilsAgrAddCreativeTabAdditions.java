package lemon_juice.scalarutilsagricultureaddon.creativetab;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.item.ScalarUtilsAgrAddItems;
import lemon_juice.scalarutilsagricultureaddon.item.seed_items.AbstractBaseSeedItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static lemon_juice.scalar_utils.creativetab.ScalarUtilsCreativeTabs.SCALAR_UTILS_AGRICULTURE_TAB;

public class ScalarUtilsAgrAddCreativeTabAdditions {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScalarUtilsAgricultureAddon.MOD_ID);

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == SCALAR_UTILS_AGRICULTURE_TAB.get()) {
            for (int i = 1; i <= 5; i++) {
                for(RegistryObject<Item> item : ScalarUtilsAgrAddItems.ITEMS.getEntries())
                    if(item.get() instanceof AbstractBaseSeedItem abstractBaseSeedItem && abstractBaseSeedItem.getTier() == i) event.accept(abstractBaseSeedItem);
            }
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
