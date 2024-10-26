package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import com.google.common.collect.Multimap;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Constants.AttributeModifierOperation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.model.ModelChainsawHat;

public class ItemChainsawHat extends ModItemBaubleBase {
	public ItemChainsawHat(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelChainsawHat();
	}

	@Override
	public Multimap<IAttribute, AttributeModifier> getBaubleAttributeModifiers() {
		Multimap<IAttribute, AttributeModifier> multimap = super.getBaubleAttributeModifiers();
		multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE, new AttributeModifier(ModReferences.ATTRIBUTE_ATTACK_DAMAGE,
				0.25, AttributeModifierOperation.ADD_MULTIPLE));
		return multimap;
	}
}