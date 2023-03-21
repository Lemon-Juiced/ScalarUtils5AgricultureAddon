package lemon_juice.scalarutilsagricultureaddon.item;

import lemon_juice.scalarutilsagricultureaddon.ScalarUtilsAgricultureAddon;
import lemon_juice.scalarutilsagricultureaddon.block.ModBlocks;
import lemon_juice.scalarutilsagricultureaddon.item.custom.FireproofItem;
import lemon_juice.scalarutilsagricultureaddon.item.custom.RemovingItem;
import lemon_juice.scalarutilsagricultureaddon.item.seed_items.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsAgricultureAddon.MOD_ID);

    /* Mapping
     * Dusts -> Grain
     * Full Blocks -> Shard
     * Gems -> Fragment
     * Ingots -> Nugget
     */

    // Amethyst (Gem)
    public static final RegistryObject<Item> AMETHYST_FRAGMENT = ITEMS.register("amethyst_fragment", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_SEEDS = ITEMS.register("amethyst_seeds", () -> new Tier1SeedItem(ModBlocks.AMETHYST_CROP.get(), new Item.Properties()));
    // Coal (Gem)
    public static final RegistryObject<Item> COAL_SEEDS = ITEMS.register("coal_seeds", () -> new Tier1SeedItem(ModBlocks.COAL_CROP.get(), new Item.Properties()));
    // Copper (Ingot)
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SEEDS = ITEMS.register("copper_seeds", () -> new Tier1SeedItem(ModBlocks.COPPER_CROP.get(), new Item.Properties()));
    // Diamond (Gem)
    public static final RegistryObject<Item> DIAMOND_FRAGMENT = ITEMS.register("diamond_fragment", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SEEDS = ITEMS.register("diamond_seeds", () -> new Tier3SeedItem(ModBlocks.DIAMOND_CROP.get(), new Item.Properties()));
    // Emerald (Gem)
    public static final RegistryObject<Item> EMERALD_FRAGMENT = ITEMS.register("emerald_fragment", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SEEDS = ITEMS.register("emerald_seeds", () -> new Tier3SeedItem(ModBlocks.EMERALD_CROP.get(), new Item.Properties()));
    // Glowstone (Dust)
    public static final RegistryObject<Item> GRAIN_OF_GLOWSTONE_DUST = ITEMS.register("grain_of_glowstone_dust", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> GLOWSTONE_SEEDS = ITEMS.register("glowstone_seeds", () -> new Tier2SeedItem(ModBlocks.GLOWSTONE_CROP.get(), new Item.Properties()));
    // Gold (Ingot)
    public static final RegistryObject<Item> GOLD_SEEDS = ITEMS.register("gold_seeds", () -> new Tier2SeedItem(ModBlocks.GOLD_CROP.get(), new Item.Properties()));
    // Iron (Ingot)
    public static final RegistryObject<Item> IRON_SEEDS = ITEMS.register("iron_seeds", () -> new Tier2SeedItem(ModBlocks.IRON_CROP.get(), new Item.Properties()));
    // Lapis Lazuli (Gem)
    public static final RegistryObject<Item> LAPIS_LAZULI_FRAGMENT = ITEMS.register("lapis_lazuli_fragment", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_LAZULI_SEEDS = ITEMS.register("lapis_lazuli_seeds", () -> new Tier2SeedItem(ModBlocks.LAPIS_LAZULI_CROP.get(), new Item.Properties()));
    // Necronite (Ingot)
    public static final RegistryObject<Item> NECRONITE_SEEDS = ITEMS.register("necronite_seeds", () -> new NecroniteSeedItem(ModBlocks.NECRONITE_CROP.get(), new Item.Properties()));
    // Nether Quartz (Gem)
    public static final RegistryObject<Item> NETHER_QUARTZ_FRAGMENT = ITEMS.register("nether_quartz_fragment", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_QUARTZ_SEEDS = ITEMS.register("nether_quartz_seeds", () -> new Tier2SeedItem(ModBlocks.NETHER_QUARTZ_CROP.get(), new Item.Properties()));
    // Netherite (Ingot)
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new FireproofItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SEEDS = ITEMS.register("netherite_seeds", () -> new NetheriteSeedItem(ModBlocks.NETHERITE_CROP.get(), new Item.Properties()));
    // Obsidian (Full Block)
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SEEDS = ITEMS.register("obsidian_seeds", () -> new Tier3SeedItem(ModBlocks.OBSIDIAN_CROP.get(), new Item.Properties()));
    // Redstone  (Dust)
    public static final RegistryObject<Item> GRAIN_OF_REDSTONE_DUST = ITEMS.register("grain_of_redstone_dust", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_SEEDS = ITEMS.register("redstone_seeds", () -> new Tier3SeedItem(ModBlocks.REDSTONE_CROP.get(), new Item.Properties()));
    // Silicon (Gem)
    public static final RegistryObject<Item> SILICON_FRAGMENT = ITEMS.register("silicon_fragment", () -> new RemovingItem(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_SEEDS = ITEMS.register("silicon_seeds", () -> new Tier2SeedItem(ModBlocks.SILICON_CROP.get(), new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
