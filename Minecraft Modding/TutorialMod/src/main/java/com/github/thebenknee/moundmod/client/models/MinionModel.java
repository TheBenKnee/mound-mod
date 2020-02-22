package com.github.thebenknee.moundmod.client.models;

import com.github.thebenknee.moundmod.entities.Minion;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MinionModel extends EntityModel<Minion> 
{
	private final RendererModel left_leg;
	private final RendererModel right_leg;
	private final RendererModel body;
	private final RendererModel tail;
	private final RendererModel tail_tip;
	private final RendererModel neck;
	private final RendererModel top_spike;
	private final RendererModel bottom_spike;
	private final RendererModel head;
	private final RendererModel nose;
	private final RendererModel tooth;
	private final RendererModel tooth2;
	private final RendererModel right_eye;
	private final RendererModel left_eye;
	private final RendererModel right_shoulder;
	private final RendererModel right_forearm;
	private final RendererModel claw;
	private final RendererModel claw3;
	private final RendererModel left_shoulder;
	private final RendererModel left_forearm;
	private final RendererModel claw2;
	private final RendererModel claw4;
	public BipedModel.ArmPose leftArmPose = BipedModel.ArmPose.EMPTY;
	public BipedModel.ArmPose rightArmPose = BipedModel.ArmPose.EMPTY;

	public MinionModel() {
		textureWidth = 32;
		textureHeight = 32;

		left_leg = new RendererModel(this);
		left_leg.setRotationPoint(1.6F, 21.0F, 0.5F);
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 19, -0.6F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

		right_leg = new RendererModel(this);
		right_leg.setRotationPoint(-1.5F, 21.0F, 0.5F);
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

		body = new RendererModel(this);
		body.setRotationPoint(0.0F, 20.2F, 1.0F);
		body.cubeList.add(new ModelBox(body, 0, 7, -2.0F, -1.2F, -2.0F, 4, 2, 3, 0.0F, false));

		tail = new RendererModel(this);
		tail.setRotationPoint(0.0F, 0.3F, 0.0F);
		body.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 0, 12, -2.0F, -0.5F, 0.0F, 4, 1, 3, 0.0F, false));

		tail_tip = new RendererModel(this);
		tail_tip.setRotationPoint(0.0F, 0.1F, 3.0F);
		tail.addChild(tail_tip);
		tail_tip.cubeList.add(new ModelBox(tail_tip, 11, 11, -2.0F, -0.6F, 0.0F, 4, 1, 3, 0.0F, false));

		neck = new RendererModel(this);
		neck.setRotationPoint(0.0F, 19.0F, 0.65F);
		neck.cubeList.add(new ModelBox(neck, 13, 15, -1.0F, -6.0F, -0.65F, 2, 6, 1, 0.0F, false));

		top_spike = new RendererModel(this);
		top_spike.setRotationPoint(0.0F, 5.0F, -0.65F);
		neck.addChild(top_spike);
		top_spike.cubeList.add(new ModelBox(top_spike, 17, 0, -1.0F, -9.0F, 1.0F, 2, 1, 1, 0.0F, false));

		bottom_spike = new RendererModel(this);
		bottom_spike.setRotationPoint(0.0F, 0.0F, 0.0F);
		top_spike.addChild(bottom_spike);
		bottom_spike.cubeList.add(new ModelBox(bottom_spike, 4, 16, -1.0F, -7.0F, 1.0F, 2, 1, 1, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 13.0F, 0.5F);
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -3.0F, -2.5F, 4, 3, 4, 0.0F, false));

		nose = new RendererModel(this);
		nose.setRotationPoint(0.0F, -0.5F, -2.5F);
		head.addChild(nose);
		nose.cubeList.add(new ModelBox(nose, 5, 18, -1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

		tooth = new RendererModel(this);
		tooth.setRotationPoint(0.0F, 11.5F, 2.0F);
		nose.addChild(tooth);
		tooth.cubeList.add(new ModelBox(tooth, 0, 6, -1.0F, -11.0F, -3.0F, 0, 1, 1, 0.0F, false));

		tooth2 = new RendererModel(this);
		tooth2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tooth.addChild(tooth2);
		tooth2.cubeList.add(new ModelBox(tooth2, 0, 6, 1.0F, -11.0F, -3.0F, 0, 1, 1, 0.0F, false));

		right_eye = new RendererModel(this);
		right_eye.setRotationPoint(0.0F, 11.5F, 2.0F);
		nose.addChild(right_eye);
		right_eye.cubeList.add(new ModelBox(right_eye, 18, 4, -3.0F, -13.0F, -1.0F, 1, 1, 1, 0.0F, false));

		left_eye = new RendererModel(this);
		left_eye.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_eye.addChild(left_eye);
		left_eye.cubeList.add(new ModelBox(left_eye, 11, 8, 2.0F, -13.0F, -1.0F, 1, 1, 1, 0.0F, false));

		right_shoulder = new RendererModel(this);
		right_shoulder.setRotationPoint(-2.0F, 19.55F, -0.5F);
		right_shoulder.cubeList.add(new ModelBox(right_shoulder, 13, 4, -1.0F, -0.55F, -2.5F, 1, 1, 3, 0.0F, false));

		right_forearm = new RendererModel(this);
		right_forearm.setRotationPoint(-2.5F, 19.6F, -3.0F);
		right_forearm.cubeList.add(new ModelBox(right_forearm, 0, 16, -0.5F, -0.6F, -2.0F, 1, 1, 2, 0.0F, false));

		claw = new RendererModel(this);
		claw.setRotationPoint(2.5F, 4.4F, 3.0F);
		right_forearm.addChild(claw);
		claw.cubeList.add(new ModelBox(claw, 0, 6, -3.0F, -5.0F, -6.0F, 0, 1, 1, 0.0F, false));

		claw3 = new RendererModel(this);
		claw3.setRotationPoint(0.0F, 0.0F, 0.0F);
		claw.addChild(claw3);
		claw3.cubeList.add(new ModelBox(claw3, 0, 6, -2.0F, -5.0F, -6.0F, 0, 1, 1, 0.0F, false));

		left_shoulder = new RendererModel(this);
		left_shoulder.setRotationPoint(2.5F, 19.6F, -0.5F);
		left_shoulder.cubeList.add(new ModelBox(left_shoulder, 12, 0, -0.5F, -0.6F, -2.5F, 1, 1, 3, 0.0F, false));

		left_forearm = new RendererModel(this);
		left_forearm.setRotationPoint(2.5F, 19.6F, -3.1F);
		left_forearm.cubeList.add(new ModelBox(left_forearm, 14, 8, -0.5F, -0.6F, -1.9F, 1, 1, 2, 0.0F, false));

		claw2 = new RendererModel(this);
		claw2.setRotationPoint(-2.5F, 4.4F, 3.1F);
		left_forearm.addChild(claw2);
		claw2.cubeList.add(new ModelBox(claw2, 0, 6, 3.0F, -5.0F, -6.0F, 0, 1, 1, 0.0F, false));

		claw4 = new RendererModel(this);
		claw4.setRotationPoint(0.0F, 0.0F, 0.0F);
		claw2.addChild(claw4);
		claw4.cubeList.add(new ModelBox(claw4, 0, 6, 2.0F, -5.0F, -6.0F, 0, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Minion entity, float f, float f1, float f2, float f3, float f4, float f5) {
		left_leg.render(f5);
		right_leg.render(f5);
		body.render(f5);
		neck.render(f5);
		head.render(f5);
		right_shoulder.render(f5);
		right_forearm.render(f5);
		left_shoulder.render(f5);
		left_forearm.render(f5);
	}
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

		@Override
		public void setRotationAngles(Minion entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float ScaleFactor) 
		{
			this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4f * limbSwingAmount;
			this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4f * limbSwingAmount;
			
			this.head.rotateAngleY = netHeadYaw * 0.017453292f;
			this.head.rotateAngleX = headPitch * 0.017453292f;
			
		}
		
}
