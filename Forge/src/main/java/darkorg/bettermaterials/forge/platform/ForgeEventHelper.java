package darkorg.bettermaterials.forge.platform;


import darkorg.bettermaterials.common.platform.services.IEventHelper;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.common.ForgeMod;
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

    @Override
    public Attribute getSwimSpeedAttribute() {
        return ForgeMod.SWIM_SPEED.get();
    }
}
