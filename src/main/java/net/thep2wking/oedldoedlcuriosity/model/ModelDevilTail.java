package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelDevilTail extends ModModelBaubleBase {
	public ModelDevilTail(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 22.5F, 0);
		bipedBody.addChild(bb_main);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, 2.2253F, -1.5708F, 0.0873F);
		cube_r1.setTextureOffset(111, 8).addBox(11.8F, 7, 6.5F, 1, 3, 1, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r2);
		setRotateAngle(cube_r2, 2.0508F, -1.0036F, 0.0873F);
		cube_r2.setTextureOffset(122, 8).addBox(9.3F, 9.6F, 4.6F, 1, 2, 1, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r3);
		setRotateAngle(cube_r3, 1.789F, -0.6109F, 0.0873F);
		cube_r3.setTextureOffset(121, 4).addBox(6.1F, 8.6F, 6.3F, 1, 3, 1, false);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r4);
		setRotateAngle(cube_r4, -0.3927F, -1.8326F, 0);
		cube_r4.setTextureOffset(124, 3).addBox(12, -15.5F, -5.7F, 1, 1, 1, false);
		cube_r4.setTextureOffset(111, 6).addBox(11, -14.5F, -5.7F, 3, 1, 1, false);
		cube_r4.setTextureOffset(111, 4).addBox(10.5F, -13.5F, -5.7F, 4, 1, 1, false);
		cube_r4.setTextureOffset(111, 0).addBox(10, -12.5F, -5.7F, 5, 1, 1, false);
		cube_r4.setTextureOffset(111, 2).addBox(10, -11.5F, -5.7F, 5, 1, 1, false);
		cube_r4.setTextureOffset(124, 13).addBox(10.5F, -10.5F, -5.7F, 1, 1, 1, false);
		cube_r4.setTextureOffset(111, 14).addBox(13.5F, -10.5F, -5.7F, 1, 1, 1, false);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r5);
		setRotateAngle(cube_r5, 1.1345F, -0.1745F, 0.0873F);
		cube_r5.setTextureOffset(121, 11).addBox(2.5F, 2.9F, 11.2F, 1, 2, 1, false);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r6);
		setRotateAngle(cube_r6, 1.1781F, 0, -0.5672F);
		cube_r6.setTextureOffset(123, 0).addBox(6.5F, 3.2F, 8.4F, 1, 2, 1, false);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r7);
		setRotateAngle(cube_r7, 0.7854F, 0, -0.829F);
		cube_r7.setTextureOffset(118, 13).addBox(8.2F, -0.8F, 7.6F, 1, 2, 1, false);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r8);
		setRotateAngle(cube_r8, 0.5672F, 0, -0.4363F);
		cube_r8.setTextureOffset(118, 7).addBox(5.2F, -8.6F, 8.8F, 1, 4, 1, false);

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r9);
		setRotateAngle(cube_r9, 0.8727F, 0, 0);
		cube_r9.setTextureOffset(114, 11).addBox(-0.5F, -9, 12, 1, 3, 1, false);
	}
}