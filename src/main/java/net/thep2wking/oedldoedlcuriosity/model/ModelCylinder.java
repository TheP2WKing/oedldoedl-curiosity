package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelCylinder extends ModModelBaubleBase {
	public ModelCylinder(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0.01F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(76, 10).addBox(-4.5F, -32.6F, -4.5F, 9, 1, 9, false);
		bb_main.setTextureOffset(76, 20).addBox(-3, -40.6F, -3, 6, 8, 6, false);
		bb_main.setTextureOffset(100, 20).addBox(-3.5F, -34.5F, -3.5F, 7, 1, 7, false);
		bb_main.setTextureOffset(76, 0).addBox(-4.5F, -33.1F, -4.5F, 9, 1, 9, false);
	}
}