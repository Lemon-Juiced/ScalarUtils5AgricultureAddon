package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class AbstractBaseCropBlock extends CropBlock {
    private static final int minAge = 0;
    private static final int maxAge = 3;
    public static final IntegerProperty AGE = IntegerProperty.create("age", minAge, maxAge);
    private final String name;
    public AbstractBaseCropBlock(String name, Properties properties) {
        super(properties);
        this.name = name;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return maxAge;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return switch (name) {
            case "aluminum" -> ModItems.ALUMINUM_SEEDS.get();
            case "amethyst" -> ModItems.AMETHYST_SEEDS.get();
            case "apatite" -> ModItems.APATITE_SEEDS.get();
            case "brass" -> ModItems.BRASS_SEEDS.get();
            case "bronze" -> ModItems.BRONZE_SEEDS.get();
            case "certus_quartz" -> ModItems.CERTUS_QUARTZ_SEEDS.get();
            case "charged_ertus_quartz" -> ModItems.CHARGED_CERTUS_QUARTZ_SEEDS.get();
            case "coal" -> ModItems.COAL_SEEDS.get();
            case "cobalt" -> ModItems.COBALT_SEEDS.get();
            case "constantan" -> ModItems.CONSTANTAN_SEEDS.get();
            case "copper" -> ModItems.COPPER_SEEDS.get();
            case "diamond" -> ModItems.DIAMOND_SEEDS.get();
            case "electrum" -> ModItems.ELECTRUM_SEEDS.get();
            case "emerald" -> ModItems.EMERALD_SEEDS.get();
            case "fluix_crystal" -> ModItems.FLUIX_CRYSTAL_SEEDS.get();
            case "glowstone" -> ModItems.GLOWSTONE_SEEDS.get();
            case "gold" -> ModItems.GOLD_SEEDS.get();
            case "invar" -> ModItems.INVAR_SEEDS.get();
            case "iron" -> ModItems.IRON_SEEDS.get();
            case "lapis_lazuli" -> ModItems.LAPIS_LAZULI_SEEDS.get();
            case "lead" -> ModItems.LEAD_SEEDS.get();
            case "manganese" -> ModItems.MANGANESE_SEEDS.get();
            case "necronite" -> ModItems.NECRONITE_SEEDS.get();
            case "nether_quartz" -> ModItems.NETHER_QUARTZ_SEEDS.get();
            case "netherite" -> ModItems.NETHERITE_SEEDS.get();
            case "nickel" -> ModItems.NICKEL_SEEDS.get();
            case "obsidian" -> ModItems.OBSIDIAN_SEEDS.get();
            case "osmium" -> ModItems.OSMIUM_SEEDS.get();
            case "peridot" -> ModItems.PERIDOT_SEEDS.get();
            case "redstone" -> ModItems.REDSTONE_SEEDS.get();
            case "rose_quartz" -> ModItems.ROSE_QUARTZ_SEEDS.get();
            case "ruby" -> ModItems.RUBY_SEEDS.get();
            case "sapphire" -> ModItems.SAPPHIRE_SEEDS.get();
            case "silicon" -> ModItems.SILICON_SEEDS.get();
            case "silver" -> ModItems.SILVER_SEEDS.get();
            case "steel" -> ModItems.STEEL_SEEDS.get();
            case "sulfur" -> ModItems.SULFUR_SEEDS.get();
            case "tin" -> ModItems.TIN_SEEDS.get();
            case "uranium" -> ModItems.URANIUM_SEEDS.get();
            default -> ModItems.ZINC_SEEDS.get(); //Make the last case the default
        };
    }
}
