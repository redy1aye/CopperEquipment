package dev.redy1aye.copperequipment.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class Sword extends SwordItem {
    public Sword(ToolMaterial material) {
        super(material, 3, -2.3f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}