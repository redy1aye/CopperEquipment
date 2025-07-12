package dev.redy1aye.copperequipment.armor;

import dev.redy1aye.copperequipment.Items;
import dev.redy1aye.copperequipment.Mod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CopperArmor implements ArmorMaterial {

    public static final ArmorMaterial COPPER_ARMOR = new CopperArmor();

    static int CopperHelmetProtection = Mod.CONFIG.CE_CFG.CopperHelmetProtection;
    static int CopperChestplateProtection = Mod.CONFIG.CE_CFG.CopperChestplateProtection;
    static int CopperLeggingsProtection = Mod.CONFIG.CE_CFG.CopperLeggingsProtection;
    static int CopperBootsProtection = Mod.CONFIG.CE_CFG.CopperBootsProtection;

    @Override
    public int getDurability(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> 121;
            case CHESTPLATE -> 176;
            case LEGGINGS -> 165;
            case BOOTS -> 143;
            default -> 0;
        };
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> CopperHelmetProtection;
            case CHESTPLATE -> CopperChestplateProtection;
            case LEGGINGS -> CopperLeggingsProtection;
            case BOOTS -> CopperBootsProtection;
            default -> 0;
        };
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COMPRESSED_COPPER);
    }

    @Override
    public String getName() {
        return "copper";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}