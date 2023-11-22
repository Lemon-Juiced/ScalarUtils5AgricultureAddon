package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ScalarUtilsAgrAddItems;
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
            case "aluminum" -> ScalarUtilsAgrAddItems.ALUMINUM_SEEDS.get();
            case "amethyst" -> ScalarUtilsAgrAddItems.AMETHYST_SEEDS.get();
            case "anglesite" -> ScalarUtilsAgrAddItems.ANGLESITE_SEEDS.get();
            case "apatite" -> ScalarUtilsAgrAddItems.APATITE_SEEDS.get();
            case "benitoite" -> ScalarUtilsAgrAddItems.BENITOITE_SEEDS.get();
            case "blutonium" -> ScalarUtilsAgrAddItems.BLUTONIUM_SEEDS.get();
            case "blutstein" -> ScalarUtilsAgrAddItems.BLUTSTEIN_SEEDS.get();
            case "brass" -> ScalarUtilsAgrAddItems.BRASS_SEEDS.get();
            case "bronze" -> ScalarUtilsAgrAddItems.BRONZE_SEEDS.get();
            case "calorite" -> ScalarUtilsAgrAddItems.CALORITE_SEEDS.get();
            case "certus_quartz" -> ScalarUtilsAgrAddItems.CERTUS_QUARTZ_SEEDS.get();
            case "charged_certus_quartz" -> ScalarUtilsAgrAddItems.CHARGED_CERTUS_QUARTZ_SEEDS.get();
            case "cinnabar" -> ScalarUtilsAgrAddItems.CINNABAR_SEEDS.get();
            case "clay" -> ScalarUtilsAgrAddItems.CLAY_SEEDS.get();
            case "coal" -> ScalarUtilsAgrAddItems.COAL_SEEDS.get();
            case "coal_coke" -> ScalarUtilsAgrAddItems.COAL_COKE_SEEDS.get();
            case "cobalt" -> ScalarUtilsAgrAddItems.COBALT_SEEDS.get();
            case "colorless_xychronite_crystal" -> ScalarUtilsAgrAddItems.COLORLESS_XYCHRONITE_CRYSTAL_SEEDS.get();
            case "conductive_alloy" -> ScalarUtilsAgrAddItems.CONDUCTIVE_ALLOY_SEEDS.get();
            case "constantan" -> ScalarUtilsAgrAddItems.CONSTANTAN_SEEDS.get();
            case "copper" -> ScalarUtilsAgrAddItems.COPPER_SEEDS.get();
            case "copper_alloy" -> ScalarUtilsAgrAddItems.COPPER_ALLOY_SEEDS.get();
            case "cyanite" -> ScalarUtilsAgrAddItems.CYANITE_SEEDS.get();
            case "dark_steel" -> ScalarUtilsAgrAddItems.DARK_STEEL_SEEDS.get();
            case "desh" -> ScalarUtilsAgrAddItems.DESH_SEEDS.get();
            case "diamond" -> ScalarUtilsAgrAddItems.DIAMOND_SEEDS.get();
            case "dimensional_shard" -> ScalarUtilsAgrAddItems.DIMENSIONAL_SHARD_SEEDS.get();
            case "electrum" -> ScalarUtilsAgrAddItems.ELECTRUM_SEEDS.get();
            case "emerald" -> ScalarUtilsAgrAddItems.EMERALD_SEEDS.get();
            case "end_steel" -> ScalarUtilsAgrAddItems.END_STEEL_SEEDS.get();
            case "ender_crystal" -> ScalarUtilsAgrAddItems.ENDER_CRYSTAL_SEEDS.get();
            case "ender_pearl" -> ScalarUtilsAgrAddItems.ENDER_PEARL_SEEDS.get();
            case "enderium" -> ScalarUtilsAgrAddItems.ENDERIUM_SEEDS.get();
            case "energetic_alloy" -> ScalarUtilsAgrAddItems.ENERGETIC_ALLOY_SEEDS.get();
            case "fluix_crystal" -> ScalarUtilsAgrAddItems.FLUIX_CRYSTAL_SEEDS.get();
            case "glowstone" -> ScalarUtilsAgrAddItems.GLOWSTONE_SEEDS.get();
            case "gold" -> ScalarUtilsAgrAddItems.GOLD_SEEDS.get();
            case "grains_of_infinity" -> ScalarUtilsAgrAddItems.GRAINS_OF_INFINITY_SEEDS.get();
            case "graphite" -> ScalarUtilsAgrAddItems.GRAPHITE_SEEDS.get();
            case "inanite" -> ScalarUtilsAgrAddItems.INANITE_SEEDS.get();
            case "insanite" -> ScalarUtilsAgrAddItems.INSANITE_SEEDS.get();
            case "invar" -> ScalarUtilsAgrAddItems.INVAR_SEEDS.get();
            case "iron" -> ScalarUtilsAgrAddItems.IRON_SEEDS.get();
            case "lapis_lazuli" -> ScalarUtilsAgrAddItems.LAPIS_LAZULI_SEEDS.get();
            case "lead" -> ScalarUtilsAgrAddItems.LEAD_SEEDS.get();
            case "ludicrite" -> ScalarUtilsAgrAddItems.LUDICRITE_SEEDS.get();
            case "lumium" -> ScalarUtilsAgrAddItems.LUMIUM_SEEDS.get();
            case "magentite" -> ScalarUtilsAgrAddItems.MAGENTITE_SEEDS.get();
            case "manganese" -> ScalarUtilsAgrAddItems.MANGANESE_SEEDS.get();
            case "manyullyn" -> ScalarUtilsAgrAddItems.MANYULLYN_SEEDS.get();
            case "necronite" -> ScalarUtilsAgrAddItems.NECRONITE_SEEDS.get();
            case "nether_quartz" -> ScalarUtilsAgrAddItems.NETHER_QUARTZ_SEEDS.get();
            case "netherite" -> ScalarUtilsAgrAddItems.NETHERITE_SEEDS.get();
            case "nickel" -> ScalarUtilsAgrAddItems.NICKEL_SEEDS.get();
            case "niter" -> ScalarUtilsAgrAddItems.NITER_SEEDS.get();
            case "obsidian" -> ScalarUtilsAgrAddItems.OBSIDIAN_SEEDS.get();
            case "osmium" -> ScalarUtilsAgrAddItems.OSMIUM_SEEDS.get();
            case "ostrum" -> ScalarUtilsAgrAddItems.OSTRUM_SEEDS.get();
            case "peridot" -> ScalarUtilsAgrAddItems.PERIDOT_SEEDS.get();
            case "platinum" -> ScalarUtilsAgrAddItems.PLATINUM_SEEDS.get();
            case "prescient_crystal" -> ScalarUtilsAgrAddItems.PRESCIENT_CRYSTAL_SEEDS.get();
            case "pulsating_alloy" -> ScalarUtilsAgrAddItems.PULSATING_ALLOY_SEEDS.get();
            case "pulsating_crystal" -> ScalarUtilsAgrAddItems.PULSATING_CRYSTAL_SEEDS.get();
            case "quartz_enriched_iron" -> ScalarUtilsAgrAddItems.QUARTZ_ENRICHED_IRON_SEEDS.get();
            case "redstone" -> ScalarUtilsAgrAddItems.REDSTONE_SEEDS.get();
            case "redstone_alloy" -> ScalarUtilsAgrAddItems.REDSTONE_ALLOY_SEEDS.get();
            case "ridiculite" -> ScalarUtilsAgrAddItems.RIDICULITE_SEEDS.get();
            case "rose_gold" -> ScalarUtilsAgrAddItems.ROSE_GOLD_SEEDS.get();
            case "rose_quartz" -> ScalarUtilsAgrAddItems.ROSE_QUARTZ_SEEDS.get();
            case "ruby" -> ScalarUtilsAgrAddItems.RUBY_SEEDS.get();
            case "sapphire" -> ScalarUtilsAgrAddItems.SAPPHIRE_SEEDS.get();
            case "signalum" -> ScalarUtilsAgrAddItems.SIGNALUM_SEEDS.get();
            case "silicon" -> ScalarUtilsAgrAddItems.SILICON_SEEDS.get();
            case "silver" -> ScalarUtilsAgrAddItems.SILVER_SEEDS.get();
            case "steel" -> ScalarUtilsAgrAddItems.STEEL_SEEDS.get();
            case "soularium" -> ScalarUtilsAgrAddItems.SOULARIUM_SEEDS.get();
            case "sulfur" -> ScalarUtilsAgrAddItems.SULFUR_SEEDS.get();
            case "tin" -> ScalarUtilsAgrAddItems.TIN_SEEDS.get();
            case "tungsten" -> ScalarUtilsAgrAddItems.TUNGSTEN_SEEDS.get();
            case "umbralite" -> ScalarUtilsAgrAddItems.UMBRALITE_SEEDS.get();
            case "uranium" -> ScalarUtilsAgrAddItems.URANIUM_SEEDS.get();
            case "vibrant_alloy" -> ScalarUtilsAgrAddItems.VIBRANT_ALLOY_SEEDS.get();
            case "zinc" -> ScalarUtilsAgrAddItems.ZINC_SEEDS.get();
            default -> ScalarUtilsAgrAddItems.ZWEIITE_SEEDS.get(); //Make the last case the default
        };
    }
}
