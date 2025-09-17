package darkorg.bettermaterials.common.platform.services;

import net.minecraftforge.common.ForgeConfigSpec;

public interface IConfigHelper {
    void registerClientConfig(ForgeConfigSpec pConfigSpec, String pFileName);

    void registerServerConfig(ForgeConfigSpec pConfigSpec, String pFileName);

    void registerCommonConfig(ForgeConfigSpec pConfigSpec, String pFileName);

    void initClientConfigs();

    void initServerConfigs();

    void initCommonConfigs();

    void initListeners();
}
