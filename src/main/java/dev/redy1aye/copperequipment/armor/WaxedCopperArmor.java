package dev.redy1aye.copperequipment.armor;

import dev.redy1aye.copperequipment.Items;
import dev.redy1aye.copperequipment.Mod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WaxedCopperArmor implements ArmorMaterial {

    public static final ArmorMaterial WAXED_COPPER_ARMOR = new WaxedCopperArmor();

    static int WaxedCopperHelmetProtection = Mod.CONFIG.WCE_CFG.WaxedCopperHelmetProtection;
    static int WaxedCopperChestplateProtection = Mod.CONFIG.WCE_CFG.WaxedCopperChestplateProtection;
    static int WaxedCopperLeggingsProtection = Mod.CONFIG.WCE_CFG.WaxedCopperLeggingsProtection;
    static int WaxedCopperBootsProtection = Mod.CONFIG.WCE_CFG.WaxedCopperBootsProtection;

    @Override
    public int getDurability(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> 242;
            case CHESTPLATE -> 352;
            case LEGGINGS -> 330;
            case BOOTS -> 286;
            default -> 0;
        };
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> WaxedCopperHelmetProtection;
            case CHESTPLATE -> WaxedCopperChestplateProtection;
            case LEGGINGS -> WaxedCopperLeggingsProtection;
            case BOOTS -> WaxedCopperBootsProtection;
            default -> 0;
        };
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
        return Ingredient.ofItems(Items.COMPRESSED_WAXED_COPPER);
    }

    @Override
    public String getName() {
        return "waxed_copper";
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