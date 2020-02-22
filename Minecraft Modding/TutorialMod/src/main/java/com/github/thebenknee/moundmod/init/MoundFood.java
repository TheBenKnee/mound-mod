package com.github.thebenknee.moundmod.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MoundFood 
{
	public static final Food GOBLIN_FLESH = (new Food.Builder()).hunger(2).saturation(0.3f).meat().build();
	public static final Food GOBLIN_JERKY = (new Food.Builder()).hunger(7).saturation(0.8f).meat().build();
	public static final Food SINISTER_APPLE = (new Food.Builder()).hunger(4).saturation(0.2f).effect(new EffectInstance(Effects.BAD_OMEN, 5000, 1), 1.0F).effect(new EffectInstance(Effects.GLOWING, 100, 0), 1.0f).setAlwaysEdible().build();
	public static final Food TURNIP = (new Food.Builder()).hunger(2).saturation(0.2f).build();
}