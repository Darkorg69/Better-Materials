package darkorg.bettermaterials.fabric;

import darkorg.bettermaterials.common.BetterMaterials;
import net.fabricmc.api.DedicatedServerModInitializer;

public class BetterMaterialsFabricServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        BetterMaterials.initServer();
    }
}
