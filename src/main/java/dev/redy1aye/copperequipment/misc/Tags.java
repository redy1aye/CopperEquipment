package dev.redy1aye.copperequipment.misc;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tags {
    public static final TagKey<Item> COPPER_STUFF = TagKey.of(Registry.ITEM_KEY, new Identifier("copperequipment", "#c:copper_stuff"));
    public static final TagKey<Item> WAXED_COPPER_STUFF = TagKey.of(Registry.ITEM_KEY, new Identifier("copperequipment", "#c:waxed_copper_stuff"));

    /* 1.18.1-
    public static final Tag<Item> COPPER_STUFF = TagFactory.ITEM.create(new Identifier("copperequipment", "copper_stuff"));
    public static final Tag<Item> WAXED_COPPER_STUFF = TagFactory.ITEM.create(new Identifier("copperequipment", "waxed_copper_stuff")); */
}