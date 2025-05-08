package com.itztk.trimsexpandeded.item;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTable {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            if(LootTables.VILLAGE_ARMORER_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) 
                        .with(ItemEntry.builder(ModItems.PLATED_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.VILLAGE_ARMORER_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) 
                        .with(ItemEntry.builder(ModItems.MARGIN_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) 
                        .with(ItemEntry.builder(ModItems.PLATED_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) 
                        .with(ItemEntry.builder(ModItems.MARGIN_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.BURIED_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.33f)) 
                        .with(ItemEntry.builder(ModItems.SHELL_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) 
                        .with(ItemEntry.builder(ModItems.DANGER_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.CAT_MORNING_GIFT_GAMEPLAY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) 
                        .with(ItemEntry.builder(ModItems.HEART_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.SNIFFER_DIGGING_GAMEPLAY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) 
                        .with(ItemEntry.builder(ModItems.VERDANT_SMITHING_TEMPALTE));

                tableBuilder.pool(poolBuilder.build());
            }



        });
    }
}