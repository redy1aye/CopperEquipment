package dev.redy1aye.copperequipment.armor;

import dev.redy1aye.copperequipment.Mod;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WaxedCopperArmor implements ArmorMaterial {

    static int WaxedCopperArmorDurability = Mod.CONFIG.CE_CFG.WaxedCopperArmorDurability;

    static int WaxedCopperHelmetProtection = Mod.CONFIG.CE_CFG.WaxedCopperHelmetProtection;
    static int WaxedCopperChestplateDProtection = Mod.CONFIG.CE_CFG.WaxedCopperChestplateProtection;
    static int WaxedCopperLeggingsProtection = Mod.CONFIG.CE_CFG.WaxedCopperLeggingsProtection;
    static int WaxedCopperBootsProtection = Mod.CONFIG.CE_CFG.WaxedCopperBootsProtection;

    public static final ArmorMaterial WAXED_COPPER_ARMOR = new WaxedCopperArmor();

    private static final int[] DURABILITY = new int[] {34, 79, 98, 12};
    private static final int[] PROTECTION = new int[] {WaxedCopperBootsProtection, WaxedCopperLeggingsProtection, WaxedCopperChestplateDProtection, WaxedCopperHelmetProtection};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()] + WaxedCopperArmorDurability;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
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