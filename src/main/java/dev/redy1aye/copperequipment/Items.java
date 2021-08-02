package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.armor.*;
import dev.redy1aye.copperequipment.tools.*;

import net.minecraft.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    static int CopperSwordDamage = Mod.CONFIG.CE_CFG.CopperSwordDamage;
    static float CopperSwordAttackSpeed = Mod.CONFIG.CE_CFG.CopperSwordAttackSpeed;

    static int CopperAxeDamage = Mod.CONFIG.CE_CFG.CopperAxeDamage;
    static float CopperAxeAttackSpeed = Mod.CONFIG.CE_CFG.CopperAxeAttackSpeed;


    static int WaxedCopperSwordDamage = Mod.CONFIG.CE_CFG.WaxedCopperSwordDamage;
    static float WaxedCopperSwordAttackSpeed = Mod.CONFIG.CE_CFG.WaxedCopperSwordAttackSpeed;

    static int WaxedCopperAxeDamage = Mod.CONFIG.CE_CFG.WaxedCopperAxeDamage;
    static float WaxedCopperAxeAttackSpeed = Mod.CONFIG.CE_CFG.WaxedCopperAxeAttackSpeed;

    public static final ToolItem COPPER_SWORD = new SwordItem(CopperTools.COPPER_TOOL, CopperSwordDamage, CopperSwordAttackSpeed, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ToolItem COPPER_SHOVEL = new ShovelItem(CopperTools.COPPER_TOOL, 4.5f, -3, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_PICKAXE = new PickaxeItem(CopperTools.COPPER_TOOL, 4, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)) {};
    public static final ToolItem COPPER_AXE = new AxeItem(CopperTools.COPPER_TOOL, CopperAxeDamage, CopperAxeAttackSpeed, new Item.Settings().group(ItemGroup.TOOLS)) {};
    public static final ToolItem COPPER_HOE = new HoeItem(CopperTools.COPPER_TOOL, 1, -1, new Item.Settings().group(ItemGroup.TOOLS)) {};

    public static final ArmorItem COPPER_HELMET = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_CHESTPLATE = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_LEGGINGS = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_BOOTS = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));


    public static final ToolItem WAXED_COPPER_SWORD = new SwordItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperSwordDamage, WaxedCopperSwordAttackSpeed, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ToolItem WAXED_COPPER_SHOVEL = new ShovelItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4.5f, -3, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem WAXED_COPPER_PICKAXE = new PickaxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)) {};
    public static final ToolItem WAXED_COPPER_AXE = new AxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperAxeDamage, WaxedCopperAxeAttackSpeed, new Item.Settings().group(ItemGroup.TOOLS)) {};
    public static final ToolItem WAXED_COPPER_HOE = new HoeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 1, -1, new Item.Settings().group(ItemGroup.TOOLS)) {};

    public static final ArmorItem WAXED_COPPER_HELMET = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Settings());
    public static final ArmorItem WAXED_COPPER_CHESTPLATE = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Settings());
    public static final ArmorItem WAXED_COPPER_LEGGINGS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Settings());
    public static final ArmorItem WAXED_COPPER_BOOTS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.FEET, new Item.Settings());

    public static final ShearsItem COPPER_SHEARS = new ShearsItem(new Item.Settings().group(ItemGroup.TOOLS));

    static boolean EnableWaxedCopperTools = Mod.CONFIG.CE_CFG.EnableWaxedCopperTools;
    static boolean EnableWaxedCopperArmor = Mod.CONFIG.CE_CFG.EnableWaxedCopperArmor;
    static boolean EnableShears = Mod.CONFIG.CE_CFG.EnableShears;

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_hoe"), COPPER_HOE);
        if(EnableWaxedCopperTools) {
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_sword"), WAXED_COPPER_SWORD);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_shovel"), WAXED_COPPER_SHOVEL);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_pickaxe"), WAXED_COPPER_PICKAXE);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_axe"), WAXED_COPPER_AXE);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_hoe"), WAXED_COPPER_HOE); }


        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_helmet"), COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_leggings"), COPPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_boots"), COPPER_BOOTS);
        if(EnableWaxedCopperArmor) {
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_helmet"), WAXED_COPPER_HELMET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_chestplate"), WAXED_COPPER_CHESTPLATE);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_leggings"), WAXED_COPPER_LEGGINGS);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_boots"), WAXED_COPPER_BOOTS); }

        if(EnableShears) {
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_shears"), COPPER_SHEARS);
        }
    }
}

