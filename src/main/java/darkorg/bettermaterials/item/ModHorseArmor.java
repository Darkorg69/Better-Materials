package darkorg.bettermaterials.item;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModHorseArmor {
    public static final DeferredRegister<Item> HORSE_ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = HORSE_ARMOR.register("copper_horse_armor", () -> new HorseArmorItem(4, "copper", new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = HORSE_ARMOR.register("emerald_horse_armor", () -> new HorseArmorItem(8, "emerald", new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = HORSE_ARMOR.register("amethyst_horse_armor", () -> new HorseArmorItem(10, "amethyst", new Item.Properties().tab(BetterMaterials.TAB_BETTER_MATERIALS).stacksTo(1)));

    public static void init(IEventBus bus) {
        HORSE_ARMOR.register(bus);
    }
}
