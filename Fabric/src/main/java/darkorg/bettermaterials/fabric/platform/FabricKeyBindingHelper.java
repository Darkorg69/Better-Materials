package darkorg.bettermaterials.fabric.platform;

import darkorg.bettermaterials.common.platform.services.IKeyBindingHelper;

public class FabricKeyBindingHelper implements IKeyBindingHelper {
    @Override
    public void registerKeyBindings() {
        //KeyBindingHelper.registerKeyBinding(BetterMaterialsKeyMappings.OPEN_GUI);
    }

    @Override
    public void registerKeyBindingListeners() {
        //ClientTickEvents.END_CLIENT_TICK.register(ModClientEvents::onPressOpenGUI);
    }
}
