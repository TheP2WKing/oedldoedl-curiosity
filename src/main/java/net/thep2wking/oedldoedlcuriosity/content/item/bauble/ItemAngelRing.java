package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import java.util.List;

import javax.annotation.Nullable;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;

public class ItemAngelRing extends ModItemBaubleBase {
	public ItemAngelRing(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			ModelBiped baubleModel, boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(modid, name, tab, sound, baubleType, baubleModel, isBodyModel, rarity, hasEffect, tooltipLines,
				annotationLines);
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
        if (player instanceof EntityPlayer) 
        {
            EntityPlayer entity = (EntityPlayer) player;
            startFlying(entity);
        }
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		this.getEquipmentSound(player);
		if (player instanceof EntityPlayer) 
        {
            EntityPlayer entity = (EntityPlayer) player;
            stopFlying(entity);
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

		if (ModTooltips.showEffectTip() && CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_EFFECTS) {
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECT_BAUBLE);
			ModTooltips.addCustomEffectInformation(tooltip,
					"item." + OedldoedlCuriosity.MODID + ".angel_ring", 1);
		} else if (ModTooltips.showEffectTipKey() && CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_EFFECTS) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}