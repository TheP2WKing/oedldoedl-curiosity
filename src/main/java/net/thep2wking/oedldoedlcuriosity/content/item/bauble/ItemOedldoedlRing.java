package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import java.util.List;

import javax.annotation.Nullable;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
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

public class ItemOedldoedlRing extends ModItemBaubleBase {
	public ItemOedldoedlRing(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			ModelBiped baubleModel, boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(modid, name, tab, sound, baubleType, baubleModel, isBodyModel, rarity, hasEffect, tooltipLines,
				annotationLines);
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 0, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.HASTE,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.LUCK,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 0, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.SATURATION,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 0, false, false));
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
			ModTooltips.addPotionEffect(tooltip, MobEffects.WATER_BREATHING.getName(), false, 0 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.FIRE_RESISTANCE.getName(), false, 0 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.REGENERATION.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.JUMP_BOOST.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.NIGHT_VISION.getName(), false, 0 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.RESISTANCE.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.SATURATION.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.STRENGTH.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.SPEED.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.HASTE.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addPotionEffect(tooltip, MobEffects.LUCK.getName(), false, 1 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
		} else if (ModTooltips.showEffectTipKey() && CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_EFFECTS) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}