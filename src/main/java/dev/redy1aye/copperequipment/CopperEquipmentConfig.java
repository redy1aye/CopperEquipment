package dev.redy1aye.copperequipment;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "CopperEquipment")
public class CopperEquipmentConfig extends PartitioningSerializer.GlobalData {

    public General CE_CFG = new General();

    @Config(name = "CopperEquipment")
    public static class General implements ConfigData {
        @Comment("Copper Equipment Mod Config")

        public int CopperArmorDurability = 100; // + 12 👒; 98 👕; 79 👖; 34 🥾. Default = 100.
        public int CopperToolsDurability = 176; // Default = 176.

        public int CopperHelmetProtection = 3; // Default = 3.
        public int CopperChestplateProtection = 6; // Default = 6.
        public int CopperLeggingsProtection = 5; // Default = 5.
        public int CopperBootsProtection = 2; // Default = 2.

        public int CopperSwordDamage = 6; // Default = 6.
        public float CopperSwordAttackSpeed = -2.3f; // Default = -2.3f.

        public int CopperAxeDamage = 9; // Default = 9.
        public float CopperAxeAttackSpeed = -3.1f; // Default = -3.1f.

        public int CopperItemMiningLevel = 2; // Default = 2.

        public boolean EnableShears = true;


        public boolean EnableWaxedCopperArmor = false; // Waxed Copper Armor is not finished.
        public boolean EnableWaxedCopperTools = true;

        public int WaxedCopperArmorDurability = 200; // + 12 👒; 98 👕; 79 👖; 34 🥾. Default = 200.
        public int WaxedCopperToolsDurability = 276; // Default = 276.

        public int WaxedCopperHelmetProtection = 1; // Default = ?.
        public int WaxedCopperChestplateProtection = 1; // Default = ?.
        public int WaxedCopperLeggingsProtection = 1; // Default = ?.
        public int WaxedCopperBootsProtection = 1; // Default = ?.

        public int WaxedCopperSwordDamage = 6; // Default = 6
        public float WaxedCopperSwordAttackSpeed = -2.5f; // Default = -2.5f.

        public int WaxedCopperAxeDamage = 9; // Default = 9
        public float WaxedCopperAxeAttackSpeed = -3.3f; // Default = -3.3f.

        public int WaxedCopperItemMiningLevel = 2; // Default = 2
    }
}