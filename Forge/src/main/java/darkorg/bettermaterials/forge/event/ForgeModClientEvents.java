package darkorg.bettermaterials.forge.event;

import darkorg.bettermaterials.common.BetterMaterials;
import darkorg.bettermaterials.common.registry.BetterMaterialsBlocks;
import darkorg.bettermaterials.common.registry.BetterMaterialsItems;
import darkorg.bettermaterials.common.registry.ModReference;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

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
            for (List<Supplier<Item>> pSuppliers : Arrays.asList(ModReference.SWORDS, ModReference.AXES, ModReference.COPPER_ARMOR, ModReference.EMERALD_ARMOR, ModReference.AMETHYST_ARMOR, ModReference.HORSE_ARMOR)) {
                for (Supplier<Item> pSupplier : pSuppliers) {
                    event.accept(pSupplier);
                }
            }
        }

        if (tabKey == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            for (List<Supplier<Item>> pSuppliers : Arrays.asList(ModReference.BONE_TOOLS, ModReference.FLINT_TOOLS, ModReference.COPPER_TOOLS, ModReference.EMERALD_TOOLS, ModReference.AMETHYST_TOOLS)) {
                for (Supplier<Item> pSupplier : pSuppliers) {
                    event.accept(pSupplier);
                }
            }

            event.accept(BetterMaterialsItems.COPPER_SHEARS.get());
        }
    }
}