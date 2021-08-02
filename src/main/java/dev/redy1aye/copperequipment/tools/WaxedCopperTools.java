package dev.redy1aye.copperequipment.tools;

import dev.redy1aye.copperequipment.Mod;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WaxedCopperTools implements ToolMaterial {

    public static final ToolMaterial WAXED_COPPER_TOOL = new WaxedCopperTools();

    static int WaxedCopperToolsDurability = Mod.CONFIG.CE_CFG.WaxedCopperToolsDurability;
    static int WaxedCopperItemMiningLevel = Mod.CONFIG.CE_CFG.WaxedCopperItemMiningLevel;

    @Override
    public int getDurability() {
        return WaxedCopperToolsDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4;
    }

    @Override
    public float getAttackDamage() {
        return -1;
    }

    @Override
    public int getMiningLevel() {
        return WaxedCopperItemMiningLevel;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}