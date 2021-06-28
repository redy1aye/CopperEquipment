package dev.redy1aye.copperequipment;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mod implements ModInitializer {

    public static final String MOD_ID = "copperequipment";

    public static final ArmorMaterial COPPER_ARMOR = new Armor();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_pickaxe"), new Pickaxe(new Tools()));
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_axe"), new Axe(new Tools()));
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_hoe"), new Hoe(new Tools()));
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_shovel"), new Shovel(new Tools()));
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_sword"), new Sword(new Tools()));

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_helmet"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_chestplate"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_leggings"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_boots"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.FEET));

    }
}