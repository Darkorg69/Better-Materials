package darkorg.bettermaterials.setup;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier BONE = new ForgeTier(0, 59, 2.0F, 0.0F, 15, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Tags.Items.BONES));
    public static final ForgeTier FLINT = new ForgeTier(1, 131, 4.0F, 1.0F, 5, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.FLINT));
    public static final ForgeTier COPPER = new ForgeTier(1, 191, 5.0F, 1.5F, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final ForgeTier EMERALD = new ForgeTier(2, 521, 7.0F, 2.5F, 8, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier AMETHYST = new ForgeTier(2, 781, 9.0F, 2.5F, 15, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.AMETHYST_SHARD));
}
