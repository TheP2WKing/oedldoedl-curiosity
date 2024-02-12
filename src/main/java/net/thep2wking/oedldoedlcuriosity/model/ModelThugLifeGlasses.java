package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelThugLifeGlasses extends ModModelBaubleBase {
	public ModelThugLifeGlasses() {
		ModelRenderer bb_main = new ModelRenderer(this);
		ModelRenderer bb_main_r1 = new ModelRenderer(this);
		ModelRenderer bb_main_r2 = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25.1F, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(117, 6).addBox(-4, -30.1F, -4.61F, 3, 2, 1, false);
		bb_main.setTextureOffset(110, 12).addBox(-4.25F, -29.5F, 1.15F, 1, 1, 2, false);
		bb_main.setTextureOffset(114, 12).addBox(1.5F, -28.6F, -4.6F, 2, 1, 1, false);
		bb_main.setTextureOffset(120, 10).addBox(3.25F, -29.5F, 1.15F, 1, 1, 2, false);
		bb_main.setTextureOffset(124, 2).addBox(-0.5F, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(117, 0).addBox(1, -30.1F, -4.61F, 3, 2, 1, false);
		bb_main.setTextureOffset(117, 3).addBox(-3.5F, -28.6F, -4.6F, 2, 1, 1, false);
		bb_main.setTextureOffset(123, 13).addBox(0.5F, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(119, 13).addBox(0.5F, -29.6F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(122, 4).addBox(3.5F, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(117, 9).addBox(3.5F, -29.6F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(110, 8).addBox(-1.5F, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(110, 6).addBox(-1.5F, -29.6F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(110, 2).addBox(-4.5F, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(110, 0).addBox(-4.5F, -29.6F, -4.6F, 1, 1, 1, false);

		bb_main_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r1);
		setRotateAngle(bb_main_r1, 0, 0.0436F, 0);
		bb_main_r1.setTextureOffset(110, 0).addBox(-4.3F, -30, -4, 1, 1, 5, false);

		bb_main_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r2);
		setRotateAngle(bb_main_r2, 0, -0.0436F, 0);
		bb_main_r2.setTextureOffset(110, 6).addBox(3.3F, -30, -4, 1, 1, 5, false);
	}
}