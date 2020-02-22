package com.github.thebenknee.moundmod.client.models;

import com.github.thebenknee.moundmod.entities.GoblinWarlord;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoblinWarlordModel extends EntityModel<GoblinWarlord> 
{
	private final RendererModel bodu;
	private final RendererModel bone2;
	private final RendererModel bone;
	private final RendererModel bone3;
	private final RendererModel bone4;
	private final RendererModel bone5;
	private final RendererModel bone6;
	private final RendererModel bone7;
	private final RendererModel bone8;
	private final RendererModel bone9;
	private final RendererModel bone10;
	private final RendererModel bone11;
	private final RendererModel bone12;
	private final RendererModel bone13;
	private final RendererModel bone14;
	private final RendererModel bone15;
	private final RendererModel bone17;
	private final RendererModel bone16;
	private final RendererModel bone18;

	public GoblinWarlordModel() {
		textureWidth = 32;
		textureHeight = 32;

		bodu = new RendererModel(this);
		bodu.setRotationPoint(-1.0F, 22.0F, 3.0F);
		bodu.cubeList.add(new ModelBox(bodu, 19, 19, 2.0F, -1.0F, -3.0F, 1, 3, 1, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -2.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -8.0F, -16.0F, 8.0F, 16, 16, 16, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 12, -2.0F, -4.0F, 1.0F, 4, 1, 3, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 7, -2.0F, -5.0F, -1.0F, 4, 2, 3, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 13, 15, -1.0F, -11.0F, 0.0F, 2, 6, 1, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -2.0F, -14.0F, -2.0F, 4, 3, 4, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 7, 19, -1.0F, -12.0F, -3.0F, 2, 1, 1, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 12, 0, -1.0F, -11.0F, -3.0F, 2, 1, 3, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 0, 16, -3.0F, -5.0F, -3.0F, 1, 1, 3, 0.0F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 5, 16, -3.0F, -5.0F, -5.0F, 1, 1, 2, 0.0F, false));

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 13, 4, 2.0F, -5.0F, -3.0F, 1, 1, 3, 0.0F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 14, 8, 2.0F, -5.0F, -5.0F, 1, 1, 2, 0.0F, false));

		bone14 = new RendererModel(this);
		bone14.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 11, 11, -2.0F, -4.0F, 4.0F, 4, 1, 3, 0.0F, false));

		bone15 = new RendererModel(this);
		bone15.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 18, 8, -1.0F, -9.0F, 1.0F, 2, 1, 1, 0.0F, false));

		bone17 = new RendererModel(this);
		bone17.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 18, 4, -1.0F, -7.0F, 1.0F, 2, 1, 1, 0.0F, false));

		bone16 = new RendererModel(this);
		bone16.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 9, 16, -3.0F, -13.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone18 = new RendererModel(this);
		bone18.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 11, 8, 2.0F, -13.0F, -1.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(GoblinWarlord entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bodu.render(f5);
		bone2.render(f5);
		bone.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
		bone6.render(f5);
		bone7.render(f5);
		bone8.render(f5);
		bone9.render(f5);
		bone10.render(f5);
		bone11.render(f5);
		bone12.render(f5);
		bone13.render(f5);
		bone14.render(f5);
		bone15.render(f5);
		bone17.render(f5);
		bone16.render(f5);
		bone18.render(f5);
	}
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
		
}
