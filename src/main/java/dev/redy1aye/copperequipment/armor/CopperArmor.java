package dev.redy1aye.copperequipment.armor;

import dev.redy1aye.copperequipment.Mod;
import dev.redy1aye.copperequipment.misc.Tags;
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
import java.util.function.Supplier;

public class CopperArmor {
    public static final RegistryEntry<ArmorMaterial> COPPER = registerArmorMaterial("copper", () -> new ArmorMaterial(
        Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.HELMET, safeConfigInt(Mod.CONFIG.CE_CFG.CopperHelmetProtection, 2));
            map.put(ArmorItem.Type.CHESTPLATE, safeConfigInt(Mod.CONFIG.CE_CFG.CopperChestplateProtection, 6));
            map.put(ArmorItem.Type.LEGGINGS, safeConfigInt(Mod.CONFIG.CE_CFG.CopperLeggingsProtection, 4));
            map.put(ArmorItem.Type.BOOTS, safeConfigInt(Mod.CONFIG.CE_CFG.CopperBootsProtection, 2));
            map.put(ArmorItem.Type.BODY, safeConfigInt(Mod.CONFIG.CE_CFG.CopperHorseArmorDurability, 4));
        }),
        9,
        SoundEvents.ITEM_ARMOR_EQUIP_IRON,
        () -> Ingredient.fromTag(Tags.COPPER_INGOTS),
        List.of(new ArmorMaterial.Layer(Identifier.of("copperequipment", "copper"))),
        0.0f,
        0.0f
    ));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of("copperequipment", name), material.get());
    }

    private static int safeConfigInt(Integer value, int fallback) {
        return value != null ? value : fallback;
    }
}