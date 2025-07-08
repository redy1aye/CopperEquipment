package dev.redy1aye.copperequipment.blocks;

import net.minecraft.block.ButtonBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;

public class Buttons extends ButtonBlock {
    public Buttons(Block.Settings settings) {
        super(settings, 20, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON);
    }
}