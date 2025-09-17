package darkorg.bettermaterials.forge;

import darkorg.bettermaterials.common.BetterMaterials;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterMaterials.MOD_ID)
public class BetterMaterialsForge {
    public static final String MOD_ID = "bettermaterials";

    public static IEventBus MOD_EVENT_BUS;

    public BetterMaterialsForge(FMLJavaModLoadingContext pFMLJavaModLoadingContext) {
        MOD_EVENT_BUS = pFMLJavaModLoadingContext.getModEventBus();
        BetterMaterials.init();
        BetterMaterials.initClient();
    }
}
