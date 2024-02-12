package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.model.ModelAmulet;

public class ItemKitagawariumAmulet extends ModItemBaubleBase {
	public ItemKitagawariumAmulet(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelAmulet();
	}
}