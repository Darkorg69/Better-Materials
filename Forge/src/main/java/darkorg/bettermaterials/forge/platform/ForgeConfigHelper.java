package darkorg.bettermaterials.forge.platform;


import darkorg.bettermaterials.common.platform.services.IConfigHelper;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public final class ForgeConfigHelper implements IConfigHelper {
    @Override
    public void initClientConfigs() {
        //Currently not used, because we have no client configuration.
        //registerClientConfig(BetterMaterialsConfig.CLIENT_SPEC, BetterMaterialsConfig.CLIENT_CONFIG_FILE_NAME);
    }

    @Override
    public void initServerConfigs() {
        //registerServerConfig(BetterMaterialsConfig.GAMEPLAY_SPEC, BetterMaterialsConfig.GAMEPLAY_CONFIG_FILE_NAME);
    }

    @Override
    public void initCommonConfigs() {
        //registerCommonConfig(BetterMaterialsConfig.COMMON_SPEC, BetterMaterialsConfig.COMMON_CONFIG_FILE_NAME);
    }

    @Override
    public void registerClientConfig(ForgeConfigSpec pConfigSpec, String pFileName) {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, pConfigSpec, pFileName);
    }

    @Override
    public void registerServerConfig(ForgeConfigSpec pConfigSpec, String pFileName) {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, pConfigSpec, pFileName);
    }

    @Override
    public void registerCommonConfig(ForgeConfigSpec pConfigSpec, String pFileName) {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, pConfigSpec, pFileName);
    }

    @Override
    public void initListeners() {
/*        BetterMaterialsForge.MOD_EVENT_BUS.addListener((ModConfigEvent.Loading pEvent) -> {
            BetterMaterials.LOGGER.debug("Loading mod config file: {}", pEvent.getConfig().getFileName());
        });

        BetterMaterialsForge.MOD_EVENT_BUS.addListener((ModConfigEvent.Reloading pEvent) -> {
            BetterMaterials.LOGGER.debug("Reloading mod config file: {}", pEvent.getConfig().getFileName());
        });

        BetterMaterialsForge.MOD_EVENT_BUS.addListener((ModConfigEvent.Unloading pEvent) -> {
            BetterMaterials.LOGGER.debug("Unloading mod config file: {}", pEvent.getConfig().getFileName());
        });*/
    }
}
