package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelAmulet extends ModModelBaubleBase {
	public ModelAmulet(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedBody.addChild(bb_main);
		bb_main.setTextureOffset(124, 7).addBox(-2.5F, -24.101F, 0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(116, 12).addBox(1.5F, -24.101F, 0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(112, 7).addBox(-2, -24.1F, 1.2F, 4, 1, 1, false);
		bb_main.setTextureOffset(112, 9).addBox(2.25F, -24.1F, -1.3F, 1, 1, 2, false);
		bb_main.setTextureOffset(120, 7).addBox(-3.25F, -24.1F, -1.3F, 1, 1, 2, false);
		bb_main.setTextureOffset(112, 12).addBox(-2.75F, -24.101F, -2.1F, 1, 1, 1, false);
		bb_main.setTextureOffset(122, 11).addBox(1.75F, -24.101F, -2.1F, 1, 1, 1, false);
		bb_main.setTextureOffset(119, 10).addBox(-2.401F, -23.1F, -2.2F, 1, 1, 1, false);
		bb_main.setTextureOffset(116, 9).addBox(1.401F, -23.1F, -2.2F, 1, 1, 1, false);
		bb_main.setTextureOffset(112, 0).addBox(-3, -22.1F, -2.1F, 6, 6, 1, false);
	}
}