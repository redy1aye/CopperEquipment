package dev.redy1aye.copperequipment.tools;

import dev.redy1aye.copperequipment.Mod;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperTools implements ToolMaterial {

    public static final ToolMaterial COPPER_TOOL = new CopperTools();

    static int CopperToolsDurability = Mod.CONFIG.CE_CFG.CopperToolsDurability;
    static int CopperItemMiningLevel = Mod.CONFIG.CE_CFG.CopperToolsMiningLevel;

    @Override
    public int getDurability() {
        return CopperToolsDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6;
    }

    @Override
    public float getAttackDamage() {
        return -1;
    }

    @Override
    public int getMiningLevel() {
        return CopperItemMiningLevel;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}