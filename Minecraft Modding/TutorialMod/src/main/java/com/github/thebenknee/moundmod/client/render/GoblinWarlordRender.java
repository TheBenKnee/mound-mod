package com.github.thebenknee.moundmod.client.render;

import com.github.thebenknee.moundmod.MoundModRegistries;
import com.github.thebenknee.moundmod.client.models.GoblinWarlordModel;
import com.github.thebenknee.moundmod.entities.GoblinWarlord;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class GoblinWarlordRender extends MobRenderer<GoblinWarlord, GoblinWarlordModel>
{
	public GoblinWarlordRender(EntityRendererManager manager)
	{
		super(manager, new GoblinWarlordModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(GoblinWarlord entity)
	{
		return MoundModRegistries.location("textures/entity/goblin_warlord.png");
	}
	
	public static class RenderFactory implements IRenderFactory<GoblinWarlord>
	{
		@Override
		public EntityRenderer<? super GoblinWarlord> createRenderFor(EntityRendererManager manager)
		{
			return new GoblinWarlordRender(manager);
		}
	}
}
