package com.github.thebenknee.moundmod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class MoundBiomes 
{
	public static Biome goblin_forest;
	public static Biome diseased_biome;
	
	public static void registerBiomes()
	{
		registerBiome(goblin_forest, BiomeType.WARM, Type.DENSE, Type.FOREST, Type.HILLS);
		registerBiome(diseased_biome, BiomeType.WARM, Type.DEAD, Type.DRY);
	}
	
	public static void registerBiome(Biome biome, BiomeType biomeType, Type... types)
	{
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 40));
	}
}
