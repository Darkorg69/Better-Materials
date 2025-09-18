package darkorg.bettermaterials.common.registry;

import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModReference {
    //Combat
    public static final List<Supplier<Item>> SWORDS = new ArrayList<>();
    public static final List<Supplier<Item>> COPPER_ARMOR = new ArrayList<>();
    public static final List<Supplier<Item>> EMERALD_ARMOR = new ArrayList<>();
    public static final List<Supplier<Item>> AMETHYST_ARMOR = new ArrayList<>();

    // Tools and utilities

    public static final List<Supplier<Item>> BONE_TOOLS = new ArrayList<>();
    public static final List<Supplier<Item>> FLINT_TOOLS = new ArrayList<>();
    public static final List<Supplier<Item>> COPPER_TOOLS = new ArrayList<>();
    public static final List<Supplier<Item>> EMERALD_TOOLS = new ArrayList<>();
    public static final List<Supplier<Item>> AMETHYST_TOOLS = new ArrayList<>();

    public static void init() {
        //Combat
        SWORDS.add(BetterMaterialsItems.BONE_SWORD);
        SWORDS.add(BetterMaterialsItems.FLINT_SWORD);
        SWORDS.add(BetterMaterialsItems.COPPER_SWORD);
        SWORDS.add(BetterMaterialsItems.AMETHYST_SWORD);
        SWORDS.add(BetterMaterialsItems.EMERALD_SWORD);

        COPPER_ARMOR.add(BetterMaterialsItems.COPPER_HELMET);
        COPPER_ARMOR.add(BetterMaterialsItems.COPPER_CHESTPLATE);
        COPPER_ARMOR.add(BetterMaterialsItems.COPPER_LEGGINGS);
        COPPER_ARMOR.add(BetterMaterialsItems.COPPER_BOOTS);

        EMERALD_ARMOR.add(BetterMaterialsItems.EMERALD_HELMET);
        EMERALD_ARMOR.add(BetterMaterialsItems.EMERALD_CHESTPLATE);
        EMERALD_ARMOR.add(BetterMaterialsItems.EMERALD_LEGGINGS);
        EMERALD_ARMOR.add(BetterMaterialsItems.EMERALD_BOOTS);

        AMETHYST_ARMOR.add(BetterMaterialsItems.AMETHYST_HELMET);
        AMETHYST_ARMOR.add(BetterMaterialsItems.AMETHYST_CHESTPLATE);
        AMETHYST_ARMOR.add(BetterMaterialsItems.AMETHYST_LEGGINGS);
        AMETHYST_ARMOR.add(BetterMaterialsItems.AMETHYST_BOOTS);

        //Tools and utilities

        BONE_TOOLS.add(BetterMaterialsItems.BONE_PICKAXE);
        BONE_TOOLS.add(BetterMaterialsItems.BONE_SHOVEL);
        BONE_TOOLS.add(BetterMaterialsItems.BONE_AXE);
        BONE_TOOLS.add(BetterMaterialsItems.BONE_HOE);

        FLINT_TOOLS.add(BetterMaterialsItems.FLINT_PICKAXE);
        FLINT_TOOLS.add(BetterMaterialsItems.FLINT_SHOVEL);
        FLINT_TOOLS.add(BetterMaterialsItems.FLINT_AXE);
        FLINT_TOOLS.add(BetterMaterialsItems.FLINT_HOE);

        COPPER_TOOLS.add(BetterMaterialsItems.COPPER_PICKAXE);
        COPPER_TOOLS.add(BetterMaterialsItems.COPPER_SHOVEL);
        COPPER_TOOLS.add(BetterMaterialsItems.COPPER_AXE);
        COPPER_TOOLS.add(BetterMaterialsItems.COPPER_HOE);

        EMERALD_TOOLS.add(BetterMaterialsItems.EMERALD_PICKAXE);
        EMERALD_TOOLS.add(BetterMaterialsItems.EMERALD_SHOVEL);
        EMERALD_TOOLS.add(BetterMaterialsItems.EMERALD_AXE);
        EMERALD_TOOLS.add(BetterMaterialsItems.EMERALD_HOE);

        AMETHYST_TOOLS.add(BetterMaterialsItems.AMETHYST_PICKAXE);
        AMETHYST_TOOLS.add(BetterMaterialsItems.AMETHYST_SHOVEL);
        AMETHYST_TOOLS.add(BetterMaterialsItems.AMETHYST_AXE);
        AMETHYST_TOOLS.add(BetterMaterialsItems.AMETHYST_HOE);
    }
}
