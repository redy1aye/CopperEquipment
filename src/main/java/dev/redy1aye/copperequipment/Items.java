package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.armor.CopperArmor;
import dev.redy1aye.copperequipment.armor.WaxedCopperArmor;
import dev.redy1aye.copperequipment.events.christmas.SnowyCopperArmor;
import dev.redy1aye.copperequipment.events.christmas.XmasCandyCane;
import dev.redy1aye.copperequipment.events.christmas.XmasCookie;
import dev.redy1aye.copperequipment.events.skins.CandySwordSkin;
import dev.redy1aye.copperequipment.events.skins.SnowySkin;
import dev.redy1aye.copperequipment.tools.CopperTools;
import dev.redy1aye.copperequipment.tools.WaxedCopperTools;
import dev.redy1aye.copperequipment.tools.CopperShears;
import net.minecraft.block.Block;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Items {
    private static final Logger LOGGER = LoggerFactory.getLogger("copperequipment");

    public static final RegistryKey<ItemGroup> TAB_COPPER = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of("copperequipment", "copperequipment_tab"));

    static boolean EnableButtons;
    static boolean EnableWaxed;
    static int CopperToolsDurability;
    static int CopperSwordDamage;
    static float CopperSwordAttackSpeed;
    static int WaxedCopperSwordDamage;
    static float WaxedCopperSwordAttackSpeed;
    static int CopperAxeDamage;
    static float CopperAxeAttackSpeed;
    static int WaxedCopperAxeDamage;
    static float WaxedCopperAxeAttackSpeed;

    static {
        try {
            EnableButtons = Mod.CONFIG.CE_CFG.EnableButtons;
            EnableWaxed = Mod.CONFIG.WCE_CFG.EnableWaxed;
            CopperToolsDurability = Mod.CONFIG.CE_CFG.CopperToolsDurability;
            CopperSwordDamage = Mod.CONFIG.CE_CFG.CopperSwordDamage;
            CopperSwordAttackSpeed = Mod.CONFIG.CE_CFG.CopperSwordAttackSpeed;
            WaxedCopperSwordDamage = Mod.CONFIG.WCE_CFG.WaxedCopperSwordDamage;
            WaxedCopperSwordAttackSpeed = Mod.CONFIG.WCE_CFG.WaxedCopperSwordAttackSpeed;
            CopperAxeDamage = Mod.CONFIG.CE_CFG.CopperAxeDamage;
            CopperAxeAttackSpeed = Mod.CONFIG.CE_CFG.CopperAxeAttackSpeed;
            WaxedCopperAxeDamage = Mod.CONFIG.WCE_CFG.WaxedCopperAxeDamage;
            WaxedCopperAxeAttackSpeed = Mod.CONFIG.WCE_CFG.WaxedCopperAxeAttackSpeed;
            LOGGER.info("Config values loaded: EnableButtons={}, EnableWaxed={}", EnableButtons, EnableWaxed);
        } catch (Exception e) {
            LOGGER.error("Failed to load config values", e);
            throw new RuntimeException("Config loading failed", e);
        }
    }

    public static final Item COMPRESSED_COPPER = new Item(new Item.Settings());
    public static final Item COMPRESSED_WAXED_COPPER = new Item(new Item.Settings());
    public static final Item COPPER_NUGGET = new Item(new Item.Settings());
    public static final Item WAXED_COPPER_NUGGET = new Item(new Item.Settings());

    public static final ToolItem COPPER_SWORD = new SwordItem(CopperTools.COPPER_TOOL,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    CopperTools.COPPER_TOOL, CopperSwordDamage, CopperSwordAttackSpeed)));
    public static final ToolItem COPPER_SHOVEL = new ShovelItem(CopperTools.COPPER_TOOL,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
                    CopperTools.COPPER_TOOL, 4.5f, -2.9f)));
    public static final ToolItem COPPER_PICKAXE = new PickaxeItem(CopperTools.COPPER_TOOL,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                    CopperTools.COPPER_TOOL, 4, -2.7f)));
    public static final ToolItem COPPER_AXE = new AxeItem(CopperTools.COPPER_TOOL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
                    CopperTools.COPPER_TOOL, CopperAxeDamage, CopperAxeAttackSpeed)));
    public static final ToolItem COPPER_HOE = new HoeItem(CopperTools.COPPER_TOOL,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
                    CopperTools.COPPER_TOOL, 1, -0.9f)));
    public static final CopperShears COPPER_SHEARS = new CopperShears(new Item.Settings(), false);

    public static final ArmorItem COPPER_HELMET = new ArmorItem(CopperArmor.COPPER, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(9)));
    public static final ArmorItem COPPER_CHESTPLATE = new ArmorItem(CopperArmor.COPPER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(9)));
    public static final ArmorItem COPPER_LEGGINGS = new ArmorItem(CopperArmor.COPPER, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(9)));
    public static final ArmorItem COPPER_BOOTS = new ArmorItem(CopperArmor.COPPER, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(9)));
    public static final AnimalArmorItem COPPER_HORSE_ARMOR = new AnimalArmorItem(CopperArmor.COPPER, AnimalArmorItem.Type.EQUESTRIAN, false,
            new Item.Settings().maxCount(1));

    public static final ToolItem WAXED_COPPER_SWORD = new SwordItem(WaxedCopperTools.WAXED_COPPER_TOOL,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperSwordDamage, WaxedCopperSwordAttackSpeed)));
    public static final ToolItem WAXED_COPPER_SHOVEL = new ShovelItem(WaxedCopperTools.WAXED_COPPER_TOOL,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
                    WaxedCopperTools.WAXED_COPPER_TOOL, 4.5f, -3.1f)));
    public static final ToolItem WAXED_COPPER_PICKAXE = new PickaxeItem(WaxedCopperTools.WAXED_COPPER_TOOL,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                    WaxedCopperTools.WAXED_COPPER_TOOL, 4, -2.9f)));
    public static final ToolItem WAXED_COPPER_AXE = new AxeItem(WaxedCopperTools.WAXED_COPPER_TOOL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
                    WaxedCopperTools.WAXED_COPPER_TOOL, WaxedCopperAxeDamage, WaxedCopperAxeAttackSpeed)));
    public static final ToolItem WAXED_COPPER_HOE = new HoeItem(WaxedCopperTools.WAXED_COPPER_TOOL,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
                    WaxedCopperTools.WAXED_COPPER_TOOL, 1, -1.1f)));
    public static final CopperShears WAXED_COPPER_SHEARS = new CopperShears(new Item.Settings(), true);

    public static final ArmorItem WAXED_COPPER_HELMET = new ArmorItem(WaxedCopperArmor.WAXED_COPPER, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(12)));
    public static final ArmorItem WAXED_COPPER_CHESTPLATE = new ArmorItem(WaxedCopperArmor.WAXED_COPPER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(12)));
    public static final ArmorItem WAXED_COPPER_LEGGINGS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(12)));
    public static final ArmorItem WAXED_COPPER_BOOTS = new ArmorItem(WaxedCopperArmor.WAXED_COPPER, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(12)));

    public static final Block COPPER_BUTTON;
    public static final Block COPPER_PRESSURE_PLATE;

    static {
        Block button = null;
        Block plate = null;
        try {
            button = new ButtonBlock(BlockSetType.IRON, 30, Block.Settings.create().strength(0.5f).noCollision());
            plate = new PressurePlateBlock(BlockSetType.IRON, Block.Settings.create().strength(0.5f).requiresTool().noCollision());
            LOGGER.info("Successfully created COPPER_BUTTON and COPPER_PRESSURE_PLATE");
        } catch (Exception e) {
            LOGGER.error("Failed to create COPPER_BUTTON or COPPER_PRESSURE_PLATE", e);
            throw new RuntimeException("Block initialization failed", e);
        }
        COPPER_BUTTON = button;
        COPPER_PRESSURE_PLATE = plate;
    }

    public static final Item XMAS_COOKIE = new XmasCookie(new Item.Settings()
            .component(DataComponentTypes.RARITY, Rarity.EPIC)
            .component(DataComponentTypes.FOOD, new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.1F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200), 0.95f)
                    .build()));
    public static final Item XMAS_CANDY_CANE = new XmasCandyCane(new Item.Settings()
            .component(DataComponentTypes.RARITY, Rarity.EPIC)
            .component(DataComponentTypes.FOOD, new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.1F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200), 0.95f)
                    .build()));

    public static final Item SKIN_SNOWY = new SnowySkin(new Item.Settings());
    public static final ArmorItem SNOWY_COPPER_HELMET = new ArmorItem(SnowyCopperArmor.SNOWY_COPPER, ArmorItem.Type.HELMET,
            new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10)));
    public static final ArmorItem SNOWY_COPPER_CHESTPLATE = new ArmorItem(SnowyCopperArmor.SNOWY_COPPER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10)));
    public static final ArmorItem SNOWY_COPPER_BOOTS = new ArmorItem(SnowyCopperArmor.SNOWY_COPPER, ArmorItem.Type.BOOTS,
            new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10)));

    public static final Item SKIN_CANDY_SWORD = new CandySwordSkin(new Item.Settings());
    public static final ToolItem CANDY_NETHERITE_SWORD = new SwordItem(ToolMaterials.NETHERITE,
            new Item.Settings().fireproof()
                    .component(DataComponentTypes.RARITY, Rarity.EPIC)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4f)));
    public static final ToolItem CANDY_DIAMOND_SWORD = new SwordItem(ToolMaterials.DIAMOND,
            new Item.Settings().component(DataComponentTypes.RARITY, Rarity.RARE)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.4f)));
    public static final ToolItem CANDY_COPPER_SWORD = new SwordItem(CopperTools.COPPER_TOOL,
            new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
                    .attributeModifiers(SwordItem.createAttributeModifiers(CopperTools.COPPER_TOOL, CopperSwordDamage, CopperSwordAttackSpeed)));

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(TAB_COPPER).register(entries -> {
            entries.add(COMPRESSED_COPPER);
            entries.add(COMPRESSED_WAXED_COPPER);
            entries.add(COPPER_NUGGET);
            entries.add(WAXED_COPPER_NUGGET);
            entries.add(COPPER_SWORD);
            entries.add(COPPER_SHOVEL);
            entries.add(COPPER_PICKAXE);
            entries.add(COPPER_AXE);
            entries.add(COPPER_HOE);
            entries.add(COPPER_SHEARS);
            entries.add(COPPER_HELMET);
            entries.add(COPPER_CHESTPLATE);
            entries.add(COPPER_LEGGINGS);
            entries.add(COPPER_BOOTS);
            entries.add(COPPER_HORSE_ARMOR);
            if (EnableWaxed) {
                entries.add(WAXED_COPPER_SWORD);
                entries.add(WAXED_COPPER_SHOVEL);
                entries.add(WAXED_COPPER_PICKAXE);
                entries.add(WAXED_COPPER_AXE);
                entries.add(WAXED_COPPER_HOE);
                entries.add(WAXED_COPPER_SHEARS);
                entries.add(WAXED_COPPER_HELMET);
                entries.add(WAXED_COPPER_CHESTPLATE);
                entries.add(WAXED_COPPER_LEGGINGS);
                entries.add(WAXED_COPPER_BOOTS);
            }
            if (EnableButtons) {
                entries.add(COPPER_BUTTON);
                entries.add(COPPER_PRESSURE_PLATE);
            }
            // Holiday/seasonal/special items intentionally NOT added to creative tab!
        });

        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "compressed_copper"), COMPRESSED_COPPER);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "compressed_waxed_copper"), COMPRESSED_WAXED_COPPER);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_nugget"), COPPER_NUGGET);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_nugget"), WAXED_COPPER_NUGGET);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_sword"), COPPER_SWORD);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_axe"), COPPER_AXE);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_hoe"), COPPER_HOE);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_shears"), COPPER_SHEARS);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_helmet"), COPPER_HELMET);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_leggings"), COPPER_LEGGINGS);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_boots"), COPPER_BOOTS);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_horse_armor"), COPPER_HORSE_ARMOR);

        if (EnableWaxed) {
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_sword"), WAXED_COPPER_SWORD);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_shovel"), WAXED_COPPER_SHOVEL);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_pickaxe"), WAXED_COPPER_PICKAXE);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_axe"), WAXED_COPPER_AXE);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_hoe"), WAXED_COPPER_HOE);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_shears"), WAXED_COPPER_SHEARS);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_helmet"), WAXED_COPPER_HELMET);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_chestplate"), WAXED_COPPER_CHESTPLATE);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_leggings"), WAXED_COPPER_LEGGINGS);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "waxed_copper_boots"), WAXED_COPPER_BOOTS);
        }

        if (EnableButtons) {
            Registry.register(Registries.BLOCK, Identifier.of("copperequipment", "copper_button"), COPPER_BUTTON);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_button"), new BlockItem(COPPER_BUTTON, new Item.Settings()));
            Registry.register(Registries.BLOCK, Identifier.of("copperequipment", "copper_pressure_plate"), COPPER_PRESSURE_PLATE);
            Registry.register(Registries.ITEM, Identifier.of("copperequipment", "copper_pressure_plate"), new BlockItem(COPPER_PRESSURE_PLATE, new Item.Settings()));
        }

        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "xmas_cookie"), XMAS_COOKIE);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "xmas_candy_cane"), XMAS_CANDY_CANE);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "snowy_skin"), SKIN_SNOWY);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "snowy_copper_helmet"), SNOWY_COPPER_HELMET);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "snowy_copper_chestplate"), SNOWY_COPPER_CHESTPLATE);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "snowy_copper_boots"), SNOWY_COPPER_BOOTS);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "candy_sword_skin"), SKIN_CANDY_SWORD);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "candy_netherite_sword"), CANDY_NETHERITE_SWORD);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "candy_diamond_sword"), CANDY_DIAMOND_SWORD);
        Registry.register(Registries.ITEM, Identifier.of("copperequipment", "candy_copper_sword"), CANDY_COPPER_SWORD);
    }
}