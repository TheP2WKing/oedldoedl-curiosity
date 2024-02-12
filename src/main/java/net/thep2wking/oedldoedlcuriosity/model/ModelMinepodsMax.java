package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelMinepodsMax extends ModModelBaubleBase {
	public ModelMinepodsMax() {
		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(108, 0).addBox(-4, -32.6F, -1, 8, 1, 2, false);
		bb_main.setTextureOffset(116, 15).addBox(3.6F, -32, -1, 1, 3, 2, false);
		bb_main.setTextureOffset(122, 13).addBox(-4.5F, -32, -1, 1, 3, 2, false);
		bb_main.setTextureOffset(114, 7).addBox(-5, -30, -2, 1, 4, 4, false);
		bb_main.setTextureOffset(120, 3).addBox(4.5F, -29.5F, -1.5F, 1, 3, 3, false);
		bb_main.setTextureOffset(108, 12).addBox(-5.5F, -29.5F, -1.5F, 1, 3, 3, false);
		bb_main.setTextureOffset(108, 3).addBox(4, -30, -2, 1, 4, 4, false);
	}
}