package darkorg.bettermaterials.fabric.platform;

import darkorg.bettermaterials.common.BetterMaterials;

import darkorg.bettermaterials.common.platform.services.IConfigHelper;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import fuzs.forgeconfigapiport.api.config.v2.ModConfigEvents;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

public class FabricConfigHelper implements IConfigHelper {
    @Override
    public void registerClientConfig(ForgeConfigSpec pConfigSpec, String pFileName) {
        ForgeConfigRegistry.INSTANCE.register(BetterMaterials.MOD_ID, ModConfig.Type.CLIENT, pConfigSpec, pFileName);
    }

    @Override
    public void registerServerConfig(ForgeConfigSpec pConfigSpec, String pFileName) {
        ForgeConfigRegistry.INSTANCE.register(BetterMaterials.MOD_ID, ModConfig.Type.SERVER, pConfigSpec, pFileName);
    }

    @Override
    public void registerCommonConfig(ForgeConfigSpec pConfigSpec, String pFileName) {
        ForgeConfigRegistry.INSTANCE.register(BetterMaterials.MOD_ID, ModConfig.Type.COMMON, pConfigSpec, pFileName);
    }

    @Override
    public void initClientConfigs() {
        //registerClientConfig(BetterMaterialsConfig.CLIENT_SPEC, BetterMaterialsConfig.CLIENT_CONFIG_FILE_NAME);
    }

    @Override
    public void initServerConfigs() {
/*        registerServerConfig(BetterMaterialsConfig.SPECIALIZATIONS_SPEC, BetterMaterialsConfig.SPECIALIZATIONS_CONFIG_FILE_NAME);
        registerServerConfig(BetterMaterialsConfig.GAMEPLAY_SPEC, BetterMaterialsConfig.GAMEPLAY_CONFIG_FILE_NAME);
        registerServerConfig(BetterMaterialsConfig.SKILLS_SPEC, BetterMaterialsConfig.SKILLS_CONFIG_FILE_NAME);*/
    }

    @Override
    public void initCommonConfigs() {
        //registerCommonConfig(BetterMaterialsConfig.COMMON_SPEC, BetterMaterialsConfig.COMMON_CONFIG_FILE_NAME);
    }

    @Override
    public void initListeners() {
        ModConfigEvents.loading(BetterMaterials.MOD_ID).register(pModConfig -> {
            BetterMaterials.LOGGER.debug("Loading mod configuration file: {}", pModConfig.getFileName());
        });

        ModConfigEvents.reloading(BetterMaterials.MOD_ID).register(pModConfig -> {
            BetterMaterials.LOGGER.debug("Reloading mod configuration file: {}", pModConfig.getFileName());
        });

        ModConfigEvents.unloading(BetterMaterials.MOD_ID).register(pModConfig -> {
            BetterMaterials.LOGGER.debug("Unloading mod configuration file: {}", pModConfig.getFileName());
        });
    }
}
