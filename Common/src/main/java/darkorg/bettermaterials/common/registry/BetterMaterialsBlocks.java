package darkorg.bettermaterials.common.registry;


import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.platform.Services;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public abstract class BetterMaterialsBlocks {
    public static Supplier<Block> FLINT_BLOCK;
    public static Supplier<Block> CHARCOAL_BLOCK;

    public static void init() {
        BetterMaterials.LOGGER.debug("Registering blocks for mod: " + BetterMaterials.MOD_ID);

        FLINT_BLOCK = registerBlock("flint_block",
                () -> {
                    return new Block(BlockBehaviour.Properties.of().strength(5.0F, 6.0F).requiresCorrectToolForDrops());
                });
        CHARCOAL_BLOCK = registerBlock("charcoal_block",
                () -> {
                    return new Block(BlockBehaviour.Properties.of().strength(5.0F, 6.0F).requiresCorrectToolForDrops());
                });
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = Services.REGISTRY_HELPER.registerBlock(name, block);
        Services.REGISTRY_HELPER.registerItem(name, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    public static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return Services.REGISTRY_HELPER.registerBlock(name, block);
    }
}

