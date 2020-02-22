package com.github.thebenknee.moundmod.util;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public interface IBlockPosQuery 
{
    boolean matches(IWorld world, BlockPos pos);
}
