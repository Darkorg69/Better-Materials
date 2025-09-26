package darkorg.bettermaterials.fabric.platform;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.platform.services.IEventHelper;
import darkorg.bettermaterials.fabric.event.FabricClientEvents;
import net.minecraft.world.entity.ai.attributes.Attribute;

public class FabricEventHelper implements IEventHelper {
    @Override
    public void initListeners() {
        BetterMaterials.LOGGER.debug("Registering event listeners for Fabric");
    }

    @Override
    public void initClientListeners() {
        FabricClientEvents.init();
    }
}
