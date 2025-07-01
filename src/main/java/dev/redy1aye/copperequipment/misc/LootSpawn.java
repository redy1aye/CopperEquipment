package dev.redy1aye.copperequipment.misc;

import dev.redy1aye.copperequipment.Items;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootSpawn {

    private static final Identifier DESERT_PYRAMID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier JUNGLE_TEMPLE = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier SPAWNER = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier END_CITY = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier MINESHAFT = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier BASTION_TREASURE = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BASTION_OTHER = new Identifier("minecraft", "chests/bastion_other");

    /* private static final Identifier COPPER_ORE
            = new Identifier("minecraft", "blocks/copper_ore"); */

    public static void registerItems() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, key, tableBuilder, source) -> {
            if (DESERT_PYRAMID.equals(key)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.27f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if (MINESHAFT.equals(key)) {
                LootPool.Builder poolBuilder1 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.43f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder1.build());

                LootPool.Builder poolBuilder2 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.24f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 7f)));
                tableBuilder.pool(poolBuilder2.build());

                LootPool.Builder poolBuilder3 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.RAW_COPPER_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder3.build());

                LootPool.Builder poolBuilder4 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(Items.COPPER_PICKAXE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder4.build());
            }

            if (SPAWNER.equals(key)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.37f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if (JUNGLE_TEMPLE.equals(key)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.68f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if (BASTION_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f))
                        .with(ItemEntry.builder(Items.COMPRESSED_COPPER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2f, 9f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if (BASTION_OTHER.equals(key)) {
                LootPool.Builder poolBuilder1 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 8f)));
                tableBuilder.pool(poolBuilder1.build());

                LootPool.Builder poolBuilder2 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder2.build());
            }

            if (END_CITY.equals(key)) {
                LootPool.Builder poolBuilder1 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder1.build());

                LootPool.Builder poolBuilder2 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f))
                        .with(ItemEntry.builder(Items.COMPRESSED_COPPER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2f, 9f)));
                tableBuilder.pool(poolBuilder2.build());

                LootPool.Builder poolBuilder3 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.11f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder3.build());

                LootPool.Builder poolBuilder4 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_SWORD))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder4.build());

                LootPool.Builder poolBuilder5 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_SHOVEL))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder5.build());

                LootPool.Builder poolBuilder6 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_PICKAXE))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder6.build());

                LootPool.Builder poolBuilder7 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_AXE))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder7.build());

                LootPool.Builder poolBuilder8 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_HELMET))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder8.build());

                LootPool.Builder poolBuilder9 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_CHESTPLATE))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder9.build());

                LootPool.Builder poolBuilder10 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_LEGGINGS))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder10.build());

                LootPool.Builder poolBuilder11 = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_BOOTS))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder11.build());
            }

            /* if(COPPER_ORE.equals(id)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.40f))
                        .with(ItemEntry.builder(Items.XMAS_COOKIE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if(COPPER_ORE.equals(id)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.40f))
                        .with(ItemEntry.builder(Items.XMAS_CANDY_CANE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if(COPPER_ORE.equals(id)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(Items.SKIN_SNOWY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }

            if(COPPER_ORE.equals(id)) {
                LootPool.Builder poolBuilder = new LootPool.Builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f))
                        .with(ItemEntry.builder(Items.SKIN_CANDY_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            } */
        });
    }
}