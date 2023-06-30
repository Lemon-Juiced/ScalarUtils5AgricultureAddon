package lemon_juice.scalarutilsagricultureaddon.creativetab;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import lemon_juice.scalarutilsagricultureaddon.item.seed_items.AbstractBaseSeedItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScalarUtilsAgricultureAddon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_AGRICULTURE_ADDON_TAB = CREATIVE_MODE_TABS.register("scalar_utils_agriculture_addon", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_agriculture_addon"))
            .icon(() -> new ItemStack(ModItems.NETHERITE_SEEDS.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == SCALAR_UTILS_AGRICULTURE_ADDON_TAB.get()) {

            // Tier 1
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof AbstractBaseSeedItem abstractBaseSeedItem && abstractBaseSeedItem.getTier() == 1) event.accept(abstractBaseSeedItem);

            // Tier 2
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof AbstractBaseSeedItem abstractBaseSeedItem && abstractBaseSeedItem.getTier() == 2) event.accept(abstractBaseSeedItem);

            // Tier 3
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof AbstractBaseSeedItem abstractBaseSeedItem && abstractBaseSeedItem.getTier() == 3)event.accept(abstractBaseSeedItem);


            // Tier 4
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof AbstractBaseSeedItem abstractBaseSeedItem && abstractBaseSeedItem.getTier() == 4) event.accept(abstractBaseSeedItem);

            // Tier 5
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof AbstractBaseSeedItem abstractBaseSeedItem && abstractBaseSeedItem.getTier() == 5) event.accept(abstractBaseSeedItem);
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
