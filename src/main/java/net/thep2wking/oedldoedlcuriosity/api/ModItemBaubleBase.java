package net.thep2wking.oedldoedlcuriosity.api;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;
import baubles.api.cap.IBaublesItemHandler;
import baubles.api.render.IRenderBauble;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;

/**
 * @author TheP2WKing
 */
public class ModItemBaubleBase extends ModItemBase implements IBauble, IRenderBauble {
    public final SoundEvent sound;
    public final BaubleType baubleType;
    public ModelBiped baubleModel;
    public final boolean isBodyModel;

    /**
     * @author TheP2WKing
     * @param modid           String
     * @param name            String
     * @param tab             {@link CreativeTabs}
     * @param sound           {@link SoundEvent}
     * @param baubleType      {@link BaubleType}
     * @param baubleModel     {@link ModelBiped}
     * @param isBodyModel     boolean
     * @param rarity          {@link EnumRarity}
     * @param hasEffect       boolean
     * @param tooltipLines    int
     * @param annotationLines int
     */
    public ModItemBaubleBase(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
            ModelBiped baubleModel, boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines,
            int annotationLines) {
        super(modid, name, tab, rarity, hasEffect, tooltipLines, annotationLines);
        this.sound = sound;
        this.baubleType = baubleType;
        this.baubleModel = baubleModel;
        this.isBodyModel = isBodyModel;
        setMaxStackSize(1);
    }

    private boolean hasBaubleRender = true;

    public Item setNoRender() {
        hasBaubleRender = false;
        return this;
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        if (CuriosityConfig.PROPERTIES.BAUBLE_USE_ANY_SLOT) {
            return BaubleType.TRINKET;
        }
        return baubleType;
    }

    @SuppressWarnings("null")
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        if (!world.isRemote) {
            IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
            for (int i = 0; i < baubles.getSlots(); i++)
                if ((baubles.getStackInSlot(i) == null || baubles.getStackInSlot(i).isEmpty())
                        && baubles.isItemValidForSlot(i, player.getHeldItem(hand), player)) {
                    baubles.setStackInSlot(i, player.getHeldItem(hand).copy());
                    if (!player.capabilities.isCreativeMode) {
                        player.inventory.setInventorySlotContents(player.inventory.currentItem, ItemStack.EMPTY);
                    }
                    onEquipped(player.getHeldItem(hand), player);
                    break;
                }
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }

    public void getEquipmentSound(EntityLivingBase player) {
        player.playSound(sound, 0.75f, 1f);
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        this.getEquipmentSound(player);
    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        this.getEquipmentSound(player);
    }

    public ModelBiped getBaubleModel() {
        return baubleModel;
    }

    public ResourceLocation getTexture() {
        return new ResourceLocation(modid, "textures/models/bauble/" + name + ".png");
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