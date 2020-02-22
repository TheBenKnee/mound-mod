package com.github.thebenknee.moundmod.client.models;

import com.github.thebenknee.moundmod.entities.GoblinLeader;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoblinLeaderModel extends EntityModel<GoblinLeader> 
{
	private final RendererModel Main;
	private final RendererModel Legs;
	private final RendererModel LeftLeg;
	private final RendererModel RightLeg;
	private final RendererModel RightArm;
	private final RendererModel LeftArm;
	private final RendererModel Head;

	public GoblinLeaderModel() {
		textureWidth = 16;
		textureHeight = 16;

		Main = new RendererModel(this);
		Main.setRotationPoint(0.0F, 24.0F, 0.0F);
		Main.cubeList.add(new ModelBox(Main, 0, 0, -2.0F, -10.0F, -2.0F, 4, 5, 3, 0.0F, false));

		Legs = new RendererModel(this);
		Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		Main.addChild(Legs);

		LeftLeg = new RendererModel(this);
		LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, 0.0F, -5.0F, -2.0F, 2, 5, 2, 0.0F, false));

		RightLeg = new RendererModel(this);
		RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -2.0F, -5.0F, -2.0F, 2, 5, 2, 0.0F, false));

		RightArm = new RendererModel(this);
		RightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		Main.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, -10.0F, -2.0F, 2, 5, 2, 0.0F, false));

		LeftArm = new RendererModel(this);
		LeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		Main.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 2.0F, -10.0F, -2.0F, 2, 5, 2, 0.0F, false));

		Head = new RendererModel(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -2.0F, -14.0F, -2.0F, 4, 4, 2, 0.0F, false));
	}

	@Override
	public void render(GoblinLeader entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Main.render(f5);
		Head.render(f5);
	}
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

		@Override
		public void setRotationAngles(GoblinLeader entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float ScaleFactor) 
		{
			this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4f * limbSwingAmount;
			this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4f * limbSwingAmount;
			
			this.Head.rotateAngleY = netHeadYaw * 0.017453292f;
			this.Head.rotateAngleX = headPitch * 0.017453292f;
		}
		
}
