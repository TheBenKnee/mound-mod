package com.github.thebenknee.moundmod.items;

import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class CustomBowItem extends BowItem
{

	public CustomBowItem(Properties builder) 
	{
		super(builder);
	}
	
	@Override
	public int getUseDuration(ItemStack stack) 
	{
		return 2000;
	}

}
