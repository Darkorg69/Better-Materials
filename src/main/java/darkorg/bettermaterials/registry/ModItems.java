package darkorg.bettermaterials.registry;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    //Tools
    public static final RegistryObject<Item> COPPER_SHEARS = registerShears("copper_shears", 158);

    public static final RegistryObject<Item> BONE_SWORD = registerSword("bone_sword", ModTiers.BONE, 3, -2.4F);
    public static final RegistryObject<Item> BONE_SHOVEL = registerShovel("bone_shovel", ModTiers.BONE, 1.5F, -3.0F);
    public static final RegistryObject<Item> BONE_PICKAXE = registerPickaxe("bone_pickaxe", ModTiers.BONE, 1, -2.8F);
    public static final RegistryObject<Item> BONE_AXE = registerAxe("bone_axe", ModTiers.BONE, 6.0F, -3.2F);
    public static final RegistryObject<Item> BONE_HOE = registerHoe("bone_hoe", ModTiers.BONE, 0, -3.0F);

    public static final RegistryObject<Item> FLINT_SWORD = registerSword("flint_sword", ModTiers.FLINT, 3, -2.4F);
    public static final RegistryObject<Item> FLINT_SHOVEL = registerShovel("flint_shovel", ModTiers.FLINT, 1.5F, -3.0F);
    public static final RegistryObject<Item> FLINT_PICKAXE = registerPickaxe("flint_pickaxe", ModTiers.FLINT, 1, -2.8F);
    public static final RegistryObject<Item> FLINT_AXE = registerAxe("flint_axe", ModTiers.FLINT, 6.0F, -3.2F);
    public static final RegistryObject<Item> FLINT_HOE = registerHoe("flint_hoe", ModTiers.FLINT, -1, -3.0F);

    public static final RegistryObject<Item> COPPER_SWORD = registerSword("copper_sword", ModTiers.COPPER, 3, -2.4F);
    public static final RegistryObject<Item> COPPER_SHOVEL = registerShovel("copper_shovel", ModTiers.COPPER, 1.5F, -3.0F);
    public static final RegistryObject<Item> COPPER_PICKAXE = registerPickaxe("copper_pickaxe", ModTiers.COPPER, 1, -2.8F);
    public static final RegistryObject<Item> COPPER_AXE = registerAxe("copper_axe", ModTiers.COPPER, 6.0F, -3.2F);
    public static final RegistryObject<Item> COPPER_HOE = registerHoe("copper_hoe", ModTiers.COPPER, -1, -2.0F);

    public static final RegistryObject<Item> EMERALD_SWORD = registerSword("emerald_sword", ModTiers.EMERALD, 3, -2.4F);
    public static final RegistryObject<Item> EMERALD_SHOVEL = registerShovel("emerald_shovel", ModTiers.EMERALD, 1.5F, -3.0F);
    public static final RegistryObject<Item> EMERALD_PICKAXE = registerPickaxe("emerald_pickaxe", ModTiers.EMERALD, 1, -2.8F);
    public static final RegistryObject<Item> EMERALD_AXE = registerAxe("emerald_axe", ModTiers.EMERALD, 5.5F, -3.1F);
    public static final RegistryObject<Item> EMERALD_HOE = registerHoe("emerald_hoe", ModTiers.EMERALD, -2, -1.0F);

    public static final RegistryObject<Item> AMETHYST_SWORD = registerSword("amethyst_sword", ModTiers.AMETHYST, 3, -2.4F);
    public static final RegistryObject<Item> AMETHYST_SHOVEL = registerShovel("amethyst_shovel", ModTiers.AMETHYST, 1.5F, -3.0F);
    public static final RegistryObject<Item> AMETHYST_PICKAXE = registerPickaxe("amethyst_pickaxe", ModTiers.AMETHYST, 1, -2.8F);
    public static final RegistryObject<Item> AMETHYST_AXE = registerAxe("amethyst_axe", ModTiers.AMETHYST, 5.0F, -3.0F);
    public static final RegistryObject<Item> AMETHYST_HOE = registerHoe("amethyst_hoe", ModTiers.AMETHYST, -3, 0.0F);

    // Armor
    public static final RegistryObject<Item> COPPER_HELMET = registerHelmet("copper_helmet", ModArmorMaterial.COPPER);
    public static final RegistryObject<Item> COPPER_CHESTPLATE = registerChestplate("copper_chestplate", ModArmorMaterial.COPPER);
    public static final RegistryObject<Item> COPPER_LEGGINGS = registerLeggings("copper_leggings", ModArmorMaterial.COPPER);
    public static final RegistryObject<Item> COPPER_BOOTS = registerBoots("copper_boots", ModArmorMaterial.COPPER);

    public static final RegistryObject<Item> EMERALD_HELMET = registerHelmet("emerald_helmet", ModArmorMaterial.EMERALD);
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = registerChestplate("emerald_chestplate", ModArmorMaterial.EMERALD);
    public static final RegistryObject<Item> EMERALD_LEGGINGS = registerLeggings("emerald_leggings", ModArmorMaterial.EMERALD);
    public static final RegistryObject<Item> EMERALD_BOOTS = registerBoots("emerald_boots", ModArmorMaterial.EMERALD);

    public static final RegistryObject<Item> AMETHYST_HELMET = registerHelmet("amethyst_helmet", ModArmorMaterial.AMETHYST);
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = registerChestplate("amethyst_chestplate", ModArmorMaterial.AMETHYST);
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = registerLeggings("amethyst_leggings", ModArmorMaterial.AMETHYST);
    public static final RegistryObject<Item> AMETHYST_BOOTS = registerBoots("amethyst_boots", ModArmorMaterial.AMETHYST);

    //Horse Armor
    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () -> new HorseArmorItem(4, "copper", ModItemProperties.HORSE_ARMOR));
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () -> new HorseArmorItem(8, "emerald", ModItemProperties.HORSE_ARMOR));
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor", () -> new HorseArmorItem(10, "amethyst", ModItemProperties.HORSE_ARMOR));

    public static RegistryObject<Item> registerShears(String pName, int pDurability) {
        return ITEMS.register(pName, () -> new ShearsItem(ModItemProperties.TOOLS.durability(pDurability)));
    }

    public static RegistryObject<Item> registerSword(String pName, ForgeTier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        return ITEMS.register(pName, () -> new SwordItem(pTier, pAttackDamageModifier, pAttackSpeedModifier, ModItemProperties.COMBAT));
    }

    public static RegistryObject<Item> registerShovel(String pName, ForgeTier pTier, float pAttackDamageModifier, float pAttackSpeedModifier) {
        return ITEMS.register(pName, () -> new ShovelItem(pTier, pAttackDamageModifier, pAttackSpeedModifier, ModItemProperties.TOOLS));
    }

    public static RegistryObject<Item> registerPickaxe(String pName, ForgeTier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        return ITEMS.register(pName, () -> new PickaxeItem(pTier, pAttackDamageModifier, pAttackSpeedModifier, ModItemProperties.TOOLS));
    }

    public static RegistryObject<Item> registerAxe(String pName, ForgeTier pTier, float pAttackDamageModifier, float pAttackSpeedModifier) {
        return ITEMS.register(pName, () -> new AxeItem(pTier, pAttackDamageModifier, pAttackSpeedModifier, ModItemProperties.TOOLS));
    }

    public static RegistryObject<Item> registerHoe(String pName, ForgeTier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        return ITEMS.register(pName, () -> new HoeItem(pTier, pAttackDamageModifier, pAttackSpeedModifier, ModItemProperties.TOOLS));
    }

    private static RegistryObject<Item> registerHelmet(String pName, ArmorMaterial pArmorMaterial) {
        return registerArmor(pName, pArmorMaterial, EquipmentSlot.HEAD);
    }

    private static RegistryObject<Item> registerChestplate(String pName, ArmorMaterial pArmorMaterial) {
        return registerArmor(pName, pArmorMaterial, EquipmentSlot.CHEST);
    }

    private static RegistryObject<Item> registerLeggings(String pName, ArmorMaterial pArmorMaterial) {
        return registerArmor(pName, pArmorMaterial, EquipmentSlot.LEGS);
    }

    private static RegistryObject<Item> registerBoots(String pName, ArmorMaterial pArmorMaterial) {
        return registerArmor(pName, pArmorMaterial, EquipmentSlot.FEET);
    }

    private static RegistryObject<Item> registerArmor(String pName, ArmorMaterial pArmorMaterial, EquipmentSlot pEquipmentSlot) {
        return ITEMS.register(pName, () -> new ArmorItem(pArmorMaterial, pEquipmentSlot, ModItemProperties.COMBAT));
    }
}
