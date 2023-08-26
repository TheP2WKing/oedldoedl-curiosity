package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelMinepods extends ModModelBaubleBase {
	public ModelMinepods(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25.1F, 0);
		bipedHead.addChild(bb_main);
		
		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, -0.2618F, 0, 0);
		cube_r1.setTextureOffset(120, 0).addBox(-4.2F, -29, -7.5F, 1, 4, 1, false);
		cube_r1.setTextureOffset(120, 5).addBox(-4.1F, -28.75F, -8.5F, 1, 2, 1, false);
		cube_r1.setTextureOffset(124, 5).addBox(3.1F, -28.75F, -8.5F, 1, 2, 1, false);
		cube_r1.setTextureOffset(124, 0).addBox(3.2F, -29, -7.5F, 1, 4, 1, false);
	}
}