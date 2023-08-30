package net.thep2wking.oedldoedlcuriosity.registry;

import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.init.ModItems;

public class ModRecipes {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(OedldoedlCuriosity.MODID);

		ModRecipeHelper.addOreDict("fabric", ModItems.MAGIC_FABRIC, 0);
		ModRecipeHelper.addOreDict("fabricMagic", ModItems.MAGIC_FABRIC, 0);

		ModRecipeHelper.addOreDict("safetyPin", ModItems.SAFETY_PIN, 0);
		ModRecipeHelper.addOreDict("electricalComponent", ModItems.ELECTRICAL_COMPONENT, 0);
		ModRecipeHelper.addOreDict("speaker", ModItems.SPEAKER, 0);
		ModRecipeHelper.addOreDict("rubberBand", ModItems.RUBBER_BAND, 0);
		ModRecipeHelper.addOreDict("glassesLens", ModItems.LENS, 0);
	}

	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(OedldoedlCuriosity.MODID);
	}
}