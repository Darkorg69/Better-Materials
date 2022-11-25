package darkorg.bettermaterials.event;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.data.client.ModBlockStateProvider;
import darkorg.bettermaterials.data.client.ModItemModelProvider;
import darkorg.bettermaterials.data.client.ModLanguageProvider;
import darkorg.bettermaterials.data.common.ModBlockTagsProvider;
import darkorg.bettermaterials.data.common.ModItemTagsProvider;
import darkorg.bettermaterials.data.common.ModLootTableProvider;
import darkorg.bettermaterials.data.common.ModRecipeProvider;
import darkorg.bettermaterials.registry.ModReference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = BetterMaterials.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void onGatherData(@NotNull GatherDataEvent event) {
        ModReference.init();

        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        ModBlockStateProvider blockStateProvider = new ModBlockStateProvider(generator, BetterMaterials.MOD_ID, existingFileHelper);
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(generator, BetterMaterials.MOD_ID, existingFileHelper);
        ModItemModelProvider itemModelProvider = new ModItemModelProvider(generator, BetterMaterials.MOD_ID, existingFileHelper);
        ModItemTagsProvider itemTagsProvider = new ModItemTagsProvider(generator, blockTagsProvider, BetterMaterials.MOD_ID, existingFileHelper);
        ModLanguageProvider languageProvider = new ModLanguageProvider(generator, BetterMaterials.MOD_ID, "en_us");
        ModLootTableProvider lootTableProvider = new ModLootTableProvider(generator);
        ModRecipeProvider recipeProvider = new ModRecipeProvider(generator);

        generator.addProvider(blockStateProvider);
        generator.addProvider(blockTagsProvider);
        generator.addProvider(itemModelProvider);
        generator.addProvider(itemTagsProvider);
        generator.addProvider(languageProvider);
        generator.addProvider(lootTableProvider);
        generator.addProvider(recipeProvider);
    }
}
