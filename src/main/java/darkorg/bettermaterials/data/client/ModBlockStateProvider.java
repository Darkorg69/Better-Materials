package darkorg.bettermaterials.data.client;

import darkorg.bettermaterials.registry.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator pGenerator, String pModId, ExistingFileHelper pExistingFileHelper) {
        super(pGenerator, pModId, pExistingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.FLINT_BLOCK.get());
        simpleBlock(ModBlocks.CHARCOAL_BLOCK.get());
    }
}
