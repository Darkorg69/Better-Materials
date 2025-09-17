package darkorg.bettermaterials.common.registry;


import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.block.MaterialBlock;
import darkorg.bettermaterials.common.platform.Services;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public abstract class BetterMaterialsBlocks {
    public static final Supplier<Block> FLINT_BLOCK = registerBlock("flint_block", MaterialBlock::new);
    public static final Supplier<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block", MaterialBlock::new);

    public static void init() {
        BetterMaterials.LOGGER.debug("Registering blocks for mod: " + BetterMaterials.MOD_ID);
    }

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = Services.REGISTRY_HELPER.registerBlock(name, block);
        Services.REGISTRY_HELPER.registerItem(name, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    public static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return Services.REGISTRY_HELPER.registerBlock(name, block);
    }
}
