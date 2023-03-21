package lemon_juice.scalarutilsagricultureaddon.creativetab;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {
    //Ideally, I'd like these to be in the tab for the main mod, but this is fine for now
    public static ResourceLocation SCALAR_UTILS_AGRICULTURE_ADDON_TAB = new ResourceLocation(ScalarUtilsAgricultureAddon.MOD_ID, "scalar_utils_agriculture_addon"); //Inside Agriculture

    public static void registerTabs(CreativeModeTabEvent.Register event) {
        // Agriculture Addon Tab
        event.registerCreativeModeTab(SCALAR_UTILS_AGRICULTURE_ADDON_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_agriculture_addon"))
                .icon(() -> new ItemStack(ModItems.NETHERITE_SEEDS.get()))
                .displayItems((features, output) -> {
                    // Tier 1
                    output.accept(new ItemStack(ModItems.ALUMINUM_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.AMETHYST_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.BRASS_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.BRONZE_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.COAL_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.COPPER_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.TIN_SEEDS.get()));
                    //Tier 2
                    output.accept(new ItemStack(ModItems.CONSTANTAN_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.ELECTRUM_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.GLOWSTONE_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.GOLD_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.INVAR_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.IRON_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.LAPIS_LAZULI_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.LEAD_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.NETHER_QUARTZ_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.NICKEL_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.OSMIUM_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.PERIDOT_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.RUBY_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.SAPPHIRE_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.SILICON_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.SILVER_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.STEEL_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.URANIUM_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.ZINC_SEEDS.get()));
                    //Tier 3
                    output.accept(new ItemStack(ModItems.COBALT_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.DIAMOND_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.EMERALD_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.OBSIDIAN_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.REDSTONE_SEEDS.get()));
                    // Tier 4
                    output.accept(new ItemStack(ModItems.NETHERITE_SEEDS.get()));
                    // Tier 5
                    output.accept(new ItemStack(ModItems.NECRONITE_SEEDS.get()));
                }));
    }
}
