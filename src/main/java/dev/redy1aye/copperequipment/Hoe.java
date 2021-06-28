package dev.redy1aye.copperequipment;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class Hoe extends HoeItem {
    public Hoe(ToolMaterial material) { super(material, -2, -0.5f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}