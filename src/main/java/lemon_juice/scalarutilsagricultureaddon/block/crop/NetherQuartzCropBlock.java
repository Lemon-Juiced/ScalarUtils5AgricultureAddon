package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class NetherQuartzCropBlock extends AbstractBaseCropBlock{
    public NetherQuartzCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.NETHER_QUARTZ_SEEDS.get();
    }
}
