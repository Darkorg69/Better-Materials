package darkorg.bettermaterials.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MaterialBlock extends Block {
    public MaterialBlock() {
        super(BlockBehaviour.Properties.of().strength(5.0F, 6.0F).requiresCorrectToolForDrops());
    }
}
