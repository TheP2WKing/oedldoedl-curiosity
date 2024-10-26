package net.thep2wking.oedldoedlcuriosity.config.categories;

import net.minecraftforge.common.config.Config;

public class Client {
	public enum EyeOffset {
		DEFAULT(0),
		UP(1),
		DOWN(-1),
		;

		public final double offset;

		private EyeOffset(double offset) {
			this.offset = offset;
		}

		public double getOffset() {
			return this.offset;
		}
	}

	@Config.Name("Bauble Model Eye Offset")
	public EyeOffset BAUBLE_MODEL_EYE_OFFSET = EyeOffset.DEFAULT;


	@Config.Name("Baubles Render Model")
	public boolean BAUBLES_RENDER_MODEL = true;

	@Config.Name("Baubles Render Enchantment Glint")
	public boolean BAUBLES_RENDER_ENCHANTMENT_GLINT = true;
}
