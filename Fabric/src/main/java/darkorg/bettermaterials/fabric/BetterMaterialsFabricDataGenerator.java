package darkorg.bettermaterials.fabric;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.fabric.datagen.client.ModLanguageProvider;
import darkorg.bettermaterials.fabric.datagen.client.ModModelProvider;
import darkorg.bettermaterials.fabric.datagen.loot.ModBlockLootTableProvider;
import darkorg.bettermaterials.fabric.datagen.server.ModBlockTagProvider;
import darkorg.bettermaterials.fabric.datagen.server.ModItemTagProvider;
import darkorg.bettermaterials.fabric.datagen.server.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BetterMaterialsFabricDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator pFabricDataGenerator) {
        BetterMaterials.initDataGenerator();

        FabricDataGenerator.Pack pack = pFabricDataGenerator.createPack();

        //Client data
        ModLanguageProvider en_us = pack.addProvider(ModLanguageProvider::new);
        ModModelProvider modModelProvider = pack.addProvider(ModModelProvider::new);

        //Server data
        ModBlockLootTableProvider modBlockLootTableProvider = pack.addProvider(ModBlockLootTableProvider::new);
        ModBlockTagProvider modBlockTagProvider = pack.addProvider(ModBlockTagProvider::new);
        ModItemTagProvider modItemTagProvider = pack.addProvider((pFabricDataOutput, pCompletableFuture) -> new ModItemTagProvider(pFabricDataOutput, pCompletableFuture, modBlockTagProvider));
        ModRecipeProvider modRecipeProvider = pack.addProvider(ModRecipeProvider::new);
    }
}
