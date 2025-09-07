package dev.redy1aye.copperequipment;

import dev.redy1aye.copperequipment.misc.LootSpawn;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

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

        Registry.register(Registries.ITEM_GROUP, Items.TAB_COPPER, FabricItemGroup.builder()
                .displayName(Text.literal("Copper Equipment"))
                .icon(() -> new ItemStack(Items.COMPRESSED_COPPER))
                .build());
    }
}