package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class NetheriteCropBlock extends AbstractBaseCropBlock{
    public NetheriteCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.NETHERITE_SEEDS.get();
    }
}
