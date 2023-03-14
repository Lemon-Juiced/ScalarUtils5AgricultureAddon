package lemon_juice.scalarutilsagricultureaddon;

import lemon_juice.scalarutilsagricultureaddon.block.ModBlocks;
import lemon_juice.scalarutilsagricultureaddon.creativetab.CreativeTab;
import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
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
    //private static final Logger LOGGER = LogUtils.getLogger();

    public ScalarUtilsAgricultureAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register Creative Tab
        modEventBus.addListener(CreativeTab::registerTabs);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
