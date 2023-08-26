package net.thep2wking.oedldoedlcuriosity.content.item.bauble.head;

import baubles.api.BaubleType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.thep2wking.oedldoedlcore.api.integration.baubles.ModItemBaubleBase;

public class ItemBunnyEars extends ModItemBaubleBase {
	public ItemBunnyEars(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			ModelBiped baubleModel, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, sound, baubleType, baubleModel, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 200, 0, false, false));
	}
}