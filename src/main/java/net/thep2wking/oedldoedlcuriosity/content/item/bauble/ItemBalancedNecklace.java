package net.thep2wking.oedldoedlcuriosity.content.item.bauble;

import java.util.List;

import javax.annotation.Nullable;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;
import net.thep2wking.oedldoedlcuriosity.init.ModItems;
import net.thep2wking.oedldoedlcuriosity.model.ModelAmulet;

public class ItemBalancedNecklace extends ModItemBaubleBase {
	public ItemBalancedNecklace(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines,
				annotationLines);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelAmulet();
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 400, 0, false, false));
		player.removePotionEffect(MobEffects.BLINDNESS);
		player.removePotionEffect(MobEffects.GLOWING);
		player.removePotionEffect(MobEffects.HUNGER);
		player.removePotionEffect(MobEffects.INSTANT_DAMAGE);
		player.removePotionEffect(MobEffects.LEVITATION);
		player.removePotionEffect(MobEffects.MINING_FATIGUE);
		player.removePotionEffect(MobEffects.NAUSEA);
		player.removePotionEffect(MobEffects.POISON);
		player.removePotionEffect(MobEffects.SLOWNESS);
		player.removePotionEffect(MobEffects.UNLUCK);
		player.removePotionEffect(MobEffects.WEAKNESS);
		player.removePotionEffect(MobEffects.WITHER);
		EntityPlayer entity = (EntityPlayer) player;
		entity.getFoodStats().addStats(20, 20F);

		if (player.isBurning()) {
			player.extinguish();
		}
	}

	@SubscribeEvent
	public static void onLivingHurt(LivingHurtEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntityLiving();
			if (BaublesApi.isBaubleEquipped(player, ModItems.BALANCED_NECKLACE) != -1) {
				event.setCanceled(true);
			}
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
			ModTooltips.addPotionEffect(tooltip, MobEffects.NIGHT_VISION.getName(), false, 0 + 1,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
					ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 1);
					ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 2);
					ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 3);
		} else if (ModTooltips.showEffectTipKey()) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}