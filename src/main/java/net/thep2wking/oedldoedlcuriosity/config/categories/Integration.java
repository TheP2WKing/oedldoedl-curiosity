package net.thep2wking.oedldoedlcuriosity.config.categories;

import net.minecraftforge.common.config.Config;

public class Integration {
	@Config.Name("jei")
	public final JEI JEI = new JEI();

	public static class JEI {
		@Config.Name("Bauble Package Recipe Category")
		public boolean BAUBLE_PACKAGE_RECIPE_CATEGORY = true;
	}
}