package net.thep2wking.oedldoedlcuriosity.api;

import java.util.List;

import javax.annotation.Nullable;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;

public class ModItemBaubleEffectBase extends ModItemBaubleBase {
	public final Potion effect;
	public final int amplifier;
	public final boolean isDebuff;

	public ModItemBaubleEffectBase(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			ModelBiped baubleModel, boolean isBodyModel, Potion effect, int amplifier, boolean isDebuff,
			EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, baubleModel, isBodyModel, rarity, hasEffect, tooltipLines,
				annotationLines);
		this.effect = effect;
		this.amplifier = amplifier;
		this.isDebuff = isDebuff;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(effect, CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION,
				amplifier, false, false));
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
			ModTooltips.addPotionEffect(tooltip, effect.getName(), isDebuff, amplifier + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
		} else if (ModTooltips.showEffectTipKey() && CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_EFFECTS) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}