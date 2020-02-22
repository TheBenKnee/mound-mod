package com.github.thebenknee.moundmod.init;

import com.github.thebenknee.moundmod.MoundModRegistries;
import com.github.thebenknee.moundmod.entities.Goblin;
import com.github.thebenknee.moundmod.entities.GoblinLeader;
import com.github.thebenknee.moundmod.entities.GoblinWarlord;
import com.github.thebenknee.moundmod.entities.Minion;
import com.github.thebenknee.moundmod.entities.SpearGoblin;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class MoundEntities 
{
	public static EntityType<?> GOBLIN = EntityType.Builder.create(Goblin::new, EntityClassification.MONSTER).build(MoundModRegistries.MODID + ":goblin").setRegistryName(MoundModRegistries.location("goblin"));
	public static EntityType<?> SPEARGOBLIN = EntityType.Builder.create(SpearGoblin::new, EntityClassification.MONSTER).build(MoundModRegistries.MODID + ":spear_goblin").setRegistryName(MoundModRegistries.location("spear_goblin"));
	public static EntityType<?> GOBLINWARLORD = EntityType.Builder.create(GoblinWarlord::new, EntityClassification.MONSTER).build(MoundModRegistries.MODID + ":goblin_warlord").setRegistryName(MoundModRegistries.location("goblin_warlord"));
	public static EntityType<?> GOBLINLEADER = EntityType.Builder.create(GoblinLeader::new, EntityClassification.MONSTER).build(MoundModRegistries.MODID + ":goblin_leader").setRegistryName(MoundModRegistries.location("goblin_leader"));
	public static EntityType<?> MINION = EntityType.Builder.create(Minion::new, EntityClassification.MONSTER).build(MoundModRegistries.MODID + ":minion").setRegistryName(MoundModRegistries.location("minion"));
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			MoundItems.goblin_egg = registerEntitySpawnEgg(GOBLIN, 0x14671D, 0x706B63, "goblin_egg"),
			MoundItems.spear_goblin_egg = registerEntitySpawnEgg(SPEARGOBLIN, 0x14671D, 0xFFF816, "spear_goblin_egg"),
			MoundItems.goblin_warlord_egg = registerEntitySpawnEgg(GOBLINWARLORD, 0x14671D, 0xE83905, "goblin_warlord_egg"),
			MoundItems.goblin_leader_egg = registerEntitySpawnEgg(GOBLINLEADER, 0x14671D, 0x6f1499, "goblin_leader_egg"),
			MoundItems.minion_egg = registerEntitySpawnEgg(MINION, 0x14671D, 0xE96D12, "minion_egg")
		);
	}
	
	public static void registerEntityWorldSpawns()
	{
		registerEntityWorldSpawn(GOBLIN, 10, 1, 10, Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.DARK_FOREST, Biomes.TALL_BIRCH_FOREST, Biomes.DARK_FOREST_HILLS);
		registerEntityWorldSpawn(SPEARGOBLIN, 10, 1, 10, Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.DARK_FOREST, Biomes.TALL_BIRCH_FOREST, Biomes.DARK_FOREST_HILLS);
		registerEntityWorldSpawn(GOBLINWARLORD, 10, 1, 10, Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.DARK_FOREST, Biomes.TALL_BIRCH_FOREST, Biomes.DARK_FOREST_HILLS);
		registerEntityWorldSpawn(GOBLINLEADER, 10, 1, 10, Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.DARK_FOREST, Biomes.TALL_BIRCH_FOREST, Biomes.DARK_FOREST_HILLS);
		registerEntityWorldSpawn(MINION, 10, 1, 10, Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.DARK_FOREST, Biomes.TALL_BIRCH_FOREST, Biomes.DARK_FOREST_HILLS);
	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(MoundModRegistries.MOUND));
		item.setRegistryName(MoundModRegistries.location(name));
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity, int weight, int minAmount, int maxAmount, Biome... biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, weight, minAmount, maxAmount));
			}
		}
	}
}
