package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelPantsu extends ModModelBaubleBase {
	public ModelPantsu(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.01F, 0.01F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(108, 3).addBox(-4.5F, -29.5F, -4.5F, 9, 2, 1, false);
		bb_main.setTextureOffset(108, 0).addBox(-4.5F, -29.5F, 3.5F, 9, 2, 1, false);
		bb_main.setTextureOffset(102, 12).addBox(3.5F, -29.5F, -3.5F, 1, 2, 7, false);
		bb_main.setTextureOffset(93, 10).addBox(-4.5F, -29.5F, -3.5F, 1, 2, 7, false);
		bb_main.setTextureOffset(108, 6).addBox(-3, -30.5F, -4.5F, 6, 1, 1, false);
		bb_main.setTextureOffset(111, 14).addBox(-2, -31.5F, -4.5F, 4, 1, 1, false);
		bb_main.setTextureOffset(93, 0).addBox(-1.5F, -32.5F, -4.5F, 3, 1, 9, false);
		bb_main.setTextureOffset(102, 10).addBox(-3, -30.5F, 3.5F, 6, 1, 1, false);
		bb_main.setTextureOffset(111, 12).addBox(-2, -31.5F, 3.5F, 4, 1, 1, false);
	}
}