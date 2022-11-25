package darkorg.bettermaterials.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator pGenerator, String pModId, ExistingFileHelper pExistingFileHelper) {
        super(pGenerator, pModId, pExistingFileHelper);
    }

    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
    ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

    @Override
    protected void registerModels() {
        withExistingParent("flint_block", modLoc("block/flint_block"));
        withExistingParent("charcoal_block", modLoc("block/charcoal_block"));
        handheldModel("bone_sword", "bone/bone_sword");
        handheldModel("bone_pickaxe", "bone/bone_pickaxe");
        handheldModel("bone_shovel", "bone/bone_shovel");
        handheldModel("bone_axe", "bone/bone_axe");
        handheldModel("bone_hoe", "bone/bone_hoe");
        handheldModel("flint_sword", "flint/flint_sword");
        handheldModel("flint_pickaxe", "flint/flint_pickaxe");
        handheldModel("flint_shovel", "flint/flint_shovel");
        handheldModel("flint_axe", "flint/flint_axe");
        handheldModel("flint_hoe", "flint/flint_hoe");
        handheldModel("copper_sword", "copper/copper_sword");
        handheldModel("copper_pickaxe", "copper/copper_pickaxe");
        handheldModel("copper_shovel", "copper/copper_shovel");
        handheldModel("copper_axe", "copper/copper_axe");
        handheldModel("copper_hoe", "copper/copper_hoe");
        handheldModel("emerald_sword", "emerald/emerald_sword");
        handheldModel("emerald_pickaxe", "emerald/emerald_pickaxe");
        handheldModel("emerald_shovel", "emerald/emerald_shovel");
        handheldModel("emerald_axe", "emerald/emerald_axe");
        handheldModel("emerald_hoe", "emerald/emerald_hoe");
        handheldModel("amethyst_sword", "amethyst/amethyst_sword");
        handheldModel("amethyst_pickaxe", "amethyst/amethyst_pickaxe");
        handheldModel("amethyst_shovel", "amethyst/amethyst_shovel");
        handheldModel("amethyst_axe", "amethyst/amethyst_axe");
        handheldModel("amethyst_hoe", "amethyst/amethyst_hoe");
        generatedModel("copper_shears", "copper/copper_shears");
        generatedModel("copper_helmet", "copper/copper_helmet");
        generatedModel("copper_chestplate", "copper/copper_chestplate");
        generatedModel("copper_leggings", "copper/copper_leggings");
        generatedModel("copper_boots", "copper/copper_boots");
        generatedModel("emerald_helmet", "emerald/emerald_helmet");
        generatedModel("emerald_chestplate", "emerald/emerald_chestplate");
        generatedModel("emerald_leggings", "emerald/emerald_leggings");
        generatedModel("emerald_boots", "emerald/emerald_boots");
        generatedModel("amethyst_helmet", "amethyst/amethyst_helmet");
        generatedModel("amethyst_chestplate", "amethyst/amethyst_chestplate");
        generatedModel("amethyst_leggings", "amethyst/amethyst_leggings");
        generatedModel("amethyst_boots", "amethyst/amethyst_boots");
        generatedModel("copper_horse_armor", "copper/copper_horse_armor");
        generatedModel("emerald_horse_armor", "emerald/emerald_horse_armor");
        generatedModel("amethyst_horse_armor", "amethyst/amethyst_horse_armor");
    }

    private void handheldModel(String itemName, String textureLocation) {
        itemModel(itemName, itemHandheld, textureLocation);
    }

    private void generatedModel(String itemName, String textureLocation) {
        itemModel(itemName, itemGenerated, textureLocation);
    }

    private void itemModel(String itemName, ModelFile modelFile, String textureLocation) {
        getBuilder(itemName).parent(modelFile).texture("layer0", "item/" + textureLocation);
    }
}
