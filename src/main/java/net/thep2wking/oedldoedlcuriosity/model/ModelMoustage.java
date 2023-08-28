package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelMoustage extends ModModelBaubleBase {
	public ModelMoustage(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.5F, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(118, 0).addBox(-2, -27, -4.5F, 4, 1, 1, false);
		bb_main.setTextureOffset(118, 4).addBox(1, -26, -4.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(118, 2).addBox(-3, -26, -4.5F, 2, 1, 1, false);
	}
}