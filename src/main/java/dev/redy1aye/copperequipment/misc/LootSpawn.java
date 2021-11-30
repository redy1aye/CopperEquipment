package dev.redy1aye.copperequipment.misc;

import dev.redy1aye.copperequipment.Items;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
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

    public static void registerItems() {

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (DESERT_PYRAMID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.27f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f)).build());
                supplier.withPool(poolBuilder.build()); }

            if (MINESHAFT.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.43f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                supplier.withPool(poolBuilder.build()); }

                    if (MINESHAFT.equals(id)) {
                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.24f))
                                .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_INGOT))
                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 7f)).build());
                        supplier.withPool(poolBuilder.build()); }

                    if (MINESHAFT.equals(id)) {
                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.1f))
                                .with(ItemEntry.builder(net.minecraft.item.Items.RAW_COPPER_BLOCK))
                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                        supplier.withPool(poolBuilder.build()); }

                    if (MINESHAFT.equals(id)) {
                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.07f))
                                .with(ItemEntry.builder(Items.COPPER_PICKAXE))
                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                        supplier.withPool(poolBuilder.build()); }

            if (SPAWNER.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.37f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                supplier.withPool(poolBuilder.build()); }

            if (JUNGLE_TEMPLE.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.68f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                supplier.withPool(poolBuilder.build()); }

            if (BASTION_TREASURE.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f))
                        .with(ItemEntry.builder(Items.COMPRESSED_COPPER))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(2f, 9f)).build());
                supplier.withPool(poolBuilder.build()); }

            if (BASTION_OTHER.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_INGOT))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 8f)).build());
                supplier.withPool(poolBuilder.build()); }

            if (BASTION_OTHER.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_BLOCK))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                supplier.withPool(poolBuilder.build()); }

            if (END_CITY.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(Items.COPPER_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                supplier.withPool(poolBuilder.build()); }

                    if (END_CITY.equals(id)) {
                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.09f))
                                .with(ItemEntry.builder(Items.COMPRESSED_COPPER))
                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(2f, 9f)).build());
                        supplier.withPool(poolBuilder.build()); }

                    if (END_CITY.equals(id)) {
                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.11f))
                                .with(ItemEntry.builder(net.minecraft.item.Items.COPPER_BLOCK))
                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                        supplier.withPool(poolBuilder.build()); }

                                if (END_CITY.equals(id)) {
                                    FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                            .rolls(ConstantLootNumberProvider.create(1))
                                            .conditionally(RandomChanceLootCondition.builder(0.02f))
                                            .with(ItemEntry.builder(Items.COPPER_SWORD))
                                            .withFunction(EnchantRandomlyLootFunction.create().build())
                                            .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                    supplier.withPool(poolBuilder.build()); }

                                if (END_CITY.equals(id)) {
                                    FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                            .rolls(ConstantLootNumberProvider.create(1))
                                            .conditionally(RandomChanceLootCondition.builder(0.02f))
                                            .with(ItemEntry.builder(Items.COPPER_SHOVEL))
                                            .withFunction(EnchantRandomlyLootFunction.create().build())
                                            .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                    supplier.withPool(poolBuilder.build()); }

                                if (END_CITY.equals(id)) {
                                    FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                            .rolls(ConstantLootNumberProvider.create(1))
                                            .conditionally(RandomChanceLootCondition.builder(0.02f))
                                            .with(ItemEntry.builder(Items.COPPER_PICKAXE))
                                            .withFunction(EnchantRandomlyLootFunction.create().build())
                                            .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                    supplier.withPool(poolBuilder.build()); }

                                if (END_CITY.equals(id)) {
                                    FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                            .rolls(ConstantLootNumberProvider.create(1))
                                            .conditionally(RandomChanceLootCondition.builder(0.02f))
                                            .with(ItemEntry.builder(Items.COPPER_AXE))
                                            .withFunction(EnchantRandomlyLootFunction.create().build())
                                            .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                    supplier.withPool(poolBuilder.build()); }

                                    if (END_CITY.equals(id)) {
                                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                                .rolls(ConstantLootNumberProvider.create(1))
                                                .conditionally(RandomChanceLootCondition.builder(0.02f))
                                                .with(ItemEntry.builder(Items.COPPER_HELMET))
                                                .withFunction(EnchantRandomlyLootFunction.create().build())
                                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                        supplier.withPool(poolBuilder.build()); }

                                    if (END_CITY.equals(id)) {
                                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                                .rolls(ConstantLootNumberProvider.create(1))
                                                .conditionally(RandomChanceLootCondition.builder(0.02f))
                                                .with(ItemEntry.builder(Items.COPPER_CHESTPLATE))
                                                .withFunction(EnchantRandomlyLootFunction.create().build())
                                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                        supplier.withPool(poolBuilder.build()); }

                                    if (END_CITY.equals(id)) {
                                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                                .rolls(ConstantLootNumberProvider.create(1))
                                                .conditionally(RandomChanceLootCondition.builder(0.02f))
                                                .with(ItemEntry.builder(Items.COPPER_LEGGINGS))
                                                .withFunction(EnchantRandomlyLootFunction.create().build())
                                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                        supplier.withPool(poolBuilder.build()); }

                                    if (END_CITY.equals(id)) {
                                        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                                                .rolls(ConstantLootNumberProvider.create(1))
                                                .conditionally(RandomChanceLootCondition.builder(0.02f))
                                                .with(ItemEntry.builder(Items.COPPER_BOOTS))
                                                .withFunction(EnchantRandomlyLootFunction.create().build())
                                                .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 2f)).build());
                                        supplier.withPool(poolBuilder.build()); }
        }));
    }
}