package darkorg.bettermaterials.block;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Block> FLINT_BLOCK = BLOCKS.register("flint_block", MaterialBlock::new);
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", MaterialBlock::new);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
