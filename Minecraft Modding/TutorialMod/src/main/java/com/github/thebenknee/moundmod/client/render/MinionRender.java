package com.github.thebenknee.moundmod.client.render;

import com.github.thebenknee.moundmod.MoundModRegistries;
import com.github.thebenknee.moundmod.client.models.MinionModel;
import com.github.thebenknee.moundmod.entities.Minion;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class MinionRender extends MobRenderer<Minion, MinionModel>
{
	public MinionRender(EntityRendererManager manager)
	{
		super(manager, new MinionModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Minion entity)
	{
		return MoundModRegistries.location("textures/entity/minion.png");
	}
	
	public static class RenderFactory implements IRenderFactory<Minion>
	{
		@Override
		public EntityRenderer<? super Minion> createRenderFor(EntityRendererManager manager)
		{
			return new MinionRender(manager);
		}
	}
}
