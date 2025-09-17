package darkorg.bettermaterials.fabric.datagen.loot;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput pDataOutput) {
        super(pDataOutput);
    }

    @Override
    public void generate() {
        this.dropSelf(BetterMaterialsBlocks.FLINT_BLOCK.get());
        this.dropSelf(BetterMaterialsBlocks.CHARCOAL_BLOCK.get());
    }
}