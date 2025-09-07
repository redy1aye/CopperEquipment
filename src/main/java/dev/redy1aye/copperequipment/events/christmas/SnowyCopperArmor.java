package dev.redy1aye.copperequipment.events.christmas;

import dev.redy1aye.copperequipment.Mod;
import dev.redy1aye.copperequipment.Items;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class SnowyCopperArmor {
    private static final Map<ArmorItem.Type, Integer> PROTECTION_VALUES = Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.HELMET, Mod.CONFIG.CE_CFG.CopperHelmetProtection);
        map.put(ArmorItem.Type.CHESTPLATE, Mod.CONFIG.CE_CFG.CopperChestplateProtection);
        map.put(ArmorItem.Type.LEGGINGS, Mod.CONFIG.CE_CFG.CopperLeggingsProtection);
        map.put(ArmorItem.Type.BOOTS, Mod.CONFIG.CE_CFG.CopperBootsProtection);
        map.put(ArmorItem.Type.BODY, 4);
    });

    public static final RegistryEntry<ArmorMaterial> SNOWY_COPPER = RegistryEntry.of(new ArmorMaterial(
        PROTECTION_VALUES,
        9,
        SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
        () -> Ingredient.ofItems(Items.COPPER_NUGGET),
        List.of(new ArmorMaterial.Layer(Identifier.of("copperequipment", "snowy_copper"))),
        0.0f,
        0.0f
    ));

    public static void initialize() {
        Registry.register(
            Registries.ARMOR_MATERIAL,
            Identifier.of("copperequipment", "snowy_copper"),
            SNOWY_COPPER.value()
        );
    }
}