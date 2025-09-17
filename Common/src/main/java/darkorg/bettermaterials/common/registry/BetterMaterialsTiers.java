package darkorg.bettermaterials.common.registry;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum BetterMaterialsTiers implements Tier {
    BONE(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.of(Items.BONE)),
    FLINT(1, 131, 4.0F, 1.0F, 5, () -> Ingredient.of(Items.FLINT)),
    COPPER(1, 191, 5.0F, 1.5F, 12, () -> Ingredient.of(Items.COPPER_INGOT)),
    EMERALD(2, 521, 7.0F, 2.5F, 8, () -> Ingredient.of(Items.EMERALD)),
    AMETHYST(2, 781, 9.0F, 2.5F, 15, () -> Ingredient.of(Items.AMETHYST_SHARD));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private BetterMaterialsTiers(int $$0, int $$1, float $$2, float $$3, int $$4, Supplier<Ingredient> $$5) {
        this.level = $$0;
        this.uses = $$1;
        this.speed = $$2;
        this.damage = $$3;
        this.enchantmentValue = $$4;
        this.repairIngredient = new LazyLoadedValue<>($$5);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @NotNull
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
    }
