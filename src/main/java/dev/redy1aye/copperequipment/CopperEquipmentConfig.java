package dev.redy1aye.copperequipment;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "Copper Equipment Configs")
public class CopperEquipmentConfig extends PartitioningSerializer.GlobalData {

    public General CE_CFG = new General();
    public General.WGeneral WCE_CFG = new General.WGeneral();

    @Config(name = "Copper Equipment")
    public static class General implements ConfigData {

        @Comment("Copper Equipment Mod Config!\nProtection values for copper armor (durability fixed: helmet=121, chestplate=176, leggings=165, boots=143).")
        public int CopperHelmetProtection = 2; // Default = 2.
        public int CopperChestplateProtection = 4; // Default = 4.
        public int CopperLeggingsProtection = 3; // Default = 3.
        public int CopperBootsProtection = 1; // Default = 1.
        @Comment("Copper sword and axe stats.")
        public int CopperSwordDamage = 6; // Default = 6.
        public float CopperSwordAttackSpeed = -2.3f; // Default = -2.3.
        public int CopperAxeDamage = 9; // Default = 9.
        public float CopperAxeAttackSpeed = -3.1f; // Default = -3.1.
        @Comment("Mining level and durability for copper tools.")
        public int CopperToolsMiningLevel = 2; // Default = 2.
        public int CopperToolsDurability = 191; // Default = 191.
        @Comment("Enable copper buttons and pressure plates.")
        public boolean EnableButtons = true;

        @Config(name = "Waxed Copper Equipment")
        public static class WGeneral implements ConfigData {

            @Comment("Waxed Copper Equipment Config!\nProtection values for waxed copper armor (durability fixed: helmet=242, chestplate=352, leggings=330, boots=286).")
            public int WaxedCopperHelmetProtection = 1; // Default = 1.
            public int WaxedCopperChestplateProtection = 2; // Default = 2.
            public int WaxedCopperLeggingsProtection = 2; // Default = 2.
            public int WaxedCopperBootsProtection = 1; // Default = 1.
            @Comment("Waxed copper sword and axe stats.")
            public int WaxedCopperSwordDamage = 6; // Default = 6.
            public float WaxedCopperSwordAttackSpeed = -2.5f; // Default = -2.5.
            public int WaxedCopperAxeDamage = 9; // Default = 9.
            public float WaxedCopperAxeAttackSpeed = -3.3f; // Default = -3.3.
            @Comment("Mining level and durability for waxed copper tools.")
            public int WaxedCopperToolsMiningLevel = 2; // Default = 2.
            public int WaxedCopperToolsDurability = 382; // Default = 382.
            @Comment("Enable waxed copper equipment.")
            public boolean EnableWaxed = true;
        }
    }
}