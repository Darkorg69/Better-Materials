package darkorg.bettermaterials.fabric.datagen.client;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import darkorg.bettermaterials.common.registry.ModReference;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput pDataOutput) {
        super(pDataOutput);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators pBlockModelGenerators) {
        pBlockModelGenerators.createTrivialCube(BetterMaterialsBlocks.FLINT_BLOCK.get());
        pBlockModelGenerators.createTrivialCube(BetterMaterialsBlocks.CHARCOAL_BLOCK.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators pItemModelGenerators) {
        for (List<Supplier<Item>> pSuppliers : Arrays.asList(ModReference.SWORDS, ModReference.BONE_TOOLS, ModReference.FLINT_TOOLS, ModReference.COPPER_TOOLS, ModReference.EMERALD_TOOLS, ModReference.AMETHYST_TOOLS)) {
            pSuppliers.forEach(pItemSupplier -> {
                pItemModelGenerators.generateFlatItem(pItemSupplier.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
            });
        }

        for (List<Supplier<Item>> pSuppliers : Arrays.asList(ModReference.COPPER_ARMOR, ModReference.EMERALD_ARMOR, ModReference.AMETHYST_ARMOR)) {
            pSuppliers.forEach(pItemSupplier -> {
                pItemModelGenerators.generateFlatItem(pItemSupplier.get(), ModelTemplates.FLAT_ITEM);
            });
        }

        pItemModelGenerators.generateFlatItem(BetterMaterialsItems.COPPER_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        pItemModelGenerators.generateFlatItem(BetterMaterialsItems.EMERALD_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        pItemModelGenerators.generateFlatItem(BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
    }
}
