package darkorg.bettermaterials.common;

import darkorg.bettermaterials.common.platform.Services;
import darkorg.bettermaterials.common.registry.ModReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterMaterials {
    public static final String MOD_ID = "bettermaterials";
    public static final String MOD_NAME = "Better Leveling";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOGGER.debug("COMMON initialization started on {}! We are currently in a {} environment!",
                Services.PLATFORM_HELPER.getPlatformName(),
                Services.PLATFORM_HELPER.getEnvironmentName()
        );
        //Init mod registries
        Services.REGISTRY_HELPER.initRegistries();
        //Init ModReference
        ModReference.init();
        //Register mod event listeners
        Services.EVENT_HELPER.initListeners();
        //Register server-side packets...
    }

    public static void initClient() {
        LOGGER.debug("CLIENT initialization started on {}! We are currently in a {} environment!",
                Services.PLATFORM_HELPER.getPlatformName(),
                Services.PLATFORM_HELPER.getEnvironmentName()
        );
        Services.EVENT_HELPER.initClientListeners();
    }

    public static void initServer() {
        LOGGER.debug("SERVER initialization started on {}! We are currently in a {} environment!",
                Services.PLATFORM_HELPER.getPlatformName(),
                Services.PLATFORM_HELPER.getEnvironmentName()
        );
    }

    public static void initDataGenerator() {
        LOGGER.debug("DATA_GENERATOR initialization started on {}! We are currently in a {} environment!",
                Services.PLATFORM_HELPER.getPlatformName(),
                Services.PLATFORM_HELPER.getEnvironmentName()
        );
    }
}