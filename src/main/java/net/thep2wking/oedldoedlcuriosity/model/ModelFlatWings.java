package net.thep2wking.oedldoedlcuriosity.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.thep2wking.oedldoedlcuriosity.api.ModModelBaubleBase;

public class ModelFlatWings extends ModModelBaubleBase {
	ModelRenderer cube_r1 = new ModelRenderer(this);
	ModelRenderer cube_r2 = new ModelRenderer(this);

	public ModelFlatWings(float modelSize) {
		super(modelSize);

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0, 25, -0.1F);
		bipedBody.addChild(bb_main);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r1);
		setRotateAngle(cube_r1, 0, -0.1309F, 0);
		cube_r1.setTextureOffset(86, 0).addBox(1.7F, -35, 1.6F, 20, 30, 1, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0, 0, 0);
		bb_main.addChild(cube_r2);
		setRotateAngle(cube_r2, 0, 0.1309F, 0);
		cube_r2.setTextureOffset(86, 31).addBox(-21.7F, -35, 1.6F, 20, 30, 1, false);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float partialTick, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, partialTick, netHeadYaw, headPitch, scaleFactor, entityIn);
		{
			EntityPlayer player = (EntityPlayer) entityIn;
			float slow = 10f;
			float fly = 5f;
			if (player.capabilities.isFlying) {
				this.cube_r2.rotateAngleY = MathHelper.sin(partialTick / fly) / 5 + 0.6f; // 3 +0.6 6 0.5
				this.cube_r1.rotateAngleY = -MathHelper.sin(partialTick / fly) / 5 - 0.6f;
			} else {
				this.cube_r2.rotateAngleY = MathHelper.sin(partialTick / slow) / 5 + 0.6f; // 3 +0.6 6 0.5
				this.cube_r1.rotateAngleY = -MathHelper.sin(partialTick / slow) / 5 - 0.6f;
			}
		}
	}
}