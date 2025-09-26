package darkorg.bettermaterials.common.registry;

import darkorg.bettermaterials.common.BetterMaterials;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum BetterMaterialsArmorMaterials implements StringRepresentable, ArmorMaterial {
    COPPER("copper", 12, Util.make(new EnumMap<>(ArmorItem.Type.class), (pEnumMap) -> {
        pEnumMap.put(ArmorItem.Type.BOOTS, 2);
        pEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
        pEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
        pEnumMap.put(ArmorItem.Type.HELMET, 2);
    }), 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(Items.COPPER_INGOT)),

    EMERALD("emerald", 21, Util.make(new EnumMap<>(ArmorItem.Type.class), (pEnumMap) -> {
        pEnumMap.put(ArmorItem.Type.BOOTS, 3);
        pEnumMap.put(ArmorItem.Type.LEGGINGS, 6);
        pEnumMap.put(ArmorItem.Type.CHESTPLATE, 8);
        pEnumMap.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(Items.EMERALD)),

    AMETHYST("amethyst", 28, Util.make(new EnumMap<>(ArmorItem.Type.class), (pEnumMap) -> {
        pEnumMap.put(ArmorItem.Type.BOOTS, 3);
        pEnumMap.put(ArmorItem.Type.LEGGINGS, 6);
        pEnumMap.put(ArmorItem.Type.CHESTPLATE, 8);
        pEnumMap.put(ArmorItem.Type.HELMET, 3);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(Items.AMETHYST_SHARD));

    public static final EnumCodec<BetterMaterialsArmorMaterials> CODEC = StringRepresentable.fromEnum(BetterMaterialsArmorMaterials::values);

    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (pEnumMap) -> {
        pEnumMap.put(ArmorItem.Type.BOOTS, 13);
        pEnumMap.put(ArmorItem.Type.LEGGINGS, 15);
        pEnumMap.put(ArmorItem.Type.CHESTPLATE, 16);
        pEnumMap.put(ArmorItem.Type.HELMET, 11);
    });

    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    BetterMaterialsArmorMaterials(String pName, int pDurabilityMultiplier, EnumMap<ArmorItem.Type, Integer> pEnumMap, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.protectionFunctionForType = pEnumMap;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = pRepairIngredient;
    }

    public int getDurabilityForType(@NotNull ArmorItem.Type pType) {
        return HEALTH_FUNCTION_FOR_TYPE.get(pType) * this.durabilityMultiplier;
    }

    public int getDefenseForType(@NotNull ArmorItem.Type pType) {
        return this.protectionFunctionForType.get(pType);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @NotNull
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @NotNull
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @NotNull
    public String getName() {
        return BetterMaterials.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @NotNull
    public String getSerializedName() {
        return this.name;
    }
}
