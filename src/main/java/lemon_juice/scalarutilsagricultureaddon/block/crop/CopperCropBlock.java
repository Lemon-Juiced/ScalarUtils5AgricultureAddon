package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class CopperCropBlock extends AbstractBaseCropBlock{
    public CopperCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.COPPER_SEEDS.get();
    }
}
