package darkorg.bettermaterials.fabric.event;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import darkorg.bettermaterials.common.registry.ModReference;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;

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


            for (Supplier<Item> item : ModReference.SWORDS) {
                pFabricItemGroupEntries.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.COPPER_ARMOR) {
                pFabricItemGroupEntries.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.EMERALD_ARMOR) {
                pFabricItemGroupEntries.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.AMETHYST_ARMOR) {
                pFabricItemGroupEntries.accept(item.get());
            }

            pFabricItemGroupEntries.accept(BetterMaterialsItems.COPPER_HORSE_ARMOR.get());
            pFabricItemGroupEntries.accept(BetterMaterialsItems.EMERALD_HORSE_ARMOR.get());
            pFabricItemGroupEntries.accept(BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get());
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(pFabricItemGroupEntries -> {

            for (Supplier<Item> item : ModReference.BONE_TOOLS) {
                pFabricItemGroupEntries.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.FLINT_TOOLS) {
                pFabricItemGroupEntries.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.COPPER_TOOLS) {
                pFabricItemGroupEntries.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.EMERALD_TOOLS) {
                pFabricItemGroupEntries.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.AMETHYST_TOOLS) {
                pFabricItemGroupEntries.accept(item.get());
            }
        });
    }
}
