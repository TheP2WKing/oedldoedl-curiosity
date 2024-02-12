package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelMeguminHat extends ModModelBaubleBase {
	public ModelMeguminHat() {
		super(0, 256, 256);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.55F, 0.01F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(168, 0).addBox(-9, -33, -9, 18, 1, 18, false);
		bb_main.setTextureOffset(222, 12).addBox(-8, -33, -10, 16, 1, 1, false);
		bb_main.setTextureOffset(168, 50).addBox(-8, -33, 9, 16, 1, 1, false);
		bb_main.setTextureOffset(210, 38).addBox(9, -33, -8, 1, 1, 16, false);
		bb_main.setTextureOffset(192, 37).addBox(-10, -33, -8, 1, 1, 16, false);
		bb_main.setTextureOffset(168, 54).addBox(-8, -32, -11, 16, 1, 3, false);
		bb_main.setTextureOffset(212, 32).addBox(-8, -32, 8, 16, 1, 3, false);
		bb_main.setTextureOffset(190, 20).addBox(8, -32, -8, 3, 1, 16, false);
		bb_main.setTextureOffset(168, 19).addBox(-11, -32, -8, 3, 1, 16, false);
		bb_main.setTextureOffset(190, 19).addBox(-10, -32.01F, 7, 3, 1, 3, false);
		bb_main.setTextureOffset(168, 19).addBox(-10, -32.01F, -10, 3, 1, 3, false);
		bb_main.setTextureOffset(168, 13).addBox(7, -32.01F, -10, 3, 1, 3, false);
		bb_main.setTextureOffset(168, 9).addBox(7, -32.01F, 7, 3, 1, 3, false);
		bb_main.setTextureOffset(168, 37).addBox(-5, -36, -5, 10, 3, 10, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, -0.6109F, 0, 0.1309F);
		cube_r1.setTextureOffset(168, 0).addBox(-5.5F, -44, -24, 3, 6, 3, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r2);
		setRotateAngle(cube_r2, -0.3054F, 0, 0.0436F);
		cube_r2.setTextureOffset(222, 0).addBox(-4.25F, -44, -13.75F, 6, 6, 6, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r3);
		setRotateAngle(cube_r3, -0.1309F, 0, 0);
		cube_r3.setTextureOffset(212, 19).addBox(-4, -40, -8.25F, 8, 5, 8, false);
	}
}