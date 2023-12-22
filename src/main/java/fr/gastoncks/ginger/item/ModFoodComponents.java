package fr.gastoncks.ginger.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GINGER = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1),0.75f)
            .build();
    public static final FoodComponent CANDIED_GINGER = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1),1f)
            .build();
}