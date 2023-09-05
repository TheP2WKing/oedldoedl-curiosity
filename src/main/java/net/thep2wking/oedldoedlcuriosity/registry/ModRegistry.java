package net.thep2wking.oedldoedlcuriosity.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.init.ModItems;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(OedldoedlCuriosity.MODID);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(OedldoedlCuriosity.MODID);

		ModRegistryHelper.registerItem(event, ModItems.BUNNY_EARS);
		ModRegistryHelper.registerItem(event, ModItems.CAT_EARS);
		ModRegistryHelper.registerItem(event, ModItems.RED_KYORYUU_HORNS);
		ModRegistryHelper.registerItem(event, ModItems.BLUE_KYORYUU_HORNS);
		ModRegistryHelper.registerItem(event, ModItems.PANTSU);
		ModRegistryHelper.registerItem(event, ModItems.MEGUMIN_PANTSU);
		ModRegistryHelper.registerItem(event, ModItems.KITTY_HEADSET);
		ModRegistryHelper.registerItem(event, ModItems.MINEPODS_MAX);
		ModRegistryHelper.registerItem(event, ModItems.PYLONE);
		ModRegistryHelper.registerItem(event, ModItems.PLUNGER);
		ModRegistryHelper.registerItem(event, ModItems.CYLINDER);
		ModRegistryHelper.registerItem(event, ModItems.MEGUMIN_HAT);
		ModRegistryHelper.registerItem(event, ModItems.CHAINSAW_HAT);
		ModRegistryHelper.registerItem(event, ModItems.CROWN);
		ModRegistryHelper.registerItem(event, ModItems.FLYING_SHOOTING_BASECAP);
		ModRegistryHelper.registerItem(event, ModItems.BUNNY_CAP);
		ModRegistryHelper.registerItem(event, ModItems.STRAW_HAT);
		ModRegistryHelper.registerItem(event, ModItems.GLASSES);
		ModRegistryHelper.registerItem(event, ModItems.SUNGLASSES);
		ModRegistryHelper.registerItem(event, ModItems.FANCY_SUNGLASSES);
		ModRegistryHelper.registerItem(event, ModItems.AMAZING_TECHNICOLOR_GLASSES);
		ModRegistryHelper.registerItem(event, ModItems.THREE_D_GLASSES);
		ModRegistryHelper.registerItem(event, ModItems.LEAF_HEADBAND);
		ModRegistryHelper.registerItem(event, ModItems.MONOCLE);
		ModRegistryHelper.registerItem(event, ModItems.GOOGLY_EYES);
		ModRegistryHelper.registerItem(event, ModItems.MOUSTAGE);
		ModRegistryHelper.registerItem(event, ModItems.FAKE_ARROW);

		ModRegistryHelper.registerItem(event, ModItems.WOODEN_BOX);
		ModRegistryHelper.registerItem(event, ModItems.TRAVELLERS_WINGS);
		ModRegistryHelper.registerItem(event, ModItems.DEMONIC_WINGS);
		ModRegistryHelper.registerItem(event, ModItems.DEVIL_WINGS);
		ModRegistryHelper.registerItem(event, ModItems.DEVIL_TAIL);

		ModRegistryHelper.registerItem(event, ModItems.MINEPODS);
		ModRegistryHelper.registerItem(event, ModItems.MINEPODS_PRO);

		ModRegistryHelper.registerItem(event, ModItems.GREMORIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.HIMEJIMARIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.TOUJOURIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.ARGENTORIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.QUARTARIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.NAGATORIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.SAKURAJIMARIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.KITAGAWARIUM_AMULET);
		ModRegistryHelper.registerItem(event, ModItems.BALANCED_NECKLACE);

		ModRegistryHelper.registerItem(event, ModItems.BASE_RING);
		ModRegistryHelper.registerItem(event, ModItems.BEDROCKIUM_RING);
		ModRegistryHelper.registerItem(event, ModItems.OEDLDOEDL_RING);
		ModRegistryHelper.registerItem(event, ModItems.ANGEL_RING);

		ModRegistryHelper.registerItem(event, ModItems.LOADING_CASE);
		ModRegistryHelper.registerItem(event, ModItems.PRO_LOADING_CASE);
		ModRegistryHelper.registerItem(event, ModItems.MAGIC_FABRIC);
		ModRegistryHelper.registerItem(event, ModItems.SAFETY_PIN);
		ModRegistryHelper.registerItem(event, ModItems.ELECTRICAL_COMPONENT);
		ModRegistryHelper.registerItem(event, ModItems.SPEAKER);
		ModRegistryHelper.registerItem(event, ModItems.RUBBER_BAND);
		ModRegistryHelper.registerItem(event, ModItems.LENS);
	}
}