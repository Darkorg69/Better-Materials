package darkorg.bettermaterials.fabric.datagen.server;

import darkorg.bettermaterials.common.registry.BetterMaterialsTags;
import darkorg.bettermaterials.common.registry.ModReference;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput pDataOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, BlockTagProvider pBlockTagProvider) {
        super(pDataOutput, pLookupProvider, pBlockTagProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        copy(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_FLINT, BetterMaterialsTags.Items.STORAGE_BLOCKS_FLINT);
        copy(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_CHARCOAL, BetterMaterialsTags.Items.STORAGE_BLOCKS_CHARCOAL);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(Stream.of(ModReference.COPPER_ARMOR, ModReference.EMERALD_ARMOR, ModReference.AMETHYST_ARMOR).flatMap(List::stream).map(Supplier::get).toArray(Item[]::new));
    }
}