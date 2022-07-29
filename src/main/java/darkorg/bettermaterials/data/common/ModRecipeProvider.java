package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.block.ModBlocks;
import darkorg.bettermaterials.item.ModHorseArmor;
import darkorg.bettermaterials.item.ModTools;
import darkorg.bettermaterials.setup.ModReference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

import static darkorg.bettermaterials.data.common.ModRecipeProvider.ModRecipeBuilder.*;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        //Blocks
        addNineStorageBlockRecipes(ModBlocks.FLINT_BLOCK.get(), Items.FLINT, consumer);
        addNineStorageBlockRecipes(ModBlocks.CHARCOAL_BLOCK.get(), Items.CHARCOAL, consumer);
        //Armor
        addArmorRecipes(ModReference.COPPER_ARMOR, Items.COPPER_INGOT, consumer);
        addArmorRecipes(ModReference.EMERALD_ARMOR, Items.EMERALD, consumer);
        addArmorRecipes(ModReference.AMETHYST_ARMOR, Items.AMETHYST_SHARD, consumer);
        //Misc
        addShearsRecipe(ModTools.COPPER_SHEARS.get(), Items.COPPER_INGOT, consumer);
        addHorseArmourRecipe(ModHorseArmor.COPPER_HORSE_ARMOR.get(), Items.COPPER_INGOT, consumer);
        addHorseArmourRecipe(ModHorseArmor.EMERALD_HORSE_ARMOR.get(), Items.EMERALD, consumer);
        addHorseArmourRecipe(ModHorseArmor.AMETHYST_HORSE_ARMOR.get(), Items.AMETHYST_SHARD, consumer);
        //Tools
        addToolRecipes(ModReference.BONE_TOOLS, Items.BONE, consumer);
        addToolRecipes(ModReference.FLINT_TOOLS, Items.FLINT, consumer);
        addToolRecipes(ModReference.COPPER_TOOLS, Items.COPPER_INGOT, consumer);
        addToolRecipes(ModReference.EMERALD_TOOLS, Items.EMERALD, consumer);
        addToolRecipes(ModReference.AMETHYST_TOOLS, Items.AMETHYST_SHARD, consumer);
        //Vanilla
        addShapelessRecipe(Items.CLAY_BALL, 4, Blocks.CLAY, consumer);
        addShapelessTagRecipe(Items.STRING, 4, ItemTags.WOOL, consumer);
        addHorseArmourRecipe(Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, consumer);
        addHorseArmourRecipe(Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, consumer);
        addHorseArmourRecipe(Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, consumer);
        ShapedRecipeBuilder.shaped(Items.FLINT).define('#', Items.GRAVEL).pattern("##").pattern("# ").group("flint").unlockedBy("has_gravel", has(Items.GRAVEL)).save(consumer, "gravel_to_flint");
        ShapedRecipeBuilder.shaped(Items.SADDLE).define('I', Items.IRON_INGOT).define('L', Items.LEATHER).define('S', Items.STRING).define('W', ItemTags.WOOL).pattern("LLL").pattern("SWS").pattern("I I").unlockedBy("has_", has(Items.SADDLE)).save(consumer);
    }

    static class ModRecipeBuilder {
        static void addToolRecipes(List<RegistryObject<Item>> toolList, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(toolList.get(0).get()).define('#', material).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(toolList.get(1).get()).define('#', material).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(toolList.get(2).get()).define('#', material).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(toolList.get(3).get()).define('#', material).define('/', Items.STICK).pattern("##").pattern("#/").pattern(" /").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(toolList.get(4).get()).define('#', material).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addArmorRecipes(List<RegistryObject<Item>> armorList, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(armorList.get(0).get()).define('#', material).pattern("###").pattern("# #").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(armorList.get(1).get()).define('#', material).pattern("# #").pattern("###").pattern("###").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(armorList.get(2).get()).define('#', material).pattern("###").pattern("# #").pattern("# #").unlockedBy("has_" + material, has(material)).save(consumer);
            ShapedRecipeBuilder.shaped(armorList.get(3).get()).define('#', material).pattern("# #").pattern("# #").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addShearsRecipe(ItemLike result, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(result).define('#', material).pattern(" #").pattern("# ").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addHorseArmourRecipe(ItemLike result, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(result).define('#', material).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addNineStorageBlockRecipes(ItemLike storageBlock, ItemLike material, Consumer<FinishedRecipe> consumer) {
            ShapelessRecipeBuilder.shapeless(material, 9).requires(storageBlock).unlockedBy("has_" + storageBlock, has(storageBlock)).save(consumer);
            ShapedRecipeBuilder.shaped(storageBlock).define('#', material).pattern("###").pattern("###").pattern("###").unlockedBy("has_" + material, has(material)).save(consumer);
        }

        static void addShapelessRecipe(ItemLike result, int count, ItemLike ingredient, Consumer<FinishedRecipe> consumer) {
            ShapelessRecipeBuilder.shapeless(result, count).requires(ingredient).unlockedBy("has_" + result, has(result)).save(consumer);
        }

        static void addShapelessTagRecipe(ItemLike result, int count, TagKey<Item> ingredientTag, Consumer<FinishedRecipe> consumer) {
            ShapelessRecipeBuilder.shapeless(result, count).requires(ingredientTag).unlockedBy("has_" + result, has(result)).save(consumer);
        }
    }
}