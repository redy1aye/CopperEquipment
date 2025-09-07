package dev.redy1aye.copperequipment.tools;

import dev.redy1aye.copperequipment.Mod;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CopperTools implements ToolMaterial {

    public static final ToolMaterial COPPER_TOOL = new CopperTools();

    static int CopperToolsDurability = Mod.CONFIG.CE_CFG.CopperToolsDurability;
    static int CopperItemMiningLevel = Mod.CONFIG.CE_CFG.CopperToolsMiningLevel;

    public int getDurability() {
        return CopperToolsDurability;
    }

    public float getMiningSpeedMultiplier() {
        return 6;
    }

    public float getAttackDamage() {
        return -1;
    }

    public int getMiningLevel() {
        return CopperItemMiningLevel;
    }

    public int getEnchantability() {
        return 17;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    public TagKey<Block> getInverseTag() {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of("minecraft", "incorrect_for_copper_tool"));
    }
}