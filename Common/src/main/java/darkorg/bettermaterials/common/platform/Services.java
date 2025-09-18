package darkorg.bettermaterials.common.platform;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.platform.services.*;

import java.util.ServiceLoader;

public abstract class Services {
    public static final IEventHelper EVENT_HELPER = load(IEventHelper.class);
    public static final IPlatformHelper PLATFORM_HELPER = load(IPlatformHelper.class);
    public static final IRegistryHelper REGISTRY_HELPER = load(IRegistryHelper.class);

    public static <T> T load(Class<T> pService) {
        final T loadedService = ServiceLoader.load(pService).findFirst().orElseThrow(() -> {
            return new NullPointerException("Failed to load service for " + pService.getName());
        });

        BetterMaterials.LOGGER.debug("Loaded {} for service {}", loadedService, pService);

        return loadedService;
    }
}