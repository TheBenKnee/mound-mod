package com.github.thebenknee.moundmod.client.render;

import com.github.thebenknee.moundmod.MoundModRegistries;
import com.github.thebenknee.moundmod.client.models.GoblinModel;
import com.github.thebenknee.moundmod.entities.Goblin;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class GoblinRender extends MobRenderer<Goblin, GoblinModel>
{
	public GoblinRender(EntityRendererManager manager)
	{
		super(manager, new GoblinModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Goblin entity)
	{
		return MoundModRegistries.location("textures/entity/goblin.png");
	}
	
	public static class RenderFactory implements IRenderFactory<Goblin>
	{
		@Override
		public EntityRenderer<? super Goblin> createRenderFor(EntityRendererManager manager)
		{
			return new GoblinRender(manager);
		}
	}
}
