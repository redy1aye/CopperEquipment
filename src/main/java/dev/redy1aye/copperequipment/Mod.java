package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.blocks.dryer.DryerScreen;
import dev.redy1aye.copperequipment.misc.LootSpawn;

import net.fabricmc.api.ModInitializer;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class Mod implements ModInitializer {

    public static final String MOD_ID = "copperequipment";
    public static final CopperEquipmentConfig CONFIG = AutoConfig.register(CopperEquipmentConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();

    public static final String skinInfo = "skininfo.copperequipment.paint";
    public static final String skinSuitable = "skinsuitable.copperequipment.";
    public static final String toolTip = "tooltip.copperequipment.";
    public static final String xmasEventCongrats = "xmas.copperequipment.congrats";

    @Override
    public void onInitialize() {
       Items.registerItems();
       LootSpawn.registerItems();
       // ScreenRegistry.register(Items.DRYER_SCREEN_HANDLER, DryerScreen::new);
    }
}
