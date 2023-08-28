package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelTravellersGloves extends ModModelBaubleBase {
	public ModelTravellersGloves(float modelSize) {
		super(modelSize);

		ModelRenderer left = new ModelRenderer(this);
		ModelRenderer right = new ModelRenderer(this);
		left.setRotationPoint(5, 22, 0);
		right.setRotationPoint(-5, 22, 0);
		bipedLeftArm.addChild(right);
		bipedRightArm.addChild(left);
		left.setTextureOffset(106, 4).addBox(-8.5F, -15.5F, -2, 1, 4, 4, false);
		left.setTextureOffset(108, 13).addBox(-4.5F, -15.5F, -2, 1, 3, 4, false);
		left.setTextureOffset(118, 17).addBox(-8, -15.5F, 1.5F, 4, 3, 1, false);
		left.setTextureOffset(118, 0).addBox(-8, -15.5F, -2.5F, 4, 3, 1, false);
		left.setTextureOffset(100, 19).addBox(-8, -12.5F, -2.5F, 2, 1, 1, false);
		left.setTextureOffset(100, 17).addBox(-8, -12.5F, 1.5F, 2, 1, 1, false);
		left.setTextureOffset(112, 8).addBox(-8.01F, -12.49F, -2, 2, 1, 4, false);
		
		right.setTextureOffset(100, 0).addBox(7.5F, -15.5F, -2, 1, 4, 4, false);
		right.setTextureOffset(112, 0).addBox(3.5F, -15.5F, -2, 1, 3, 4, false);
		right.setTextureOffset(114, 13).addBox(4, -15.5F, 1.5F, 4, 3, 1, false);
		right.setTextureOffset(106, 0).addBox(4, -15.5F, -2.5F, 4, 3, 1, false);
		right.setTextureOffset(100, 10).addBox(6, -12.5F, -2.5F, 2, 1, 1, false);
		right.setTextureOffset(100, 8).addBox(6, -12.5F, 1.5F, 2, 1, 1, false);
		right.setTextureOffset(100, 12).addBox(6.01F, -12.49F, -2, 2, 1, 4, false);
	}
}