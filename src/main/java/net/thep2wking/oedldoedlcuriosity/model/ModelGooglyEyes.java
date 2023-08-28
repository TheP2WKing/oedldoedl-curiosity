package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelGooglyEyes extends ModModelBaubleBase {
	public ModelGooglyEyes(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25, 0.3F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(117, 4).addBox(-3.5F, -30, -4.5F, 3, 3, 1, false);
		bb_main.setTextureOffset(117, 0).addBox(0.5F, -30, -4.5F, 3, 3, 1, false);
		bb_main.setTextureOffset(124, 7).addBox(-2.5F, -29, -4.65F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 3).addBox(1.5F, -29, -4.65F, 1, 1, 1, false);
	}
}