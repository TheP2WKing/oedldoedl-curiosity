package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelMonocle extends ModModelBaubleBase {
	public ModelMonocle(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25.1F, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(121, 7).addBox(3.5F, -28.61F, -3.95F, 1, 2, 1, false);
		bb_main.setTextureOffset(121, 0).addBox(3.5F, -27.11F, -3.45F, 1, 2, 1, false);
		bb_main.setTextureOffset(117, 7).addBox(-0.01F, -29.6F, -4.6F, 1, 2, 1, false);
		bb_main.setTextureOffset(113, 6).addBox(2.99F, -29.6F, -4.6F, 1, 2, 1, false);
		bb_main.setTextureOffset(113, 0).addBox(0.49F, -30.1F, -4.6F, 3, 3, 1, false);
		bb_main.setTextureOffset(118, 5).addBox(0.99F, -30.6F, -4.6F, 2, 1, 1, false);
		bb_main.setTextureOffset(113, 4).addBox(0.99F, -27.6F, -4.6F, 2, 1, 1, false);
		bb_main.setTextureOffset(123, 11).addBox(0.49F, -27.6F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 9).addBox(2.49F, -27.6F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 6).addBox(2.49F, -30.6F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 2).addBox(0.49F, -30.6F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(113, 11).addBox(3.5F, -29.11F, -4.45F, 1, 1, 1, false);
		bb_main.setTextureOffset(120, 10).addBox(-0.01F, -28.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(123, 4).addBox(2.99F, -28.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(116, 10).addBox(2.99F, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(113, 9).addBox(-0.01F, -30.1F, -4.6F, 1, 1, 1, false);
		bb_main.setTextureOffset(120, 3).addBox(1.49F, -27.1F, -4.6F, 1, 1, 1, false);
	}
}