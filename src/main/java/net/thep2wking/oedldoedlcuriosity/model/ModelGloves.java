package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelGloves extends ModModelBaubleBase {
	public ModelGloves(float modelSize) {
		super(modelSize);

		ModelRenderer left = new ModelRenderer(this);
		ModelRenderer right = new ModelRenderer(this);
		left.setRotationPoint(5, 22, 0);
		right.setRotationPoint(-5, 22, 0);
		bipedLeftArm.addChild(right);
		bipedRightArm.addChild(left);
		
		left.setTextureOffset(120, 12).addBox(-8.5F, -15.5F, -1.5F, 1, 4, 3, false);
		left.setTextureOffset(114, 4).addBox(-8.5F, -15.5F, 1.5F, 5, 4, 1, false);
		left.setTextureOffset(99, 15).addBox(-8.5F, -15.5F, -2.5F, 5, 4, 1, false);
		left.setTextureOffset(111, 15).addBox(-4.5F, -15.5F, -1.5F, 1, 4, 3, false);
		left.setTextureOffset(99, 5).addBox(-8, -12.25F, -2, 4, 1, 4, false);
		
		right.setTextureOffset(99, 20).addBox(7.5F, -15.5F, -1.5F, 1, 4, 3, false);
		right.setTextureOffset(116, 19).addBox(3.5F, -15.5F, -1.5F, 1, 4, 3, false);
		right.setTextureOffset(111, 10).addBox(3.5F, -15.5F, 1.5F, 5, 4, 1, false);
		right.setTextureOffset(99, 10).addBox(3.5F, -15.5F, -2.5F, 5, 4, 1, false);
		right.setTextureOffset(99, 0).addBox(4, -12.25F, -2, 4, 1, 4, false);
	}
}