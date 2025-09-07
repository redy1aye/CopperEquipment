package dev.redy1aye.copperequipment.events.christmas;

import dev.redy1aye.copperequipment.Mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import java.util.List;

public class XmasCookie extends Item {

    public XmasCookie(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable(Mod.xmasEventCongrats).formatted(Formatting.GREEN));
        super.appendTooltip(itemStack, context, tooltip, type);
    }
}