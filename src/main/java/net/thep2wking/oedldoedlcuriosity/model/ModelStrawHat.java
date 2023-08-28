package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelStrawHat extends ModModelBaubleBase {
	public ModelStrawHat(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.1F, 0.01F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(77, 17).addBox(-4.5F, -32.5F, -4.5F, 9, 1, 9, false);
		bb_main.setTextureOffset(104, 18).addBox(4, -32, -4.5F, 1, 3, 9, false);
		bb_main.setTextureOffset(77, 27).addBox(-5, -32, -4.5F, 1, 3, 9, false);
		bb_main.setTextureOffset(108, 30).addBox(-4.5F, -32, -5, 9, 3, 1, false);
		bb_main.setTextureOffset(88, 30).addBox(-4.5F, -32, 4, 9, 3, 1, false);
		bb_main.setTextureOffset(77, 0).addBox(-8.5F, -28.99F, -8.5F, 17, 0, 17, false);
	}
}