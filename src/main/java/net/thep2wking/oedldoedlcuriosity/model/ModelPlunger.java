package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelPlunger extends ModModelBaubleBase {
	public ModelPlunger() {
		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(108, 0).addBox(-2.5F, -33, -2.5F, 5, 1, 5, false);
		bb_main.setTextureOffset(108, 6).addBox(-2, -34, -2, 4, 1, 4, false);
		bb_main.setTextureOffset(108, 11).addBox(-0.5F, -44, -0.5F, 1, 10, 1, false);
		bb_main.setTextureOffset(112, 11).addBox(-1, -35, -1, 2, 1, 2, false);
	}
}