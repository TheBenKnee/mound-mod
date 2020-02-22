package com.github.thebenknee.moundmod.world;

import com.github.thebenknee.moundmod.init.MoundBiomes;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

public class MoundWorldType extends WorldType
{

	public MoundWorldType() 
	{
		super("mound_type");
	}
	
	@Override
	public ChunkGenerator<?> createChunkGenerator(World world) 
	{
		OverworldGenSettings settings = new OverworldGenSettings();
		SingleBiomeProviderSettings single = new SingleBiomeProviderSettings();
		single.setBiome(MoundBiomes.goblin_forest);
		return new OverworldChunkGenerator(world, new SingleBiomeProvider(single), settings);
	}

}
