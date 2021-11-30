package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.misc.LootSpawn;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

import net.fabricmc.api.ModInitializer;

public class Mod implements ModInitializer {
    public static final String MOD_ID = "copperequipment";
    public static final CopperEquipmentConfig CONFIG = AutoConfig.register(CopperEquipmentConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();

    @Override
    public void onInitialize() {
       Items.registerItems();
       LootSpawn.registerItems();
    }
}