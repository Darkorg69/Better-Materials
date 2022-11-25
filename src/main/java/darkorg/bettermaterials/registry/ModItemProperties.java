package darkorg.bettermaterials.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ModItemProperties {
    public static final Item.Properties BUILDING_BLOCK = new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Item.Properties HORSE_ARMOR = new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC);
    public static final Item.Properties COMBAT = new Item.Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static final Item.Properties TOOLS = new Item.Properties().tab(CreativeModeTab.TAB_TOOLS);
}
