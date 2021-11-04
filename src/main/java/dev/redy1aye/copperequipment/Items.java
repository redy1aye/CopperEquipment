package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.armor.*;
import dev.redy1aye.copperequipment.tools.*;
import dev.redy1aye.copperequipment.blocks.*;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    static boolean EnableButtons = Mod.CONFIG.CE_CFG.EnableButtons;

    static int CopperToolsDurability = Mod.CONFIG.CE_CFG.CopperToolsDurability;


    static int CopperSwordDamage = Mod.CONFIG.CE_CFG.CopperSwordDamage;
    static float CopperSwordAttackSpeed = Mod.CONFIG.CE_CFG.CopperSwordAttackSpeed;

    static int CopperAxeDamage = Mod.CONFIG.CE_CFG.CopperAxeDamage;
    static float CopperAxeAttackSpeed = Mod.CONFIG.CE_CFG.CopperAxeAttackSpeed;

        static int WaxedCopperSwordDamage = Mod.CONFIG.WCE_CFG.WaxedCopperSwordDamage;
        static float WaxedCopperSwordAttackSpeed = Mod.CONFIG.WCE_CFG.WaxedCopperSwordAttackSpeed;

        static int WaxedCopperAxeDamage = Mod.CONFIG.WCE_CFG.WaxedCopperAxeDamage;
        static float WaxedCopperAxeAttackSpeed = Mod.CONFIG.WCE_CFG.WaxedCopperAxeAttackSpeed;


    public static final ToolItem COPPER_SWORD = new SwordItem(CopperTools.COPPER_TOOL, CopperSwordDamage, CopperSwordAttackSpeed, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ToolItem COPPER_SHOVEL = new ShovelItem(CopperTools.COPPER_TOOL, 4.5f, -3, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_PICKAXE = new PickaxeItem(CopperTools.COPPER_TOOL, 4, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)) {};
    public static final ToolItem COPPER_AXE = new AxeItem(CopperTools.COPPER_TOOL, CopperAxeDamage, CopperAxeAttackSpeed, new Item.Settings().group(ItemGroup.TOOLS)) {};
    public static final ToolItem COPPER_HOE = new HoeItem(CopperTools.COPPER_TOOL, 1, -1, new Item.Settings().group(ItemGroup.TOOLS)) {};
    public static final ShearsItem COPPER_SHEARS = new ModShears(new Item.Settings().maxDamage(CopperToolsDurability).group(ItemGroup.TOOLS));

    public static final ArmorItem COPPER_HELMET = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_CHESTPLATE = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_LEGGINGS = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem COPPER_BOOTS = new ArmorItem(CopperArmor.COPPER_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final HorseArmorItem COPPER_HORSE_ARMOR = new HorseArmorItem(6, "copper", new FabricItemSettings().maxCount(1).group(ItemGroup.MISC));;

        public static final ToolItem WAXED_COPPER_SWORD = new SwordItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperSwordDamage, WaxedCopperSwordAttackSpeed, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ToolItem WAXED_COPPER_SHOVEL = new ShovelItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4.5f, -3, new Item.Settings().group(ItemGroup.TOOLS));
        public static final ToolItem WAXED_COPPER_PICKAXE = new PickaxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)) {};
        public static final ToolItem WAXED_COPPER_AXE = new AxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperAxeDamage, WaxedCopperAxeAttackSpeed, new Item.Settings().group(ItemGroup.TOOLS)) {};
        public static final ToolItem WAXED_COPPER_HOE = new HoeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 1, -1, new Item.Settings().group(ItemGroup.TOOLS)) {};

        public static final ArmorItem WAXED_COPPER_HELMET = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ArmorItem WAXED_COPPER_CHESTPLATE = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ArmorItem WAXED_COPPER_LEGGINGS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ArmorItem WAXED_COPPER_BOOTS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));


    public static final Block COPPER_BUTTON = new Buttons
            (FabricBlockSettings.of(Material.METAL).strength(0.5f, 0.5f).sounds(BlockSoundGroup.COPPER));

    public static final Block COPPER_PRESSURE_PLATE = new PreasurePlates
            (PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.of(Material.METAL).strength(0.5f, 0.5f).requiresTool().sounds(BlockSoundGroup.COPPER));


    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_hoe"), COPPER_HOE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_shears"), COPPER_SHEARS);

            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_sword"), WAXED_COPPER_SWORD);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_shovel"), WAXED_COPPER_SHOVEL);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_pickaxe"), WAXED_COPPER_PICKAXE);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_axe"), WAXED_COPPER_AXE);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_hoe"), WAXED_COPPER_HOE);

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_helmet"), COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_leggings"), COPPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_boots"), COPPER_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_horse_armor"), COPPER_HORSE_ARMOR);

            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_helmet"), WAXED_COPPER_HELMET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_chestplate"), WAXED_COPPER_CHESTPLATE);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_leggings"), WAXED_COPPER_LEGGINGS);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_boots"), WAXED_COPPER_BOOTS);

        if(EnableButtons) {
        Registry.register(Registry.BLOCK, new Identifier(Mod.MOD_ID, "copper_button"), COPPER_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_button"),
                new BlockItem(COPPER_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier(Mod.MOD_ID, "copper_pressure_plate"), COPPER_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_pressure_plate"),
                new BlockItem(COPPER_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE))); }
    }
}