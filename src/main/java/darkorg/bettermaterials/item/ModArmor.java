package darkorg.bettermaterials.item;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.setup.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModArmor {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> COPPER_HELMET = ARMOR.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ARMOR.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ARMOR.register("copper_leggings", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_BOOTS = ARMOR.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static final RegistryObject<Item> EMERALD_HELMET = ARMOR.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ARMOR.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ARMOR.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ARMOR.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ARMOR.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ARMOR.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ARMOR.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ARMOR.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET, new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static void init(IEventBus bus) {
        ARMOR.register(bus);
    }
}
