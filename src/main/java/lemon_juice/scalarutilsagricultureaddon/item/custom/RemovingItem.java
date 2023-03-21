package lemon_juice.scalarutilsagricultureaddon.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RemovingItem extends Item {
    public RemovingItem(Properties properties) {
        super(properties);
    }

    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("removing.tooltip").withStyle(ChatFormatting.DARK_GREEN));
    }
}
