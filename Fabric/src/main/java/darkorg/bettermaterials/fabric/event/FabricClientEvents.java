package darkorg.bettermaterials.fabric.event;

import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

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
            //swords
            pFabricItemGroupEntries.addBefore(Items.STONE_SWORD, BetterMaterialsItems.BONE_SWORD.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_SWORD, BetterMaterialsItems.COPPER_SWORD.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.COPPER_SWORD.get(), BetterMaterialsItems.FLINT_SWORD.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_SWORD, BetterMaterialsItems.AMETHYST_SWORD.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_SWORD.get(), BetterMaterialsItems.EMERALD_SWORD.get());

            //copper armor
            pFabricItemGroupEntries.addBefore(Items.IRON_HELMET, BetterMaterialsItems.COPPER_HELMET.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_CHESTPLATE, BetterMaterialsItems.COPPER_CHESTPLATE.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_LEGGINGS, BetterMaterialsItems.COPPER_LEGGINGS.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_BOOTS, BetterMaterialsItems.COPPER_BOOTS.get());

            //amethyst armor
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_HELMET, BetterMaterialsItems.AMETHYST_HELMET.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_CHESTPLATE, BetterMaterialsItems.AMETHYST_CHESTPLATE.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_LEGGINGS, BetterMaterialsItems.AMETHYST_LEGGINGS.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_BOOTS, BetterMaterialsItems.AMETHYST_BOOTS.get());

            //emerald armor
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_HELMET.get(), BetterMaterialsItems.EMERALD_HELMET.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_CHESTPLATE.get(), BetterMaterialsItems.EMERALD_CHESTPLATE.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_LEGGINGS.get(), BetterMaterialsItems.EMERALD_LEGGINGS.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_BOOTS.get(), BetterMaterialsItems.EMERALD_BOOTS.get());

            //horse armor
            pFabricItemGroupEntries.addBefore(Items.IRON_HORSE_ARMOR, BetterMaterialsItems.COPPER_HORSE_ARMOR.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_HORSE_ARMOR, BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get(), BetterMaterialsItems.EMERALD_HORSE_ARMOR.get());
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(pFabricItemGroupEntries -> {

            //bone tools
            pFabricItemGroupEntries.addBefore(Items.STONE_PICKAXE, BetterMaterialsItems.BONE_PICKAXE.get());
            pFabricItemGroupEntries.addBefore(Items.STONE_SHOVEL, BetterMaterialsItems.BONE_SHOVEL.get());
            pFabricItemGroupEntries.addBefore(Items.STONE_AXE, BetterMaterialsItems.BONE_AXE.get());
            pFabricItemGroupEntries.addBefore(Items.STONE_HOE, BetterMaterialsItems.BONE_HOE.get());

            //copper tools
            pFabricItemGroupEntries.addBefore(Items.IRON_PICKAXE, BetterMaterialsItems.COPPER_PICKAXE.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_SHOVEL, BetterMaterialsItems.COPPER_SHOVEL.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_AXE, BetterMaterialsItems.COPPER_AXE.get());
            pFabricItemGroupEntries.addBefore(Items.IRON_HOE, BetterMaterialsItems.COPPER_HOE.get());

            //flint tools
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.COPPER_PICKAXE.get(), BetterMaterialsItems.FLINT_PICKAXE.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.COPPER_SHOVEL.get(), BetterMaterialsItems.FLINT_SHOVEL.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.COPPER_AXE.get(), BetterMaterialsItems.FLINT_AXE.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.COPPER_HOE.get(), BetterMaterialsItems.FLINT_HOE.get());
            pFabricItemGroupEntries.addBefore(Items.SHEARS, BetterMaterialsItems.COPPER_SHEARS.get());

            //amethyst tools
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_PICKAXE, BetterMaterialsItems.AMETHYST_PICKAXE.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_SHOVEL, BetterMaterialsItems.AMETHYST_SHOVEL.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_AXE, BetterMaterialsItems.AMETHYST_AXE.get());
            pFabricItemGroupEntries.addBefore(Items.DIAMOND_HOE, BetterMaterialsItems.AMETHYST_HOE.get());

            //emerald tools
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_PICKAXE.get(), BetterMaterialsItems.EMERALD_PICKAXE.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_SHOVEL.get(), BetterMaterialsItems.EMERALD_SHOVEL.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_AXE.get(), BetterMaterialsItems.EMERALD_AXE.get());
            pFabricItemGroupEntries.addBefore(BetterMaterialsItems.AMETHYST_HOE.get(), BetterMaterialsItems.EMERALD_HOE.get());
        });
    }
}
