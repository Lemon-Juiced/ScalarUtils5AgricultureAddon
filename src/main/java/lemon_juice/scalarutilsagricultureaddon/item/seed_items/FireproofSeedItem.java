package lemon_juice.scalarutilsagricultureaddon.item.seed_items;

import net.minecraft.world.level.block.Block;

public class FireproofSeedItem extends AbstractBaseSeedItem{
    public FireproofSeedItem(Block block, Properties properties, int tier) {
        super(block, properties, tier);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
