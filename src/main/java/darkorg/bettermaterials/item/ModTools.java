package darkorg.bettermaterials.item;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.setup.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> BONE_SWORD = TOOLS.register("bone_sword", () -> new SwordItem(ModTiers.BONE, 3, -2.4F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_SHOVEL = TOOLS.register("bone_shovel", () -> new ShovelItem(ModTiers.BONE, 1.5F, -3.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_PICKAXE = TOOLS.register("bone_pickaxe", () -> new PickaxeItem(ModTiers.BONE, 1, -2.8F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_AXE = TOOLS.register("bone_axe", () -> new AxeItem(ModTiers.BONE, 6.0F, -3.2F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_HOE = TOOLS.register("bone_hoe", () -> new HoeItem(ModTiers.BONE, 0, -3.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static final RegistryObject<Item> FLINT_SWORD = TOOLS.register("flint_sword", () -> new SwordItem(ModTiers.FLINT, 3, -2.4F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_SHOVEL = TOOLS.register("flint_shovel", () -> new ShovelItem(ModTiers.FLINT, 1.5F, -3.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_PICKAXE = TOOLS.register("flint_pickaxe", () -> new PickaxeItem(ModTiers.FLINT, 1, -2.8F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_AXE = TOOLS.register("flint_axe", () -> new AxeItem(ModTiers.FLINT, 6.0F, -3.2F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_HOE = TOOLS.register("flint_hoe", () -> new HoeItem(ModTiers.FLINT, -1, -2.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static final RegistryObject<Item> COPPER_SWORD = TOOLS.register("copper_sword", () -> new SwordItem(ModTiers.COPPER, 3, -2.4F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_SHOVEL = TOOLS.register("copper_shovel", () -> new ShovelItem(ModTiers.COPPER, 1.5F, -3.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_PICKAXE = TOOLS.register("copper_pickaxe", () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_AXE = TOOLS.register("copper_axe", () -> new AxeItem(ModTiers.COPPER, 6.0F, -3.2F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_HOE = TOOLS.register("copper_hoe", () -> new HoeItem(ModTiers.COPPER, -1, -2.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> COPPER_SHEARS = TOOLS.register("copper_shears", () -> new ShearsItem(new Item.Properties().durability(158).tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static final RegistryObject<Item> EMERALD_SWORD = TOOLS.register("emerald_sword", () -> new SwordItem(ModTiers.EMERALD, 3, -2.4F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = TOOLS.register("emerald_shovel", () -> new ShovelItem(ModTiers.EMERALD, 1.5F, -3.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = TOOLS.register("emerald_pickaxe", () -> new PickaxeItem(ModTiers.EMERALD, 1, -2.8F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_AXE = TOOLS.register("emerald_axe", () -> new AxeItem(ModTiers.EMERALD, 5.5F, -3.1F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_HOE = TOOLS.register("emerald_hoe", () -> new HoeItem(ModTiers.EMERALD, -2, -1.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_SWORD = TOOLS.register("amethyst_sword", () -> new SwordItem(ModTiers.AMETHYST, 3, -2.4F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = TOOLS.register("amethyst_shovel", () -> new ShovelItem(ModTiers.AMETHYST, 1.5F, -3.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = TOOLS.register("amethyst_pickaxe", () -> new PickaxeItem(ModTiers.AMETHYST, 1, -2.8F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> AMETHYST_AXE = TOOLS.register("amethyst_axe", () -> new AxeItem(ModTiers.AMETHYST, 5.0F, -3.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> AMETHYST_HOE = TOOLS.register("amethyst_hoe", () -> new HoeItem(ModTiers.AMETHYST, -3, 0.0F, (new Item.Properties()).tab(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static void init(IEventBus bus) {
        TOOLS.register(bus);
    }
}
