package darkorg.bettermaterials.fabric.datagen.server;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_FLINT).add(BetterMaterialsBlocks.FLINT_BLOCK.get());
        getOrCreateTagBuilder(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_CHARCOAL).add(BetterMaterialsBlocks.CHARCOAL_BLOCK.get());
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(BetterMaterialsBlocks.FLINT_BLOCK.get()).add(BetterMaterialsBlocks.CHARCOAL_BLOCK.get());
        //getOrCreateTagBuilder(BlockTags.STORAGE_BLOCKS).addTag(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_FLINT).addTag(BetterMaterialsTags.Blocks.STORAGE_BLOCKS_CHARCOAL);
    }
}
