package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.block.ModBlocks;
import darkorg.bettermaterials.setup.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, BetterMaterials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Blocks.STORAGE_BLOCKS_FLINT).add(ModBlocks.FLINT_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_CHARCOAL).add(ModBlocks.CHARCOAL_BLOCK.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.FLINT_BLOCK.get()).add(ModBlocks.CHARCOAL_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_FLINT).addTag(ModTags.Blocks.STORAGE_BLOCKS_CHARCOAL);
    }
}
