package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelKittyHeadset extends ModModelBaubleBase {
	public ModelKittyHeadset(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(103, 0).addBox(-4, -32.6F, -1, 8, 1, 2, false);
		bb_main.setTextureOffset(117, 16).addBox(3.6F, -32, -1, 1, 3, 2, false);
		bb_main.setTextureOffset(111, 15).addBox(-4.5F, -32, -1, 1, 3, 2, false);
		bb_main.setTextureOffset(120, 3).addBox(0.5F, -33.5F, -0.5F, 3, 1, 1, false);
		bb_main.setTextureOffset(109, 3).addBox(-3.5F, -33.5F, -0.5F, 3, 1, 1, false);
		bb_main.setTextureOffset(103, 18).addBox(-3, -34.5F, -0.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(109, 5).addBox(1, -34.5F, -0.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(116, 12).addBox(3.6F, -25.5F, -3.6F, 1, 1, 3, false);
		bb_main.setTextureOffset(109, 7).addBox(-5, -30, -2, 1, 4, 4, false);
		bb_main.setTextureOffset(115, 3).addBox(4.5F, -29.5F, -1.5F, 1, 3, 3, false);
		bb_main.setTextureOffset(103, 12).addBox(-5.5F, -29.5F, -1.5F, 1, 3, 3, false);
		bb_main.setTextureOffset(103, 3).addBox(4, -30, -2, 1, 4, 4, false);
		bb_main.setTextureOffset(115, 9).addBox(0.6F, -25.5F, -4.6F, 4, 1, 1, false);
		bb_main.setTextureOffset(103, 3).addBox(3.6F, -26.5F, -1.1F, 1, 1, 1, false);
	}
}