package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class IronCropBlock extends AbstractBaseCropBlock{
    public IronCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.IRON_SEEDS.get();
    }
}
