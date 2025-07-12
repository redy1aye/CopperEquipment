package dev.redy1aye.copperequipment.blocks;

import net.minecraft.block.ButtonBlock;
import net.minecraft.block.Block;
import dev.redy1aye.copperequipment.Items;

public class Buttons extends ButtonBlock {
    public Buttons(Block.Settings settings) {
        super(settings, Items.COPPER_SET_TYPE, 20, false);
    }
}