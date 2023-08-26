package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelFakeArrow extends ModModelBaubleBase {
	public ModelFakeArrow(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bipedHead.addChild(bb_main);
		bb_main.setRotationPoint(0, 24, 0);
		bb_main.setTextureOffset(90, 0).addBox(-9, -30, -0.5F, 18, 1, 1, true);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, 0, -0.1309F, 0);
		cube_r1.setTextureOffset(90, 12).addBox(6, -29.99F, -2, 2, 1, 1, true);
		cube_r1.setTextureOffset(97, 7).addBox(-9.5F, -30, -0.75F, 2, 1, 1, true);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r2);
		setRotateAngle(cube_r2, 0, 0.1309F, 0);
		cube_r2.setTextureOffset(97, 5).addBox(-9.5F, -30, -0.25F, 2, 1, 1, true);
		cube_r2.setTextureOffset(95, 11).addBox(6, -29.99F, 1, 2, 1, 1, true);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r3);
		setRotateAngle(cube_r3, 0, 0, -0.1309F);
		cube_r3.setTextureOffset(90, 8).addBox(-5.75F, -29.5F, -0.5F, 2, 1, 1, true);
		cube_r3.setTextureOffset(90, 10).addBox(9.75F, -28.25F, -0.51F, 2, 1, 1, true);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r4);
		setRotateAngle(cube_r4, 0, 0, 0.1309F);
		cube_r4.setTextureOffset(95, 9).addBox(-13.5F, -30, -0.5F, 2, 1, 1, true);
		cube_r4.setTextureOffset(100, 10).addBox(2, -31.25F, -0.49F, 2, 1, 1, true);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r5);
		setRotateAngle(cube_r5, 0, -0.2182F, 0);
		cube_r5.setTextureOffset(90, 2).addBox(-8.5F, -29.99F, 0.5F, 3, 1, 1, true);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r6);
		setRotateAngle(cube_r6, 0, 0, -0.2182F);
		cube_r6.setTextureOffset(90, 4).addBox(-2.25F, -30.25F, -0.51F, 3, 1, 1, true);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r7);
		setRotateAngle(cube_r7, 0, 0.2182F, 0);
		cube_r7.setTextureOffset(90, 6).addBox(-8.5F, -29.99F, -1.5F, 3, 1, 1, true);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r8);
		setRotateAngle(cube_r8, 0, 0, 0.2182F);
		cube_r8.setTextureOffset(97, 3).addBox(-15, -28.25F, -0.49F, 3, 1, 1, true);
	}
}