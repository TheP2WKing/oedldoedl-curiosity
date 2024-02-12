package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelCrown extends ModModelBaubleBase {
	public ModelCrown() {
		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.01F, 0.01F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(103, 17).addBox(-4.5F, -33.5F, -4.5F, 9, 3, 1, false);
		bb_main.setTextureOffset(103, 13).addBox(-4.5F, -33.5F, 3.5F, 9, 3, 1, false);
		bb_main.setTextureOffset(112, 3).addBox(3.5F, -33.5F, -3.5F, 1, 3, 7, false);
		bb_main.setTextureOffset(103, 0).addBox(-4.5F, -33.5F, -3.5F, 1, 3, 7, false);
		bb_main.setTextureOffset(120, 0).addBox(3.5F, -35.5F, -4.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(116, 0).addBox(-4.5F, -35.5F, -4.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(107, 10).addBox(-4.5F, -35.5F, 3.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(103, 10).addBox(3.5F, -35.5F, 3.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(124, 6).addBox(2.5F, -34.5F, 3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 4).addBox(3.5F, -34.5F, 2.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(107, 21).addBox(3.5F, -34.5F, -3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 2).addBox(2.5F, -34.5F, -4.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(124, 0).addBox(-3.5F, -34.5F, -4.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(103, 21).addBox(-4.5F, -34.5F, -3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(122, 20).addBox(-4.5F, -34.5F, 2.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(123, 18).addBox(0.5F, -34.5F, 3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(123, 13).addBox(-1.5F, -34.5F, 3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(112, 3).addBox(-0.5F, -35.5F, 3.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(122, 16).addBox(0.5F, -34.5F, -4.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(121, 7).addBox(-1.5F, -34.5F, -4.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(112, 0).addBox(-0.5F, -35.5F, -4.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(103, 3).addBox(3.5F, -35.5F, -0.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(121, 5).addBox(3.5F, -34.5F, 0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(121, 3).addBox(3.5F, -34.5F, -1.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(115, 5).addBox(-4.5F, -34.5F, 0.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(103, 0).addBox(-4.5F, -35.5F, -0.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(106, 5).addBox(-4.5F, -34.5F, -1.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(106, 2).addBox(-3.5F, -34.5F, 3.5F, 1, 1, 1, false);
	}
}