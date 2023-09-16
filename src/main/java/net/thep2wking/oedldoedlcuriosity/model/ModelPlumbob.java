package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelPlumbob extends ModModelBaubleBase {
	ModelRenderer bb_main = new ModelRenderer(this);

	public ModelPlumbob(float modelSize) {
		super(modelSize);
		bipedHead.addChild(bb_main);
		bb_main.setRotationPoint(0, 24, 0);
		bb_main.setTextureOffset(124, 9).addBox(-0.5F, -44.75F, -0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 4).addBox(-0.5F, -37.5F, -0.5F, 1, 1, 1, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1, -3, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, 0.3491F, -0.6981F, -0.48F);
		cube_r1.setTextureOffset(109, 0).addBox(10.55F, -36.25F, 1, 1, 4, 1, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1, 3, 0);
		bb_main.addChild(cube_r2);
		setRotateAngle(cube_r2, -0.3491F, -0.6981F, 0.48F);
		cube_r2.setTextureOffset(113, 0).addBox(-18.15F, -43.85F, -1, 1, 4, 1, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1, -3, 0);
		bb_main.addChild(cube_r3);
		setRotateAngle(cube_r3, 0.3491F, 0.6981F, 0.48F);
		cube_r3.setTextureOffset(109, 5).addBox(-11.55F, -36.25F, 1, 1, 4, 1, false);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1, 3, 0);
		bb_main.addChild(cube_r4);
		setRotateAngle(cube_r4, -0.3491F, 0.6981F, -0.48F);
		cube_r4.setTextureOffset(113, 5).addBox(17.15F, -43.85F, -1, 1, 4, 1, false);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1, 3, 0);
		bb_main.addChild(cube_r5);
		setRotateAngle(cube_r5, 0.3491F, 0.6981F, 0.48F);
		cube_r5.setTextureOffset(117, 0).addBox(-18.15F, -43.85F, 0, 1, 4, 1, false);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1, -3, 0);
		bb_main.addChild(cube_r6);
		setRotateAngle(cube_r6, -0.3491F, 0.6981F, -0.48F);
		cube_r6.setTextureOffset(117, 5).addBox(10.55F, -36.25F, -2, 1, 4, 1, false);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1, -3, 0);
		bb_main.addChild(cube_r7);
		setRotateAngle(cube_r7, -0.3491F, -0.6981F, 0.48F);
		cube_r7.setTextureOffset(109, 10).addBox(-11.55F, -36.25F, -2, 1, 4, 1, false);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1, 3, 0);
		bb_main.addChild(cube_r8);
		setRotateAngle(cube_r8, 0.3491F, -0.6981F, -0.48F);
		cube_r8.setTextureOffset(113, 10).addBox(17.15F, -43.85F, 0, 1, 4, 1, false);

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1, 3, 0);
		bb_main.addChild(cube_r9);
		setRotateAngle(cube_r9, 0, 0, 0.3927F);
		cube_r9.setTextureOffset(117, 10).addBox(-19.6F, -43.1F, -0.51F, 1, 4, 1, false);

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1, -3, 0);
		bb_main.addChild(cube_r10);
		setRotateAngle(cube_r10, 0, 0, -0.3927F);
		cube_r10.setTextureOffset(121, 0).addBox(11.5F, -36, -0.5F, 1, 4, 1, false);

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1, 3, 0);
		bb_main.addChild(cube_r11);
		setRotateAngle(cube_r11, 0, 0, -0.3927F);
		cube_r11.setTextureOffset(121, 5).addBox(18.6F, -43.1F, -0.51F, 1, 4, 1, false);

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1, -3, 0);
		bb_main.addChild(cube_r12);
		setRotateAngle(cube_r12, 0, 0, 0.3927F);
		cube_r12.setTextureOffset(121, 10).addBox(-12.5F, -36, -0.5F, 1, 4, 1, false);

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0, -3, -1);
		bb_main.addChild(cube_r13);
		setRotateAngle(cube_r13, -0.3927F, 0, 0);
		cube_r13.setTextureOffset(109, 15).addBox(-0.5F, -36, -12.5F, 1, 4, 1, false);

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0, 3, -1);
		bb_main.addChild(cube_r14);
		setRotateAngle(cube_r14, 0.3927F, 0, 0);
		cube_r14.setTextureOffset(113, 15).addBox(-0.49F, -43.1F, 18.6F, 1, 4, 1, false);

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0, 3, 1);
		bb_main.addChild(cube_r15);
		setRotateAngle(cube_r15, -0.3927F, 0, 0);
		cube_r15.setTextureOffset(117, 15).addBox(-0.49F, -43.1F, -19.6F, 1, 4, 1, false);

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0, -3, 1);
		bb_main.addChild(cube_r16);
		setRotateAngle(cube_r16, 0.3927F, 0, 0);
		cube_r16.setTextureOffset(121, 15).addBox(-0.5F, -36, 11.5F, 1, 4, 1, false);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		bb_main.render(f5);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float partialTick, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, partialTick, netHeadYaw, headPitch, scaleFactor, entityIn);
		float slow = 30f;
		this.bb_main.rotateAngleY = partialTick / slow;
	}
}