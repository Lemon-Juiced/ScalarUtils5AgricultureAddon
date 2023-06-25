package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class RoseQuartzCropBlock extends AbstractBaseCropBlock{
    public RoseQuartzCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.ROSE_QUARTZ_SEEDS.get();
    }
}
