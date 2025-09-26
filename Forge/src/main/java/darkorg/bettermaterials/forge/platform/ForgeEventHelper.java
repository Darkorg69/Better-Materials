package darkorg.bettermaterials.forge.platform;

import darkorg.bettermaterials.common.platform.services.IEventHelper;
import net.minecraftforge.fml.common.Mod;

public final class ForgeEventHelper implements IEventHelper {
    /**
     * On Forge, we have no event listeners init, because {@link Mod.EventBusSubscriber} handles everything.
     */
    @Override
    public void initListeners() {

    }

    /**
     * On Forge, we have no event listeners init, because {@link Mod.EventBusSubscriber} handles everything.
     */
    @Override
    public void initClientListeners() {

    }
}
