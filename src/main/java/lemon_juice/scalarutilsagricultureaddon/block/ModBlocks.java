package lemon_juice.scalarutilsagricultureaddon.block;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.block.crop.*;
import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtilsAgricultureAddon.MOD_ID);

    public static final RegistryObject<Block> ALUMINUM_CROP = registerBlockWithoutBlockItem("aluminum_crop", () -> new AbstractBaseCropBlock("aluminum", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> AMETHYST_CROP = registerBlockWithoutBlockItem("amethyst_crop", () -> new AbstractBaseCropBlock("amethyst", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ANGLESITE_CROP = registerBlockWithoutBlockItem("anglesite_crop", () -> new AbstractBaseCropBlock("anglesite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> APATITE_CROP = registerBlockWithoutBlockItem("apatite_crop", () -> new AbstractBaseCropBlock("apatite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> BENITOITE_CROP = registerBlockWithoutBlockItem("benitoite_crop", () -> new AbstractBaseCropBlock("benitoite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> BLUTONIUM_CROP = registerBlockWithoutBlockItem("blutonium_crop", () -> new AbstractBaseCropBlock("blutonium", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> BLUTSTEIN_CROP = registerBlockWithoutBlockItem("blutstein_crop", () -> new AbstractBaseCropBlock("blutstein", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> BRASS_CROP = registerBlockWithoutBlockItem("brass_crop", () -> new AbstractBaseCropBlock("brass", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> BRONZE_CROP = registerBlockWithoutBlockItem("bronze_crop", () -> new AbstractBaseCropBlock("bronze", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CALORITE_CROP = registerBlockWithoutBlockItem("calorite_crop", () -> new AbstractBaseCropBlock("calorite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CERTUS_QUARTZ_CROP = registerBlockWithoutBlockItem("certus_quartz_crop", () -> new AbstractBaseCropBlock("certus_quartz", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CHARGED_CERTUS_QUARTZ_CROP = registerBlockWithoutBlockItem("charged_certus_quartz_crop", () -> new AbstractBaseCropBlock("charged_certus_quartz", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CINNABAR_CROP = registerBlockWithoutBlockItem("cinnabar_crop", () -> new AbstractBaseCropBlock("cinnabar", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CLAY_CROP = registerBlockWithoutBlockItem("clay_crop", () -> new AbstractBaseCropBlock("clay", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COAL_CROP = registerBlockWithoutBlockItem("coal_crop", () -> new AbstractBaseCropBlock("coal", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COAL_COKE_CROP = registerBlockWithoutBlockItem("coal_coke_crop", () -> new AbstractBaseCropBlock("coal_coke", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COBALT_CROP = registerBlockWithoutBlockItem("cobalt_crop", () -> new AbstractBaseCropBlock("cobalt", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COLORLESS_XYCHRONITE_CRYSTAL_CROP = registerBlockWithoutBlockItem("colorless_xychronite_crystal_crop", () -> new AbstractBaseCropBlock("colorless_xychronite_crystal", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CONDUCTIVE_ALLOY_CROP = registerBlockWithoutBlockItem("conductive_alloy_crop", () -> new AbstractBaseCropBlock("conductive_alloy", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CONSTANTAN_CROP = registerBlockWithoutBlockItem("constantan_crop", () -> new AbstractBaseCropBlock("constantan", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COPPER_CROP = registerBlockWithoutBlockItem("copper_crop", () -> new AbstractBaseCropBlock("copper", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COPPER_ALLOY_CROP = registerBlockWithoutBlockItem("copper_alloy_crop", () -> new AbstractBaseCropBlock("copper_alloy", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CYANITE_CROP = registerBlockWithoutBlockItem("cyanite_crop", () -> new AbstractBaseCropBlock("cyanite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> DARK_STEEL_CROP = registerBlockWithoutBlockItem("dark_steel_crop", () -> new AbstractBaseCropBlock("dark_steel", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> DESH_CROP = registerBlockWithoutBlockItem("desh_crop", () -> new AbstractBaseCropBlock("dark_steel", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> DIAMOND_CROP = registerBlockWithoutBlockItem("diamond_crop", () -> new AbstractBaseCropBlock("diamond", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> DIMENSIONAL_SHARD_CROP = registerBlockWithoutBlockItem("dimensional_shard_crop", () -> new AbstractBaseCropBlock("dimensional_shard", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ELECTRUM_CROP = registerBlockWithoutBlockItem("electrum_crop", () -> new AbstractBaseCropBlock("electrum", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> EMERALD_CROP = registerBlockWithoutBlockItem("emerald_crop", () -> new AbstractBaseCropBlock("emerald", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> END_STEEL_CROP = registerBlockWithoutBlockItem("end_steel_crop", () -> new AbstractBaseCropBlock("end_steel", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ENDER_CRYSTAL_CROP = registerBlockWithoutBlockItem("ender_crystal_crop", () -> new AbstractBaseCropBlock("ender_crystal", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ENDER_PEARL_CROP = registerBlockWithoutBlockItem("ender_pearl_crop", () -> new AbstractBaseCropBlock("ender_pearl", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ENDERIUM_CROP = registerBlockWithoutBlockItem("enderium_crop", () -> new AbstractBaseCropBlock("enderium", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ENERGETIC_ALLOY_CROP = registerBlockWithoutBlockItem("energetic_alloy_crop", () -> new AbstractBaseCropBlock("energetic_alloy", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> FLUIX_CRYSTAL_CROP = registerBlockWithoutBlockItem("fluix_crystal_crop", () -> new AbstractBaseCropBlock("fluix_crystal", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> GLOWSTONE_CROP = registerBlockWithoutBlockItem("glowstone_crop", () -> new AbstractBaseCropBlock("glowstone", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().lightLevel((p_50874_) -> {return 15;})));
    public static final RegistryObject<Block> GOLD_CROP = registerBlockWithoutBlockItem("gold_crop", () -> new AbstractBaseCropBlock("gold", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> GRAINS_OF_INFINITY_CROP = registerBlockWithoutBlockItem("grains_of_infinity_crop", () -> new AbstractBaseCropBlock("grains_of_infinity", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> GRAPHITE_CROP = registerBlockWithoutBlockItem("graphite_crop", () -> new AbstractBaseCropBlock("graphite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> INSANITE_CROP = registerBlockWithoutBlockItem("insanite_crop", () -> new AbstractBaseCropBlock("isanite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> INVAR_CROP = registerBlockWithoutBlockItem("invar_crop", () -> new AbstractBaseCropBlock("invar", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> IRON_CROP = registerBlockWithoutBlockItem("iron_crop", () -> new AbstractBaseCropBlock("iron", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> LAPIS_LAZULI_CROP = registerBlockWithoutBlockItem("lapis_lazuli_crop", () -> new AbstractBaseCropBlock("lapis_lazuli", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> LEAD_CROP = registerBlockWithoutBlockItem("lead_crop", () -> new AbstractBaseCropBlock("lead", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> LUDICRITE_CROP = registerBlockWithoutBlockItem("ludicrite_crop", () -> new AbstractBaseCropBlock("ludicrite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> LUMIUM_CROP = registerBlockWithoutBlockItem("lumium_crop", () -> new AbstractBaseCropBlock("lumium", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> MAGNETITE_CROP = registerBlockWithoutBlockItem("magnetite_crop", () -> new AbstractBaseCropBlock("magnetite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> MANGANESE_CROP = registerBlockWithoutBlockItem("manganese_crop", () -> new AbstractBaseCropBlock("manganese", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> MANYULLYN_CROP = registerBlockWithoutBlockItem("manyullyn_crop", () -> new AbstractBaseCropBlock("mannyullyn", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NECRONITE_CROP = registerBlockWithoutBlockItem("necronite_crop", () -> new AbstractBaseCropBlock("necronite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NETHER_QUARTZ_CROP = registerBlockWithoutBlockItem("nether_quartz_crop", () -> new AbstractBaseCropBlock("nether_quartz", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NETHERITE_CROP = registerBlockWithoutBlockItem("netherite_crop", () -> new AbstractBaseCropBlock("netherite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NICKEL_CROP = registerBlockWithoutBlockItem("nickel_crop", () -> new AbstractBaseCropBlock("nickel", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NITER_CROP = registerBlockWithoutBlockItem("niter_crop", () -> new AbstractBaseCropBlock("niter", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> OBSIDIAN_CROP = registerBlockWithoutBlockItem("obsidian_crop", () -> new AbstractBaseCropBlock("obsidian", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> OSMIUM_CROP = registerBlockWithoutBlockItem("osmium_crop", () -> new AbstractBaseCropBlock("osmium", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> OSTRUM_CROP = registerBlockWithoutBlockItem("ostrum_crop", () -> new AbstractBaseCropBlock("ostrum", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> PERIDOT_CROP = registerBlockWithoutBlockItem("peridot_crop", () -> new AbstractBaseCropBlock("peridot", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> PLATINUM_CROP = registerBlockWithoutBlockItem("platinum_crop", () -> new AbstractBaseCropBlock("platinum", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> PRESCIENT_CRYSTAL_CROP = registerBlockWithoutBlockItem("prescient_crystal_crop", () -> new AbstractBaseCropBlock("prescient_crystal", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> PULSATING_ALLOY_CROP = registerBlockWithoutBlockItem("pulsating_alloy_crop", () -> new AbstractBaseCropBlock("pulsating_alloy", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> PULSATING_CRYSTAL_CROP = registerBlockWithoutBlockItem("pulsating_crystal_crop", () -> new AbstractBaseCropBlock("pulsatingcrystal", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> REDSTONE_CROP = registerBlockWithoutBlockItem("redstone_crop", () -> new AbstractBaseCropBlock("redstone", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> REDSTONE_ALLOY_CROP = registerBlockWithoutBlockItem("redstone_alloy_crop", () -> new AbstractBaseCropBlock("redstone", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> REFINED_IRON_CROP = registerBlockWithoutBlockItem("refined_iron_crop", () -> new AbstractBaseCropBlock("refined_iron", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RIDICULITE_CROP = registerBlockWithoutBlockItem("ridiculite_crop", () -> new AbstractBaseCropBlock("ridiculite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ROSE_GOLD_CROP = registerBlockWithoutBlockItem("rose_gold_crop", () -> new AbstractBaseCropBlock("rose_gold", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ROSE_QUARTZ_CROP = registerBlockWithoutBlockItem("rose_quartz_crop", () -> new AbstractBaseCropBlock("rose_quartz", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RUBY_CROP = registerBlockWithoutBlockItem("ruby_crop", () -> new AbstractBaseCropBlock("ruby", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SAPPHIRE_CROP = registerBlockWithoutBlockItem("sapphire_crop", () -> new AbstractBaseCropBlock("sapphire", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SIGNALUM_CROP = registerBlockWithoutBlockItem("signalum_crop", () -> new AbstractBaseCropBlock("signalum", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SILICON_CROP = registerBlockWithoutBlockItem("silicon_crop", () -> new AbstractBaseCropBlock("silicon", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SILVER_CROP = registerBlockWithoutBlockItem("silver_crop", () -> new AbstractBaseCropBlock("silver", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> STEEL_CROP = registerBlockWithoutBlockItem("steel_crop", () -> new AbstractBaseCropBlock("steel", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SOULARIUM_CROP = registerBlockWithoutBlockItem("soularium_crop", () -> new AbstractBaseCropBlock("soularium", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SULFUR_CROP = registerBlockWithoutBlockItem("sulfur_crop", () -> new AbstractBaseCropBlock("sulfur", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> TIN_CROP = registerBlockWithoutBlockItem("tin_crop", () -> new AbstractBaseCropBlock("tin", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> TUNGSTEN_CROP = registerBlockWithoutBlockItem("tungsten_crop", () -> new AbstractBaseCropBlock("tungsten", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> UMBRALITE_CROP = registerBlockWithoutBlockItem("umbralite_crop", () -> new AbstractBaseCropBlock("umbralite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> URANIUM_CROP = registerBlockWithoutBlockItem("uranium_crop", () -> new AbstractBaseCropBlock("uranium", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> VIBRANT_ALLOY_CROP = registerBlockWithoutBlockItem("vibrant_alloy_crop", () -> new AbstractBaseCropBlock("vibrant_alloy", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> VIBRANT_CRYSTAL_CROP = registerBlockWithoutBlockItem("vibrant_crystal_crop", () -> new AbstractBaseCropBlock("vibrant_crystal", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ZINC_CROP = registerBlockWithoutBlockItem("zinc_crop", () -> new AbstractBaseCropBlock("zinc", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ZWEIITE_CROP = registerBlockWithoutBlockItem("zwiite_crop", () -> new AbstractBaseCropBlock("zweiite", BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    /******************************** Registry ********************************/
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
