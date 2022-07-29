package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.item.ModArmor;
import darkorg.bettermaterials.item.ModTools;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModReference {
    public static List<RegistryObject<Item>> BONE_TOOLS = new ArrayList<>();
    public static List<RegistryObject<Item>> FLINT_TOOLS = new ArrayList<>();
    public static List<RegistryObject<Item>> COPPER_TOOLS = new ArrayList<>();
    public static List<RegistryObject<Item>> COPPER_ARMOR = new ArrayList<>();
    public static List<RegistryObject<Item>> EMERALD_TOOLS = new ArrayList<>();
    public static List<RegistryObject<Item>> EMERALD_ARMOR = new ArrayList<>();
    public static List<RegistryObject<Item>> AMETHYST_TOOLS = new ArrayList<>();
    public static List<RegistryObject<Item>> AMETHYST_ARMOR = new ArrayList<>();

    public static void init() {
        //Tools
        BONE_TOOLS.add(ModTools.BONE_SWORD);
        BONE_TOOLS.add(ModTools.BONE_PICKAXE);
        BONE_TOOLS.add(ModTools.BONE_SHOVEL);
        BONE_TOOLS.add(ModTools.BONE_AXE);
        BONE_TOOLS.add(ModTools.BONE_HOE);

        FLINT_TOOLS.add(ModTools.FLINT_SWORD);
        FLINT_TOOLS.add(ModTools.FLINT_PICKAXE);
        FLINT_TOOLS.add(ModTools.FLINT_SHOVEL);
        FLINT_TOOLS.add(ModTools.FLINT_AXE);
        FLINT_TOOLS.add(ModTools.FLINT_HOE);

        COPPER_TOOLS.add(ModTools.COPPER_SWORD);
        COPPER_TOOLS.add(ModTools.COPPER_PICKAXE);
        COPPER_TOOLS.add(ModTools.COPPER_SHOVEL);
        COPPER_TOOLS.add(ModTools.COPPER_AXE);
        COPPER_TOOLS.add(ModTools.COPPER_HOE);

        AMETHYST_TOOLS.add(ModTools.AMETHYST_SWORD);
        AMETHYST_TOOLS.add(ModTools.AMETHYST_PICKAXE);
        AMETHYST_TOOLS.add(ModTools.AMETHYST_SHOVEL);
        AMETHYST_TOOLS.add(ModTools.AMETHYST_AXE);
        AMETHYST_TOOLS.add(ModTools.AMETHYST_HOE);

        EMERALD_TOOLS.add(ModTools.EMERALD_SWORD);
        EMERALD_TOOLS.add(ModTools.EMERALD_PICKAXE);
        EMERALD_TOOLS.add(ModTools.EMERALD_SHOVEL);
        EMERALD_TOOLS.add(ModTools.EMERALD_AXE);
        EMERALD_TOOLS.add(ModTools.EMERALD_HOE);

        //Armor
        COPPER_ARMOR.add(ModArmor.COPPER_HELMET);
        COPPER_ARMOR.add(ModArmor.COPPER_CHESTPLATE);
        COPPER_ARMOR.add(ModArmor.COPPER_LEGGINGS);
        COPPER_ARMOR.add(ModArmor.COPPER_BOOTS);

        EMERALD_ARMOR.add(ModArmor.EMERALD_HELMET);
        EMERALD_ARMOR.add(ModArmor.EMERALD_CHESTPLATE);
        EMERALD_ARMOR.add(ModArmor.EMERALD_LEGGINGS);
        EMERALD_ARMOR.add(ModArmor.EMERALD_BOOTS);

        AMETHYST_ARMOR.add(ModArmor.AMETHYST_HELMET);
        AMETHYST_ARMOR.add(ModArmor.AMETHYST_CHESTPLATE);
        AMETHYST_ARMOR.add(ModArmor.AMETHYST_LEGGINGS);
        AMETHYST_ARMOR.add(ModArmor.AMETHYST_BOOTS);
    }
}
