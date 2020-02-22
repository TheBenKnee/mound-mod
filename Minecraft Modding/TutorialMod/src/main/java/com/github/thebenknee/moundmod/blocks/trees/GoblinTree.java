package com.github.thebenknee.moundmod.blocks.trees;

import java.util.Random;

import javax.annotation.Nullable;

import com.github.thebenknee.moundmod.world.gen.MoundFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class GoblinTree extends Tree
{
	   @Nullable
	   @Override
	   protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random)
	   {
	      return MoundFeatures.GOBLIN_TREE;
	   }
}
