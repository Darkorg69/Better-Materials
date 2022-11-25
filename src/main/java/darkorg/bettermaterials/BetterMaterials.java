package darkorg.bettermaterials;

import darkorg.bettermaterials.registry.ModBlockItems;
import darkorg.bettermaterials.registry.ModBlocks;
import darkorg.bettermaterials.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterMaterials.MOD_ID)
public class BetterMaterials {
    public static final String MOD_ID = "bettermaterials";

    public static IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

    public BetterMaterials() {
        ModBlocks.BLOCKS.register(modBus);
        ModBlockItems.BLOCK_ITEMS.register(modBus);
        ModItems.ITEMS.register(modBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
