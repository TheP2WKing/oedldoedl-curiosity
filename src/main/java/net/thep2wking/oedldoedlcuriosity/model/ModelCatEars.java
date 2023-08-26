package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelCatEars extends ModModelBaubleBase {
	public ModelCatEars(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0.1F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(111, 6).addBox(2, -32, -1, 3, 1, 1, false);
		bb_main.setTextureOffset(123, 0).addBox(1, -34, -1, 1, 2, 1, false);
		bb_main.setTextureOffset(111, 11).addBox(2, -36, -1, 1, 2, 1, false);
		bb_main.setTextureOffset(120, 10).addBox(-2, -34, -1, 1, 2, 1, false);
		bb_main.setTextureOffset(116, 10).addBox(-6, -35, -1, 1, 3, 1, false);
		bb_main.setTextureOffset(119, 4).addBox(-3, -36, -1, 1, 2, 1, false);
		bb_main.setTextureOffset(115, 14).addBox(4, -36, -1, 1, 1, 1, false);
		bb_main.setTextureOffset(111, 14).addBox(-5, -36, -1, 1, 1, 1, false);
		bb_main.setTextureOffset(119, 0).addBox(5, -35, -1, 1, 3, 1, false);
		bb_main.setTextureOffset(119, 13).addBox(3, -37, -1, 1, 1, 1, false);
		bb_main.setTextureOffset(111, 8).addBox(3, -35, -0.5F, 2, 2, 1, false);
		bb_main.setTextureOffset(118, 7).addBox(-5, -35, -0.5F, 2, 2, 1, false);
		bb_main.setTextureOffset(124, 7).addBox(-3, -34, -0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(111, 4).addBox(2, -33, -1, 3, 1, 1, false);
		bb_main.setTextureOffset(111, 2).addBox(-5, -32, -1, 3, 1, 1, false);
		bb_main.setTextureOffset(123, 12).addBox(2, -34, -0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(111, 0).addBox(-5, -33, -1, 3, 1, 1, false);
		bb_main.setTextureOffset(123, 9).addBox(-4, -37, -1, 1, 1, 1, false);
		bb_main.setTextureOffset(123, 5).addBox(-4, -36, -0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(122, 3).addBox(3, -36, -0.5F, 1, 1, 1, false);
	}
}