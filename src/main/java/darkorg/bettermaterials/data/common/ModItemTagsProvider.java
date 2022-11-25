package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.registry.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, String pModId, @Nullable ExistingFileHelper pExistingFileHelper) {
        super(pGenerator, pBlockTagsProvider, pModId, pExistingFileHelper);
    }

    @Override
    protected void addTags() {
        copy(ModTags.Blocks.STORAGE_BLOCKS_CHARCOAL, ModTags.Items.STORAGE_BLOCKS_CHARCOAL);
        copy(ModTags.Blocks.STORAGE_BLOCKS_FLINT, ModTags.Items.STORAGE_BLOCKS_FLINT);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
    }
}
