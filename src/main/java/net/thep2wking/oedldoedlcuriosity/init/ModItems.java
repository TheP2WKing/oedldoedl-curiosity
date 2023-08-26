package net.thep2wking.oedldoedlcuriosity.init;

import baubles.api.BaubleType;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.head.ItemBunnyEars;
import net.thep2wking.oedldoedlcuriosity.model.ModelBunnyEars;

public class ModItems {
	public static final Item BUNNY_EARS = new ItemBunnyEars(OedldoedlCuriosity.MODID, "bunny_ears",
			OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelBunnyEars(1),
			ModRarities.AQUA, false, 2, 0);
}