package darkorg.bettermaterials.forge.event;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterMaterials.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ForgeModClientEvents {
    @SubscribeEvent
    public static void onCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tabKey = event.getTabKey();
        if (tabKey == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(BetterMaterialsBlocks.FLINT_BLOCK.get());
            event.accept(BetterMaterialsBlocks.CHARCOAL_BLOCK.get());
        }

        if (tabKey == CreativeModeTabs.COMBAT) {
            //swords
            event.accept(BetterMaterialsItems.BONE_SWORD.get());
            event.accept(BetterMaterialsItems.FLINT_SWORD.get());
            event.accept(BetterMaterialsItems.COPPER_SWORD.get());
            event.accept(BetterMaterialsItems.EMERALD_SWORD.get());
            event.accept(BetterMaterialsItems.AMETHYST_SWORD.get());
            //copper armor
            event.accept(BetterMaterialsItems.COPPER_HELMET.get());
            event.accept(BetterMaterialsItems.COPPER_CHESTPLATE.get());
            event.accept(BetterMaterialsItems.COPPER_LEGGINGS.get());
            event.accept(BetterMaterialsItems.COPPER_BOOTS.get());
            //emerald armor
            event.accept(BetterMaterialsItems.EMERALD_HELMET.get());
            event.accept(BetterMaterialsItems.EMERALD_CHESTPLATE.get());
            event.accept(BetterMaterialsItems.EMERALD_LEGGINGS.get());
            event.accept(BetterMaterialsItems.EMERALD_BOOTS.get());
            //amethyst armor
            event.accept(BetterMaterialsItems.AMETHYST_HELMET.get());
            event.accept(BetterMaterialsItems.AMETHYST_CHESTPLATE.get());
            event.accept(BetterMaterialsItems.AMETHYST_LEGGINGS.get());
            event.accept(BetterMaterialsItems.AMETHYST_BOOTS.get());
            //horse armor
            event.accept(BetterMaterialsItems.COPPER_HORSE_ARMOR.get());
            event.accept(BetterMaterialsItems.EMERALD_HORSE_ARMOR.get());
            event.accept(BetterMaterialsItems.AMETHYST_HORSE_ARMOR.get());
        }

        if (tabKey == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            //bone tools
            event.accept(BetterMaterialsItems.BONE_PICKAXE.get());
            event.accept(BetterMaterialsItems.BONE_SHOVEL.get());
            event.accept(BetterMaterialsItems.BONE_AXE.get());
            event.accept(BetterMaterialsItems.BONE_HOE.get());
            //flint tools
            event.accept(BetterMaterialsItems.FLINT_PICKAXE.get());
            event.accept(BetterMaterialsItems.FLINT_SHOVEL.get());
            event.accept(BetterMaterialsItems.FLINT_AXE.get());
            event.accept(BetterMaterialsItems.FLINT_HOE.get());
            //copper tools
            event.accept(BetterMaterialsItems.COPPER_PICKAXE.get());
            event.accept(BetterMaterialsItems.COPPER_SHOVEL.get());
            event.accept(BetterMaterialsItems.COPPER_AXE.get());
            event.accept(BetterMaterialsItems.COPPER_HOE.get());
            //emerald tools
            event.accept(BetterMaterialsItems.EMERALD_PICKAXE.get());
            event.accept(BetterMaterialsItems.EMERALD_SHOVEL.get());
            event.accept(BetterMaterialsItems.EMERALD_AXE.get());
            event.accept(BetterMaterialsItems.EMERALD_HOE.get());
            //amethyst tools
            event.accept(BetterMaterialsItems.AMETHYST_PICKAXE.get());
            event.accept(BetterMaterialsItems.AMETHYST_SHOVEL.get());
            event.accept(BetterMaterialsItems.AMETHYST_AXE.get());
            event.accept(BetterMaterialsItems.AMETHYST_HOE.get());
        }
    }
}
