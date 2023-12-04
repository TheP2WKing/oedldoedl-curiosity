package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelDevilHorns extends ModModelBaubleBase {
	public ModelDevilHorns(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		ModelRenderer cube_r1 = new ModelRenderer(this);;
		ModelRenderer cube_r2 = new ModelRenderer(this);;
		ModelRenderer cube_r3 = new ModelRenderer(this);;
		ModelRenderer cube_r4 = new ModelRenderer(this);;
		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedHead.addChild(bb_main);
		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
		cube_r1.setTextureOffset(120, 0).addBox(-11.13F, -34.12F, -2.49F, 1, 4, 1, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0436F);
		cube_r2.setTextureOffset(120, 5).addBox(-3.5F, -35.5F, -2.5F, 1, 4, 1, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotateAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
		cube_r3.setTextureOffset(124, 0).addBox(10.13F, -34.12F, -2.49F, 1, 4, 1, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotateAngle(cube_r4, 0.0F, 0.0F, -0.0436F);
		cube_r4.setTextureOffset(124, 5).addBox(2.5F, -35.5F, -2.5F, 1, 4, 1, false);
	}
}