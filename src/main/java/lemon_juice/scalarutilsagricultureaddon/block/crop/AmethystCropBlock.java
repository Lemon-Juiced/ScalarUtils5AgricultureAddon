package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class AmethystCropBlock extends AbstractBaseCropBlock{
    public AmethystCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.AMETHYST_SEEDS.get();
    }
}
