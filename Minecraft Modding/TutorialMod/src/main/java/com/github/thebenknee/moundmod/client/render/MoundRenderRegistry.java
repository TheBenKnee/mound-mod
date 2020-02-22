package com.github.thebenknee.moundmod.client.render;

import com.github.thebenknee.moundmod.entities.Goblin;
import com.github.thebenknee.moundmod.entities.GoblinLeader;
import com.github.thebenknee.moundmod.entities.GoblinWarlord;
import com.github.thebenknee.moundmod.entities.Minion;
import com.github.thebenknee.moundmod.entities.SpearGoblin;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class MoundRenderRegistry 
{
	public static void registryEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(Goblin.class, new GoblinRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(SpearGoblin.class, new SpearGoblinRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(GoblinWarlord.class, new GoblinWarlordRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(GoblinLeader.class, new GoblinLeaderRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(Minion.class, new MinionRender.RenderFactory());
	}
}
