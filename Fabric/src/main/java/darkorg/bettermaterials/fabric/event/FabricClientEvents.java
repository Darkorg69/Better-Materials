package darkorg.bettermaterials.fabric.event;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import darkorg.bettermaterials.common.registry.ModReference;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public abstract class FabricClientEvents {
    public static void init() {
        onCreativeModeTabs();
    }

    public static void onCreativeModeTabs() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(pContent -> {
                    pContent.accept(BetterMaterialsBlocks.FLINT_BLOCK.get());
                    pContent.accept(BetterMaterialsBlocks.CHARCOAL_BLOCK.get());
                }
        );

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(pContent -> {

            for (Supplier<Item> item : ModReference.SWORDS) {
                pContent.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.COPPER_ARMOR) {
                pContent.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.EMERALD_ARMOR) {
                pContent.accept(item.get());
            }

            for (Supplier<Item> item : ModReference.AMETHYST_ARMOR) {
                pContent.accept(item.get());
            }

            pContent.accept(BetterMaterialsItems.COPPER_HORSE_ARMOR.get());
            pContent.accept(BetterMaterialsItems.EMERALD_HORSE_ARMOR.get());
            pContent.accept(BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get());
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(pFabricItemGroupEntries -> {

        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(pContent -> {
                    //pContent.addAfter(Items.RAW_GOLD, BetterMaterialsItems.RAW_DEBRIS.get())
                }
        );
    }
}
