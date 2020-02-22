package com.github.thebenknee.moundmod.world.biomes;

import com.github.thebenknee.moundmod.MoundModRegistries;
import com.github.thebenknee.moundmod.init.MoundBlocks;
import com.github.thebenknee.moundmod.init.MoundEntities;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.LakesConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.LakeChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class DiseasedBiome extends Biome 
{
	public DiseasedBiome() 
	{
		super((new Biome.Builder())
				.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MoundBlocks.block_heart.getDefaultState(), MoundBlocks.goblin_dirt.getDefaultState(), MoundBlocks.block_heart.getDefaultState())))
				.precipitation(RainType.RAIN)
				.category(Category.PLAINS)
				.downfall(0.3f)
				.depth(0.9f)
				.temperature(0.8f)
				.scale(0.2f)
				.waterColor(0x036633)
				.waterFogColor(0x270434)
				.parent(null));
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addStructures(this);
		DefaultBiomeFeatures.addOres(this);
	    DefaultBiomeFeatures.addMonsterRooms(this);
	    DefaultBiomeFeatures.addMushrooms(this);
	    DefaultBiomeFeatures.addSprings(this);
	    DefaultBiomeFeatures.addTaigaRocks(this);
	    DefaultBiomeFeatures.addFossils(this);
	    DefaultBiomeFeatures.addSedimentDisks(this);
	    DefaultBiomeFeatures.addFreezeTopLayer(this);
	    this.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Biome.createDecoratedFeature(Feature.LAKE, new LakesConfig(Blocks.WATER.getDefaultState()), Placement.WATER_LAKE, new LakeChanceConfig(4)));
	    this.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, MoundBlocks.goblin_dirt.getDefaultState(), 33), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 256)));
	    this.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, MoundBlocks.goblin_gravel.getDefaultState(), 33), Placement.COUNT_RANGE, new CountRangeConfig(8, 0, 0, 256)));
	    
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(MoundEntities.GOBLIN, 20, 1, 5));
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(MoundEntities.SPEARGOBLIN, 20, 1, 2));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SPIDER, 100, 4, 4));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SKELETON, 100, 4, 4));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SLIME, 100, 4, 4));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.WITCH, 5, 1, 1));
		
		this.setRegistryName(MoundModRegistries.location("diseased_biome"));
	}

}
