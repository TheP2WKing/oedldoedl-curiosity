package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelWoodenBox extends ModModelBaubleBase {
	public ModelWoodenBox(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedBody.addChild(bb_main);
		bb_main.setTextureOffset(80, 0).addBox(-4, -24, 2, 8, 14, 7, false);
		bb_main.setTextureOffset(80, 31).addBox(-4.5F, -13.5F, 1.5F, 1, 2, 8, false);
		bb_main.setTextureOffset(110, 0).addBox(-4.5F, -18, 1.5F, 1, 2, 8, false);
		bb_main.setTextureOffset(98, 33).addBox(-3, -23, 8.2F, 6, 12, 1, false);
		bb_main.setTextureOffset(80, 0).addBox(1.5F, -18.5F, 8.75F, 1, 3, 1, false);
		bb_main.setTextureOffset(108, 23).addBox(-4.5F, -22.5F, 1.5F, 1, 2, 8, false);
		bb_main.setTextureOffset(108, 13).addBox(3.5F, -18, 1.5F, 1, 2, 8, false);
		bb_main.setTextureOffset(98, 21).addBox(3.5F, -13.5F, 1.5F, 1, 2, 8, false);
		bb_main.setTextureOffset(80, 21).addBox(3.5F, -22.5F, 1.5F, 1, 2, 8, false);
		bb_main.setTextureOffset(110, 10).addBox(-3.5F, -18, 1.5F, 7, 2, 1, false);
		bb_main.setTextureOffset(90, 24).addBox(-3.5F, -22.5F, 1.5F, 7, 2, 1, false);
		bb_main.setTextureOffset(90, 21).addBox(-3.5F, -13.5F, 1.5F, 7, 2, 1, false);
	}
}