package darkorg.bettermaterials.data.client;

import darkorg.bettermaterials.registry.ModBlocks;
import darkorg.bettermaterials.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator pGenerator, String pModId, String pLocale) {
        super(pGenerator, pModId, pLocale);
    }

    @Override
    protected void addTranslations() {
        add(ModBlocks.CHARCOAL_BLOCK.get(), "Block of Charcoal");
        add(ModBlocks.FLINT_BLOCK.get(), "Block of Flint");
        add(ModItems.AMETHYST_AXE.get(), "Amethyst Axe");
        add(ModItems.AMETHYST_BOOTS.get(), "Amethyst Boots");
        add(ModItems.AMETHYST_CHESTPLATE.get(), "Amethyst Chestplate");
        add(ModItems.AMETHYST_HELMET.get(), "Amethyst Helmet");
        add(ModItems.AMETHYST_HOE.get(), "Amethyst Hoe");
        add(ModItems.AMETHYST_HORSE_ARMOR.get(), "Amethyst Horse Armor");
        add(ModItems.AMETHYST_LEGGINGS.get(), "Amethyst Leggings");
        add(ModItems.AMETHYST_PICKAXE.get(), "Amethyst Pickaxe");
        add(ModItems.AMETHYST_SHOVEL.get(), "Amethyst Shovel");
        add(ModItems.AMETHYST_SWORD.get(), "Amethyst Sword");
        add(ModItems.BONE_AXE.get(), "Bone Axe");
        add(ModItems.BONE_HOE.get(), "Bone Hoe");
        add(ModItems.BONE_PICKAXE.get(), "Bone Pickaxe");
        add(ModItems.BONE_SHOVEL.get(), "Bone Shovel");
        add(ModItems.BONE_SWORD.get(), "Bone Sword");
        add(ModItems.COPPER_AXE.get(), "Copper Axe");
        add(ModItems.COPPER_BOOTS.get(), "Copper Boots");
        add(ModItems.COPPER_CHESTPLATE.get(), "Copper Chestplate");
        add(ModItems.COPPER_HELMET.get(), "Copper Helmet");
        add(ModItems.COPPER_HOE.get(), "Copper Hoe");
        add(ModItems.COPPER_HORSE_ARMOR.get(), "Copper Horse Armor");
        add(ModItems.COPPER_LEGGINGS.get(), "Copper Leggings");
        add(ModItems.COPPER_PICKAXE.get(), "Copper Pickaxe");
        add(ModItems.COPPER_SHEARS.get(), "Copper Shears");
        add(ModItems.COPPER_SHOVEL.get(), "Copper Shovel");
        add(ModItems.COPPER_SWORD.get(), "Copper Sword");
        add(ModItems.EMERALD_AXE.get(), "Emerald Axe");
        add(ModItems.EMERALD_BOOTS.get(), "Emerald Boots");
        add(ModItems.EMERALD_CHESTPLATE.get(), "Emerald Chestplate");
        add(ModItems.EMERALD_HELMET.get(), "Emerald Helmet");
        add(ModItems.EMERALD_HOE.get(), "Emerald Hoe");
        add(ModItems.EMERALD_HORSE_ARMOR.get(), "Emerald Horse Armor");
        add(ModItems.EMERALD_LEGGINGS.get(), "Emerald Leggings");
        add(ModItems.EMERALD_PICKAXE.get(), "Emerald Pickaxe");
        add(ModItems.EMERALD_SHOVEL.get(), "Emerald Shovel");
        add(ModItems.EMERALD_SWORD.get(), "Emerald Sword");
        add(ModItems.FLINT_AXE.get(), "Flint Axe");
        add(ModItems.FLINT_HOE.get(), "Flint Hoe");
        add(ModItems.FLINT_PICKAXE.get(), "Flint Pickaxe");
        add(ModItems.FLINT_SHOVEL.get(), "Flint Shovel");
        add(ModItems.FLINT_SWORD.get(), "Flint Sword");
    }
}
