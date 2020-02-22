package com.github.thebenknee.moundmod.world.gen;

import com.github.thebenknee.moundmod.init.MoundBlocks;
import com.github.thebenknee.moundmod.world.gen.tree.BasicTreeFeature;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class MoundFeatures 
{

	//Flowers
	public static final FlowersFeature GOBLIN_FLOWERS = new GoblinForestFlowersFeature(NoFeatureConfig::deserialize);
	
	//Trees
	public static final AbstractTreeFeature<NoFeatureConfig> GOBLIN_TREE = new BasicTreeFeature.Builder().log(MoundBlocks.goblin_log.getDefaultState()).leaves(MoundBlocks.goblin_leaves.getDefaultState()).create();

	
}