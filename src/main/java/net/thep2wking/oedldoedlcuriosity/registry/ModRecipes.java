package net.thep2wking.oedldoedlcuriosity.registry;

import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;

public class ModRecipes {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(OedldoedlCuriosity.MODID);
	}

	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(OedldoedlCuriosity.MODID);
	}
}