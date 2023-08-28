package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelRedKyoryuuHorns extends ModModelBaubleBase {
	public ModelRedKyoryuuHorns(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(124, 9).addBox(-4.28F, -38.45F, -4.86F, 1, 1, 1, false);
		bb_main.setTextureOffset(120, 9).addBox(3.28F, -38.45F, -4.86F, 1, 1, 1, false);

		ModelRenderer bb_main_r1 = new ModelRenderer(this);
		bb_main_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r1);
		setRotateAngle(bb_main_r1, 0.1745F, 0, 0.1309F);
		bb_main_r1.setTextureOffset(116, 0).addBox(-1.5F, -36, 1.5F, 1, 4, 1, false);
		bb_main_r1.setTextureOffset(116, 5).addBox(-2, -35, 2, 1, 3, 1, false);

		ModelRenderer bb_main_r2 = new ModelRenderer(this);
		bb_main_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r2);
		setRotateAngle(bb_main_r2, 0.0436F, 0, 0.0436F);
		bb_main_r2.setTextureOffset(124, 0).addBox(1.63F, -37.8F, -3.22F, 1, 2, 1, false);

		ModelRenderer bb_main_r3 = new ModelRenderer(this);
		bb_main_r3.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r3);
		setRotateAngle(bb_main_r3, 0.3491F, 0, 0.3491F);
		bb_main_r3.setTextureOffset(124, 3).addBox(-9.48F, -34.8F, 7.6F, 1, 2, 1, false);

		ModelRenderer bb_main_r4 = new ModelRenderer(this);
		bb_main_r4.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r4);
		setRotateAngle(bb_main_r4, 0.3491F, 0, -0.3491F);
		bb_main_r4.setTextureOffset(124, 6).addBox(8.48F, -34.8F, 7.6F, 1, 2, 1, false);

		ModelRenderer bb_main_r5 = new ModelRenderer(this);
		bb_main_r5.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r5);
		setRotateAngle(bb_main_r5, 0.1745F, 0, -0.1309F);
		bb_main_r5.setTextureOffset(120, 5).addBox(1, -35, 2, 1, 3, 1, false);
		bb_main_r5.setTextureOffset(120, 0).addBox(0.5F, -36, 1.5F, 1, 4, 1, false);

		ModelRenderer bb_main_r6 = new ModelRenderer(this);
		bb_main_r6.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r6);
		setRotateAngle(bb_main_r6, 0.0436F, 0, -0.0436F);
		bb_main_r6.setTextureOffset(116, 9).addBox(-2.63F, -37.8F, -3.22F, 1, 2, 1, false);
	}
}