package darkorg.bettermaterials.fabric.platform;

import darkorg.bettermaterials.common.platform.services.IRegistryHelper;
import darkorg.bettermaterials.common.registry.BetterMaterialsRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public final class FabricRegistryHelper implements IRegistryHelper {
    @Override
    public void initRegistries() {
        BetterMaterialsRegistries.init();
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(ResourceLocation pResourceLocation, Supplier<T> pItem) {
        T toReturn = Registry.register(BuiltInRegistries.ITEM, pResourceLocation, pItem.get());
        return () -> toReturn;
    }

    @Override
    public <T extends Block> Supplier<T> registerBlock(ResourceLocation pResourceLocation, Supplier<T> pBlock) {
        T toReturn = Registry.register(BuiltInRegistries.BLOCK, pResourceLocation, pBlock.get());
        return () -> toReturn;
    }

    @Override
    public <T extends Block> Supplier<T> registerBlockWithBlockItem(ResourceLocation pResourceLocation, Supplier<T> pBlock) {
        return this.registerBlockWithBlockItem(pResourceLocation, pBlock, new Item.Properties());
    }

    @Override
    public <T extends Block> Supplier<T> registerBlockWithBlockItem(ResourceLocation pResourceLocation, Supplier<T> pBlock, Item.Properties pProperties) {
        Supplier<T> toReturn = this.registerBlock(pResourceLocation, pBlock);
        this.registerItem(pResourceLocation, () -> new BlockItem(toReturn.get(), pProperties));
        return toReturn;
    }
}
