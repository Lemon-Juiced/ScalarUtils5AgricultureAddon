package lemon_juice.scalarutilsagricultureaddon.creativetab;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
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
            event.accept(ModItems.ALUMINUM_SEEDS.get());
            event.accept(ModItems.AMETHYST_SEEDS.get());
            event.accept(ModItems.APATITE_SEEDS.get());
            event.accept(ModItems.BRASS_SEEDS.get());
            event.accept(ModItems.BRONZE_SEEDS.get());
            event.accept(ModItems.COAL_SEEDS.get());
            event.accept(ModItems.COPPER_SEEDS.get());
            event.accept(ModItems.TIN_SEEDS.get());
            //Tier 2
            event.accept(ModItems.CONSTANTAN_SEEDS.get());
            event.accept(ModItems.ELECTRUM_SEEDS.get());
            event.accept(ModItems.GLOWSTONE_SEEDS.get());
            event.accept(ModItems.GOLD_SEEDS.get());
            event.accept(ModItems.INVAR_SEEDS.get());
            event.accept(ModItems.IRON_SEEDS.get());
            event.accept(ModItems.LAPIS_LAZULI_SEEDS.get());
            event.accept(ModItems.LEAD_SEEDS.get());
            event.accept(ModItems.MANGANESE_SEEDS.get());
            event.accept(ModItems.NETHER_QUARTZ_SEEDS.get());
            event.accept(ModItems.NICKEL_SEEDS.get());
            event.accept(ModItems.OSMIUM_SEEDS.get());
            event.accept(ModItems.PERIDOT_SEEDS.get());
            event.accept(ModItems.ROSE_QUARTZ_SEEDS.get());
            event.accept(ModItems.RUBY_SEEDS.get());
            event.accept(ModItems.SAPPHIRE_SEEDS.get());
            event.accept(ModItems.SILICON_SEEDS.get());
            event.accept(ModItems.SILVER_SEEDS.get());
            event.accept(ModItems.STEEL_SEEDS.get());
            event.accept(ModItems.URANIUM_SEEDS.get());
            event.accept(ModItems.ZINC_SEEDS.get());
            //Tier 3
            event.accept(ModItems.COBALT_SEEDS.get());
            event.accept(ModItems.DIAMOND_SEEDS.get());
            event.accept(ModItems.EMERALD_SEEDS.get());
            event.accept(ModItems.OBSIDIAN_SEEDS.get());
            event.accept(ModItems.REDSTONE_SEEDS.get());
            // Tier 4
            event.accept(ModItems.NETHERITE_SEEDS.get());
            // Tier 5
            event.accept(ModItems.NECRONITE_SEEDS.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
