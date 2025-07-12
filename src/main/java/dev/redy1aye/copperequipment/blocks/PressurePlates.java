package dev.redy1aye.copperequipment.blocks;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.Block;
import dev.redy1aye.copperequipment.Items;

public class PressurePlates extends PressurePlateBlock {
    public PressurePlates(ActivationRule type, Block.Settings settings) {
        super(type, settings, Items.COPPER_SET_TYPE);
    }
}