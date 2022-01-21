package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.armor.*;
import dev.redy1aye.copperequipment.events.christmas.SnowyCopperArmor;
import dev.redy1aye.copperequipment.events.christmas.XmasCandyCane;
import dev.redy1aye.copperequipment.events.christmas.XmasCookie;
import dev.redy1aye.copperequipment.events.skins.CandySwordSkin;
import dev.redy1aye.copperequipment.events.skins.SnowySkin;
import dev.redy1aye.copperequipment.items.*;
import dev.redy1aye.copperequipment.tools.*;
import dev.redy1aye.copperequipment.blocks.*;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Items {

    static boolean EnableButtons = Mod.CONFIG.CE_CFG.EnableButtons;
    // static boolean EnableBuckets = Mod.CONFIG.CE_CFG.EnableBuckets;
        static boolean EnableWaxed = Mod.CONFIG.WCE_CFG.EnableWaxed;

    static int CopperToolsDurability = Mod.CONFIG.CE_CFG.CopperToolsDurability;

    static int CopperSwordDamage = Mod.CONFIG.CE_CFG.CopperSwordDamage;
    static float CopperSwordAttackSpeed = Mod.CONFIG.CE_CFG.CopperSwordAttackSpeed;
        static int WaxedCopperSwordDamage = Mod.CONFIG.WCE_CFG.WaxedCopperSwordDamage;
        static float WaxedCopperSwordAttackSpeed = Mod.CONFIG.WCE_CFG.WaxedCopperSwordAttackSpeed;

    static int CopperAxeDamage = Mod.CONFIG.CE_CFG.CopperAxeDamage;
    static float CopperAxeAttackSpeed = Mod.CONFIG.CE_CFG.CopperAxeAttackSpeed;
        static int WaxedCopperAxeDamage = Mod.CONFIG.WCE_CFG.WaxedCopperAxeDamage;
        static float WaxedCopperAxeAttackSpeed = Mod.CONFIG.WCE_CFG.WaxedCopperAxeAttackSpeed;


    public static final Item COMPRESSED_COPPER = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
        public static final Item COMPRESSED_WAXED_COPPER = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static final Item COPPER_NUGGET = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
        public static final Item WAXED_COPPER_NUGGET = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));


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
    public static final HorseArmorItem COPPER_HORSE_ARMOR = new HorseArmorItem(6, "copper", new FabricItemSettings().maxCount(1).group(ItemGroup.MISC));

        public static final ToolItem WAXED_COPPER_SWORD = new SwordItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperSwordDamage, WaxedCopperSwordAttackSpeed, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ToolItem WAXED_COPPER_SHOVEL = new ShovelItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4.5f, -3, new Item.Settings().group(ItemGroup.TOOLS));
        public static final ToolItem WAXED_COPPER_PICKAXE = new PickaxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 4, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)) {};
        public static final ToolItem WAXED_COPPER_AXE = new AxeItem(WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperAxeDamage, WaxedCopperAxeAttackSpeed, new Item.Settings().group(ItemGroup.TOOLS)) {};
        public static final ToolItem WAXED_COPPER_HOE = new HoeItem(WaxedCopperTools.WAXED_COPPER_TOOL, 1, -1, new Item.Settings().group(ItemGroup.TOOLS)) {};

        public static final ArmorItem WAXED_COPPER_HELMET = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ArmorItem WAXED_COPPER_CHESTPLATE = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ArmorItem WAXED_COPPER_LEGGINGS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ArmorItem WAXED_COPPER_BOOTS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));


        public static final CopperBucket COPPER_BUCKET = new CopperBucket(Fluids.EMPTY, new Item.Settings().maxCount(16).group(ItemGroup.MISC));
        public static final CopperBucket WATER_COPPER_BUCKET = new CopperBucket(Fluids.WATER, new Item.Settings().recipeRemainder(COPPER_BUCKET).maxCount(1).group(ItemGroup.MISC));
        public static final PowderSnowBucketItem POWDER_SNOW_COPPER_BUCKET = new PowderSnowBucketItem(Blocks.POWDER_SNOW, SoundEvents.ITEM_BUCKET_EMPTY_POWDER_SNOW, new Item.Settings().recipeRemainder(COPPER_BUCKET).maxCount(1).group(ItemGroup.MISC));
        public static final MilkBucketItem MILK_COPPER_BUCKET = new MilkBucketItem(new Item.Settings().recipeRemainder(COPPER_BUCKET).maxCount(1).group(ItemGroup.MISC));
        public static final EntityBucketItem PUFFERFISH_COPPER_BUCKET = new EntityBucketItem(EntityType.PUFFERFISH, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, (new Item.Settings()).maxCount(1).recipeRemainder(COPPER_BUCKET).group(ItemGroup.MISC));
        public static final EntityBucketItem SALMON_COPPER_BUCKET = new EntityBucketItem(EntityType.SALMON, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, (new Item.Settings()).maxCount(1).recipeRemainder(COPPER_BUCKET).group(ItemGroup.MISC));
        public static final EntityBucketItem COD_COPPER_BUCKET = new EntityBucketItem(EntityType.COD, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, (new Item.Settings()).maxCount(1).recipeRemainder(COPPER_BUCKET).group(ItemGroup.MISC));
        public static final EntityBucketItem TROPICAL_FISH_COPPER_BUCKET = new EntityBucketItem(EntityType.TROPICAL_FISH, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, (new Item.Settings()).maxCount(1).recipeRemainder(COPPER_BUCKET).group(ItemGroup.MISC));
        public static final EntityBucketItem AXOLOTL_COPPER_BUCKET = new EntityBucketItem(EntityType.AXOLOTL, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, (new Item.Settings()).maxCount(1).recipeRemainder(COPPER_BUCKET).group(ItemGroup.MISC));


    public static final Block COPPER_BUTTON = new Buttons
            (FabricBlockSettings.of(Material.METAL).strength(0.5f, 0.5f).sounds(BlockSoundGroup.COPPER).collidable(false));

    public static final Block COPPER_PRESSURE_PLATE = new PreasurePlates
            (PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.of(Material.METAL).strength(0.5f, 0.5f).requiresTool().sounds(BlockSoundGroup.COPPER).collidable(false));

    /*public static final Dryer DRYER = new Dryer
            (false, 0, FabricBlockSettings.of(Material.METAL).strength(0.9f, 0.9f).sounds(BlockSoundGroup.NETHERITE).nonOpaque());*/


    public static final Item XMAS_COOKIE = new XmasCookie(new FabricItemSettings().rarity(Rarity.EPIC)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200), 0.95f).build()));
    public static final Item XMAS_CANDY_CANE = new XmasCandyCane(new FabricItemSettings().rarity(Rarity.EPIC)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200), 0.95f).build()));

    public static final Item SKIN_SNOWY = new SnowySkin(new FabricItemSettings());
    public static final ArmorItem SNOWY_COPPER_HELMET = new ArmorItem(SnowyCopperArmor.SNOWY_COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().rarity(Rarity.UNCOMMON));
    public static final ArmorItem SNOWY_COPPER_CHESTPLATE = new ArmorItem(SnowyCopperArmor.SNOWY_COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().rarity(Rarity.UNCOMMON));
    public static final ArmorItem SNOWY_COPPER_BOOTS = new ArmorItem(SnowyCopperArmor.SNOWY_COPPER_ARMOR, EquipmentSlot.FEET, new Item.Settings().rarity(Rarity.UNCOMMON));

    public static final Item SKIN_CANDY_SWORD = new CandySwordSkin(new FabricItemSettings());
    public static final ToolItem CANDY_NETHERITE_SWORD = new SwordItem(ToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
    public static final ToolItem CANDY_DIAMOND_SWORD = new SwordItem(ToolMaterials.DIAMOND, 3, -2.4F, new Item.Settings().rarity(Rarity.RARE));
    public static final ToolItem CANDY_COPPER_SWORD = new SwordItem(CopperTools.COPPER_TOOL, CopperSwordDamage, CopperSwordAttackSpeed, new Item.Settings().rarity(Rarity.UNCOMMON));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "compressed_copper"), COMPRESSED_COPPER);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "compressed_waxed_copper"), COMPRESSED_WAXED_COPPER);

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_nugget"), COPPER_NUGGET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_nugget"), WAXED_COPPER_NUGGET);


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
        if(EnableWaxed) {
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_helmet"), COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_leggings"), COPPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_boots"), COPPER_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_horse_armor"), COPPER_HORSE_ARMOR);

            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_helmet"), WAXED_COPPER_HELMET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_chestplate"), WAXED_COPPER_CHESTPLATE);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_leggings"), WAXED_COPPER_LEGGINGS);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "waxed_copper_boots"), WAXED_COPPER_BOOTS); }

        /*Registry.register(Registry.BLOCK, new Identifier(Mod.MOD_ID, "dryer"), DRYER);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "dryer"),
                new BlockItem(DRYER, new FabricItemSettings().group(ItemGroup.REDSTONE)));*/

        if(EnableButtons) {
        Registry.register(Registry.BLOCK, new Identifier(Mod.MOD_ID, "copper_button"), COPPER_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_button"),
                new BlockItem(COPPER_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier(Mod.MOD_ID, "copper_pressure_plate"), COPPER_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_pressure_plate"),
                new BlockItem(COPPER_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE))); }

        /* if(EnableBuckets) {
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "copper_bucket"), COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "water_copper_bucket"), WATER_COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "powder_snow_copper_bucket"), POWDER_SNOW_COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "milk_copper_bucket"), MILK_COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "pufferfish_copper_bucket"), PUFFERFISH_COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "salmon_copper_bucket"), SALMON_COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "cod_copper_bucket"), COD_COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "tropical_fish_copper_bucket"), TROPICAL_FISH_COPPER_BUCKET);
            Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "axolotl_copper_bucket"), AXOLOTL_COPPER_BUCKET); } */

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "xmas_cookie"), XMAS_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "xmas_candy_cane"), XMAS_CANDY_CANE);

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "snowy_skin"), SKIN_SNOWY);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "snowy_copper_helmet"), SNOWY_COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "snowy_copper_chestplate"), SNOWY_COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "snowy_copper_boots"), SNOWY_COPPER_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "candy_sword_skin"), SKIN_CANDY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "candy_netherite_sword"), CANDY_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "candy_diamond_sword"), CANDY_DIAMOND_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "candy_copper_sword"), CANDY_COPPER_SWORD);
    }
}