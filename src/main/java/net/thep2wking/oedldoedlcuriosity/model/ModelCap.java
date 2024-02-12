package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelCap extends ModModelBaubleBase {
	public ModelCap() {
		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.55F, 0.01F);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(93, 9).addBox(-3.5F, -33.5F, 3.5F, 7, 3, 1, false);
		bb_main.setTextureOffset(93, 13).addBox(3.5F, -33.5F, -4.5F, 1, 4, 9, false);
		bb_main.setTextureOffset(82, 9).addBox(-4.5F, -33.5F, -4.5F, 1, 4, 9, false);
		bb_main.setTextureOffset(82, 0).addBox(-4, -33.8F, -4, 8, 1, 8, false);
		bb_main.setTextureOffset(104, 9).addBox(-3.5F, -30.9F, -10, 7, 1, 5, false);
		bb_main.setTextureOffset(91, 26).addBox(-2.5F, -30.9F, -11, 5, 1, 1, false);
		bb_main.setTextureOffset(82, 2).addBox(-1.5F, -30.9F, -12, 3, 1, 1, false);
		bb_main.setTextureOffset(106, 0).addBox(3, -30.49F, -10.51F, 1, 1, 7, false);
		bb_main.setTextureOffset(82, 22).addBox(-4, -30.49F, -10.51F, 1, 1, 7, false);
		bb_main.setTextureOffset(87, 12).addBox(2.5F, -30.491F, -10.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(82, 11).addBox(1, -30.49F, -11.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(87, 10).addBox(-3.5F, -30.491F, -10.5F, 1, 1, 1, false);
		bb_main.setTextureOffset(82, 9).addBox(-3, -30.49F, -11.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(103, 26).addBox(-2, -30.491F, -12.5F, 4, 1, 1, false);
		bb_main.setTextureOffset(82, 6).addBox(1.5F, -30.5F, 3.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(82, 4).addBox(-3.5F, -30.5F, 3.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(82, 0).addBox(-1.5F, -29.8F, 3.5F, 3, 1, 1, false);
		bb_main.setTextureOffset(104, 19).addBox(-3.5F, -33.5F, -4.5F, 7, 1, 1, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, -0.1745F, 0, 0);
		cube_r1.setTextureOffset(104, 15).addBox(-3.5F, -32.1F, -10.5F, 7, 3, 1, false);
	}
}