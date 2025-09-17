package darkorg.bettermaterials.common.platform.services;

import net.minecraft.world.entity.ai.attributes.Attribute;

public interface IEventHelper {
    void initListeners();

    void initClientListeners();

    Attribute getSwimSpeedAttribute();
}

