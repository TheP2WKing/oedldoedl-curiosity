package net.thep2wking.oedldoedlcuriosity.config.categories;

import net.minecraftforge.common.config.Config;

public class Properties {
	@Config.Name("Baubles Use Any Slot")
	public boolean BAUBLES_USE_ANY_SLOT = false;

	@Config.Name("Baubles Do Render")
	public boolean BAUBLES_DO_RENDER = true;

	@Config.Name("Baubles Step Up")
	public boolean BAUBLES_STEP_UP = true;

	@Config.Name("Baubles Unlimited Air")
	public boolean BAUBLES_UNLIMITED_AIR = true;

	@Config.Name("Baubles Night Vision")
	public boolean BAUBLES_NIGHT_VISION = true;

	@Config.Name("effects")
	public final Effects EFFECTS = new Effects();

	public static class Effects {
		@Config.Name("Bauble Base Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int BAUBLE_BASE_DURATION = 200;
	}
}