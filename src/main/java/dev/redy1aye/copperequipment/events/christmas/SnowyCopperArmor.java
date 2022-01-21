package dev.redy1aye.copperequipment.events.christmas;

import dev.redy1aye.copperequipment.Mod;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SnowyCopperArmor implements ArmorMaterial {

    public static final ArmorMaterial SNOWY_COPPER_ARMOR = new SnowyCopperArmor();

    static int CopperArmorDurability = Mod.CONFIG.CE_CFG.CopperArmorDurability;

    static int CopperHelmetProtection = Mod.CONFIG.CE_CFG.CopperHelmetProtection;
    static int CopperChestplateProtection = Mod.CONFIG.CE_CFG.CopperChestplateProtection;
    static int CopperLeggingsProtection = Mod.CONFIG.CE_CFG.CopperLeggingsProtection;
    static int CopperBootsProtection = Mod.CONFIG.CE_CFG.CopperBootsProtection;

    private static final int[] DURABILITY = new int[] {34, 79, 98, 12};
    private static final int[] PROTECTION = new int[] {CopperBootsProtection, CopperLeggingsProtection, CopperChestplateProtection, CopperHelmetProtection};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()] + CopperArmorDurability;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability()   {
        return 12;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_POWDER_SNOW_BREAK;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return "snowy_copper";
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