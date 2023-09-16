package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import baubles.api.BaubleType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;

public class ItemPlumbob extends ModItemBaubleBase {
	public ItemPlumbob(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			ModelBiped baubleModel, boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(modid, name, tab, sound, baubleType, baubleModel, isBodyModel, rarity, hasEffect, tooltipLines,
				annotationLines);
	}

	private boolean hasBaubleRender = true;

    public Item setNoRender() {
        hasBaubleRender = false;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void onPlayerBaubleRender(ItemStack itemStack, EntityPlayer player, RenderType renderType,
            float partialTicks) {
        if (!this.isBodyModel && hasBaubleRender) {
            if (renderType != RenderType.HEAD)
                return;

            Minecraft.getMinecraft().renderEngine.bindTexture(getTexture());
            Helper.translateToHeadLevel(player);

            float s = 1.0F / 16F;
            GlStateManager.scale(s, s, s);
            GlStateManager.rotate(-90, 0, 1, 0);

            // rendering of baubles is slighty offset (default = y26)
            if (!player.isSneaking()) {
                GlStateManager.translate(0, 26.075, 0);
            } else {
                GlStateManager.translate(0, 26.125, 0);
            }

            if (baubleModel == null)
                baubleModel = getBaubleModel();

            if (CuriosityConfig.PROPERTIES.BAUBLE_RENDER && hasBaubleRender) {
                baubleModel.bipedHead.render(1);
                baubleModel.setRotationAngles(player.limbSwing, player.limbSwingAmount, player.ticksExisted,
                        player.cameraYaw, player.cameraPitch, s, player);
            }
        } else if (this.isBodyModel && hasBaubleRender) {
            if (renderType != RenderType.BODY)
                return;

            Minecraft.getMinecraft().renderEngine.bindTexture(getTexture());
            Helper.rotateIfSneaking(player);

            float s = 1.0F / 16F;
            GlStateManager.scale(s, s, s);

            if (baubleModel == null)
                baubleModel = getBaubleModel();

            if (CuriosityConfig.PROPERTIES.BAUBLE_RENDER && hasBaubleRender) {
                baubleModel.bipedBody.render(1);
                baubleModel.setRotationAngles(player.limbSwing, player.limbSwingAmount, player.ticksExisted,
                        player.cameraYaw, player.cameraPitch, s, player);
            }
        }
    }
}