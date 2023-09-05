package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelHeadband extends ModModelBaubleBase {
	public ModelHeadband(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.01F, 0.02F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(99, 9).addBox(3.5F, -30.5F, -3.5F, 1, 2, 7, false);
		bb_main.setTextureOffset(99, 0).addBox(-4.5F, -30.5F, -3.5F, 1, 2, 7, false);
		bb_main.setTextureOffset(108, 3).addBox(-4.5F, -30.5F, 3.5F, 9, 2, 1, false);
		bb_main.setTextureOffset(102, 11).addBox(0.5F, -28.5F, 3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(102, 5).addBox(1, -27.5F, 3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(108, 9).addBox(1.5F, -26.5F, 3.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(99, 9).addBox(2, -24.5F, 3.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(102, 2).addBox(-1.5F, -28.5F, 3.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(99, 3).addBox(-2, -27.5F, 3.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(99, 0).addBox(-2.5F, -25.5F, 3.5F, 1, 2, 1, false);
		bb_main.setTextureOffset(108, 0).addBox(-4.5F, -30.5F, -4.5F, 9, 2, 1, false);
	}
}