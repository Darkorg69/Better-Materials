package darkorg.bettermaterials.common.platform.services;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface IRegistryHelper {
    void initRegistries();

    <T extends Item> Supplier<T> registerItem(ResourceLocation pResourceLocation, Supplier<T> pItem);

    <T extends Block> Supplier<T> registerBlock(ResourceLocation pResourceLocation, Supplier<T> pBlock);

    <T extends Block> Supplier<T> registerBlockWithBlockItem(ResourceLocation pResourceLocation, Supplier<T> pBlock);

    <T extends Block> Supplier<T> registerBlockWithBlockItem(ResourceLocation pResourceLocation, Supplier<T> pBlock, Item.Properties pProperties);
}
