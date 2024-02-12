package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelFancySunglasses extends ModModelBaubleBase {
	public ModelFancySunglasses() {
		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25.1F, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(118, 6).addBox(-3.5F, -30.6F, -4.6F, 2, 4, 1, false);
		bb_main.setTextureOffset(118, 0).addBox(1.5F, -30.6F, -4.6F, 2, 4, 1, false);
		bb_main.setTextureOffset(121, 14).addBox(-0.5F, -29.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(111, 12).addBox(3.5F, -29.6F, -4.6F, 1, 2, 1, false);
		bb_main.setTextureOffset(122, 11).addBox(0.5F, -29.6F, -4.6F, 1, 2, 1, false);
		bb_main.setTextureOffset(111, 6).addBox(-1.5F, -29.6F, -4.6F, 1, 2, 1, false);
		bb_main.setTextureOffset(111, 0).addBox(-4.5F, -29.6F, -4.6F, 1, 2, 1, false);
		bb_main.setTextureOffset(118, 13).addBox(3, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 6).addBox(1, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 2).addBox(1, -28.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 0).addBox(3, -28.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(123, 4).addBox(-4, -28.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(115, 12).addBox(-2, -28.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(111, 9).addBox(-2, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(111, 3).addBox(-4, -30.1F, -4.6F, 1, 1, 1, false);

		ModelRenderer bb_main_r1 = new ModelRenderer(this);
		bb_main_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r1);
		setRotateAngle(bb_main_r1, -0.1745F, 0, 0);
		bb_main_r1.setTextureOffset(124, 8).addBox(3.25F, -28.8F, -4.1F, 1, 1, 1, false);
		bb_main_r1.setTextureOffset(114, 14).addBox(-4.25F, -28.8F, -4.1F, 1, 1, 1, false);

		ModelRenderer bb_main_r2 = new ModelRenderer(this);
		bb_main_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r2);
		setRotateAngle(bb_main_r2, 0, -0.0436F, 0);
		bb_main_r2.setTextureOffset(111, 0).addBox(3.3F, -29.1F, -4, 1, 1, 5, false);

		ModelRenderer bb_main_r3 = new ModelRenderer(this);
		bb_main_r3.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r3);
		setRotateAngle(bb_main_r3, 0, 0.0436F, 0);
		bb_main_r3.setTextureOffset(111, 6).addBox(-4.3F, -29.1F, -4, 1, 1, 5, false);
	}
}