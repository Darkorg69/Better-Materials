package darkorg.bettermaterials.common.registry;

import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static darkorg.bettermaterials.common.registry.BetterMaterialsItems.*;

public class ModReference {
    //Combat
    public static final List<Supplier<Item>> SWORDS = Arrays.asList(BONE_SWORD, FLINT_SWORD, COPPER_SWORD, EMERALD_SWORD, AMETHYST_SWORD);
    public static final List<Supplier<Item>> PICKAXES = Arrays.asList(BONE_PICKAXE, FLINT_PICKAXE, COPPER_PICKAXE, EMERALD_PICKAXE, AMETHYST_PICKAXE);
    public static final List<Supplier<Item>> SHOVELS = Arrays.asList(BONE_SHOVEL, FLINT_SHOVEL, COPPER_SHOVEL, EMERALD_SHOVEL, AMETHYST_SHOVEL);
    public static final List<Supplier<Item>> AXES = Arrays.asList(BONE_AXE, FLINT_AXE, COPPER_AXE, EMERALD_AXE, AMETHYST_AXE);
    public static final List<Supplier<Item>> HOES = Arrays.asList(BONE_HOE, FLINT_HOE, COPPER_HOE, EMERALD_HOE, AMETHYST_HOE);
    public static final List<Supplier<Item>> COPPER_ARMOR = Arrays.asList(COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS);
    public static final List<Supplier<Item>> EMERALD_ARMOR = Arrays.asList(EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS);
    public static final List<Supplier<Item>> AMETHYST_ARMOR = Arrays.asList(AMETHYST_HELMET, AMETHYST_CHESTPLATE, AMETHYST_LEGGINGS, AMETHYST_BOOTS);
    public static final List<Supplier<Item>> ARMOR = Stream.of(COPPER_ARMOR, EMERALD_ARMOR, AMETHYST_ARMOR).flatMap(List::stream).collect(Collectors.toList());
    public static final List<Supplier<Item>> HORSE_ARMOR = Arrays.asList(COPPER_HORSE_ARMOR, EMERALD_HORSE_ARMOR, AMETHYST_HORSE_ARMOR);
    public static final List<Supplier<Item>> BONE_TOOLS = Arrays.asList(BONE_SHOVEL, BONE_PICKAXE, BONE_AXE, BONE_HOE);
    public static final List<Supplier<Item>> FLINT_TOOLS = Arrays.asList(FLINT_SHOVEL, FLINT_PICKAXE, FLINT_AXE, FLINT_HOE);
    public static final List<Supplier<Item>> COPPER_TOOLS = Arrays.asList(COPPER_SHOVEL, COPPER_PICKAXE, COPPER_AXE, COPPER_HOE);
    public static final List<Supplier<Item>> EMERALD_TOOLS = Arrays.asList(EMERALD_SHOVEL, EMERALD_PICKAXE, EMERALD_AXE, EMERALD_HOE);
    public static final List<Supplier<Item>> AMETHYST_TOOLS = Arrays.asList(AMETHYST_SHOVEL, AMETHYST_PICKAXE, AMETHYST_AXE, AMETHYST_HOE);
    public static final List<Supplier<Item>> TOOLS = Stream.of(BONE_TOOLS, FLINT_TOOLS, COPPER_TOOLS, EMERALD_TOOLS, AMETHYST_TOOLS).flatMap(List::stream).collect(Collectors.toList());
}
