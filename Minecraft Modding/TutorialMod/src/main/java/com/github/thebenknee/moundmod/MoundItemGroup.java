package com.github.thebenknee.moundmod;

import com.github.thebenknee.moundmod.init.MoundItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MoundItemGroup extends ItemGroup
{

	public MoundItemGroup() 
	{
		super("mound");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(MoundItems.gobar_sword);
	}

}
