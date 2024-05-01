package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelBattleAxe extends ModModelBaubleBase {
	public ModelBattleAxe() {
		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 24, 0);
		bipedHead.addChild(bb_main);
		bb_main.setTextureOffset(115, 10).addBox(-1.5F, -34, 0, 3, 2, 1, false);

		ModelRenderer right = new ModelRenderer(this);
		bb_main.addChild(right);
		right.setTextureOffset(124, 0).addBox(1.5F, -34.5F, 0, 1, 3, 1, false);
		right.setTextureOffset(104, 16).addBox(2.5F, -36.5F, 0, 1, 5, 1, false);
		right.setTextureOffset(108, 3).addBox(3.5F, -38.5F, 0, 1, 8, 1, false);
		right.setTextureOffset(120, 16).addBox(5.5F, -36, 0, 1, 4, 1, false);
		right.setTextureOffset(111, 11).addBox(4.5F, -37.5F, 0, 1, 7, 1, false);

		ModelRenderer left = new ModelRenderer(this);
		bb_main.addChild(left);
		left.setTextureOffset(108, 18).addBox(-2.5F, -34.5F, 0, 1, 3, 1, false);
		left.setTextureOffset(116, 3).addBox(-3.5F, -36.5F, 0, 1, 5, 1, false);
		left.setTextureOffset(104, 3).addBox(-4.5F, -38.5F, 0, 1, 8, 1, false);
		left.setTextureOffset(120, 3).addBox(-6.5F, -36, 0, 1, 4, 1, false);
		left.setTextureOffset(112, 3).addBox(-5.5F, -37.5F, 0, 1, 7, 1, false);

		ModelRenderer fixture = new ModelRenderer(this);
		bb_main.addChild(fixture);
		fixture.setTextureOffset(104, 0).addBox(-4, -32.525F, -1, 8, 1, 2, -0.001F);
		fixture.setTextureOffset(104, 12).addBox(3.5F, -32.225F, -1, 1, 2, 2, -0.001F);
		fixture.setTextureOffset(115, 13).addBox(-4.5F, -32.225F, -1, 1, 2, 2, -0.001F);

		ModelRenderer spikes = new ModelRenderer(this);
		bb_main.addChild(spikes);
		setRotateAngle(spikes, -0.2094F, -0.7854F, 0.1396F);
		spikes.setTextureOffset(115, 17).addBox(-3.75F, -35.74F, -4.125F, 1, 4, 1, 0);
		spikes.setTextureOffset(122, 12).addBox(-3.225F, -34.75F, -4.975F, 1, 3, 1, -0.07F);
		spikes.setTextureOffset(123, 7).addBox(-4.6F, -34.75F, -3.6F, 1, 3, 1, -0.07F);
	}
}