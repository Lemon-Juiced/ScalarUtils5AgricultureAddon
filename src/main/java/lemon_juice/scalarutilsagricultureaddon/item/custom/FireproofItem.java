package lemon_juice.scalarutilsagricultureaddon.item.custom;

import net.minecraft.world.item.Item;

public class FireproofItem extends Item {
    public FireproofItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
