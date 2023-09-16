package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelBirdNest extends ModModelBaubleBase {
	public ModelBirdNest(float modelSize) {
		super(modelSize);

		ModelRenderer nest = new ModelRenderer(this);
		bipedHead.addChild(nest);
		nest.setRotationPoint(0, 24, 0);
		nest.setTextureOffset(98, 0).addBox(-3, -33, -3, 6, 1, 6, false);
		nest.setTextureOffset(114, 10).addBox(-3, -34.5F, -4, 6, 2, 1, false);
		nest.setTextureOffset(114, 7).addBox(-3, -34.5F, 3, 6, 2, 1, false);
		nest.setTextureOffset(106, 9).addBox(3, -34.5F, -3, 1, 2, 6, false);
		nest.setTextureOffset(98, 7).addBox(-4, -34.5F, -3, 1, 2, 6, false);

		ModelRenderer eggs = new ModelRenderer(this);
		bipedHead.addChild(eggs);
		eggs.setRotationPoint(0, 24, 0);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		eggs.addChild(cube_r1);
		setRotateAngle(cube_r1, 0, 0.1309F, 0);
		cube_r1.setTextureOffset(98, 15).addBox(-0.5F, -35, 0.5F, 3, 2, 2, false);

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0, 0, 0);
		eggs.addChild(cube_r2);
		setRotateAngle(cube_r2, 0, 0.2618F, 0);
		cube_r2.setTextureOffset(106, 17).addBox(0.5F, -35.5F, -2, 2, 3, 2, false);

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0, 0, 0);
		eggs.addChild(cube_r3);
		setRotateAngle(cube_r3, 0, -0.3491F, 0);
		cube_r3.setTextureOffset(114, 17).addBox(-2.5F, -35.5F, -0.5F, 2, 3, 2, false);
	}
}