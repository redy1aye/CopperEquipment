package dev.redy1aye.copperequipment.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class Shovel extends ShovelItem {
    public Shovel(ToolMaterial material) {
        super(material, 1, -2.5f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}