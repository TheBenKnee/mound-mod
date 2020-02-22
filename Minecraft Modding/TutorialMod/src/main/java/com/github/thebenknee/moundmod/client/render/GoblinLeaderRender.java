package com.github.thebenknee.moundmod.client.render;

import com.github.thebenknee.moundmod.MoundModRegistries;
import com.github.thebenknee.moundmod.client.models.GoblinLeaderModel;
import com.github.thebenknee.moundmod.entities.GoblinLeader;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class GoblinLeaderRender extends MobRenderer<GoblinLeader, GoblinLeaderModel>
{
	public GoblinLeaderRender(EntityRendererManager manager)
	{
		super(manager, new GoblinLeaderModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(GoblinLeader entity)
	{
		return MoundModRegistries.location("textures/entity/goblin_leader.png");
	}
	
	public static class RenderFactory implements IRenderFactory<GoblinLeader>
	{
		@Override
		public EntityRenderer<? super GoblinLeader> createRenderFor(EntityRendererManager manager)
		{
			return new GoblinLeaderRender(manager);
		}
	}
}
