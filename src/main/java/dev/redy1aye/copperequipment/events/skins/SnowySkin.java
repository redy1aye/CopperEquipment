package dev.redy1aye.copperequipment.events.skins;

import static dev.redy1aye.copperequipment.Mod.*;

import org.jetbrains.annotations.Nullable;
import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class SnowySkin extends Item {
    public SnowySkin(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText(xmasEventCongrats));
        tooltip.add(new TranslatableText(" "));
        tooltip.add(new TranslatableText(skinInfo));
        tooltip.add(new TranslatableText(skinSuitable + "snowy_skin"));

        super.appendTooltip(stack, world, tooltip, context);
    }
}