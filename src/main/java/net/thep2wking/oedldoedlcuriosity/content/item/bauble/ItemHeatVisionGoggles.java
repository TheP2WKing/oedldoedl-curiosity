package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;
import net.thep2wking.oedldoedlcuriosity.init.ModItems;
import net.thep2wking.oedldoedlcuriosity.model.ModelHeatVisionGoggles;
import net.minecraft.entity.Entity;

@Mod.EventBusSubscriber
public class ItemHeatVisionGoggles extends ModItemBaubleBase {
	public static List<EntityLivingBase> entitiesToRemove = new ArrayList<EntityLivingBase>();

	public ItemHeatVisionGoggles(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelHeatVisionGoggles();
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onGameRenderOverlay(RenderGameOverlayEvent.Pre event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.player;
		boolean doRender = !player.isSneaking() && CuriosityConfig.CONTENT.HEAT_VISION_GOGGLES_OVERLAY;
		if (doRender) {
			if (event.getType() != RenderGameOverlayEvent.ElementType.ALL) {
				return;
			}
			if (BaublesApi.isBaubleEquipped(player, ModItems.HEAT_VISION_GOGGLES) != -1) {
				int color = 0xCC000000;
				Gui.drawRect(0, 0, event.getResolution().getScaledWidth(), event.getResolution().getScaledHeight(),
						color);
			}
		}
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (!player.isSneaking()) {
			AxisAlignedBB aabb = new AxisAlignedBB(player.posX, player.posY, player.posZ,
					player.posX, player.posY,
					player.posZ).grow(32);
			List<EntityLivingBase> mobs = player.world.getEntitiesWithinAABB(EntityLivingBase.class, aabb,
					(Entity e) -> e != null && (e.isCreatureType(EnumCreatureType.MONSTER, false)
							|| e.isCreatureType(EnumCreatureType.WATER_CREATURE, false)
							|| e.isCreatureType(EnumCreatureType.CREATURE, false)
							|| e.isCreatureType(EnumCreatureType.AMBIENT, false)));
			if (!(player instanceof EntityPlayer)) {
				mobs.addAll(player.world.getEntitiesWithinAABB(EntityPlayer.class, aabb));
			}
			for (EntityLivingBase mob : mobs) {
				mob.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 4, 0, false, false));
				entitiesToRemove.add(mob);
			}
		} else {
			for (EntityLivingBase mob : entitiesToRemove) {
				mob.removePotionEffect(MobEffects.GLOWING);
			}
			entitiesToRemove.clear();
		}
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		for (EntityLivingBase mob : entitiesToRemove) {
			mob.removePotionEffect(MobEffects.GLOWING);
		}
		entitiesToRemove.clear();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (ModTooltips.showAnnotationTip()) {
			for (int i = 1; i <= annotationLines; ++i) {
				ModTooltips.addAnnotation(tooltip, this.getUnlocalizedName(), i);
			}
		}
		if (ModTooltips.showInfoTip()) {
			for (int i = 1; i <= tooltipLines; ++i) {
				ModTooltips.addInformation(tooltip, this.getUnlocalizedName(), i);
			}
		} else if (ModTooltips.showInfoTipKey() && !(tooltipLines == 0)) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_INFO);
		}

		if (ModTooltips.showEffectTip()) {
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECT_BAUBLE);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 1);
		} else if (ModTooltips.showEffectTipKey()) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}