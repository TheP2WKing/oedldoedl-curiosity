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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;
import net.thep2wking.oedldoedlcuriosity.init.ModItems;
import net.thep2wking.oedldoedlcuriosity.model.ModelAmulet;

@Mod.EventBusSubscriber
public class ItemNagatoriumAmulet extends ModItemBaubleBase {
	public ItemNagatoriumAmulet(String modid, String name, CreativeTabs tab, SoundEvent sound, BaubleType baubleType,
			boolean isBodyModel, EnumRarity rarity, boolean hasEffect, int tooltipLines,
			int annotationLines) {
		super(modid, name, tab, sound, baubleType, isBodyModel, rarity, hasEffect, tooltipLines,
				annotationLines);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getBaubleModel() {
		return new ModelAmulet();
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		EntityPlayer entity = (EntityPlayer) player;

		if (CuriosityConfig.PROPERTIES.BAUBLES_STEP_UP) {
			player.stepHeight = 1.1f;
		}
		if (CuriosityConfig.PROPERTIES.BAUBLES_UNLIMITED_AIR) {
			player.setAir(300);
		}
		if (CuriosityConfig.PROPERTIES.BAUBLES_NIGHT_VISION) {
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 400, 0, false, false));
		}

		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK,
				CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION, 1, false, false));

		if (CuriosityConfig.CONTENT.AMULETS.NAGATORIUM_AMULET_INVERT_POTION_EFFECTS) {
			effectToInvert(entity, MobEffects.HUNGER, MobEffects.SATURATION);
			effectToInvert(entity, MobEffects.INSTANT_DAMAGE, MobEffects.INSTANT_HEALTH);
			effectToInvert(entity, MobEffects.MINING_FATIGUE, MobEffects.HASTE);
			effectToInvert(entity, MobEffects.POISON, MobEffects.REGENERATION);
			effectToInvert(entity, MobEffects.SLOWNESS, MobEffects.SPEED);
			effectToInvert(entity, MobEffects.WEAKNESS, MobEffects.STRENGTH);
			effectToInvert(entity, MobEffects.WITHER, MobEffects.REGENERATION);

			player.removePotionEffect(MobEffects.LEVITATION);
			player.removePotionEffect(MobEffects.BLINDNESS);
			player.removePotionEffect(MobEffects.GLOWING);
			player.removePotionEffect(MobEffects.INVISIBILITY);
			player.removePotionEffect(MobEffects.NAUSEA);
		}
	}

	public static void effectToInvert(EntityPlayer player, Potion effectIn, Potion effectOut) {
		if (player.isPotionActive(effectIn)) {
			player.removePotionEffect(effectIn);
			player.addPotionEffect(new PotionEffect(effectOut, 400, 1, false, false));
		}
	}

	@SubscribeEvent
	public static void onLivingHurt(LivingHurtEvent event) {
		if (event.getSource() instanceof EntityDamageSource
				&& !((EntityDamageSource) event.getSource()).getIsThornsDamage()) {
			if (event.getSource().getTrueSource() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
				if (BaublesApi.isBaubleEquipped(player, ModItems.NAGATORIUM_AMULET) != -1) {
					EntityLivingBase target = event.getEntityLiving();
					if (CuriosityConfig.CONTENT.AMULETS.NAGATORIUM_AMULET_NASTY_EFFECTS) {
						target.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 60, 0, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 60, 3, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 100, 0, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 60, 4, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 60, 0, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.POISON, 60, 3, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, 60, 9, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 60, 2, false, false));
						target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 60, 2, false, false));
					}
					if (player.isSneaking() && CuriosityConfig.CONTENT.AMULETS.NAGATORIUM_AMULET_LEVITATION) {
						target.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 100, false, false));
					}
				}
			}
		}
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		this.getEquipmentSound(player);
		if (player instanceof EntityPlayer) {
			EntityPlayer entity = (EntityPlayer) player;
			entity.stepHeight = 0.6F;
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
			ModTooltips.addPotionEffect(tooltip, MobEffects.NIGHT_VISION.getName(), false, 1, 400);
			ModTooltips.addPotionEffect(tooltip, MobEffects.UNLUCK.getName(), true, 2,
					CuriosityConfig.PROPERTIES.EFFECTS.BAUBLE_BASE_DURATION);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 1);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 2);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 3);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 4);
			ModTooltips.addCustomEffectInformation(tooltip, this.getUnlocalizedName(), 5);
		} else if (ModTooltips.showEffectTipKey()) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
	}
}