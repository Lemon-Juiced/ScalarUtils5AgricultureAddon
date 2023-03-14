package lemon_juice.scalarutilsagricultureaddon.block.crop;

import lemon_juice.scalarutilsagricultureaddon.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class ObsidianCropBlock extends AbstractBaseCropBlock{
    public ObsidianCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() { return ModItems.OBSIDIAN_SEEDS.get(); }
}
