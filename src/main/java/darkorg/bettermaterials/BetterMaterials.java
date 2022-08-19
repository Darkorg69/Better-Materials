package darkorg.bettermaterials;

import darkorg.bettermaterials.item.ModItems;
import darkorg.bettermaterials.setup.ModRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(BetterMaterials.MOD_ID)
public class BetterMaterials {
    public static final String MOD_ID = "bettermaterials";

    IEventBus eventBus = MinecraftForge.EVENT_BUS;
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public BetterMaterials() {
        ModRegistry.init(modEventBus);
        eventBus.register(this);
    }

    public static final CreativeModeTab TAB_BETTER_MATERIALS = new CreativeModeTab("better_materials") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.FLINT_BLOCK.get());
        }
    };
}
