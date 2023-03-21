package lemon_juice.scalarutilsagricultureaddon.item.seed_items;

import net.minecraft.world.level.block.Block;

public class NecroniteSeedItem extends Tier5SeedItem{
    public NecroniteSeedItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
