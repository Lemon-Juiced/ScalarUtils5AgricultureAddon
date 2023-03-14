package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class GlowstoneCropBlock extends AbstractBaseCropBlock{
    public GlowstoneCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.GLOWSTONE_SEEDS.get();
    }
}
