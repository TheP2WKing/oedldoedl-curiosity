package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelAnimatedWings extends ModModelBaubleBase {
	ModelRenderer WingBaseRight = new ModelRenderer(this);
	ModelRenderer WingEdgeRight = new ModelRenderer(this);
	ModelRenderer WingInsetRight = new ModelRenderer(this);
	ModelRenderer WingCenterRight = new ModelRenderer(this);
	ModelRenderer WingFlangeRight = new ModelRenderer(this);
	ModelRenderer WingAuxRight = new ModelRenderer(this);
	ModelRenderer WingBaseLeft = new ModelRenderer(this);
	ModelRenderer WingEdgeLeft = new ModelRenderer(this);
	ModelRenderer WingInsetLeft = new ModelRenderer(this);
	ModelRenderer WingCenterLeft = new ModelRenderer(this);
	ModelRenderer WingFlangeLeft = new ModelRenderer(this);
	ModelRenderer WingAuxLeft = new ModelRenderer(this);

	public ModelAnimatedWings(float modelSize) {
		super(modelSize);

		bipedBody.addChild(WingBaseRight);
		bipedBody.addChild(WingBaseLeft);

		WingBaseRight.setTextureOffset(64, 9)
				.addBox(-0.5F, -1F, 0F, 1, 2, 10)
				.setRotationPoint(-1F, 1F, 0F);
		setRotateAngle(WingBaseRight, 0.5235988F, -0.5235988F, 0F);

		WingEdgeRight.setTextureOffset(64, 21)
				.addBox(0F, 0F, -2F, 1, 9, 2)
				.setRotationPoint(-0.502F, -1F, 10F);
		setRotateAngle(WingEdgeRight, 0.5235988F, 0F, 0F);

		WingInsetRight.setTextureOffset(70, 21)
				.addBox(0F, 0F, -1F, 1, 9, 2)
				.setRotationPoint(-0.504F, 0F, 7.8F);
		setRotateAngle(WingInsetRight, 0.3490659F, 0F, 0F);

		WingCenterRight.setTextureOffset(76, 21)
				.addBox(0F, 0F, -1F, 1, 9, 2)
				.setRotationPoint(-0.506F, 0.3F, 6.3F);
		setRotateAngle(WingCenterRight, 0.1745329F, 0F, 0F);

		WingFlangeRight.setTextureOffset(82, 21)
				.addBox(0F, 0F, -1F, 1, 8, 2)
				.setRotationPoint(-0.508F, 0.3F, 5.1F);
		setRotateAngle(WingFlangeRight, 0F, 0F, 0F);

		WingAuxRight.setTextureOffset(88, 21)
				.addBox(0F, 0F, -1F, 1, 7, 2)
				.setRotationPoint(-0.51F, 0.1F, 4F);
		setRotateAngle(WingAuxRight, -0.1745329F, 0F, 0F);

		WingBaseRight.addChild(WingEdgeRight);
		WingBaseRight.addChild(WingInsetRight);
		WingBaseRight.addChild(WingCenterRight);
		WingBaseRight.addChild(WingFlangeRight);
		WingBaseRight.addChild(WingAuxRight);

		WingBaseLeft.setTextureOffset(106, 9)
				.addBox(-0.5F, -1F, 0F, 1, 2, 10)
				.setRotationPoint(1F, 1F, 0F);
		setRotateAngle(WingBaseLeft, 0.5235988F, 0.5235988F, 0F);

		WingEdgeLeft.setTextureOffset(122, 21)
				.addBox(0F, 0F, -2F, 1, 9, 2)
				.setRotationPoint(-0.502F, -1F, 10F);
		setRotateAngle(WingEdgeLeft, 0.5235988F, 0F, 0F);

		WingInsetLeft.setTextureOffset(116, 21)
				.addBox(0F, 0F, -1F, 1, 9, 2)
				.setRotationPoint(-0.504F, 0F, 7.8F);
		setRotateAngle(WingInsetLeft, 0.3490659F, 0F, 0F);

		WingCenterLeft.setTextureOffset(110, 21)
				.addBox(0F, 0F, -1F, 1, 9, 2)
				.setRotationPoint(-0.506F, 0.3F, 6.3F);
		setRotateAngle(WingCenterLeft, 0.1745329F, 0F, 0F);

		WingFlangeLeft.setTextureOffset(104, 21)
				.addBox(0F, 0F, -1F, 1, 8, 2)
				.setRotationPoint(-0.508F, 0.3F, 5.1F);
		setRotateAngle(WingFlangeLeft, 0F, 0F, 0F);

		WingAuxLeft.setTextureOffset(98, 21)
				.addBox(0F, 0F, -1F, 1, 7, 2)
				.setRotationPoint(-0.51F, 0.1F, 4F);
		setRotateAngle(WingAuxLeft, -0.1745329F, 0F, 0F);

		WingBaseLeft.addChild(WingEdgeLeft);
		WingBaseLeft.addChild(WingInsetLeft);
		WingBaseLeft.addChild(WingCenterLeft);
		WingBaseLeft.addChild(WingFlangeLeft);
		WingBaseLeft.addChild(WingAuxLeft);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		WingBaseRight.render(f5);
		WingBaseLeft.render(f5);
	}

	public void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float partialTick, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, partialTick, netHeadYaw, headPitch, scaleFactor, entityIn);
		if (this.isRiding) {
			float slow = 10F;
			this.WingBaseRight.rotateAngleX = MathHelper.sin(partialTick / slow) / 10f + 0.9F;
			this.WingBaseRight.rotateAngleY = MathHelper.sin(partialTick / slow) / 5 - 0.7f;
			this.WingBaseRight.rotateAngleZ = MathHelper.sin(partialTick / slow) / 2.5f - 0.3f;

			this.WingBaseLeft.rotateAngleX = MathHelper.sin(partialTick / slow) / 10 + 0.9F;
			this.WingBaseLeft.rotateAngleY = -MathHelper.sin(partialTick / slow) / 5 + 0.7f;
			this.WingBaseLeft.rotateAngleZ = -MathHelper.sin(partialTick / slow) / 2.5f + 0.3f;
		} else if (entityIn.isInWater()) {
			float slow = 10f;
			this.WingBaseRight.rotateAngleX = MathHelper.sin(partialTick / slow) / 15f + 0.5235988F;
			this.WingBaseRight.rotateAngleY = MathHelper.sin(partialTick / slow) / 15f - 0.8f;
			this.WingBaseRight.rotateAngleZ = MathHelper.sin(partialTick / slow) / 15f - 0.8f;

			this.WingBaseLeft.rotateAngleX = MathHelper.sin(partialTick / slow) / 15f + 0.5235988F;
			this.WingBaseLeft.rotateAngleY = -MathHelper.sin(partialTick / slow) / 15f + 0.8f;
			this.WingBaseLeft.rotateAngleZ = -MathHelper.sin(partialTick / slow) / 15f + 0.8f;
		} else if (entityIn.getPosition().getY() - entityIn.prevPosY < 0f && entityIn.fallDistance > 4.0) {
			float slow = 10f;
			this.WingBaseRight.rotateAngleX = MathHelper.sin(partialTick / slow) / 15f + 0.7F;
			this.WingBaseRight.rotateAngleY = MathHelper.sin(partialTick / slow) / 15f - 0.8f;
			this.WingBaseRight.rotateAngleZ = MathHelper.sin(partialTick / slow) / 15f - 0.3f;

			this.WingBaseLeft.rotateAngleX = MathHelper.sin(partialTick / slow) / 15f + 0.7F;
			this.WingBaseLeft.rotateAngleY = -MathHelper.sin(partialTick / slow) / 15f + 0.8f;
			this.WingBaseLeft.rotateAngleZ = -MathHelper.sin(partialTick / slow) / 15f + 0.3f;
		} else {
			float slow = 10f;
			// if (entityIn.getMotion().x != 0 || entityIn.getMotion().z != 0) slow = 6f;
			this.WingBaseRight.rotateAngleX = MathHelper.sin(partialTick / slow) / 5f + 0.5235988F;
			this.WingBaseRight.rotateAngleY = MathHelper.sin(partialTick / slow) / 3 - 0.6f;
			this.WingBaseRight.rotateAngleZ = MathHelper.sin(partialTick / slow) / 1.5f - 0.3f;

			this.WingBaseLeft.rotateAngleX = MathHelper.sin(partialTick / slow) / 5f + 0.5235988F;
			this.WingBaseLeft.rotateAngleY = -MathHelper.sin(partialTick / slow) / 3 + 0.6f;
			this.WingBaseLeft.rotateAngleZ = -MathHelper.sin(partialTick / slow) / 1.5f + 0.3f;
		}

		if (this.isSneak) {
			this.WingBaseRight.rotateAngleX += 0.4f;
			this.WingBaseLeft.rotateAngleX += 0.4f;
		}
	}
}