package lemon_juice.scalarutilsagricultureaddon.item.seed_items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractBaseSeedItem extends ItemNameBlockItem {
    public final int tier;
    public final boolean isFireproof;

    public AbstractBaseSeedItem(Block block, Properties properties, int tier) {
        this(block, properties, tier, false);
    }

    public AbstractBaseSeedItem(Block block, Properties properties, int tier, boolean isFireproof) {
        super(block, properties);
        this.tier = tier;
        this.isFireproof = isFireproof;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        switch (tier) {
            case 1 -> components.add(Component.translatable("tooltip.scalar_utils_agriculture_addon.t1_seed"));
            case 2 -> components.add(Component.translatable("tooltip.scalar_utils_agriculture_addon.t2_seed").withStyle(ChatFormatting.YELLOW));
            case 3 -> components.add(Component.translatable("tooltip.scalar_utils_agriculture_addon.t3_seed").withStyle(ChatFormatting.AQUA));
            case 4 -> components.add(Component.translatable("tooltip.scalar_utils_agriculture_addon.t4_seed").withStyle(ChatFormatting.LIGHT_PURPLE));
            case 5 -> components.add(Component.translatable("tooltip.scalar_utils_agriculture_addon.t5_seed").withStyle(ChatFormatting.DARK_PURPLE));
            default -> components.add(Component.translatable("tooltip.scalar_utils_agriculture_addon.base_seed"));
        }
    }

    @Override
    public Rarity getRarity(ItemStack itemStack) {
        return switch (tier) {
            case 2 -> Rarity.UNCOMMON;
            case 3 -> Rarity.RARE;
            case 4, 5 -> Rarity.EPIC;
            default -> Rarity.COMMON;
        };
    }

    @Override
    public boolean isFireResistant() {
        return isFireproof;
    }

    /**
     * This might be useful to have in the future.
     *
     * @return the tier of the seed
     */
    public int getTier() {
        return tier;
    }
}
