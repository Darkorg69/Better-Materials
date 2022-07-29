package darkorg.bettermaterials.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class MaterialBlock extends Block {
    public MaterialBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops());
    }
}
