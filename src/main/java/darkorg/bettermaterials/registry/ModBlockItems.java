package darkorg.bettermaterials.registry;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class ModBlockItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> FLINT_BLOCK = BLOCK_ITEMS.register("flint_block", () -> new BlockItem(ModBlocks.FLINT_BLOCK.get(), ModItemProperties.BUILDING_BLOCK));
    public static final RegistryObject<Item> CHARCOAL_BLOCK = BLOCK_ITEMS.register("charcoal_block", () -> new BlockItem(ModBlocks.CHARCOAL_BLOCK.get(), ModItemProperties.BUILDING_BLOCK) {
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 16000;
        }
    });
}
