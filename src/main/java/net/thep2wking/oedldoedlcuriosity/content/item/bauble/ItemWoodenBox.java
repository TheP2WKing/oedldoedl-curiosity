package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import com.google.common.collect.Multimap;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.item.EnumRarity;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Constants.AttributeModifierOperation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleEffectBase;
import net.thep2wking.oedldoedlcuriosity.model.ModelWoodenBox;

public class ItemWoodenBox extends ModItemBaubleEffectBase {
	public ItemWoodenBox(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, Potion effect, int amplifier, boolean isDebuff, EnumRarity rarity, boolean hasEffect,
			int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, effect, amplifier, isDebuff, rarity, hasEffect,
				tooltipLines, annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelWoodenBox();
	}

	@Override
	public Multimap<IAttribute, AttributeModifier> getBaubleAttributeModifiers() {
		Multimap<IAttribute, AttributeModifier> multimap = super.getBaubleAttributeModifiers();
		multimap.put(SharedMonsterAttributes.MAX_HEALTH,
				new AttributeModifier(ModReferences.ATTRIBUTE_MAX_HEALTH, 8, AttributeModifierOperation.ADD));
		return multimap;
	}
}