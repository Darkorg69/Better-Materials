package darkorg.bettermaterials.common.registry.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class ModHoeItem extends DiggerItem {
    public ModHoeItem(Tier pTier, float pAttackDamage, float pAttackSpeed, TagKey<Block> pRequiresTool, Properties pProperties) {
        super(pAttackDamage, pAttackSpeed, pTier, pRequiresTool, pProperties);
    }
}
