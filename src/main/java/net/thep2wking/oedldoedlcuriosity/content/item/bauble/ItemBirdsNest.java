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
import net.thep2wking.oedldoedlcuriosity.model.ModelBirdsNest;

public class ItemBirdsNest extends ModItemBaubleBase {
	public ItemBirdsNest(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelBirdsNest();
	}

	@Override
	public Multimap<IAttribute, AttributeModifier> getBaubleAttributeModifiers() {
		Multimap<IAttribute, AttributeModifier> multimap = super.getBaubleAttributeModifiers();
		multimap.put(SharedMonsterAttributes.MAX_HEALTH,
				new AttributeModifier(ModReferences.ATTRIBUTE_MAX_HEALTH, 2, AttributeModifierOperation.ADD));
		return multimap;
	}
}