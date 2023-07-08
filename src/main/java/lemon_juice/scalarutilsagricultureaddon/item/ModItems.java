package lemon_juice.scalarutilsagricultureaddon.item;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.block.ModBlocks;
import lemon_juice.scalarutilsagricultureaddon.item.seed_items.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsAgricultureAddon.MOD_ID);

    public static final RegistryObject<Item> ALUMINUM_SEEDS = ITEMS.register("aluminum_seeds", () -> new AbstractBaseSeedItem(ModBlocks.ALUMINUM_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> AMETHYST_SEEDS = ITEMS.register("amethyst_seeds", () -> new AbstractBaseSeedItem(ModBlocks.AMETHYST_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> APATITE_SEEDS = ITEMS.register("apatite_seeds", () -> new AbstractBaseSeedItem(ModBlocks.APATITE_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> BRASS_SEEDS = ITEMS.register("brass_seeds", () -> new AbstractBaseSeedItem(ModBlocks.BRASS_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> BRONZE_SEEDS = ITEMS.register("bronze_seeds", () -> new AbstractBaseSeedItem(ModBlocks.BRONZE_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> CERTUS_QUARTZ_SEEDS = ITEMS.register("certus_quartz_seeds", () -> new AbstractBaseSeedItem(ModBlocks.CERTUS_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> CHARGED_CERTUS_QUARTZ_SEEDS = ITEMS.register("charged_certus_quartz_seeds", () -> new AbstractBaseSeedItem(ModBlocks.CHARGED_CERTUS_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> COAL_SEEDS = ITEMS.register("coal_seeds", () -> new AbstractBaseSeedItem(ModBlocks.COAL_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> COBALT_SEEDS = ITEMS.register("cobalt_seeds", () -> new AbstractBaseSeedItem(ModBlocks.COBALT_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> CONSTANTAN_SEEDS = ITEMS.register("constantan_seeds", () -> new AbstractBaseSeedItem(ModBlocks.CONSTANTAN_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> COPPER_SEEDS = ITEMS.register("copper_seeds", () -> new AbstractBaseSeedItem(ModBlocks.COPPER_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> DIAMOND_SEEDS = ITEMS.register("diamond_seeds", () -> new AbstractBaseSeedItem(ModBlocks.DIAMOND_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ELECTRUM_SEEDS = ITEMS.register("electrum_seeds", () -> new AbstractBaseSeedItem(ModBlocks.ELECTRUM_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> EMERALD_SEEDS = ITEMS.register("emerald_seeds", () -> new AbstractBaseSeedItem(ModBlocks.EMERALD_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> GLOWSTONE_SEEDS = ITEMS.register("glowstone_seeds", () -> new AbstractBaseSeedItem(ModBlocks.GLOWSTONE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> GOLD_SEEDS = ITEMS.register("gold_seeds", () -> new AbstractBaseSeedItem(ModBlocks.GOLD_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> INVAR_SEEDS = ITEMS.register("invar_seeds", () -> new AbstractBaseSeedItem(ModBlocks.INVAR_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> IRON_SEEDS = ITEMS.register("iron_seeds", () -> new AbstractBaseSeedItem(ModBlocks.IRON_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> LAPIS_LAZULI_SEEDS = ITEMS.register("lapis_lazuli_seeds", () -> new AbstractBaseSeedItem(ModBlocks.LAPIS_LAZULI_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> LEAD_SEEDS = ITEMS.register("lead_seeds", () -> new AbstractBaseSeedItem(ModBlocks.LEAD_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> MANGANESE_SEEDS = ITEMS.register("manganese_seeds", () -> new AbstractBaseSeedItem(ModBlocks.MANGANESE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> NECRONITE_SEEDS = ITEMS.register("necronite_seeds", () -> new AbstractBaseSeedItem(ModBlocks.NECRONITE_CROP.get(), new Item.Properties(), 5, true));
    public static final RegistryObject<Item> NETHER_QUARTZ_SEEDS = ITEMS.register("nether_quartz_seeds", () -> new AbstractBaseSeedItem(ModBlocks.NETHER_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> NETHERITE_SEEDS = ITEMS.register("netherite_seeds", () -> new AbstractBaseSeedItem(ModBlocks.NETHERITE_CROP.get(), new Item.Properties(), 4, true));
    public static final RegistryObject<Item> NICKEL_SEEDS = ITEMS.register("nickel_seeds", () -> new AbstractBaseSeedItem(ModBlocks.NICKEL_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> OBSIDIAN_SEEDS = ITEMS.register("obsidian_seeds", () -> new AbstractBaseSeedItem(ModBlocks.OBSIDIAN_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> OSMIUM_SEEDS = ITEMS.register("osmium_seeds", () -> new AbstractBaseSeedItem(ModBlocks.OSMIUM_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> PERIDOT_SEEDS = ITEMS.register("peridot_seeds", () -> new AbstractBaseSeedItem(ModBlocks.PERIDOT_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> REDSTONE_SEEDS = ITEMS.register("redstone_seeds", () -> new AbstractBaseSeedItem(ModBlocks.REDSTONE_CROP.get(), new Item.Properties(), 3));
    public static final RegistryObject<Item> ROSE_QUARTZ_SEEDS = ITEMS.register("rose_quartz_seeds", () -> new AbstractBaseSeedItem(ModBlocks.ROSE_QUARTZ_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> RUBY_SEEDS = ITEMS.register("ruby_seeds", () -> new AbstractBaseSeedItem(ModBlocks.RUBY_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SAPPHIRE_SEEDS = ITEMS.register("sapphire_seeds", () -> new AbstractBaseSeedItem(ModBlocks.SAPPHIRE_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SILICON_SEEDS = ITEMS.register("silicon_seeds", () -> new AbstractBaseSeedItem(ModBlocks.SILICON_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SILVER_SEEDS = ITEMS.register("silver_seeds", () -> new AbstractBaseSeedItem(ModBlocks.SILVER_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> STEEL_SEEDS = ITEMS.register("steel_seeds", () -> new AbstractBaseSeedItem(ModBlocks.STEEL_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> SULFUR_SEEDS = ITEMS.register("sulfur_seeds", () -> new AbstractBaseSeedItem(ModBlocks.SULFUR_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> TIN_SEEDS = ITEMS.register("tin_seeds", () -> new AbstractBaseSeedItem(ModBlocks.TIN_CROP.get(), new Item.Properties(), 1));
    public static final RegistryObject<Item> URANIUM_SEEDS = ITEMS.register("uranium_seeds", () -> new AbstractBaseSeedItem(ModBlocks.URANIUM_CROP.get(), new Item.Properties(), 2));
    public static final RegistryObject<Item> ZINC_SEEDS = ITEMS.register("zinc_seeds", () -> new AbstractBaseSeedItem(ModBlocks.ZINC_CROP.get(), new Item.Properties(), 2));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
