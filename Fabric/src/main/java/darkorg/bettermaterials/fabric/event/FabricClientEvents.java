package darkorg.bettermaterials.fabric.event;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import darkorg.bettermaterials.common.registry.ModReference;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public abstract class FabricClientEvents {
    public static void init() {
        onCreativeModeTabs();
    }

    public static void onCreativeModeTabs() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(pContent -> {
            pContent.addBefore(Blocks.COAL_BLOCK, BetterMaterialsBlocks.CHARCOAL_BLOCK.get());
            pContent.addBefore(BetterMaterialsBlocks.CHARCOAL_BLOCK.get(), BetterMaterialsBlocks.FLINT_BLOCK.get());
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(pFabricItemGroupEntries -> {
            pFabricItemGroupEntries.addBefore(Items.STONE_SWORD, BetterMaterialsItems.BONE_SWORD.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_SWORD, BetterMaterialsItems.FLINT_SWORD.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_SWORD, BetterMaterialsItems.COPPER_SWORD.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_SWORD, BetterMaterialsItems.EMERALD_SWORD.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_SWORD, BetterMaterialsItems.AMETHYST_SWORD.get());

            pFabricItemGroupEntries.addBefore(Items.STONE_AXE, BetterMaterialsItems.BONE_AXE.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_AXE, BetterMaterialsItems.FLINT_AXE.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_AXE, BetterMaterialsItems.COPPER_AXE.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_AXE, BetterMaterialsItems.EMERALD_AXE.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_AXE, BetterMaterialsItems.AMETHYST_AXE.get());

            for (Supplier<Item> itemSupplier : ModReference.COPPER_ARMOR) {
                pFabricItemGroupEntries.addBefore(Items.IRON_HELMET, itemSupplier.get());
            }

            for (List<Supplier<Item>> supplierList : Arrays.asList(ModReference.EMERALD_ARMOR, ModReference.AMETHYST_ARMOR)) {
                for (Supplier<Item> itemSupplier : supplierList) {
                    pFabricItemGroupEntries.addBefore(Items.DIAMOND_HELMET, itemSupplier.get());
                }
            }

            pFabricItemGroupEntries.addBefore(Items.IRON_HORSE_ARMOR, BetterMaterialsItems.COPPER_HORSE_ARMOR.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_HORSE_ARMOR, BetterMaterialsItems.EMERALD_HORSE_ARMOR.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_HORSE_ARMOR, BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get());
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(pFabricItemGroupEntries -> {
            for (Supplier<Item> itemSupplier : ModReference.BONE_TOOLS) {
                pFabricItemGroupEntries.addBefore(Items.WOODEN_SHOVEL, itemSupplier.get());
            }

            for (List<Supplier<Item>> supplierList : Arrays.asList(ModReference.FLINT_TOOLS, ModReference.COPPER_TOOLS)) {
                for (Supplier<Item> itemSupplier : supplierList) {
                    pFabricItemGroupEntries.addBefore(Items.STONE_SHOVEL, itemSupplier.get());
                }
            }

            for (List<Supplier<Item>> supplierList : Arrays.asList(ModReference.EMERALD_TOOLS, ModReference.AMETHYST_TOOLS)) {
                for (Supplier<Item> itemSupplier : supplierList) {
                    pFabricItemGroupEntries.addBefore(Items.DIAMOND_SHOVEL, itemSupplier.get());
                }
            }

            pFabricItemGroupEntries.addBefore(Items.SHEARS, BetterMaterialsItems.COPPER_SHEARS.get());
        });
    }
}
