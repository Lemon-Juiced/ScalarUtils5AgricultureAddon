package lemon_juice.scalarutilsagricultureaddon;

import lemon_juice.scalarutilsagricultureaddon.block.ScalarUtilsAgrAddBlocks;
import lemon_juice.scalarutilsagricultureaddon.creativetab.ScalarUtilsAgrAddCreativeTabAdditions;
import lemon_juice.scalarutilsagricultureaddon.item.ScalarUtilsAgrAddItems;
import lemon_juice.scalarutilsagricultureaddon.util.ScalarUtilsAgrAddCompostables;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ScalarUtilsAgricultureAddon.MOD_ID)
public class ScalarUtilsAgricultureAddon {
    public static final String MOD_ID = "scalar_utils_agriculture_addon";

    public ScalarUtilsAgricultureAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ScalarUtilsAgrAddItems.register(modEventBus);
        ScalarUtilsAgrAddBlocks.register(modEventBus);

        // Register Creative Tab
        ScalarUtilsAgrAddCreativeTabAdditions.register(modEventBus);
        modEventBus.addListener(ScalarUtilsAgrAddCreativeTabAdditions::registerTabs);

        // Calls commonSetup (Compostables)
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //Register Compostables
            ScalarUtilsAgrAddCompostables.setup(event);
        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
