package lemon_juice.scalarutilsagricultureaddon.item.seed_items;

import net.minecraft.world.level.block.Block;

public class NetheriteSeedItem extends Tier4SeedItem{
    public NetheriteSeedItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
