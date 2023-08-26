package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelPylone extends ModModelBaubleBase {
	public ModelPylone(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.5F, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(92, 0).addBox(-4.5F, -33, -4.5F, 9, 1, 9, false);
		bb_main.setTextureOffset(92, 10).addBox(-3, -35, -3, 6, 2, 6, false);
		bb_main.setTextureOffset(92, 18).addBox(-2.5F, -37, -2.5F, 5, 2, 5, false);
		bb_main.setTextureOffset(110, 10).addBox(-2, -39, -2, 4, 2, 4, false);
		bb_main.setTextureOffset(107, 18).addBox(-1.5F, -40, -1.5F, 3, 1, 3, false);
	}
}