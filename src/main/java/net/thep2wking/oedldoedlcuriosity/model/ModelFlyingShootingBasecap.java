package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModModelBaubleBase;

public class ModelFlyingShootingBasecap extends ModModelBaubleBase {
	public ModelFlyingShootingBasecap(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24.9F, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(81, 0).addBox(-4.5F, -34.5F, -4.5F, 9, 1, 9, false);
		bb_main.setTextureOffset(103, 10).addBox(-3, -35, -3, 6, 1, 6, false);
		bb_main.setTextureOffset(92, 13).addBox(-1, -35.5F, -1, 2, 1, 2, false);
		bb_main.setTextureOffset(81, 10).addBox(-4.5F, -34, 4, 3, 4, 1, false);
		bb_main.setTextureOffset(81, 0).addBox(1.5F, -34, 4, 3, 4, 1, false);
		bb_main.setTextureOffset(81, 5).addBox(-1.5F, -34, 4, 3, 3, 1, false);
		bb_main.setTextureOffset(81, 15).addBox(-1.5F, -30.5F, 4, 3, 1, 1, false);
		bb_main.setTextureOffset(108, 0).addBox(-4.5F, -34, -5, 9, 3, 1, false);
		bb_main.setTextureOffset(92, 14).addBox(-5, -34, -4.5F, 1, 4, 9, false);
		bb_main.setTextureOffset(81, 10).addBox(4, -34, -4.5F, 1, 4, 9, false);
		bb_main.setTextureOffset(105, 21).addBox(4.5F, -33, -3.5F, 1, 2, 7, false);
		bb_main.setTextureOffset(97, 30).addBox(-3.5F, -33, 4.5F, 7, 2, 1, false);
		bb_main.setTextureOffset(81, 23).addBox(-5.5F, -33, -3.5F, 1, 2, 7, false);
		bb_main.setTextureOffset(81, 32).addBox(3.5F, -31, -8.5F, 1, 1, 4, false);
		bb_main.setTextureOffset(103, 17).addBox(-4, -32, -8, 8, 1, 3, false);
		bb_main.setTextureOffset(108, 4).addBox(-3, -33, -7, 6, 1, 2, false);
		bb_main.setTextureOffset(90, 27).addBox(-2, -32.5F, -9, 4, 1, 2, false);
		bb_main.setTextureOffset(81, 27).addBox(-1, -32.5F, -10, 2, 1, 1, false);
		bb_main.setTextureOffset(81, 25).addBox(-1, -33, -8, 2, 1, 1, false);
		bb_main.setTextureOffset(96, 33).addBox(-2, -33.5F, -6, 4, 1, 1, false);
		bb_main.setTextureOffset(92, 10).addBox(-3, -32, -10, 6, 1, 2, false);
		bb_main.setTextureOffset(87, 32).addBox(-2, -32, -11, 4, 1, 1, false);
		bb_main.setTextureOffset(103, 13).addBox(3, -31, -10, 1, 1, 2, false);
		bb_main.setTextureOffset(81, 23).addBox(1.5F, -31, -11, 2, 1, 1, false);
		bb_main.setTextureOffset(103, 21).addBox(-3.5F, -31, -11, 2, 1, 1, false);
		bb_main.setTextureOffset(108, 7).addBox(-2.5F, -31, -12, 5, 1, 1, false);
		bb_main.setTextureOffset(81, 17).addBox(-1, -31, -12.5F, 2, 1, 1, false);
		bb_main.setTextureOffset(92, 16).addBox(-4, -31, -10, 1, 1, 2, false);
		bb_main.setTextureOffset(109, 30).addBox(-4.5F, -31, -8.5F, 1, 1, 4, false);
	}
}