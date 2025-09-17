package darkorg.bettermaterials.common.registry;

import darkorg.bettermaterials.common.BetterMaterials;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public abstract class BetterMaterialsTags {
    public static class Blocks {
        public static final TagKey<Block> STORAGE_BLOCKS_FLINT = createTag("storage_blocks/flint");
        public static final TagKey<Block> STORAGE_BLOCKS_CHARCOAL = createTag("storage_blocks/charcoal");

        private static TagKey<Block> createTag(String pName) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(BetterMaterials.MOD_ID, pName));
        }
    }

    public static class Items {
        public static final TagKey<Item> STORAGE_BLOCKS_FLINT = createTag("storage_blocks/flint");
        public static final TagKey<Item> STORAGE_BLOCKS_CHARCOAL = createTag("storage_blocks/charcoal");

        private static TagKey<Item> createTag(String pName) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(BetterMaterials.MOD_ID, pName));
        }
    }
}
