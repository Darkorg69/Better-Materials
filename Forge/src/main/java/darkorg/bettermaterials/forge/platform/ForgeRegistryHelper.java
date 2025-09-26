package darkorg.bettermaterials.forge.platform;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.platform.services.IRegistryHelper;
import darkorg.bettermaterials.common.registry.BetterMaterialsRegistries;
import darkorg.bettermaterials.forge.BetterMaterialsForge;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public final class ForgeRegistryHelper implements IRegistryHelper {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterMaterials.MOD_ID);

    @Override
    public void initRegistries() {
        BetterMaterialsRegistries.init();

        BLOCKS.register(BetterMaterialsForge.MOD_EVENT_BUS);
        ITEMS.register(BetterMaterialsForge.MOD_EVENT_BUS);
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(ResourceLocation pResourceLocation, Supplier<T> pRegistryObject) {
        return ITEMS.register(pResourceLocation.getPath(), pRegistryObject);
    }

    @Override
    public <T extends Block> Supplier<T> registerBlock(ResourceLocation pResourceLocation, Supplier<T> pRegistryObject) {
        return BLOCKS.register(pResourceLocation.getPath(), pRegistryObject);
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
