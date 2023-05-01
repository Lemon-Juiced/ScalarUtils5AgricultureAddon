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

    public static final RegistryObject<Block> ALUMINUM_CROP = registerBlockWithoutBlockItem("aluminum_crop", () -> new AluminumCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> AMETHYST_CROP = registerBlockWithoutBlockItem("amethyst_crop", () -> new AmethystCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> BRASS_CROP = registerBlockWithoutBlockItem("brass_crop", () -> new BrassCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> BRONZE_CROP = registerBlockWithoutBlockItem("bronze_crop", () -> new BronzeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COAL_CROP = registerBlockWithoutBlockItem("coal_crop", () -> new CoalCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COBALT_CROP = registerBlockWithoutBlockItem("cobalt_crop", () -> new CobaltCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CONSTANTAN_CROP = registerBlockWithoutBlockItem("constantan_crop", () -> new ConstantanCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COPPER_CROP = registerBlockWithoutBlockItem("copper_crop", () -> new CopperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> DIAMOND_CROP = registerBlockWithoutBlockItem("diamond_crop", () -> new DiamondCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ELECTRUM_CROP = registerBlockWithoutBlockItem("electrum_crop", () -> new ElectrumCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> EMERALD_CROP = registerBlockWithoutBlockItem("emerald_crop", () -> new EmeraldCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> GLOWSTONE_CROP = registerBlockWithoutBlockItem("glowstone_crop", () -> new GlowstoneCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().lightLevel((p_50874_) -> {return 15;})));
    public static final RegistryObject<Block> GOLD_CROP = registerBlockWithoutBlockItem("gold_crop", () -> new GoldCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> INVAR_CROP = registerBlockWithoutBlockItem("invar_crop", () -> new InvarCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> IRON_CROP = registerBlockWithoutBlockItem("iron_crop", () -> new IronCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> LAPIS_LAZULI_CROP = registerBlockWithoutBlockItem("lapis_lazuli_crop", () -> new LapisLazuliCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> LEAD_CROP = registerBlockWithoutBlockItem("lead_crop", () -> new LeadCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> MANGANESE_CROP = registerBlockWithoutBlockItem("manganese_crop", () -> new ManganeseCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NECRONITE_CROP = registerBlockWithoutBlockItem("necronite_crop", () -> new NecroniteCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NETHER_QUARTZ_CROP = registerBlockWithoutBlockItem("nether_quartz_crop", () -> new NetherQuartzCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NETHERITE_CROP = registerBlockWithoutBlockItem("netherite_crop", () -> new NetheriteCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NICKEL_CROP = registerBlockWithoutBlockItem("nickel_crop", () -> new NickelCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> OBSIDIAN_CROP = registerBlockWithoutBlockItem("obsidian_crop", () -> new ObsidianCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> OSMIUM_CROP = registerBlockWithoutBlockItem("osmium_crop", () -> new OsmiumCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> PERIDOT_CROP = registerBlockWithoutBlockItem("peridot_crop", () -> new PeridotCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> REDSTONE_CROP = registerBlockWithoutBlockItem("redstone_crop", () -> new RedstoneCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RUBY_CROP = registerBlockWithoutBlockItem("ruby_crop", () -> new RubyCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SAPPHIRE_CROP = registerBlockWithoutBlockItem("sapphire_crop", () -> new SapphireCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SILICON_CROP = registerBlockWithoutBlockItem("silicon_crop", () -> new SiliconCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SILVER_CROP = registerBlockWithoutBlockItem("silver_crop", () -> new SilverCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> STEEL_CROP = registerBlockWithoutBlockItem("steel_crop", () -> new SteelCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> TIN_CROP = registerBlockWithoutBlockItem("tin_crop", () -> new TinCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> URANIUM_CROP = registerBlockWithoutBlockItem("uranium_crop", () -> new UraniumCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ZINC_CROP = registerBlockWithoutBlockItem("zinc_crop", () -> new ZincCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

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
