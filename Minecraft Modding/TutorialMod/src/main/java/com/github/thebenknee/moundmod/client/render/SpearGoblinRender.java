package com.github.thebenknee.moundmod.client.render;

import com.github.thebenknee.moundmod.MoundModRegistries;
import com.github.thebenknee.moundmod.client.models.SpearGoblinModel;
import com.github.thebenknee.moundmod.entities.SpearGoblin;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class SpearGoblinRender extends MobRenderer<SpearGoblin, SpearGoblinModel>
{
	public SpearGoblinRender(EntityRendererManager manager)
	{
		super(manager, new SpearGoblinModel(), 0f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(SpearGoblin entity)
	{
		return MoundModRegistries.location("textures/entity/spear_goblin.png");
	}
	
	public static class RenderFactory implements IRenderFactory<SpearGoblin>
	{
		@Override
		public EntityRenderer<? super SpearGoblin> createRenderFor(EntityRendererManager manager)
		{
			return new SpearGoblinRender(manager);
		}
	}
}
