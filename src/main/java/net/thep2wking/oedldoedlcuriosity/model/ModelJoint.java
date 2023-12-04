package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelJoint extends ModModelBaubleBase {
	public ModelJoint(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		ModelRenderer cube_r1 = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.5F, 0.05F);
		bipedHead.addChild(bb_main);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, 0.3927F, -0.9163F, 0.0F);
		cube_r1.setTextureOffset(114, 0).addBox(-3.5F, -25.0F, 2.0F, 1, 1, 6, false);
	}
}