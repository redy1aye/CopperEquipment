package dev.redy1aye.copperequipment;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class Pickaxe extends PickaxeItem {
    public Pickaxe(ToolMaterial material) {
        super(material, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
