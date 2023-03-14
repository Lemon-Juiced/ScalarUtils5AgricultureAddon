package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class GoldCropBlock extends AbstractBaseCropBlock{
    public GoldCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.GOLD_SEEDS.get();
    }
}
