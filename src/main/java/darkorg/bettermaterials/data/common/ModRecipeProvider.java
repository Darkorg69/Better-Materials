package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.registry.ModBlocks;
import darkorg.bettermaterials.registry.ModItems;
import darkorg.bettermaterials.registry.ModReference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(Items.SADDLE).define('I', Items.IRON_INGOT).define('L', Items.LEATHER).define('S', Items.STRING).define('W', ItemTags.WOOL).pattern("L L").pattern("ILI").pattern("SWS").unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER)).unlockedBy(getHasName(Items.STRING), has(Items.STRING)).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(Items.CLAY_BALL, 4).requires(Blocks.CLAY).unlockedBy(getHasName(Blocks.CLAY), has(Blocks.CLAY)).save(pFinishedRecipeConsumer, getConversionRecipeName(Items.CLAY_BALL, Blocks.CLAY));
        ShapelessRecipeBuilder.shapeless(Items.FLINT).requires(Blocks.GRAVEL, 3).unlockedBy(getHasName(Blocks.GRAVEL), has(Blocks.GRAVEL)).save(pFinishedRecipeConsumer, getConversionRecipeName(Items.FLINT, Blocks.GRAVEL));
        ShapelessRecipeBuilder.shapeless(Items.STRING, 4).requires(ItemTags.WOOL).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pFinishedRecipeConsumer, "string_from_wool");
        addArmorRecipes(ModReference.AMETHYST_ARMOR, Items.AMETHYST_SHARD, pFinishedRecipeConsumer);
        addArmorRecipes(ModReference.COPPER_ARMOR, Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addArmorRecipes(ModReference.EMERALD_ARMOR, Items.EMERALD, pFinishedRecipeConsumer);
        addHorseArmorRecipe(Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, pFinishedRecipeConsumer);
        addHorseArmorRecipe(Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, pFinishedRecipeConsumer);
        addHorseArmorRecipe(Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, pFinishedRecipeConsumer);
        addHorseArmorRecipe(ModItems.AMETHYST_HORSE_ARMOR.get(), Items.AMETHYST_SHARD, pFinishedRecipeConsumer);
        addHorseArmorRecipe(ModItems.COPPER_HORSE_ARMOR.get(), Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addHorseArmorRecipe(ModItems.EMERALD_HORSE_ARMOR.get(), Items.EMERALD, pFinishedRecipeConsumer);
        addNineBlockStorageRecipes(Items.CHARCOAL, ModBlocks.CHARCOAL_BLOCK.get(), pFinishedRecipeConsumer);
        addNineBlockStorageRecipes(Items.FLINT, ModBlocks.FLINT_BLOCK.get(), pFinishedRecipeConsumer);
        addShearsRecipe(ModItems.COPPER_SHEARS.get(), Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.AMETHYST_TOOLS, Items.AMETHYST_SHARD, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.BONE_TOOLS, Items.BONE, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.COPPER_TOOLS, Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.EMERALD_TOOLS, Items.EMERALD, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.FLINT_TOOLS, Items.FLINT, pFinishedRecipeConsumer);
    }

    private static void addShearsRecipe(ItemLike pResult, ItemLike pMaterial, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(pResult).define('#', pMaterial).pattern(" #").pattern("# ").unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
    }

    private static void addHorseArmorRecipe(ItemLike pResult, ItemLike pMaterial, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(pResult).define('#', pMaterial).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy(getHasName(pMaterial), has(pMaterial)).unlockedBy(getHasName(Items.LEATHER_HORSE_ARMOR), has(Items.LEATHER_HORSE_ARMOR)).save(pFinishedRecipeConsumer);
    }

    private static void addNineBlockStorageRecipes(ItemLike pUnpacked, ItemLike pPacked, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapelessRecipeBuilder.shapeless(pUnpacked, 9).requires(pPacked).unlockedBy(getHasName(pPacked), has(pPacked)).save(pFinishedRecipeConsumer, new ResourceLocation(getConversionRecipeName(pUnpacked, pPacked)));
        ShapedRecipeBuilder.shaped(pPacked).define('#', pUnpacked).pattern("###").pattern("###").pattern("###").unlockedBy(getHasName(pUnpacked), has(pUnpacked)).save(pFinishedRecipeConsumer, new ResourceLocation(getConversionRecipeName(pPacked, pUnpacked)));
    }

    private static void addArmorRecipes(@NotNull List<Item> pArmorList, ItemLike pMaterial, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(pArmorList.get(0)).define('#', pMaterial).pattern("###").pattern("# #").unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pArmorList.get(1)).define('#', pMaterial).pattern("# #").pattern("###").pattern("###").unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pArmorList.get(2)).define('#', pMaterial).pattern("###").pattern("# #").pattern("# #").unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pArmorList.get(3)).define('#', pMaterial).pattern("# #").pattern("# #").unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
    }

    private static void addToolRecipes(@NotNull List<Item> pToolList, ItemLike pMaterial, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(pToolList.get(0)).define('#', pMaterial).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pToolList.get(1)).define('#', pMaterial).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has_" + pMaterial, has(pMaterial)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pToolList.get(2)).define('#', pMaterial).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has_" + pMaterial, has(pMaterial)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pToolList.get(3)).define('#', pMaterial).define('/', Items.STICK).pattern("##").pattern("#/").pattern(" /").unlockedBy("has_" + pMaterial, has(pMaterial)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(pToolList.get(4)).define('#', pMaterial).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has_" + pMaterial, has(pMaterial)).save(pFinishedRecipeConsumer);
    }
}