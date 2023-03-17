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
    public static ResourceLocation SCALAR_UTILS_MICRO_RESOURCES_TAB = new ResourceLocation(ScalarUtilsAgricultureAddon.MOD_ID, "scalar_utils_micro_resources"); //Inside Items

    public static void registerTabs(CreativeModeTabEvent.Register event){
        // Agriculture Addon Tab
        event.registerCreativeModeTab(SCALAR_UTILS_AGRICULTURE_ADDON_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_agriculture_addon"))
                .icon(() -> new ItemStack(ModItems.NETHERITE_SEEDS.get()))
                .displayItems((features, output) -> {
                    // Tier 1
                    output.accept(new ItemStack(ModItems.AMETHYST_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.COAL_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.COPPER_SEEDS.get()));
                    //Tier 2
                    output.accept(new ItemStack(ModItems.GLOWSTONE_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.GOLD_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.IRON_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.LAPIS_LAZULI_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.NETHER_QUARTZ_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.SILICON_SEEDS.get()));
                    //Tier 3
                    output.accept(new ItemStack(ModItems.DIAMOND_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.EMERALD_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.OBSIDIAN_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.REDSTONE_SEEDS.get()));
                    // Tier 4
                    output.accept(new ItemStack(ModItems.NETHERITE_SEEDS.get()));
                    // Tier 5
                    output.accept(new ItemStack(ModItems.NECRONITE_SEEDS.get()));
                }));

        // Micro-Resources Tab
        event.registerCreativeModeTab(SCALAR_UTILS_MICRO_RESOURCES_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_micro_resources"))
                .icon(() -> new ItemStack(ModItems.NETHERITE_NUGGET.get()))
                .displayItems((features, output) -> {
                    // Fragments
                    output.accept(new ItemStack(ModItems.AMETHYST_FRAGMENT.get()));
                    output.accept(new ItemStack(ModItems.DIAMOND_FRAGMENT.get()));
                    output.accept(new ItemStack(ModItems.EMERALD_FRAGMENT.get()));
                    output.accept(new ItemStack(ModItems.LAPIS_LAZULI_FRAGMENT.get()));
                    output.accept(new ItemStack(ModItems.NETHER_QUARTZ_FRAGMENT.get()));
                    output.accept(new ItemStack(ModItems.SILICON_FRAGMENT.get()));

                    // Nuggets
                    output.accept(new ItemStack(ModItems.COPPER_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.NETHERITE_NUGGET.get()));

                    // Shard(s)
                    output.accept(new ItemStack(ModItems.OBSIDIAN_SHARD.get()));

                    // Tiny Piles
                    output.accept(new ItemStack(ModItems.TINY_PILE_OF_GLOWSTONE_DUST.get()));
                    output.accept(new ItemStack(ModItems.TINY_PILE_OF_REDSTONE_DUST.get()));
                }));
    }
}
