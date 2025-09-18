package darkorg.bettermaterials.common.platform.services;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface IRegistryHelper {
    void initRegistries();

    <T extends Item> Supplier<T> registerItem(String pName, Supplier<T> pItem);

    <T extends Block> Supplier<T> registerBlock(String pName, Supplier<T> pBlock);
}
