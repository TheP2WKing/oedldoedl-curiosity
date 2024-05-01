package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelHeatVisionGoggles extends ModModelBaubleBase {
	ModelRenderer rotable = new ModelRenderer(this);
	ModelRenderer non_rotable = new ModelRenderer(this);

	public ModelHeatVisionGoggles() {
		rotable.setRotationPoint(0, 24.5F, 0.5F);
		bipedHead.addChild(rotable);

		non_rotable.setRotationPoint(0, 24.5F, 0.5F);
		bipedHead.addChild(non_rotable);
		non_rotable.setTextureOffset(106, 12).addBox(-4, -31, -4.75F, 8, 1, 1, 0);
		non_rotable.setTextureOffset(106, 10).addBox(-4, -31, 2.75F, 8, 1, 1, 0);
		non_rotable.setTextureOffset(106, 1).addBox(3.25F, -30.5F, -4.501F, 1, 1, 8, 0.001F);
		non_rotable.setTextureOffset(96, 9).addBox(-4.25F, -30.5F, -4.501F, 1, 1, 8, 0.001F);
		non_rotable.setTextureOffset(106, 14).addBox(-1, -31.999F, -4.75F, 2, 1, 1, 0);
		non_rotable.setTextureOffset(110, 19).addBox(-0.5F, -33, 2.75F, 1, 2, 1, 0);
		non_rotable.setTextureOffset(96, 0).addBox(-0.5F, -33.25F, -4.5F, 1, 1, 8, 0);
		non_rotable.setTextureOffset(119, 25).addBox(-0.5F, -31.5F, -5, 1, 1, 1, 0.15F);
		non_rotable.setTextureOffset(100, 26).addBox(-0.5F, -32.999F, -4.75F, 1, 1, 1, 0);
		
		ModelRenderer left = new ModelRenderer(this);
		left.setRotationPoint(4, 0, -1);
		rotable.addChild(left);
		setRotateAngle(left, 0, -0.1396F, 0);
		left.setTextureOffset(115, 25).addBox(-2.1F, -28.5F, -7.8F, 1, 1, 1, 0.05F);
		left.setTextureOffset(111, 25).addBox(-2.1F, -28.5F, -7.2F, 1, 1, 1, 0.13F);
		left.setTextureOffset(96, 13).addBox(-3.1F, -28.501F, -4.3F, 2, 1, 1, 0.05F);
		left.setTextureOffset(107, 25).addBox(-2.1F, -28.5F, -6.5F, 1, 1, 1, 0.22F);
		left.setTextureOffset(103, 25).addBox(-2.1F, -28.501F, -4.9F, 1, 1, 1, 0.1F);
		left.setTextureOffset(120, 20).addBox(-2.1F, -28.5F, -5.3F, 1, 1, 1, 0.18F);

		ModelRenderer left2 = new ModelRenderer(this);
		left2.setRotationPoint(0, 0, -1);
		rotable.addChild(left2);
		setRotateAngle(left2, 0, 0.0175F, 0);
		left2.setTextureOffset(120, 18).addBox(1.1F, -28.5F, -8, 1, 1, 1, 0.05F);
		left2.setTextureOffset(100, 24).addBox(1.1F, -28.5F, -7.4F, 1, 1, 1, 0.13F);
		left2.setTextureOffset(96, 11).addBox(1.1F, -28.5F, -4.5F, 2, 1, 1, 0.05F);
		left2.setTextureOffset(119, 23).addBox(1.1F, -28.5F, -6.7F, 1, 1, 1, 0.22F);
		left2.setTextureOffset(106, 6).addBox(1.1F, -28.5F, -5.1F, 2, 1, 1, 0.1F);
		left2.setTextureOffset(106, 4).addBox(1.1F, -28.501F, -5.5F, 2, 1, 1, 0.18F);

		ModelRenderer right3 = new ModelRenderer(this);
		right3.setRotationPoint(-4, 0, -1);
		rotable.addChild(right3);
		setRotateAngle(right3, 0, 0.1222F, 0);
		right3.setTextureOffset(115, 23).addBox(1, -28.5F, -7.8F, 1, 1, 1, 0.05F);
		right3.setTextureOffset(111, 23).addBox(1, -28.5F, -7.2F, 1, 1, 1, 0.13F);
		right3.setTextureOffset(106, 2).addBox(1, -28.501F, -4.3F, 2, 1, 1, 0.05F);
		right3.setTextureOffset(107, 23).addBox(1, -28.5F, -6.5F, 1, 1, 1, 0.22F);
		right3.setTextureOffset(103, 23).addBox(1, -28.5F, -4.9F, 1, 1, 1, 0.1F);
		right3.setTextureOffset(100, 22).addBox(1, -28.5F, -5.3F, 1, 1, 1, 0.18F);

		ModelRenderer right4 = new ModelRenderer(this);
		right4.setRotationPoint(0, 0, -1);
		rotable.addChild(right4);
		setRotateAngle(right4, 0, -0.0175F, 0);
		right4.setTextureOffset(100, 15).addBox(-2, -28.5F, -8, 1, 1, 1, 0.05F);
		right4.setTextureOffset(96, 15).addBox(-2, -28.5F, -7.4F, 1, 1, 1, 0.13F);
		right4.setTextureOffset(106, 0).addBox(-3, -28.5F, -4.5F, 2, 1, 1, 0.05F);
		right4.setTextureOffset(100, 3).addBox(-2, -28.5F, -6.7F, 1, 1, 1, 0.22F);
		right4.setTextureOffset(96, 9).addBox(-3, -28.501F, -5.1F, 2, 1, 1, 0.1F);
		right4.setTextureOffset(96, 6).addBox(-3, -28.501F, -5.5F, 2, 1, 1, 0.18F);

		rotable.setTextureOffset(103, 19).addBox(-3.75F, -29.65F, -8.25F, 2, 1, 3, -0.3F);
		rotable.setTextureOffset(111, 15).addBox(1.75F, -29.65F, -8.25F, 2, 1, 3, -0.3F);
		rotable.setTextureOffset(118, 16).addBox(0, -29.65F, -7, 4, 1, 1, -0.22F);
		rotable.setTextureOffset(118, 14).addBox(-4, -29.65F, -7, 4, 1, 1, -0.22F);
		rotable.setTextureOffset(96, 0).addBox(-1, -29.74F, -8, 2, 1, 2, -0.12F);
		rotable.setTextureOffset(96, 3).addBox(-0.5F, -30, -8.15F, 1, 1, 2, -0.17F);
		rotable.setTextureOffset(103, 27).addBox(-3.75F, -29.15F, -7, 3, 1, 1, -0.22F);
		rotable.setTextureOffset(111, 27).addBox(0.75F, -29.15F, -7, 3, 1, 1, -0.22F);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2, 0, 0);
		rotable.addChild(cube_r1);
		setRotateAngle(cube_r1, 0, -0.0349F, 0);
		cube_r1.setTextureOffset(116, 0).addBox(-1.25F, -29, -6.85F, 3, 2, 2, -0.26F);
		
		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2, 0, 0);
		rotable.addChild(cube_r2);
		setRotateAngle(cube_r2, 0, 0.0349F, 0);
		cube_r2.setTextureOffset(116, 4).addBox(-1.75F, -29, -6.85F, 3, 2, 2, -0.26F);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r3);
		setRotateAngle(cube_r3, 0, 0.0873F, 0);
		cube_r3.setTextureOffset(96, 18).addBox(1.05F, -29.66F, -8.05F, 2, 1, 3, -0.3F);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r4);
		setRotateAngle(cube_r4, 0, -0.0873F, 0);
		cube_r4.setTextureOffset(113, 19).addBox(-3.05F, -29.66F, -8.05F, 2, 1, 3, -0.3F);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r5);
		setRotateAngle(cube_r5, -1.0908F, 0, 0);
		cube_r5.setTextureOffset(96, 22).addBox(-0.5F, -10.465F, -30.28F, 1, 3, 1, -0.25F);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r6);
		setRotateAngle(cube_r6, -0.2618F, 0, 0);
		cube_r6.setTextureOffset(96, 26).addBox(-0.5F, -27.6F, -14.85F, 1, 1, 1, -0.25F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		non_rotable.render(scale);
		rotable.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float partialTick, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, partialTick, netHeadYaw, headPitch, scaleFactor, entityIn);
		if (entityIn.isSneaking()) {
			this.rotable.rotateAngleX = (float) -Math.sin(Math.toRadians(45));
			this.rotable.setRotationPoint(0, 20, -21);
		} else {
			this.rotable.rotateAngleX = 0;
			this.rotable.setRotationPoint(0, 24.5F, 0.5F);
		}
	}
}