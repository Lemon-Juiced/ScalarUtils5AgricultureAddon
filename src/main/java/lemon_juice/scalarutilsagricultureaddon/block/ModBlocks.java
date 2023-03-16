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

    public static final RegistryObject<Block> AMETHYST_CROP = registerBlockWithoutBlockItem("amethyst_crop", () -> new AmethystCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COAL_CROP = registerBlockWithoutBlockItem("coal_crop", () -> new CoalCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> COPPER_CROP = registerBlockWithoutBlockItem("copper_crop", () -> new CopperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> DIAMOND_CROP = registerBlockWithoutBlockItem("diamond_crop", () -> new DiamondCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> EMERALD_CROP = registerBlockWithoutBlockItem("emerald_crop", () -> new EmeraldCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> GLOWSTONE_CROP = registerBlockWithoutBlockItem("glowstone_crop", () -> new GlowstoneCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().lightLevel((p_50874_) -> {return 15;})));
    public static final RegistryObject<Block> GOLD_CROP = registerBlockWithoutBlockItem("gold_crop", () -> new GoldCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> IRON_CROP = registerBlockWithoutBlockItem("iron_crop", () -> new IronCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> LAPIS_LAZULI_CROP = registerBlockWithoutBlockItem("lapis_lazuli_crop", () -> new LapisLazuliCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NETHER_QUARTZ_CROP = registerBlockWithoutBlockItem("nether_quartz_crop", () -> new NetherQuartzCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> NETHERITE_CROP = registerBlockWithoutBlockItem("netherite_crop", () -> new NetheriteCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> OBSIDIAN_CROP = registerBlockWithoutBlockItem("obsidian_crop", () -> new ObsidianCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> REDSTONE_CROP = registerBlockWithoutBlockItem("redstone_crop", () -> new RedstoneCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SILICON_CROP = registerBlockWithoutBlockItem("silicon_crop", () -> new SiliconCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

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
