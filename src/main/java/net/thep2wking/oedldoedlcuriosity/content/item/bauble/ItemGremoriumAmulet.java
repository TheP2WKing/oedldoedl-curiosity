package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import java.util.List;

import javax.annotation.Nullable;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;
import net.thep2wking.oedldoedlcuriosity.model.ModelAmulet;

public class ItemGremoriumAmulet extends ModItemBaubleBase {
	public ItemGremoriumAmulet(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines,
				annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelAmulet();
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		EntityPlayer entity = (EntityPlayer) player;

		if (CuriosityConfig.PROPERTIES.BAUBLES_STEP_UP) {
			player.stepHeight = 1.1f;
		}
		if (CuriosityConfig.PROPERTIES.BAUBLES_UNLIMITED_AIR) {
			player.setAir(300);
		}
		if (CuriosityConfig.PROPERTIES.BAUBLES_NIGHT_VISION) {
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 400, 0, false, false));
		}

		if (CuriosityConfig.CONTENT.AMULETS.GREMORIUM_AMULET_FLIGHT) {
			startFlying(entity);
		}

		if (CuriosityConfig.CONTENT.AMULETS.GREMORIUM_AMULET_REMOVES_BAD_EFFECTS) {
			player.removePotionEffect(MobEffects.POISON);
			player.removePotionEffect(MobEffects.INSTANT_DAMAGE);
			player.removePotionEffect(MobEffects.WITHER);
		}

		player.addPotionEffect(new PotionEffect(MobEffects.HASTE,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
	}

	public void startFlying(EntityPlayer player) {
		player.capabilities.allowFlying = true;
		if (!player.getEntityWorld().isRemote) {
			player.sendPlayerAbilities();
		}
	}

	public void stopFlying(EntityPlayer player) {
		if (!player.getEntityWorld().isRemote && !player.isCreative() && !player.isSpectator()) {
			player.capabilities.isFlying = false;
			player.capabilities.allowFlying = false;
			player.sendPlayerAbilities();
		}
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		this.getEquipmentSound(player);
		if (player instanceof EntityPlayer) {
			EntityPlayer entity = (EntityPlayer) player;
			startFlying(entity);
		}
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		this.getEquipmentSound(player);
		if (player instanceof EntityPlayer) {
			EntityPlayer entity = (EntityPlayer) player;
			stopFlying(entity);
			if (!entity.isCreative() && !entity.isSpectator()) {
				entity.capabilities.allowFlying = false;
				entity.capabilities.isFlying = false;
			}
			entity.stepHeight = 0.6F;
		}
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
			ModTooltips.addPotionEffect(tooltip, MobEffects.NIGHT_VISION.getName(), false, 1, 400);
			ModTooltips.addPotionEffect(tooltip, MobEffects.HASTE.getName(), false, 2,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 1);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 2);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 3);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 4);
		} else if (ModTooltips.showEffectTipKey()) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}