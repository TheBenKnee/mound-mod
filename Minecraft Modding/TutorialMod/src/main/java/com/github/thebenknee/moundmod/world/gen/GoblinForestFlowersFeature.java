package com.github.thebenknee.moundmod.world.gen;

import java.util.Random;
import java.util.function.Function;

import com.github.thebenknee.moundmod.init.MoundBlocks;
import com.mojang.datafixers.Dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class GoblinForestFlowersFeature extends FlowersFeature
{

	private static final Block[] FLOWERS = new Block[]{MoundBlocks.goblin_flower, MoundBlocks.goblin_flower2, MoundBlocks.goblin_flower3, MoundBlocks.goblin_flower4};

	public GoblinForestFlowersFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> deserializer)
	{
		super(deserializer);
	}

	@Override
	public BlockState getRandomFlower(Random p_202355_1_, BlockPos p_202355_2_)
	{
		double d0 = MathHelper.clamp((1.0D + Biome.INFO_NOISE.getValue((double)p_202355_2_.getX() / 48.0D, (double)p_202355_2_.getZ() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
		Block block = FLOWERS[(int)(d0 * (double)FLOWERS.length)];
		return block.getDefaultState();
	}
	
}
