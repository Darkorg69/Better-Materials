package darkorg.bettermaterials.data;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.data.client.ModBlockStateProvider;
import darkorg.bettermaterials.data.client.ModItemModelProvider;
import darkorg.bettermaterials.data.common.ModBlockTagsProvider;
import darkorg.bettermaterials.data.common.ModItemTagsProvider;
import darkorg.bettermaterials.data.common.ModLootTableProvider;
import darkorg.bettermaterials.data.common.ModRecipeProvider;
import darkorg.bettermaterials.setup.ModReference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterMaterials.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherDataEvent(GatherDataEvent event) {
        ModReference.init();
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        ModBlockStateProvider blockStateProvider = new ModBlockStateProvider(generator, existingFileHelper);
        ModItemModelProvider itemModelProvider = new ModItemModelProvider(generator, existingFileHelper);
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(generator, existingFileHelper);
        ModItemTagsProvider itemTagsProvider = new ModItemTagsProvider(generator, blockTagsProvider, existingFileHelper);
        ModLootTableProvider lootTableProvider = new ModLootTableProvider(generator);
        ModRecipeProvider recipeProvider = new ModRecipeProvider(generator);

        generator.addProvider(true, blockStateProvider);
        generator.addProvider(true, itemModelProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, itemTagsProvider);
        generator.addProvider(true, lootTableProvider);
        generator.addProvider(true, recipeProvider);
    }
}
