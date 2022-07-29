package darkorg.bettermaterials.data.client;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BetterMaterials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.FLINT_BLOCK.get());
        simpleBlock(ModBlocks.CHARCOAL_BLOCK.get());
    }
}
