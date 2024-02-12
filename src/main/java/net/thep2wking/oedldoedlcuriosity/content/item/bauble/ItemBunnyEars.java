package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleEffectBase;
import net.thep2wking.oedldoedlcuriosity.model.ModelBunnyEars;

public class ItemBunnyEars extends ModItemBaubleEffectBase {
	public ItemBunnyEars(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, Potion effect, int amplifier, boolean isDebuff, EnumRarity rarity, boolean hasEffect,
			int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, effect, amplifier, isDebuff, rarity, hasEffect, tooltipLines,
		        annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelBunnyEars();
	}
}