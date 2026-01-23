package dev.redy1aye.copperequipment.tools;

import dev.redy1aye.copperequipment.Mod;
import dev.redy1aye.copperequipment.misc.Tags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class WaxedCopperTools implements ToolMaterial {

    public static final ToolMaterial WAXED_COPPER_TOOL = new WaxedCopperTools();

    static int WaxedCopperToolsDurability = Mod.CONFIG.WCE_CFG.WaxedCopperToolsDurability;
    static int WaxedCopperItemMiningLevel = Mod.CONFIG.WCE_CFG.WaxedCopperToolsMiningLevel;

    public int getDurability() {
        return WaxedCopperToolsDurability;
    }

    public float getMiningSpeedMultiplier() {
        return 4;
    }

    public float getAttackDamage() {
        return -1;
    }

    public int getMiningLevel() {
        return WaxedCopperItemMiningLevel;
    }

    public int getEnchantability() {
        return 18;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(Tags.COPPER_INGOTS);
    }

    public TagKey<Block> getInverseTag() {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of("minecraft", "incorrect_for_copper_tool"));
    }
}