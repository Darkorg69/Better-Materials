package darkorg.bettermaterials.registry;

import darkorg.bettermaterials.registry.ModItems;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModReference {
    public static List<Item> BONE_TOOLS = new ArrayList<>();

    public static List<Item> FLINT_TOOLS = new ArrayList<>();

    public static List<Item> COPPER_TOOLS = new ArrayList<>();
    public static List<Item> COPPER_ARMOR = new ArrayList<>();

    public static List<Item> EMERALD_TOOLS = new ArrayList<>();
    public static List<Item> EMERALD_ARMOR = new ArrayList<>();

    public static List<Item> AMETHYST_TOOLS = new ArrayList<>();
    public static List<Item> AMETHYST_ARMOR = new ArrayList<>();

    public static void init() {
        BONE_TOOLS.add(ModItems.BONE_SWORD.get());
        BONE_TOOLS.add(ModItems.BONE_PICKAXE.get());
        BONE_TOOLS.add(ModItems.BONE_SHOVEL.get());
        BONE_TOOLS.add(ModItems.BONE_AXE.get());
        BONE_TOOLS.add(ModItems.BONE_HOE.get());

        FLINT_TOOLS.add(ModItems.FLINT_SWORD.get());
        FLINT_TOOLS.add(ModItems.FLINT_PICKAXE.get());
        FLINT_TOOLS.add(ModItems.FLINT_SHOVEL.get());
        FLINT_TOOLS.add(ModItems.FLINT_AXE.get());
        FLINT_TOOLS.add(ModItems.FLINT_HOE.get());

        COPPER_TOOLS.add(ModItems.COPPER_SWORD.get());
        COPPER_TOOLS.add(ModItems.COPPER_PICKAXE.get());
        COPPER_TOOLS.add(ModItems.COPPER_SHOVEL.get());
        COPPER_TOOLS.add(ModItems.COPPER_AXE.get());
        COPPER_TOOLS.add(ModItems.COPPER_HOE.get());

        COPPER_ARMOR.add(ModItems.COPPER_HELMET.get());
        COPPER_ARMOR.add(ModItems.COPPER_CHESTPLATE.get());
        COPPER_ARMOR.add(ModItems.COPPER_LEGGINGS.get());
        COPPER_ARMOR.add(ModItems.COPPER_BOOTS.get());

        EMERALD_TOOLS.add(ModItems.EMERALD_SWORD.get());
        EMERALD_TOOLS.add(ModItems.EMERALD_PICKAXE.get());
        EMERALD_TOOLS.add(ModItems.EMERALD_SHOVEL.get());
        EMERALD_TOOLS.add(ModItems.EMERALD_AXE.get());
        EMERALD_TOOLS.add(ModItems.EMERALD_HOE.get());

        EMERALD_ARMOR.add(ModItems.EMERALD_HELMET.get());
        EMERALD_ARMOR.add(ModItems.EMERALD_CHESTPLATE.get());
        EMERALD_ARMOR.add(ModItems.EMERALD_LEGGINGS.get());
        EMERALD_ARMOR.add(ModItems.EMERALD_BOOTS.get());

        AMETHYST_TOOLS.add(ModItems.AMETHYST_SWORD.get());
        AMETHYST_TOOLS.add(ModItems.AMETHYST_PICKAXE.get());
        AMETHYST_TOOLS.add(ModItems.AMETHYST_SHOVEL.get());
        AMETHYST_TOOLS.add(ModItems.AMETHYST_AXE.get());
        AMETHYST_TOOLS.add(ModItems.AMETHYST_HOE.get());

        AMETHYST_ARMOR.add(ModItems.AMETHYST_HELMET.get());
        AMETHYST_ARMOR.add(ModItems.AMETHYST_CHESTPLATE.get());
        AMETHYST_ARMOR.add(ModItems.AMETHYST_LEGGINGS.get());
        AMETHYST_ARMOR.add(ModItems.AMETHYST_BOOTS.get());
    }
}
