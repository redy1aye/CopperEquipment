package dev.redy1aye.copperequipment.misc;

import net.fabricmc.fabric.api.tag.TagFactory;

import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Tags {
    public static final Tag<Item> COPPER_STUFF = TagFactory.ITEM.create(new Identifier("copperequipment", "copper_stuff"));
    public static final Tag<Item> WAXED_COPPER_STUFF = TagFactory.ITEM.create(new Identifier("copperequipment", "waxed_copper_stuff"));
}