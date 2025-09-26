package darkorg.bettermaterials.fabric.datagen.server;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import darkorg.bettermaterials.common.registry.ModReference;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static darkorg.bettermaterials.fabric.datagen.server.ModRecipeProvider.ModRecipeBuilder.*;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput pDataOutput) {
        super(pDataOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        //Blocks
        addNineStorageBlockRecipes(BetterMaterialsBlocks.FLINT_BLOCK.get(), Items.FLINT, pFinishedRecipeConsumer);
        addNineStorageBlockRecipes(BetterMaterialsBlocks.CHARCOAL_BLOCK.get(), Items.CHARCOAL, pFinishedRecipeConsumer);
        //Combat
        addSwordRecipe(BetterMaterialsItems.BONE_SWORD, Items.BONE, pFinishedRecipeConsumer);
        addSwordRecipe(BetterMaterialsItems.FLINT_SWORD, Items.FLINT, pFinishedRecipeConsumer);
        addSwordRecipe(BetterMaterialsItems.COPPER_SWORD, Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addSwordRecipe(BetterMaterialsItems.EMERALD_SWORD, Items.EMERALD, pFinishedRecipeConsumer);
        addSwordRecipe(BetterMaterialsItems.AMETHYST_SWORD, Items.AMETHYST_SHARD, pFinishedRecipeConsumer);
        addArmorRecipes(ModReference.COPPER_ARMOR, Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addArmorRecipes(ModReference.EMERALD_ARMOR, Items.EMERALD, pFinishedRecipeConsumer);
        addArmorRecipes(ModReference.AMETHYST_ARMOR, Items.AMETHYST_SHARD, pFinishedRecipeConsumer);
        //Misc
        addHorseArmourRecipe(BetterMaterialsItems.COPPER_HORSE_ARMOR, Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addHorseArmourRecipe(() -> Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, pFinishedRecipeConsumer);
        addHorseArmourRecipe(() -> Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, pFinishedRecipeConsumer);
        addHorseArmourRecipe(BetterMaterialsItems.EMERALD_HORSE_ARMOR, Items.EMERALD, pFinishedRecipeConsumer);
        addHorseArmourRecipe(BetterMaterialsItems.AMETHYST_HORSE_ARMOR, Items.AMETHYST_SHARD, pFinishedRecipeConsumer);
        addHorseArmourRecipe(() -> Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, pFinishedRecipeConsumer);
        //Tools
        addToolRecipes(ModReference.BONE_TOOLS, Items.BONE, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.FLINT_TOOLS, Items.FLINT, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.COPPER_TOOLS, Items.COPPER_INGOT, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.EMERALD_TOOLS, Items.EMERALD, pFinishedRecipeConsumer);
        addToolRecipes(ModReference.AMETHYST_TOOLS, Items.AMETHYST_SHARD, pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, BetterMaterialsItems.COPPER_SHEARS.get()).define('#', Items.COPPER_INGOT).pattern(" #").pattern("# ").unlockedBy("has_" + Items.COPPER_INGOT, has(Items.COPPER_INGOT)).save(pFinishedRecipeConsumer);
        //Misc
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CLAY_BALL, 4).requires(Blocks.CLAY).unlockedBy("has_" + Items.CLAY_BALL, has(Items.CLAY_BALL)).save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4).requires(ItemTags.WOOL).unlockedBy("has_" + Items.STRING, has(Items.STRING)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.FLINT).define('#', Items.GRAVEL).pattern("##").pattern("# ").group("flint").unlockedBy("has_gravel", has(Items.GRAVEL)).save(pFinishedRecipeConsumer, "gravel_to_flint");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SADDLE).define('I', Items.IRON_INGOT).define('L', Items.LEATHER).define('S', Items.STRING).define('W', ItemTags.WOOL).pattern("LLL").pattern("SWS").pattern("I I").unlockedBy("has_", has(Items.SADDLE)).save(pFinishedRecipeConsumer);
    }

    static class ModRecipeBuilder {
        static void addNineStorageBlockRecipes(ItemLike storageBlock, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, material, 9).requires(storageBlock).unlockedBy("has_" + storageBlock, has(storageBlock)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, storageBlock).define('#', material).pattern("###").pattern("###").pattern("###").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addSwordRecipe(Supplier<Item> pSwordItem, ItemLike material, Consumer<FinishedRecipe> pRecipeConsumer) {
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pSwordItem.get()).define('#', material).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy("has_" + material, has(material)).save(pRecipeConsumer);
        }

        static void addToolRecipes(List<Supplier<Item>> pToolList, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pToolList.get(0).get()).define('#', material).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pToolList.get(1).get()).define('#', material).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pToolList.get(2).get()).define('#', material).define('/', Items.STICK).pattern("##").pattern("#/").pattern(" /").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pToolList.get(3).get()).define('#', material).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addArmorRecipes(List<Supplier<Item>> armorList, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armorList.get(0).get()).define('#', material).pattern("###").pattern("# #").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armorList.get(1).get()).define('#', material).pattern("# #").pattern("###").pattern("###").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armorList.get(2).get()).define('#', material).pattern("###").pattern("# #").pattern("# #").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armorList.get(3).get()).define('#', material).pattern("# #").pattern("# #").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addHorseArmourRecipe(Supplier<Item> result, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result.get()).define('#', material).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has_" + material, has(material)).save(consumer);
        }
    }
}
