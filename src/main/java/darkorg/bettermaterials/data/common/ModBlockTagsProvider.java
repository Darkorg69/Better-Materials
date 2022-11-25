package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.registry.ModBlocks;
import darkorg.bettermaterials.registry.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator pGenerator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.FLINT_BLOCK.get(), ModBlocks.CHARCOAL_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_CHARCOAL).add(ModBlocks.CHARCOAL_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_FLINT).add(ModBlocks.FLINT_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTags(ModTags.Blocks.STORAGE_BLOCKS_FLINT, ModTags.Blocks.STORAGE_BLOCKS_CHARCOAL);
    }
}
