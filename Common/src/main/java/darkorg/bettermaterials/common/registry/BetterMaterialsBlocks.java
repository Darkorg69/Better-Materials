package darkorg.bettermaterials.common.registry;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.platform.Services;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public abstract class BetterMaterialsBlocks {
    public static final Supplier<Block> FLINT_BLOCK = registerBlockWithBlockItem("flint_block", () -> new Block(BlockBehaviour.Properties.of().strength(5.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final Supplier<Block> CHARCOAL_BLOCK = registerBlockWithBlockItem("charcoal_block", () -> new Block(BlockBehaviour.Properties.of().strength(5.0F, 6.0F).requiresCorrectToolForDrops()));

    public static void init() {
        BetterMaterials.LOGGER.debug("Registering blocks for mod: " + BetterMaterials.MOD_ID);
    }

    private static <T extends Block> Supplier<T> registerBlockWithBlockItem(String pName, Supplier<T> pBlock) {
        return Services.REGISTRY_HELPER.registerBlockWithBlockItem(new ResourceLocation(BetterMaterials.MOD_ID, pName), pBlock);
    }
}

