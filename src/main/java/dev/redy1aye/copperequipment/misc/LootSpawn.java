package dev.redy1aye.copperequipment.misc;

import dev.redy1aye.copperequipment.Items;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

public class LootSpawn {

    private static final RegistryKey<LootTable> DESERT_PYRAMID = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/desert_pyramid"));
    private static final RegistryKey<LootTable> JUNGLE_TEMPLE = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/jungle_temple"));
    private static final RegistryKey<LootTable> SPAWNER = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/simple_dungeon"));
    private static final RegistryKey<LootTable> END_CITY = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/end_city_treasure"));
    private static final RegistryKey<LootTable> MINESHAFT = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/abandoned_mineshaft"));
    private static final RegistryKey<LootTable> BASTION_TREASURE = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/bastion_treasure"));
    private static final RegistryKey<LootTable> BASTION_OTHER = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/bastion_other"));
    private static final RegistryKey<LootTable> VILLAGE_SHEPHERD = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "chests/village/village_shepherd"));

    /* private static final RegistryKey<LootTable> COPPER_ORE
        = RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of("minecraft", "blocks/copper_ore")); */

    public static void registerItems() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            RegistryWrapper.WrapperLookup registryLookup = registries;

            if (DESERT_PYRAMID.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.27f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f)));
                tableBuilder.pool(poolBuilder);
            }

            if (MINESHAFT.equals(key)) {
                LootPool.Builder poolBuilder1 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.43f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder1);

                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.24f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 7f)));
                tableBuilder.pool(poolBuilder2);

                LootPool.Builder poolBuilder3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.RAW_COPPER_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder3);

                LootPool.Builder poolBuilder4 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(Items.COPPER_PICKAXE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder4);
            }

            if (SPAWNER.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.37f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder);
            }

            if (JUNGLE_TEMPLE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.68f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder);
            }

            if (BASTION_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f))
                        .with(ItemEntry.builder(Items.COMPRESSED_COPPER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2f, 9f)));
                tableBuilder.pool(poolBuilder);
            }

            if (BASTION_OTHER.equals(key)) {
                LootPool.Builder poolBuilder1 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 8f)));
                tableBuilder.pool(poolBuilder1);

                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder2);
            }

            if (END_CITY.equals(key)) {
                LootPool.Builder poolBuilder1 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder1);

                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f))
                        .with(ItemEntry.builder(Items.COMPRESSED_COPPER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2f, 9f)));
                tableBuilder.pool(poolBuilder2);

                LootPool.Builder poolBuilder3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.11f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder3);

                LootPool.Builder poolBuilder4 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_SWORD))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder4);

                LootPool.Builder poolBuilder5 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_SHOVEL))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder5);

                LootPool.Builder poolBuilder6 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_PICKAXE))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder6);

                LootPool.Builder poolBuilder7 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_AXE))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder7);

                LootPool.Builder poolBuilder8 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_HELMET))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder8);

                LootPool.Builder poolBuilder9 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_CHESTPLATE))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder9);

                LootPool.Builder poolBuilder10 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_LEGGINGS))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder10);

                LootPool.Builder poolBuilder11 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Items.COPPER_BOOTS))
                        .apply(EnchantRandomlyLootFunction.builder(registryLookup))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)));
                tableBuilder.pool(poolBuilder11);
            }

            if (VILLAGE_SHEPHERD.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.20f))
                        .with(ItemEntry.builder(Items.COPPER_SHEARS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));
                tableBuilder.pool(poolBuilder);
            }

            /* if (COPPER_ORE.equals(key)) {
               LootPool.Builder poolBuilder1 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.40f))
                        .with(ItemEntry.builder(Items.XMAS_COOKIE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder1);

                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.40f))
                        .with(ItemEntry.builder(Items.XMAS_CANDY_CANE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);

                LootPool.Builder poolBuilder3 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(Items.SKIN_SNOWY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder3);

                LootPool.Builder poolBuilder4 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f))
                        .with(ItemEntry.builder(Items.SKIN_CANDY_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder4);
            } */
        });
    }
}