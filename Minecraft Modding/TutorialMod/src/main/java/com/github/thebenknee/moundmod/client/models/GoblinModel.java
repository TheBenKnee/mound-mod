package com.github.thebenknee.moundmod.client.models;

import com.github.thebenknee.moundmod.entities.Goblin;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoblinModel extends EntityModel<Goblin> 
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

	public GoblinModel() {
		textureWidth = 32;
		textureHeight = 32;

		torso = new RendererModel(this);
		torso.setRotationPoint(0.0F, 19.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 0, -2.75F, -5.0F, 0.0F, 5, 6, 2, 0.0F, false));

		belly = new RendererModel(this);
		belly.setRotationPoint(0.0F, 5.0F, 0.0F);
		torso.addChild(belly);
		belly.cubeList.add(new ModelBox(belly, 12, 13, -2.7F, -8.0F, -2.0F, 5, 4, 2, 0.0F, false));
		belly.cubeList.add(new ModelBox(belly, 13, 7, -2.2F, -7.45F, -3.0F, 4, 3, 1, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 14.0F, 0.9F);
		head.cubeList.add(new ModelBox(head, 0, 8, -2.1F, -4.0F, -1.9F, 4, 4, 3, 0.0F, false));

		nose = new RendererModel(this);
		nose.setRotationPoint(0.0F, 10.0F, -0.9F);
		head.addChild(nose);
		nose.cubeList.add(new ModelBox(nose, 12, 0, -1.6F, -11.75F, -2.0F, 3, 1, 1, 0.0F, false));
		nose.cubeList.add(new ModelBox(nose, 14, 19, -1.0F, -12.0F, -2.0F, 2, 1, 1, 0.0F, false));
		nose.cubeList.add(new ModelBox(nose, 14, 11, -1.0F, -11.8F, -2.6F, 2, 1, 1, 0.0F, false));
		nose.cubeList.add(new ModelBox(nose, 0, 0, -1.1F, -12.1F, -2.1F, 1, 1, 1, 0.0F, false));
		nose.cubeList.add(new ModelBox(nose, 0, 0, -0.6F, -12.1F, -2.3F, 1, 1, 1, 0.0F, false));
		nose.cubeList.add(new ModelBox(nose, 0, 0, 0.7F, -12.0F, -2.3F, 1, 1, 1, 0.0F, false));

		ears = new RendererModel(this);
		ears.setRotationPoint(0.0F, 10.0F, -0.9F);
		head.addChild(ears);

		right_ear = new RendererModel(this);
		right_ear.setRotationPoint(0.0F, 0.0F, 0.0F);
		ears.addChild(right_ear);
		right_ear.cubeList.add(new ModelBox(right_ear, 3, 23, -2.25F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));
		right_ear.cubeList.add(new ModelBox(right_ear, 22, 19, -3.0F, -14.0F, 0.0F, 1, 1, 1, 0.0F, false));
		right_ear.cubeList.add(new ModelBox(right_ear, 22, 6, -3.0F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));
		right_ear.cubeList.add(new ModelBox(right_ear, 22, 4, -4.0F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));

		left_ear = new RendererModel(this);
		left_ear.setRotationPoint(0.0F, 0.0F, 0.0F);
		ears.addChild(left_ear);
		left_ear.cubeList.add(new ModelBox(left_ear, 14, 21, 2.5F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));
		left_ear.cubeList.add(new ModelBox(left_ear, 4, 21, 1.75F, -14.0F, 0.0F, 1, 1, 1, 0.0F, false));
		left_ear.cubeList.add(new ModelBox(left_ear, 20, 11, 1.75F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));
		left_ear.cubeList.add(new ModelBox(left_ear, 19, 5, 0.75F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));

		arms = new RendererModel(this);
		arms.setRotationPoint(0.0F, 24.0F, 0.0F);

		left_arm = new RendererModel(this);
		left_arm.setRotationPoint(2.2F, -9.0F, 1.1F);
		arms.addChild(left_arm);

		left_shoulder = new RendererModel(this);
		left_shoulder.setRotationPoint(0.05F, 0.0F, -0.05F);
		left_arm.addChild(left_shoulder);
		left_shoulder.cubeList.add(new ModelBox(left_shoulder, 14, 2, -0.1F, 0.0F, -0.45F, 1, 3, 1, 0.0F, false));

		left_forearm = new RendererModel(this);
		left_forearm.setRotationPoint(-2.2F, 9.0F, -1.1F);
		left_arm.addChild(left_forearm);
		left_forearm.cubeList.add(new ModelBox(left_forearm, 19, 20, 2.15F, -6.25F, 0.6F, 1, 3, 1, 0.0F, false));

		right_arm = new RendererModel(this);
		right_arm.setRotationPoint(-2.8F, -9.0F, 1.1F);
		arms.addChild(right_arm);

		right_forearm = new RendererModel(this);
		right_forearm.setRotationPoint(2.8F, 9.0F, -1.1F);
		right_arm.addChild(right_forearm);
		right_forearm.cubeList.add(new ModelBox(right_forearm, 20, 0, -3.75F, -6.25F, 0.6F, 1, 3, 1, 0.0F, false));

		right_shoulder = new RendererModel(this);
		right_shoulder.setRotationPoint(2.8F, 9.0F, -1.1F);
		right_arm.addChild(right_shoulder);
		right_shoulder.cubeList.add(new ModelBox(right_shoulder, 0, 15, -3.75F, -9.0F, 0.6F, 1, 3, 1, 0.0F, false));

		legs = new RendererModel(this);
		legs.setRotationPoint(0.0F, 20.0F, 0.0F);

		right_leg = new RendererModel(this);
		right_leg.setRotationPoint(-2.5F, 0.0F, 1.0F);
		legs.addChild(right_leg);
		right_leg.cubeList.add(new ModelBox(right_leg, 10, 19, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

		right_foot = new RendererModel(this);
		right_foot.setRotationPoint(2.5F, 4.0F, -1.0F);
		right_leg.addChild(right_foot);
		right_foot.cubeList.add(new ModelBox(right_foot, 4, 18, -3.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

		left_leg = new RendererModel(this);
		left_leg.setRotationPoint(2.2F, 0.1F, 1.0F);
		legs.addChild(left_leg);
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 19, -0.5F, -0.1F, -0.5F, 1, 4, 1, 0.0F, false));

		left_foot = new RendererModel(this);
		left_foot.setRotationPoint(-2.2F, 3.9F, -1.0F);
		left_leg.addChild(left_foot);
		left_foot.cubeList.add(new ModelBox(left_foot, 6, 15, 1.65F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Goblin entity, float f, float f1, float f2, float f3, float f4, float f5) {
		torso.render(f5);
		head.render(f5);
		arms.render(f5);
		legs.render(f5);
	}
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

		@Override
		public void setRotationAngles(Goblin entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float ScaleFactor) 
		{
			this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4f * limbSwingAmount;
			this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4f * limbSwingAmount;
			
			this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4f * limbSwingAmount;
			this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4f * limbSwingAmount;
			
			this.head.rotateAngleY = netHeadYaw * 0.017453292f;
			this.head.rotateAngleX = headPitch * 0.017453292f;
		}
		
}
