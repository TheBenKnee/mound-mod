package com.github.thebenknee.moundmod.world;

import com.github.thebenknee.moundmod.config.OregenConfig;
import com.github.thebenknee.moundmod.init.MoundBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration 
{
	public static void setupOreGeneration()
	{
		if(OregenConfig.generate_overworld.get())
		{
			for(Biome biome : ForgeRegistries.BIOMES)
			{		
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, MoundBlocks.ore_gobar.getDefaultState(), OregenConfig.tutorial_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(8, 5, 0, 90)));
				
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, MoundBlocks.ore_gobar.getDefaultState(), OregenConfig.tutorial_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 5, 0, 100)));
			}
		}
	}
}
