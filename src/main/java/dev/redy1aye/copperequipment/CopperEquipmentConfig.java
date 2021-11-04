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

            @Comment("Copper Equipment Mod Config!"
                + "\n")
        public int CopperArmorDurability = 100; @Comment("+ 12 \uD83D\uDC52; 98 \uD83D\uDC55; 79 \uD83D\uDC56; 34 \uD83E\uDD7E.") // + 12 👒; 98 👕; 79 👖; 34 🥾. Default = 100.
        public int CopperToolsDurability = 176;
            @Comment("// //")
        public int CopperHelmetProtection = 3; // Default = 3.
        public int CopperChestplateProtection = 6; // Default = 6.
        public int CopperLeggingsProtection = 5; // Default = 5.
        public int CopperBootsProtection = 2; // Default = 2.
            @Comment("// //")
        public int CopperSwordDamage = 6; // Default = 6.
        public float CopperSwordAttackSpeed = -2.3f; // Default = -2.3.

        public int CopperAxeDamage = 9; // Default = 9.
        public float CopperAxeAttackSpeed = -3.1f; // Default = -3.1.
            @Comment("// //")
        public int CopperToolsMiningLevel = 2; // Default = 2.
            @Comment("// //")
        public boolean EnableButtons = true;

        @Config(name = "Waxed Copper Equipment")
        public static class WGeneral implements ConfigData {

                @Comment("Copper Equipment Mod! Waxed Config!"
                    + "\n")
            public int WaxedCopperArmorDurability = 200; @Comment("+ 12 \uD83D\uDC52; 98 \uD83D\uDC55; 79 \uD83D\uDC56; 34 \uD83E\uDD7E.") // + 12 👒; 98 👕; 79 👖; 34 🥾. Default = 200.
            public int WaxedCopperToolsDurability = 276; // Default = 276.
                @Comment("// //")
            public int WaxedCopperHelmetProtection = 2; // Default = 2.
            public int WaxedCopperChestplateProtection = 5; // Default = 5.
            public int WaxedCopperLeggingsProtection = 4; // Default = 4.
            public int WaxedCopperBootsProtection = 1; // Default = 1.
                @Comment("// //")
            public int WaxedCopperSwordDamage = 6; // Default = 6.
            public float WaxedCopperSwordAttackSpeed = -2.5f; // Default = -2.5.

            public int WaxedCopperAxeDamage = 9; // Default = 9.
            public float WaxedCopperAxeAttackSpeed = -3.3f; // Default = -3.3.
                @Comment("// //")
            public int WaxedCopperToolsMiningLevel = 2; // Default = 2.
        }
    }
}