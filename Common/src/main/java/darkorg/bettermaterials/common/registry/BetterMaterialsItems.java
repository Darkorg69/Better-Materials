package darkorg.bettermaterials.common.registry;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.platform.Services;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public abstract class BetterMaterialsItems {
    public static final Supplier<Item> BONE_SWORD = Services.REGISTRY_HELPER.registerItem("bone_sword", () -> new SwordItem(BetterMaterialsTiers.BONE, 3, -2.4F, (new Item.Properties())));
    public static final Supplier<Item> BONE_SHOVEL = Services.REGISTRY_HELPER.registerItem("bone_shovel", () -> new ShovelItem(BetterMaterialsTiers.BONE, 1.5F, -3.0F, (new Item.Properties())));
    public static final Supplier<Item> BONE_PICKAXE = Services.REGISTRY_HELPER.registerItem("bone_pickaxe", () -> new PickaxeItem(BetterMaterialsTiers.BONE, 1, -2.8F, (new Item.Properties())));
    public static final Supplier<Item> BONE_AXE = Services.REGISTRY_HELPER.registerItem("bone_axe", () -> new AxeItem(BetterMaterialsTiers.BONE, 6.0F, -3.2F, (new Item.Properties())));
    public static final Supplier<Item> BONE_HOE = Services.REGISTRY_HELPER.registerItem("bone_hoe", () -> new HoeItem(BetterMaterialsTiers.BONE, 0, -3.0F, (new Item.Properties())));

    public static final Supplier<Item> FLINT_SWORD = Services.REGISTRY_HELPER.registerItem("flint_sword", () -> new SwordItem(BetterMaterialsTiers.FLINT, 3, -2.4F, (new Item.Properties())));
    public static final Supplier<Item> FLINT_SHOVEL = Services.REGISTRY_HELPER.registerItem("flint_shovel", () -> new ShovelItem(BetterMaterialsTiers.FLINT, 1.5F, -3.0F, (new Item.Properties())));
    public static final Supplier<Item> FLINT_PICKAXE = Services.REGISTRY_HELPER.registerItem("flint_pickaxe", () -> new PickaxeItem(BetterMaterialsTiers.FLINT, 1, -2.8F, (new Item.Properties())));
    public static final Supplier<Item> FLINT_AXE = Services.REGISTRY_HELPER.registerItem("flint_axe", () -> new AxeItem(BetterMaterialsTiers.FLINT, 6.0F, -3.2F, (new Item.Properties())));
    public static final Supplier<Item> FLINT_HOE = Services.REGISTRY_HELPER.registerItem("flint_hoe", () -> new HoeItem(BetterMaterialsTiers.FLINT, -1, -2.0F, (new Item.Properties())));

    public static final Supplier<Item> COPPER_SWORD = Services.REGISTRY_HELPER.registerItem("copper_sword", () -> new SwordItem(BetterMaterialsTiers.COPPER, 3, -2.4F, (new Item.Properties())));
    public static final Supplier<Item> COPPER_SHOVEL = Services.REGISTRY_HELPER.registerItem("copper_shovel", () -> new ShovelItem(BetterMaterialsTiers.COPPER, 1.5F, -3.0F, (new Item.Properties())));
    public static final Supplier<Item> COPPER_PICKAXE = Services.REGISTRY_HELPER.registerItem("copper_pickaxe", () -> new PickaxeItem(BetterMaterialsTiers.COPPER, 1, -2.8F, (new Item.Properties())));
    public static final Supplier<Item> COPPER_AXE = Services.REGISTRY_HELPER.registerItem("copper_axe", () -> new AxeItem(BetterMaterialsTiers.COPPER, 6.0F, -3.2F, (new Item.Properties())));
    public static final Supplier<Item> COPPER_HOE = Services.REGISTRY_HELPER.registerItem("copper_hoe", () -> new HoeItem(BetterMaterialsTiers.COPPER, -1, -2.0F, (new Item.Properties())));
    public static final Supplier<Item> COPPER_SHEARS = Services.REGISTRY_HELPER.registerItem("copper_shears", () -> new ShearsItem(new Item.Properties().durability(158)));

    public static final Supplier<Item> EMERALD_SWORD = Services.REGISTRY_HELPER.registerItem("emerald_sword", () -> new SwordItem(BetterMaterialsTiers.EMERALD, 3, -2.4F, (new Item.Properties())));
    public static final Supplier<Item> EMERALD_SHOVEL = Services.REGISTRY_HELPER.registerItem("emerald_shovel", () -> new ShovelItem(BetterMaterialsTiers.EMERALD, 1.5F, -3.0F, (new Item.Properties())));
    public static final Supplier<Item> EMERALD_PICKAXE = Services.REGISTRY_HELPER.registerItem("emerald_pickaxe", () -> new PickaxeItem(BetterMaterialsTiers.EMERALD, 1, -2.8F, (new Item.Properties())));
    public static final Supplier<Item> EMERALD_AXE = Services.REGISTRY_HELPER.registerItem("emerald_axe", () -> new AxeItem(BetterMaterialsTiers.EMERALD, 5.5F, -3.1F, (new Item.Properties())));
    public static final Supplier<Item> EMERALD_HOE = Services.REGISTRY_HELPER.registerItem("emerald_hoe", () -> new HoeItem(BetterMaterialsTiers.EMERALD, -2, -1.0F, (new Item.Properties())));

    public static final Supplier<Item> AMETHYST_SWORD = Services.REGISTRY_HELPER.registerItem("amethyst_sword", () -> new SwordItem(BetterMaterialsTiers.AMETHYST, 3, -2.4F, (new Item.Properties())));
    public static final Supplier<Item> AMETHYST_SHOVEL = Services.REGISTRY_HELPER.registerItem("amethyst_shovel", () -> new ShovelItem(BetterMaterialsTiers.AMETHYST, 1.5F, -3.0F, (new Item.Properties())));
    public static final Supplier<Item> AMETHYST_PICKAXE = Services.REGISTRY_HELPER.registerItem("amethyst_pickaxe", () -> new PickaxeItem(BetterMaterialsTiers.AMETHYST, 1, -2.8F, (new Item.Properties())));
    public static final Supplier<Item> AMETHYST_AXE = Services.REGISTRY_HELPER.registerItem("amethyst_axe", () -> new net.minecraft.world.item.AxeItem(BetterMaterialsTiers.AMETHYST, 5.0F, -3.0F, (new Item.Properties())));
    public static final Supplier<Item> AMETHYST_HOE = Services.REGISTRY_HELPER.registerItem("amethyst_hoe", () -> new HoeItem(BetterMaterialsTiers.AMETHYST, -3, 0.0F, (new Item.Properties())));

    public static final Supplier<Item> COPPER_HELMET = Services.REGISTRY_HELPER.registerItem("copper_helmet", () -> new ArmorItem(BetterMaterialsArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> COPPER_CHESTPLATE = Services.REGISTRY_HELPER.registerItem("copper_chestplate", () -> new ArmorItem(BetterMaterialsArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> COPPER_LEGGINGS = Services.REGISTRY_HELPER.registerItem("copper_leggings", () -> new ArmorItem(BetterMaterialsArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> COPPER_BOOTS = Services.REGISTRY_HELPER.registerItem("copper_boots", () -> new ArmorItem(BetterMaterialsArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> EMERALD_HELMET = Services.REGISTRY_HELPER.registerItem("emerald_helmet", () -> new ArmorItem(BetterMaterialsArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> EMERALD_CHESTPLATE = Services.REGISTRY_HELPER.registerItem("emerald_chestplate", () -> new ArmorItem(BetterMaterialsArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> EMERALD_LEGGINGS = Services.REGISTRY_HELPER.registerItem("emerald_leggings", () -> new ArmorItem(BetterMaterialsArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> EMERALD_BOOTS = Services.REGISTRY_HELPER.registerItem("emerald_boots", () -> new ArmorItem(BetterMaterialsArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> AMETHYST_HELMET = Services.REGISTRY_HELPER.registerItem("amethyst_helmet", () -> new ArmorItem(BetterMaterialsArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> AMETHYST_CHESTPLATE = Services.REGISTRY_HELPER.registerItem("amethyst_chestplate", () -> new ArmorItem(BetterMaterialsArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> AMETHYST_LEGGINGS = Services.REGISTRY_HELPER.registerItem("amethyst_leggings", () -> new ArmorItem(BetterMaterialsArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> AMETHYST_BOOTS = Services.REGISTRY_HELPER.registerItem("amethyst_boots", () -> new ArmorItem(BetterMaterialsArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> COPPER_HORSE_ARMOR = Services.REGISTRY_HELPER.registerItem("copper_horse_armor", () -> new HorseArmorItem(4, "copper", new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> EMERALD_HORSE_ARMOR = Services.REGISTRY_HELPER.registerItem("emerald_horse_armor", () -> new HorseArmorItem(8, "emerald", new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> AMETHYST_HORSE_ARMOR = Services.REGISTRY_HELPER.registerItem("amethyst_horse_armor", () -> new HorseArmorItem(10, "amethyst", new Item.Properties().stacksTo(1)));

    public static void init() {
        BetterMaterials.LOGGER.debug("Registering items for mod: " + BetterMaterials.MOD_ID);
        BetterMaterials.LOGGER.debug("Successfully registered items for mod: " + BetterMaterials.MOD_ID);
    }
}