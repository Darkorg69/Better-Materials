package darkorg.bettermaterials.fabric.datagen.server;

import darkorg.bettermaterials.common.registry.BetterMaterialsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput pDataOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, BlockTagProvider pBlockTagProvider) {
        super(pDataOutput, pLookupProvider, pBlockTagProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        copy(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_FLINT, BetterMaterialsTags.Items.STORAGE_BLOCKS_FLINT);
        copy(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_CHARCOAL, BetterMaterialsTags.Items.STORAGE_BLOCKS_CHARCOAL);
        //copy(BlockTags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
    }
}