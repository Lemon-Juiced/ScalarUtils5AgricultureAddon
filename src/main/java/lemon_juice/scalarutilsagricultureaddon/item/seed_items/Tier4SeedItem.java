package lemon_juice.scalarutilsagricultureaddon.item.seed_items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Tier4SeedItem extends AbstractBaseSeedItem {
    public Tier4SeedItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public Rarity getRarity(ItemStack itemStack) {
        return Rarity.EPIC;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("t4_seed.tooltip").withStyle(ChatFormatting.LIGHT_PURPLE));
    }
}
