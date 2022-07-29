package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final class Blocks {

        public static final TagKey<Block> STORAGE_BLOCKS_FLINT = createForgeBlockTag("storage_blocks/flint");
        public static final TagKey<Block> STORAGE_BLOCKS_CHARCOAL = createForgeBlockTag("storage_blocks/charcoal");

        private static TagKey<Block> createForgeBlockTag(String path) {
            return BlockTags.create(new ResourceLocation("forge", path));
        }

        private static TagKey<Block> createModBlockTag(String path) {
            return BlockTags.create(new ResourceLocation(BetterMaterials.MOD_ID, path));
        }
    }

    public static final class Items {

        public static final TagKey<Item> STORAGE_BLOCKS_FLINT = createForgeItemTag("storage_blocks/flint");
        public static final TagKey<Item> STORAGE_BLOCKS_CHARCOAL = createForgeItemTag("storage_blocks/charcoal");

        private static TagKey<Item> createForgeItemTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

        private static TagKey<Item> createModItemTag(String path) {
            return ItemTags.create(new ResourceLocation(BetterMaterials.MOD_ID, path));
        }
    }
}
