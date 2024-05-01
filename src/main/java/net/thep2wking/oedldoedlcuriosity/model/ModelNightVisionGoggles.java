package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelNightVisionGoggles extends ModModelBaubleBase {
	ModelRenderer rotable = new ModelRenderer(this);
	ModelRenderer non_rotable = new ModelRenderer(this);

	public ModelNightVisionGoggles() {
		rotable.setRotationPoint(0, 24.5F, 0.5F);
		bipedHead.addChild(rotable);
		rotable.setTextureOffset(116, 16).addBox(-2, -29, -8.001F, 4, 2, 2, 0);
		rotable.setTextureOffset(100, 18).addBox(-2.913F, -28.5F, -8.27F, 1, 1, 2, -0.27F);
		rotable.setTextureOffset(110, 14).addBox(1.913F, -28.5F, -8.27F, 1, 1, 2, -0.27F);
		rotable.setTextureOffset(100, 12).addBox(1.913F, -28.5F, -7.73F, 1, 1, 2, -0.27F);
		rotable.setTextureOffset(110, 3).addBox(-2.913F, -28.5F, -7.73F, 1, 1, 2, -0.27F);
		rotable.setTextureOffset(120, 6).addBox(-0.5F, -29.3F, -8.25F, 1, 1, 2, -0.15F);
		rotable.setTextureOffset(118, 14).addBox(1, -28.5F, -10.2F, 1, 1, 1, -0.15F);
		rotable.setTextureOffset(104, 15).addBox(1, -28.5F, -9.9F, 1, 1, 1, -0.08F);
		rotable.setTextureOffset(100, 15).addBox(1, -28.5F, -9.5F, 1, 1, 1, 0.01F);
		rotable.setTextureOffset(114, 14).addBox(1, -28.5F, -8.75F, 1, 1, 1, 0.13F);
		rotable.setTextureOffset(114, 6).addBox(-2, -28.5F, -10.2F, 1, 1, 1, -0.15F);
		rotable.setTextureOffset(114, 3).addBox(-2, -28.5F, -9.9F, 1, 1, 1, -0.08F);
		rotable.setTextureOffset(114, 0).addBox(-2, -28.5F, -9.5F, 1, 1, 1, 0.01F);
		rotable.setTextureOffset(104, 12).addBox(-2, -28.5F, -8.75F, 1, 1, 1, 0.13F);
		rotable.setTextureOffset(120, 3).addBox(-0.5F, -29.3F, -8.4F, 1, 1, 2, -0.2F);
		rotable.setTextureOffset(110, 6).addBox(-0.5F, -29.3F, -6.85F, 1, 1, 1, -0.15F);
		rotable.setTextureOffset(104, 9).addBox(-2, -28.5F, -6.5F, 1, 1, 1, 0.13F);
		rotable.setTextureOffset(104, 6).addBox(-2, -28.5F, -5.5F, 1, 1, 1, 0);
		rotable.setTextureOffset(100, 6).addBox(1, -28.5F, -6.5F, 1, 1, 1, 0.13F);
		rotable.setTextureOffset(104, 3).addBox(1, -28.5F, -5.5F, 1, 1, 1, 0);

		non_rotable.setRotationPoint(0, 24.5F, 0.5F);
		bipedHead.addChild(non_rotable);
		non_rotable.setTextureOffset(110, 12).addBox(-4, -31, -4.75F, 8, 1, 1, 0);
		non_rotable.setTextureOffset(110, 10).addBox(-4, -31, 2.75F, 8, 1, 1, 0);
		non_rotable.setTextureOffset(110, 1).addBox(3.25F, -30.5F, -4.5F, 1, 1, 8, 0.001F);
		non_rotable.setTextureOffset(100, 9).addBox(-4.25F, -30.5F, -4.5F, 1, 1, 8, 0.001F);
		non_rotable.setTextureOffset(106, 18).addBox(-1, -31.999F, -4.75F, 2, 1, 1, 0);
		non_rotable.setTextureOffset(100, 21).addBox(-0.5F, -33, 2.75F, 1, 2, 1, 0);
		non_rotable.setTextureOffset(100, 0).addBox(-0.5F, -33.25F, -4.5F, 1, 1, 8, 0);
		non_rotable.setTextureOffset(104, 0).addBox(-0.5F, -31.5F, -5, 1, 1, 1, 0.15F);
		non_rotable.setTextureOffset(108, 21).addBox(-0.5F, -32.999F, -4.75F, 1, 1, 1, 0);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r1);
		setRotateAngle(cube_r1, -1.0908F, 0, 0);
		cube_r1.setTextureOffset(117, 20).addBox(-0.5F, -10.465F, -30.28F, 1, 3, 1, -0.25F);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r2);
		setRotateAngle(cube_r2, -0.2618F, 0, 0);
		cube_r2.setTextureOffset(104, 21).addBox(-0.5F, -27.6F, -14.85F, 1, 2, 1, -0.25F);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r3);
		setRotateAngle(cube_r3, 0, 0, 0.6981F);
		cube_r3.setTextureOffset(112, 18).addBox(-18.47F, -22.555F, -7.999F, 1, 1, 2, 0);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0, 0, 0);
		rotable.addChild(cube_r4);
		setRotateAngle(cube_r4, 0, 0, -0.6981F);
		cube_r4.setTextureOffset(120, 0).addBox(17.47F, -22.555F, -7.999F, 1, 1, 2, 0);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0, -56, -1);
		rotable.addChild(cube_r5);
		setRotateAngle(cube_r5, 0, 0, -0.8727F);
		cube_r5.setTextureOffset(100, 0).addBox(-20.93F, 19.17F, -7, 1, 1, 2, 0);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0, -56, -1);
		rotable.addChild(cube_r6);
		setRotateAngle(cube_r6, 0, 0, 0.8727F);
		cube_r6.setTextureOffset(100, 3).addBox(19.93F, 19.17F, -7, 1, 1, 2, 0);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0, 0, -1);
		rotable.addChild(cube_r7);
		setRotateAngle(cube_r7, 0, 0, 0.8727F);
		cube_r7.setTextureOffset(100, 9).addBox(-20.93F, -20.17F, -7, 1, 1, 2, 0);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0, 0, -1);
		rotable.addChild(cube_r8);
		setRotateAngle(cube_r8, 0, 0, -0.8727F);
		cube_r8.setTextureOffset(110, 0).addBox(19.93F, -20.17F, -7, 1, 1, 2, 0);
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
			this.rotable.setRotationPoint(0, 20.0F, -21.0F);
		} else {
			this.rotable.rotateAngleX = 0;
			this.rotable.setRotationPoint(0, 24.5F, 0.5F);
		}
	}
}