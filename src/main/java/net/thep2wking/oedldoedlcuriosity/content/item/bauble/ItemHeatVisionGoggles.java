package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import java.util.List;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.init.ModItems;
import net.thep2wking.oedldoedlcuriosity.model.ModelBunnyEars;

@Mod.EventBusSubscriber
public class ItemHeatVisionGoggles extends ModItemBaubleBase {
	public ItemHeatVisionGoggles(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelBunnyEars();
	}

	@SubscribeEvent
	public static void onRenderOverlay(RenderGameOverlayEvent.Pre event) {
		if (event.getType() != RenderGameOverlayEvent.ElementType.ALL) {
			return;
		}

		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.player;
		if (isWearingGoggles(player)) {
			int color = 0xE6000000;
			Gui.drawRect(0, 0, event.getResolution().getScaledWidth(), event.getResolution().getScaledHeight(), color);
		}
	}

	public static boolean isWearingGoggles(EntityPlayer player) {
		if (BaublesApi.isBaubleEquipped(player, ModItems.HEAT_VISON_GOGGLES) != -1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		World world = player.world;
		if (player instanceof EntityPlayer) {
			List<EntityLivingBase> entities = world.getEntitiesWithinAABB(EntityLivingBase.class,
					player.getEntityBoundingBox().grow(40.0D));
			for (EntityLivingBase entity : entities) {
				if (entity != player) {
					entity.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 19, 0, false, false));
				}
			}
		}
	}
}