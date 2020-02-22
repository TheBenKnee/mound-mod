package com.github.thebenknee.moundmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig 
{
	public static ForgeConfigSpec.IntValue tutorial_chance;
	public static ForgeConfigSpec.BooleanValue generate_overworld;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
	{
		server.comment("Oregen Config");
		
		tutorial_chance = server
				.comment("maximum number of ore veins of the tutorial ore that can spawn in one chunk.")
				.defineInRange("oregen.tutorial_chance", 5, 1, 1000000);
		
		generate_overworld = server
				.comment("Devide if you want the ore to generate only in the overworld or not")
				.define("oregen.generate_overworld", true);
	}
}
