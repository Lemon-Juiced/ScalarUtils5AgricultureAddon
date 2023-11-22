package lemon_juice.scalarutilsagricultureaddon.item;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.block.ScalarUtilsAgrAddBlocks;
import lemon_juice.scalarutilsagricultureaddon.item.seed_items.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ScalarUtilsAgrAddItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsAgricultureAddon.MOD_ID);

    public static final RegistryObject<Item> ALUMINUM_SEEDS = ITEMS.register("aluminum_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ALUMINUM_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> AMETHYST_SEEDS = ITEMS.register("amethyst_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.AMETHYST_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> ANGLESITE_SEEDS = ITEMS.register("anglesite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ANGLESITE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> APATITE_SEEDS = ITEMS.register("apatite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.APATITE_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> BENITOITE_SEEDS = ITEMS.register("benitoite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.BENITOITE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> BLUTONIUM_SEEDS = ITEMS.register("blutonium_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.BLUTONIUM_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> BLUTSTEIN_SEEDS = ITEMS.register("blutstein_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.BLUTSTEIN_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> BRASS_SEEDS = ITEMS.register("brass_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.BRASS_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> BRONZE_SEEDS = ITEMS.register("bronze_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.BRONZE_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> CALORITE_SEEDS = ITEMS.register("calorite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CALORITE_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> CERTUS_QUARTZ_SEEDS = ITEMS.register("certus_quartz_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CERTUS_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> CHARGED_CERTUS_QUARTZ_SEEDS = ITEMS.register("charged_certus_quartz_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CHARGED_CERTUS_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> CINNABAR_SEEDS = ITEMS.register("cinnabar_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CINNABAR_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> CLAY_SEEDS = ITEMS.register("clay_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CLAY_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> COAL_SEEDS = ITEMS.register("coal_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.COAL_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> COAL_COKE_SEEDS = ITEMS.register("coal_coke_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.COAL_COKE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> COBALT_SEEDS = ITEMS.register("cobalt_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.COBALT_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> COLORLESS_XYCHRONITE_CRYSTAL_SEEDS = ITEMS.register("colorless_xychronite_crystal_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.COLORLESS_XYCHRONITE_CRYSTAL_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> CONDUCTIVE_ALLOY_SEEDS = ITEMS.register("conductive_alloy_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CONDUCTIVE_ALLOY_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> CONSTANTAN_SEEDS = ITEMS.register("constantan_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CONSTANTAN_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> COPPER_SEEDS = ITEMS.register("copper_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.COPPER_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> COPPER_ALLOY_SEEDS = ITEMS.register("copper_alloy_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.COPPER_ALLOY_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> CYANITE_SEEDS = ITEMS.register("cyanite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.CYANITE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> DARK_STEEL_SEEDS = ITEMS.register("dark_steel_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.DARK_STEEL_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> DESH_SEEDS = ITEMS.register("desh_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.DESH_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> DIAMOND_SEEDS = ITEMS.register("diamond_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.DIAMOND_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> DIMENSIONAL_SHARD_SEEDS = ITEMS.register("dimensional_shard_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.DIMENSIONAL_SHARD_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ELECTRUM_SEEDS = ITEMS.register("electrum_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ELECTRUM_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> EMERALD_SEEDS = ITEMS.register("emerald_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.EMERALD_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> END_STEEL_SEEDS = ITEMS.register("end_steel_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.END_STEEL_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ENDER_PEARL_SEEDS = ITEMS.register("ender_pearl_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ENDER_PEARL_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ENDERIUM_SEEDS = ITEMS.register("enderium_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ENDERIUM_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> ENERGETIC_ALLOY_SEEDS = ITEMS.register("energetic_alloy_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ENERGETIC_ALLOY_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ENDER_CRYSTAL_SEEDS = ITEMS.register("ender_crystal_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ENDER_CRYSTAL_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> FLUIX_CRYSTAL_SEEDS = ITEMS.register("fluix_crystal_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.FLUIX_CRYSTAL_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> GLOWSTONE_SEEDS = ITEMS.register("glowstone_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.GLOWSTONE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> GOLD_SEEDS = ITEMS.register("gold_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.GOLD_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> GRAINS_OF_INFINITY_SEEDS = ITEMS.register("grains_of_infinity_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.GRAINS_OF_INFINITY_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> GRAPHITE_SEEDS = ITEMS.register("graphite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.GRAPHITE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> INANITE_SEEDS = ITEMS.register("inanite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.INANITE_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> INSANITE_SEEDS = ITEMS.register("insanite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.INSANITE_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> INVAR_SEEDS = ITEMS.register("invar_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.INVAR_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> IRON_SEEDS = ITEMS.register("iron_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.IRON_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> LAPIS_LAZULI_SEEDS = ITEMS.register("lapis_lazuli_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.LAPIS_LAZULI_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> LEAD_SEEDS = ITEMS.register("lead_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.LEAD_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> LUDICRITE_SEEDS = ITEMS.register("ludicrite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.LUDICRITE_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> LUMIUM_SEEDS = ITEMS.register("lumium_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.LUMIUM_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> MAGENTITE_SEEDS = ITEMS.register("magentite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.MAGENTITE_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> MANGANESE_SEEDS = ITEMS.register("manganese_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.MANGANESE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> MANYULLYN_SEEDS = ITEMS.register("manyullyn_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.MANYULLYN_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> NECRONITE_SEEDS = ITEMS.register("necronite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.NECRONITE_CROP.get(), new Item.Properties(), 5, true));
    public static final RegistryObject<Item> NETHER_QUARTZ_SEEDS = ITEMS.register("nether_quartz_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.NETHER_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> NETHERITE_SEEDS = ITEMS.register("netherite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.NETHERITE_CROP.get(), new Item.Properties(), 4, true));
    public static final RegistryObject<Item> NICKEL_SEEDS = ITEMS.register("nickel_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.NICKEL_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> NITER_SEEDS = ITEMS.register("niter_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.NITER_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> OBSIDIAN_SEEDS = ITEMS.register("obsidian_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.OBSIDIAN_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> OSMIUM_SEEDS = ITEMS.register("osmium_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.OSMIUM_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> OSTRUM_SEEDS = ITEMS.register("ostrum_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.OSTRUM_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> PERIDOT_SEEDS = ITEMS.register("peridot_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.PERIDOT_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> PLATINUM_SEEDS = ITEMS.register("platinum_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.PLATINUM_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> PRESCIENT_CRYSTAL_SEEDS = ITEMS.register("prescient_crystal_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.PRESCIENT_CRYSTAL_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> PULSATING_ALLOY_SEEDS = ITEMS.register("pulsating_alloy_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.PULSATING_ALLOY_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> PULSATING_CRYSTAL_SEEDS = ITEMS.register("pulsating_crystal_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.PULSATING_CRYSTAL_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> QUARTZ_ENRICHED_IRON_SEEDS = ITEMS.register("quartz_enriched_iron_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.QUARTZ_ENRICHED_IRON_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> REDSTONE_SEEDS = ITEMS.register("redstone_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.REDSTONE_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> REDSTONE_ALLOY_SEEDS = ITEMS.register("redstone_alloy_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.REDSTONE_ALLOY_CROP.get(), new Item.Properties(), 3));public static final RegistryObject<Item> RIDICULITE_SEEDS = ITEMS.register("ridiculite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.RIDICULITE_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ROSE_GOLD_SEEDS = ITEMS.register("rose_gold_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ROSE_GOLD_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ROSE_QUARTZ_SEEDS = ITEMS.register("rose_quartz_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ROSE_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> RUBY_SEEDS = ITEMS.register("ruby_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.RUBY_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SAPPHIRE_SEEDS = ITEMS.register("sapphire_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.SAPPHIRE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SIGNALUM_SEEDS = ITEMS.register("signalum_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.SIGNALUM_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> SILICON_SEEDS = ITEMS.register("silicon_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.SILICON_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SILVER_SEEDS = ITEMS.register("silver_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.SILVER_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> STEEL_SEEDS = ITEMS.register("steel_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.STEEL_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SOULARIUM_SEEDS = ITEMS.register("soularium_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.SOULARIUM_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> SULFUR_SEEDS = ITEMS.register("sulfur_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.SULFUR_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> TIN_SEEDS = ITEMS.register("tin_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.TIN_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> TUNGSTEN_SEEDS = ITEMS.register("tungsten_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.TUNGSTEN_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> UMBRALITE_SEEDS = ITEMS.register("umbralite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.UMBRALITE_CROP.get(), new Item.Properties(), 5));
    public static final RegistryObject<Item> URANIUM_SEEDS = ITEMS.register("uranium_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.URANIUM_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> VIBRANT_ALLOY_SEEDS = ITEMS.register("vibrant_alloy_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.VIBRANT_ALLOY_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> VIBRANT_CRYSTAL_SEEDS = ITEMS.register("vibrant_crystal_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.VIBRANT_CRYSTAL_CROP.get(), new Item.Properties(), 4));
    public static final RegistryObject<Item> ZINC_SEEDS = ITEMS.register("zinc_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ZINC_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> ZWEIITE_SEEDS = ITEMS.register("zweiite_seeds", () -> new AbstractBaseSeedItem(ScalarUtilsAgrAddBlocks.ZWEIITE_CROP.get(), new Item.Properties(), 3));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}