package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.block.ModBlocks;
import darkorg.bettermaterials.item.ModArmor;
import darkorg.bettermaterials.item.ModHorseArmor;
import darkorg.bettermaterials.item.ModItems;
import darkorg.bettermaterials.item.ModTools;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModRegistry {
    public static void init(IEventBus bus) {
        ModBlocks.init(bus);
        ModItems.init(bus);
        ModTools.init(bus);
        ModArmor.init(bus);
        ModHorseArmor.init(bus);
    }
}
