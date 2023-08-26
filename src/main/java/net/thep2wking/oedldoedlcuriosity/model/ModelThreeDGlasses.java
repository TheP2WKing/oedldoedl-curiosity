package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelThreeDGlasses extends ModModelBaubleBase {
	public ModelThreeDGlasses(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25.1F, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(118, 6).addBox(-4.5F, -30.1F, -4.6F, 4, 3, 1, false);
		bb_main.setTextureOffset(117, 12).addBox(-4.25F, -30, 1.1F, 1, 2, 1, false);
		bb_main.setTextureOffset(118, 0).addBox(0.5F, -30.1F, -4.6F, 4, 3, 1, false);
		bb_main.setTextureOffset(111, 6).addBox(3.25F, -30, 1.15F, 1, 2, 1, false);
		bb_main.setTextureOffset(111, 0).addBox(-0.5F, -30, -4.6F, 1, 2, 1, false);

		ModelRenderer bb_main_r1 = new ModelRenderer(this);
		bb_main_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r1);
		setRotateAngle(bb_main_r1, 0, 0.0436F, 0);
		bb_main_r1.setTextureOffset(121, 10).addBox(-4.3F, -29, -4, 1, 1, 2, false);
		bb_main_r1.setTextureOffset(111, 0).addBox(-4.3F, -30, -4, 1, 1, 5, false);

		ModelRenderer bb_main_r2 = new ModelRenderer(this);
		bb_main_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(bb_main_r2);
		setRotateAngle(bb_main_r2, 0, -0.0436F, 0);
		bb_main_r2.setTextureOffset(111, 12).addBox(3.3F, -29, -4, 1, 1, 2, false);
		bb_main_r2.setTextureOffset(111, 6).addBox(3.3F, -30, -4, 1, 1, 5, false);
	}
}