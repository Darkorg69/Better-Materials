package darkorg.bettermaterials.fabric.datagen.client;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder pBuilder) {
        pBuilder.add(BetterMaterialsBlocks.FLINT_BLOCK.get(), "Block of Flint");
        pBuilder.add(BetterMaterialsBlocks.CHARCOAL_BLOCK.get(), "Block of Charcoal");
        pBuilder.add(BetterMaterialsItems.BONE_SWORD.get(), "Bone Sword");
        pBuilder.add(BetterMaterialsItems.BONE_PICKAXE.get(), "Bone Pickaxe");
        pBuilder.add(BetterMaterialsItems.BONE_SHOVEL.get(), "Bone Shovel");
        pBuilder.add(BetterMaterialsItems.BONE_AXE.get(), "Bone Axe");
        pBuilder.add(BetterMaterialsItems.BONE_HOE.get(), "Bone Hoe");
        pBuilder.add(BetterMaterialsItems.FLINT_SWORD.get(), "Flint Sword");
        pBuilder.add(BetterMaterialsItems.FLINT_PICKAXE.get(), "Flint Pickaxe");
        pBuilder.add(BetterMaterialsItems.FLINT_SHOVEL.get(), "Flint Shovel");
        pBuilder.add(BetterMaterialsItems.FLINT_AXE.get(), "Flint Axe");
        pBuilder.add(BetterMaterialsItems.FLINT_HOE.get(), "Flint Hoe");
        pBuilder.add(BetterMaterialsItems.COPPER_SWORD.get(), "Copper Sword");
        pBuilder.add(BetterMaterialsItems.COPPER_PICKAXE.get(), "Copper Pickaxe");
        pBuilder.add(BetterMaterialsItems.COPPER_SHOVEL.get(), "Copper Shovel");
        pBuilder.add(BetterMaterialsItems.COPPER_AXE.get(), "Copper Axe");
        pBuilder.add(BetterMaterialsItems.COPPER_HOE.get(), "Copper Hoe");
        pBuilder.add(BetterMaterialsItems.COPPER_SHEARS.get(), "Copper Shears");
        pBuilder.add(BetterMaterialsItems.COPPER_HELMET.get(), "Copper Helmet");
        pBuilder.add(BetterMaterialsItems.COPPER_CHESTPLATE.get(), "Copper Chestplate");
        pBuilder.add(BetterMaterialsItems.COPPER_LEGGINGS.get(), "Copper Leggings");
        pBuilder.add(BetterMaterialsItems.COPPER_BOOTS.get(), "Copper Boots");
        pBuilder.add(BetterMaterialsItems.COPPER_HORSE_ARMOR.get(), "Copper Horse Armor");
        pBuilder.add(BetterMaterialsItems.EMERALD_SWORD.get(), "Emerald Sword");
        pBuilder.add(BetterMaterialsItems.EMERALD_PICKAXE.get(), "Emerald Pickaxe");
        pBuilder.add(BetterMaterialsItems.EMERALD_SHOVEL.get(), "Emerald Shovel");
        pBuilder.add(BetterMaterialsItems.EMERALD_AXE.get(), "Emerald Axe");
        pBuilder.add(BetterMaterialsItems.EMERALD_HOE.get(), "Emerald Hoe");
        pBuilder.add(BetterMaterialsItems.EMERALD_HELMET.get(), "Emerald Helmet");
        pBuilder.add(BetterMaterialsItems.EMERALD_CHESTPLATE.get(), "Emerald Chestplate");
        pBuilder.add(BetterMaterialsItems.EMERALD_LEGGINGS.get(), "Emerald Leggings");
        pBuilder.add(BetterMaterialsItems.EMERALD_BOOTS.get(), "Emerald Boots");
        pBuilder.add(BetterMaterialsItems.EMERALD_HORSE_ARMOR.get(), "Emerald Horse Armor");
        pBuilder.add(BetterMaterialsItems.AMETHYST_SWORD.get(), "Amethyst Sword");
        pBuilder.add(BetterMaterialsItems.AMETHYST_PICKAXE.get(), "Amethyst Pickaxe");
        pBuilder.add(BetterMaterialsItems.AMETHYST_SHOVEL.get(), "Amethyst Shovel");
        pBuilder.add(BetterMaterialsItems.AMETHYST_AXE.get(), "Amethyst Axe");
        pBuilder.add(BetterMaterialsItems.AMETHYST_HOE.get(), "Amethyst Hoe");
        pBuilder.add(BetterMaterialsItems.AMETHYST_HELMET.get(), "Amethyst Helmet");
        pBuilder.add(BetterMaterialsItems.AMETHYST_CHESTPLATE.get(), "Amethyst Chestplate");
        pBuilder.add(BetterMaterialsItems.AMETHYST_LEGGINGS.get(), "Amethyst Leggings");
        pBuilder.add(BetterMaterialsItems.AMETHYST_BOOTS.get(), "Amethyst Boots");
        pBuilder.add(BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get(), "Amethyst Horse Armor");
    }
}
