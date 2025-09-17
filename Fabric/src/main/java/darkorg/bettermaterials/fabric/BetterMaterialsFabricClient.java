package darkorg.bettermaterials.fabric;

import darkorg.bettermaterials.common.BetterMaterials;
import net.fabricmc.api.ClientModInitializer;

public class BetterMaterialsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BetterMaterials.initClient();
    }
}
