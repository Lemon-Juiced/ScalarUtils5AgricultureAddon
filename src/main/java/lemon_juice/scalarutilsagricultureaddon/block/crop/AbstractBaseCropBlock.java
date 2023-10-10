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
            case "anglesite" -> ModItems.ANGLESITE_SEEDS.get();
            case "apatite" -> ModItems.APATITE_SEEDS.get();
            case "benitoite" -> ModItems.BENITOITE_SEEDS.get();
            case "blutonium" -> ModItems.BLUTONIUM_SEEDS.get();
            case "brass" -> ModItems.BRASS_SEEDS.get();
            case "bronze" -> ModItems.BRONZE_SEEDS.get();
            case "calorite" -> ModItems.CALORITE_SEEDS.get();
            case "certus_quartz" -> ModItems.CERTUS_QUARTZ_SEEDS.get();
            case "charged_certus_quartz" -> ModItems.CHARGED_CERTUS_QUARTZ_SEEDS.get();
            case "cinnabar" -> ModItems.CINNABAR_SEEDS.get();
            case "clay" -> ModItems.CLAY_SEEDS.get();
            case "coal" -> ModItems.COAL_SEEDS.get();
            case "coal_coke" -> ModItems.COAL_COKE_SEEDS.get();
            case "cobalt" -> ModItems.COBALT_SEEDS.get();
            case "colorless_xychronite_crystal" -> ModItems.COLORLESS_XYCHRONITE_CRYSTAL_SEEDS.get();
            case "conductive_alloy" -> ModItems.CONDUCTIVE_ALLOY_SEEDS.get();
            case "constantan" -> ModItems.CONSTANTAN_SEEDS.get();
            case "copper" -> ModItems.COPPER_SEEDS.get();
            case "copper_alloy" -> ModItems.COPPER_ALLOY_SEEDS.get();
            case "cyanite" -> ModItems.CYANITE_SEEDS.get();
            case "dark_steel" -> ModItems.DARK_STEEL_SEEDS.get();
            case "desh" -> ModItems.DESH_SEEDS.get();
            case "diamond" -> ModItems.DIAMOND_SEEDS.get();
            case "dimensional_shard" -> ModItems.DIMENSIONAL_SHARD_SEEDS.get();
            case "electrum" -> ModItems.ELECTRUM_SEEDS.get();
            case "emerald" -> ModItems.EMERALD_SEEDS.get();
            case "end_steel" -> ModItems.END_STEEL_SEEDS.get();
            case "ender_crystal" -> ModItems.ENDER_CRYSTAL_SEEDS.get();
            case "ender_pearl" -> ModItems.ENDER_PEARL_SEEDS.get();
            case "enderium" -> ModItems.ENDERIUM_SEEDS.get();
            case "energetic_alloy" -> ModItems.ENERGETIC_ALLOY_SEEDS.get();
            case "fluix_crystal" -> ModItems.FLUIX_CRYSTAL_SEEDS.get();
            case "glowstone" -> ModItems.GLOWSTONE_SEEDS.get();
            case "gold" -> ModItems.GOLD_SEEDS.get();
            case "grains_of_infinity" -> ModItems.GRAINS_OF_INFINITY_SEEDS.get();
            case "graphite" -> ModItems.GRAPHITE_SEEDS.get();
            case "insanite" -> ModItems.INSANITE_SEEDS.get();
            case "invar" -> ModItems.INVAR_SEEDS.get();
            case "iron" -> ModItems.IRON_SEEDS.get();
            case "lapis_lazuli" -> ModItems.LAPIS_LAZULI_SEEDS.get();
            case "lead" -> ModItems.LEAD_SEEDS.get();
            case "ludicrite" -> ModItems.LUDICRITE_SEEDS.get();
            case "lumium" -> ModItems.LUMIUM_SEEDS.get();
            case "magnetite" -> ModItems.MAGNETITE_SEEDS.get();
            case "manganese" -> ModItems.MANGANESE_SEEDS.get();
            case "manyullyn" -> ModItems.MANYULLYN_SEEDS.get();
            case "necronite" -> ModItems.NECRONITE_SEEDS.get();
            case "nether_quartz" -> ModItems.NETHER_QUARTZ_SEEDS.get();
            case "netherite" -> ModItems.NETHERITE_SEEDS.get();
            case "nickel" -> ModItems.NICKEL_SEEDS.get();
            case "niter" -> ModItems.NITER_SEEDS.get();
            case "obsidian" -> ModItems.OBSIDIAN_SEEDS.get();
            case "osmium" -> ModItems.OSMIUM_SEEDS.get();
            case "ostrum" -> ModItems.OSTRUM_SEEDS.get();
            case "peridot" -> ModItems.PERIDOT_SEEDS.get();
            case "platinum" -> ModItems.PLATINUM_SEEDS.get();
            case "prescient_crystal" -> ModItems.PRESCIENT_CRYSTAL_SEEDS.get();
            case "pulsating_alloy" -> ModItems.PULSATING_ALLOY_SEEDS.get();
            case "pulsating_crystal" -> ModItems.PULSATING_CRYSTAL_SEEDS.get();
            case "redstone" -> ModItems.REDSTONE_SEEDS.get();
            case "redstone_alloy" -> ModItems.REDSTONE_ALLOY_SEEDS.get();
            case "refined_iron" -> ModItems.REFINED_IRON_SEEDS.get();
            case "ridiculite" -> ModItems.RIDICULITE_SEEDS.get();
            case "rose_gold" -> ModItems.ROSE_GOLD_SEEDS.get();
            case "rose_quartz" -> ModItems.ROSE_QUARTZ_SEEDS.get();
            case "ruby" -> ModItems.RUBY_SEEDS.get();
            case "sapphire" -> ModItems.SAPPHIRE_SEEDS.get();
            case "signalum" -> ModItems.SIGNALUM_SEEDS.get();
            case "silicon" -> ModItems.SILICON_SEEDS.get();
            case "silver" -> ModItems.SILVER_SEEDS.get();
            case "steel" -> ModItems.STEEL_SEEDS.get();
            case "soularium" -> ModItems.SOULARIUM_SEEDS.get();
            case "sulfur" -> ModItems.SULFUR_SEEDS.get();
            case "tin" -> ModItems.TIN_SEEDS.get();
            case "tungsten" -> ModItems.TUNGSTEN_SEEDS.get();
            case "umbralite" -> ModItems.UMBRALITE_SEEDS.get();
            case "uranium" -> ModItems.URANIUM_SEEDS.get();
            case "vibrant_alloy" -> ModItems.VIBRANT_ALLOY_SEEDS.get();
            case "vibrant_crystal" -> ModItems.VIBRANT_CRYSTAL_SEEDS.get();
            default -> ModItems.ZINC_SEEDS.get(); //Make the last case the default
        };
    }
}
