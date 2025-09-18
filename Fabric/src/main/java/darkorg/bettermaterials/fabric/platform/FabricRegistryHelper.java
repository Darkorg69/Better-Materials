package darkorg.bettermaterials.fabric.platform;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.platform.services.IRegistryHelper;
import darkorg.bettermaterials.common.registry.BetterMaterialsRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public final class FabricRegistryHelper implements IRegistryHelper {
    @Override
    public void initRegistries() {
        BetterMaterialsRegistries.init();
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(String pName, Supplier<T> pItem) {
        T toReturn = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BetterMaterials.MOD_ID, pName), pItem.get());
        return () -> toReturn;
    }

    @Override
    public <T extends Block> Supplier<T> registerBlock(String pName, Supplier<T> pBlock) {
        T toReturn = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterMaterials.MOD_ID, pName), pBlock.get());
        return () -> toReturn;
    }
}
