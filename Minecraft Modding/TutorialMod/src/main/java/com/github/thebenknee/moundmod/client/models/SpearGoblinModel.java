package com.github.thebenknee.moundmod.client.models;

import com.github.thebenknee.moundmod.entities.SpearGoblin;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SpearGoblinModel extends EntityModel<SpearGoblin>
{
	private final RendererModel torso;
	private final RendererModel belly;
	private final RendererModel head;
	private final RendererModel nose;
	private final RendererModel ears;
	private final RendererModel right_ear;
	private final RendererModel left_ear;
	private final RendererModel arms;
	private final RendererModel left_arm;
	private final RendererModel left_shoulder;
	private final RendererModel left_forearm;
	private final RendererModel right_arm;
	private final RendererModel right_forearm;
	private final RendererModel right_shoulder;
	private final RendererModel legs;
	private final RendererModel right_leg;
	private final RendererModel right_foot;
	private final RendererModel left_leg;
	private final RendererModel left_foot;

	public SpearGoblinModel() {
		textureWidth = 32;
		textureHeight = 32;

		torso = new RendererModel(this);
		torso.setRotationPoint(0.0F, 19.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 0, -2.15F, -7.0F, 0.0F, 4, 8, 2, 0.0F, false));

		belly = new RendererModel(this);
		belly.setRotationPoint(0.0F, 5.0F, 0.0F);
		torso.addChild(belly);
		belly.cubeList.add(new ModelBox(belly, 12, 0, -2.1F, -10.0F, -2.0F, 4, 6, 2, 0.0F, false));
		belly.cubeList.add(new ModelBox(belly, 0, 10, -1.6F, -9.45F, -3.0F, 3, 5, 1, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 14.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 9, 9, -2.1F, -6.0F, -2.0F, 4, 4, 3, 0.0F, false));

		nose = new RendererModel(this);
		nose.setRotationPoint(0.0F, 10.0F, -1.0F);
		head.addChild(nose);
		nose.cubeList.add(new ModelBox(nose, 0, 16, -1.6F, -13.75F, -2.0F, 3, 1, 1, 0.0F, false));
		nose.cubeList.add(new ModelBox(nose, 4, 19, -1.0F, -14.0F, -2.0F, 2, 1, 1, 0.0F, false));
		nose.cubeList.add(new ModelBox(nose, 16, 16, -1.0F, -13.8F, -2.6F, 2, 1, 1, 0.0F, false));

		ears = new RendererModel(this);
		ears.setRotationPoint(0.0F, 10.0F, -1.0F);
		head.addChild(ears);

		right_ear = new RendererModel(this);
		right_ear.setRotationPoint(0.0F, 0.0F, 0.0F);
		ears.addChild(right_ear);
		right_ear.cubeList.add(new ModelBox(right_ear, 22, 15, -2.25F, -17.0F, 0.0F, 1, 1, 1, 0.0F, false));
		right_ear.cubeList.add(new ModelBox(right_ear, 22, 0, -3.0F, -16.0F, 0.0F, 1, 1, 1, 0.0F, false));
		right_ear.cubeList.add(new ModelBox(right_ear, 13, 22, -3.0F, -17.0F, 0.0F, 1, 1, 1, 0.0F, false));
		right_ear.cubeList.add(new ModelBox(right_ear, 21, 19, -4.0F, -17.0F, 0.0F, 1, 1, 1, 0.0F, false));

		left_ear = new RendererModel(this);
		left_ear.setRotationPoint(0.0F, 0.0F, 0.0F);
		ears.addChild(left_ear);
		left_ear.cubeList.add(new ModelBox(left_ear, 21, 17, 2.5F, -17.0F, 0.0F, 1, 1, 1, 0.0F, false));
		left_ear.cubeList.add(new ModelBox(left_ear, 10, 16, 1.75F, -16.0F, 0.0F, 1, 1, 1, 0.0F, false));
		left_ear.cubeList.add(new ModelBox(left_ear, 10, 0, 1.75F, -17.0F, 0.0F, 1, 1, 1, 0.0F, false));
		left_ear.cubeList.add(new ModelBox(left_ear, 8, 10, 0.75F, -17.0F, 0.0F, 1, 1, 1, 0.0F, false));

		arms = new RendererModel(this);
		arms.setRotationPoint(0.0F, 12.9F, 0.0F);

		left_arm = new RendererModel(this);
		left_arm.setRotationPoint(2.1F, 0.1F, 1.1F);
		arms.addChild(left_arm);

		left_shoulder = new RendererModel(this);
		left_shoulder.setRotationPoint(0.7F, 2.0F, 0.0F);
		left_arm.addChild(left_shoulder);
		left_shoulder.cubeList.add(new ModelBox(left_shoulder, 4, 21, -1.0F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		left_forearm = new RendererModel(this);
		left_forearm.setRotationPoint(0.9F, 4.8F, 0.0F);
		left_arm.addChild(left_forearm);
		left_forearm.cubeList.add(new ModelBox(left_forearm, 10, 19, -1.2F, -2.05F, -0.5F, 1, 4, 1, 0.0F, false));

		right_arm = new RendererModel(this);
		right_arm.setRotationPoint(-2.3F, 0.1F, 1.1F);
		arms.addChild(right_arm);

		right_forearm = new RendererModel(this);
		right_forearm.setRotationPoint(-1.0F, 4.8F, -0.0F);
		right_arm.addChild(right_forearm);
		right_forearm.cubeList.add(new ModelBox(right_forearm, 20, 8, 0.3F, -2.05F, -0.5F, 1, 4, 1, 0.0F, false));

		right_shoulder = new RendererModel(this);
		right_shoulder.setRotationPoint(-1.1F, 2.0F, 0.0F);
		right_arm.addChild(right_shoulder);
		right_shoulder.cubeList.add(new ModelBox(right_shoulder, 21, 21, 0.4F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		legs = new RendererModel(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);

		right_leg = new RendererModel(this);
		right_leg.setRotationPoint(-1.6F, -4.0F, 1.0F);
		legs.addChild(right_leg);
		right_leg.cubeList.add(new ModelBox(right_leg, 17, 18, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

		right_foot = new RendererModel(this);
		right_foot.setRotationPoint(1.6F, 4.0F, -1.0F);
		right_leg.addChild(right_foot);
		right_foot.cubeList.add(new ModelBox(right_foot, 12, 16, -2.1F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

		left_leg = new RendererModel(this);
		left_leg.setRotationPoint(1.4F, -4.0F, 1.1F);
		legs.addChild(left_leg);
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 18, -0.5F, 0.0F, -0.6F, 1, 4, 1, 0.0F, false));

		left_foot = new RendererModel(this);
		left_foot.setRotationPoint(-1.4F, 4.0F, -1.1F);
		left_leg.addChild(left_foot);
		left_foot.cubeList.add(new ModelBox(left_foot, 6, 16, 0.85F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(SpearGoblin entity, float f, float f1, float f2, float f3, float f4, float f5) {
		torso.render(f5);
		head.render(f5);
		arms.render(f5);
		legs.render(f5);
	}
	public void setRotationAngle(RendererModel RendererModel, float x, float y, float z) {
		RendererModel.rotateAngleX = x;
		RendererModel.rotateAngleY = y;
		RendererModel.rotateAngleZ = z;
	}

		@Override
		public void setRotationAngles(SpearGoblin entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float ScaleFactor) 
		{
			this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4f * limbSwingAmount;
			this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4f * limbSwingAmount;
			
			this.head.rotateAngleY = netHeadYaw * 0.017453292f;
			this.head.rotateAngleX = headPitch * 0.017453292f;
		}
}

