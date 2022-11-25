package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.registry.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ModBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.FLINT_BLOCK.get());
        this.dropSelf(ModBlocks.CHARCOAL_BLOCK.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}