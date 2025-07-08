package dev.redy1aye.copperequipment.blocks;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;

public class PreasurePlates extends PressurePlateBlock {
    public PreasurePlates(ActivationRule type, Block.Settings settings) {
        super(type, settings, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON);
    }
}