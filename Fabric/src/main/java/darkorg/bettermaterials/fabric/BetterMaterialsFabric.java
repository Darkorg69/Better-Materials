package darkorg.bettermaterials.fabric;

import darkorg.bettermaterials.common.BetterMaterials;
import net.fabricmc.api.ModInitializer;

public class BetterMaterialsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BetterMaterials.init();
        //ModLootTableModifiers.init();
    }
}
