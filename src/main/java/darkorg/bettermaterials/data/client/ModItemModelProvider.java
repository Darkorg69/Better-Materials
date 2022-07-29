package darkorg.bettermaterials.data.client;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BetterMaterials.MOD_ID, existingFileHelper);
    }

    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
    ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

    @Override
    protected void registerModels() {
        //BlockItem
        withExistingParent("flint_block", modLoc("block/flint_block"));
        withExistingParent("charcoal_block", modLoc("block/charcoal_block"));
        //Handheld
        buildHandheldModel("bone_sword", "bone/bone_sword");
        buildHandheldModel("bone_pickaxe", "bone/bone_pickaxe");
        buildHandheldModel("bone_shovel", "bone/bone_shovel");
        buildHandheldModel("bone_axe", "bone/bone_axe");
        buildHandheldModel("bone_hoe", "bone/bone_hoe");
        buildHandheldModel("flint_sword", "flint/flint_sword");
        buildHandheldModel("flint_pickaxe", "flint/flint_pickaxe");
        buildHandheldModel("flint_shovel", "flint/flint_shovel");
        buildHandheldModel("flint_axe", "flint/flint_axe");
        buildHandheldModel("flint_hoe", "flint/flint_hoe");
        buildHandheldModel("copper_sword", "copper/copper_sword");
        buildHandheldModel("copper_pickaxe", "copper/copper_pickaxe");
        buildHandheldModel("copper_shovel", "copper/copper_shovel");
        buildHandheldModel("copper_axe", "copper/copper_axe");
        buildHandheldModel("copper_hoe", "copper/copper_hoe");
        buildHandheldModel("emerald_sword", "emerald/emerald_sword");
        buildHandheldModel("emerald_pickaxe", "emerald/emerald_pickaxe");
        buildHandheldModel("emerald_shovel", "emerald/emerald_shovel");
        buildHandheldModel("emerald_axe", "emerald/emerald_axe");
        buildHandheldModel("emerald_hoe", "emerald/emerald_hoe");
        buildHandheldModel("amethyst_sword", "amethyst/amethyst_sword");
        buildHandheldModel("amethyst_pickaxe", "amethyst/amethyst_pickaxe");
        buildHandheldModel("amethyst_shovel", "amethyst/amethyst_shovel");
        buildHandheldModel("amethyst_axe", "amethyst/amethyst_axe");
        buildHandheldModel("amethyst_hoe", "amethyst/amethyst_hoe");
        //Generated
        buildGeneratedModel("copper_shears", "copper/copper_shears");
        buildGeneratedModel("copper_helmet", "copper/copper_helmet");
        buildGeneratedModel("copper_chestplate", "copper/copper_chestplate");
        buildGeneratedModel("copper_leggings", "copper/copper_leggings");
        buildGeneratedModel("copper_boots", "copper/copper_boots");
        buildGeneratedModel("emerald_helmet", "emerald/emerald_helmet");
        buildGeneratedModel("emerald_chestplate", "emerald/emerald_chestplate");
        buildGeneratedModel("emerald_leggings", "emerald/emerald_leggings");
        buildGeneratedModel("emerald_boots", "emerald/emerald_boots");
        buildGeneratedModel("amethyst_helmet", "amethyst/amethyst_helmet");
        buildGeneratedModel("amethyst_chestplate", "amethyst/amethyst_chestplate");
        buildGeneratedModel("amethyst_leggings", "amethyst/amethyst_leggings");
        buildGeneratedModel("amethyst_boots", "amethyst/amethyst_boots");
        buildGeneratedModel("copper_horse_armor", "copper/copper_horse_armor");
        buildGeneratedModel("emerald_horse_armor", "emerald/emerald_horse_armor");
        buildGeneratedModel("amethyst_horse_armor", "amethyst/amethyst_horse_armor");
    }

    private void buildItemModel(String itemName, ModelFile modelFile, String textureLocation) {
        getBuilder(itemName).parent(modelFile).texture("layer0", "item/" + textureLocation);
    }

    private void buildHandheldModel(String itemName, String textureLocation) {
        buildItemModel(itemName, itemHandheld, textureLocation);
    }

    private void buildGeneratedModel(String itemName, String textureLocation) {
        buildItemModel(itemName, itemGenerated, textureLocation);
    }
}
