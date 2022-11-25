package darkorg.bettermaterials.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final class Blocks {
        public static final TagKey<Block> STORAGE_BLOCKS_FLINT = create("storage_blocks/flint");
        public static final TagKey<Block> STORAGE_BLOCKS_CHARCOAL = create("storage_blocks/charcoal");

        private static TagKey<Block> create(String path) {
            return BlockTags.create(new ResourceLocation("forge", path));
        }
    }

    public static final class Items {
        public static final TagKey<Item> STORAGE_BLOCKS_FLINT = create("storage_blocks/flint");
        public static final TagKey<Item> STORAGE_BLOCKS_CHARCOAL = create("storage_blocks/charcoal");

        private static TagKey<Item> create(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
