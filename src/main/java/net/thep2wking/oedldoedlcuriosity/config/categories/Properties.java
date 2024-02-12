package net.thep2wking.oedldoedlcuriosity.config.categories;

import net.minecraftforge.common.config.Config;

public class Properties {
	@Config.Name("Baubles Use Any Slot")
	public boolean BAUBLE_USE_ANY_SLOT = false;

	@Config.Name("Bauble Do Render")
	public boolean BAUBLE_RENDER = true;

	@Config.Name("effects")
	public final Effects EFFECTS = new Effects();

	public static class Effects {
		@Config.Name("Bauble Base Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int BAUBLE_BASE_DURATION = 200;
	}
}