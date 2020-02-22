package com.github.thebenknee.moundmod.blocks;

import com.github.thebenknee.moundmod.init.MoundItems;

import net.minecraft.block.CarrotBlock;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TurnipBlock extends CarrotBlock
{
	
	   public TurnipBlock(Properties p_i48433_1_) 
	   {
		   super(p_i48433_1_);
	   }

	@OnlyIn(Dist.CLIENT)
	   protected IItemProvider getSeedsItem() 
		{
	      return MoundItems.turnip;
		}


}
