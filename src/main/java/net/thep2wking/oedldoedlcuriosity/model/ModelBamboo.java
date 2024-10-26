package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelBamboo extends ModModelBaubleBase {
	public ModelBamboo() {
		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25f, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(90, 0).addBox(-4.26F, -26.6501F, -4.75F, 1, 1, 9, false);
		bb_main.setTextureOffset(90, 10).addBox(3.26F, -26.65F, -4.75F, 1, 1, 9, false);
		bb_main.setTextureOffset(110, 0).addBox(-4, -26.65F, 3.2501F, 8, 1, 1, false);

		ModelRenderer bb_rot = new ModelRenderer(this);
		bb_rot.setRotationPoint(8, -6, -18);
		bb_main.addChild(bb_rot);
		setRotateAngle(bb_rot, -0.7854F, 0, 0);
		bb_rot.setTextureOffset(90, 20).addBox(-12, -25, -5.5F, 8, 2, 2, -0.2F);
	}
}