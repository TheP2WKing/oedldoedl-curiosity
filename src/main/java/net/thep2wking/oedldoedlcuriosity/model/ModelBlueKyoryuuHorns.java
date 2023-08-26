package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelBlueKyoryuuHorns extends ModModelBaubleBase {
	public ModelBlueKyoryuuHorns(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedHead.addChild(bb_main);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, 0.7418F, 0, 0);
		cube_r1.setTextureOffset(104, 0).addBox(-0.5F, -23.9F, 26.75F, 1, 3, 1, false);
		cube_r1.setTextureOffset(110, 12).addBox(-0.5F, -34.7F, 17.3F, 1, 6, 1, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r2);
		setRotateAngle(cube_r2, 1.3963F, 0, 0);
		cube_r2.setTextureOffset(109, 8).addBox(-0.5F, -2.4F, 29, 1, 1, 3, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r3);
		setRotateAngle(cube_r3, 1.6144F, 0.0436F, 0.0436F);
		cube_r3.setTextureOffset(122, 3).addBox(-2.3F, 6.6F, 30.7F, 1, 1, 1, false);

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r4);
		setRotateAngle(cube_r4, 0.6545F, 0.0873F, 0);
		cube_r4.setTextureOffset(104, 6).addBox(-1.2F, -22.8F, 20.8F, 1, 2, 3, false);

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r5);
		setRotateAngle(cube_r5, 1.309F, 0, 0.0436F);
		cube_r5.setTextureOffset(110, 0).addBox(-2.1F, -3.4F, 32, 1, 1, 2, false);

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r6);
		setRotateAngle(cube_r6, 1.6144F, -0.0436F, -0.0436F);
		cube_r6.setTextureOffset(107, 19).addBox(1.3F, 6.6F, 30.7F, 1, 1, 1, false);

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r7);
		setRotateAngle(cube_r7, 1.309F, 0, -0.0436F);
		cube_r7.setTextureOffset(114, 8).addBox(1.1F, -3.4F, 32, 1, 1, 2, false);

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r8);
		setRotateAngle(cube_r8, 0.6545F, -0.0873F, 0);
		cube_r8.setTextureOffset(111, 3).addBox(0.2F, -22.8F, 20.8F, 1, 2, 3, false);

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r9);
		setRotateAngle(cube_r9, 0.2182F, 0, 0);
		cube_r9.setTextureOffset(123, 5).addBox(-0.5F, -30.25F, 13.2F, 1, 1, 1, false);

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r10);
		setRotateAngle(cube_r10, 0.5672F, 0, 0);
		cube_r10.setTextureOffset(120, 0).addBox(-0.5F, -25.55F, 22.7F, 1, 2, 1, false);

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r11);
		setRotateAngle(cube_r11, 0.5236F, 0, 0);
		cube_r11.setTextureOffset(117, 16).addBox(-0.5F, -29, 21, 1, 3, 1, false);
		cube_r11.setTextureOffset(120, 6).addBox(-0.5F, -37.6F, 9.36F, 1, 4, 1, false);

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r12);
		setRotateAngle(cube_r12, 0.6981F, -0.0873F, 0);
		cube_r12.setTextureOffset(104, 17).addBox(-1.3F, -32.6F, 15.5F, 1, 2, 1, false);

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r13);
		setRotateAngle(cube_r13, 0.9599F, -0.0873F, 0);
		cube_r13.setTextureOffset(121, 15).addBox(-1.3F, -22.6F, 23.2F, 1, 2, 1, false);

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r14);
		setRotateAngle(cube_r14, 1.0908F, -0.0436F, 0);
		cube_r14.setTextureOffset(116, 0).addBox(-1, -22.6F, 25.9F, 1, 4, 1, false);

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r15);
		setRotateAngle(cube_r15, 0.2618F, 0, 0);
		cube_r15.setTextureOffset(114, 12).addBox(-0.5F, -33.4F, 12.8F, 1, 4, 1, false);

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r16);
		setRotateAngle(cube_r16, 1.0036F, 0, 0);
		cube_r16.setTextureOffset(104, 20).addBox(-0.5F, -12.9F, 26.2F, 1, 1, 1, false);

		ModelRenderer cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r17);
		setRotateAngle(cube_r17, 0.6545F, 0, 0);
		cube_r17.setTextureOffset(104, 0).addBox(-0.5F, -22.5F, 21.2F, 1, 2, 4, false);

		ModelRenderer cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r18);
		setRotateAngle(cube_r18, 0.829F, 0, 0);
		cube_r18.setTextureOffset(124, 0).addBox(-0.5F, -19.1F, 25.6F, 1, 1, 1, false);

		ModelRenderer cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r19);
		setRotateAngle(cube_r19, 0.48F, 0, 0);
		cube_r19.setTextureOffset(118, 3).addBox(-0.5F, -27, 18.3F, 1, 1, 2, false);

		ModelRenderer cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r20);
		setRotateAngle(cube_r20, 0.9599F, 0.0873F, 0);
		cube_r20.setTextureOffset(113, 18).addBox(0.3F, -22.6F, 23.2F, 1, 2, 1, false);

		ModelRenderer cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r21);
		setRotateAngle(cube_r21, 0.6981F, 0.0873F, 0);
		cube_r21.setTextureOffset(122, 11).addBox(0.3F, -32.6F, 15.5F, 1, 2, 1, false);

		ModelRenderer cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r22);
		setRotateAngle(cube_r22, 1.0908F, 0.0436F, 0);
		cube_r22.setTextureOffset(118, 11).addBox(0, -22.6F, 25.9F, 1, 4, 1, false);

		ModelRenderer cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r23);
		setRotateAngle(cube_r23, 0.6981F, 0, 0);
		cube_r23.setTextureOffset(110, 20).addBox(-0.5F, -27, 17.6F, 1, 1, 1, false);
		cube_r23.setTextureOffset(121, 18).addBox(-0.5F, -31.8F, 15.1F, 1, 2, 1, false);

		ModelRenderer cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r24);
		setRotateAngle(cube_r24, 1.1345F, 0, 0);
		cube_r24.setTextureOffset(104, 11).addBox(-0.5F, -20.6F, 26.3F, 1, 4, 2, false);
	}
}