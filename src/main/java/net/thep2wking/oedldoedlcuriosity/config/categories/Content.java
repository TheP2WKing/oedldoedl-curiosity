package net.thep2wking.oedldoedlcuriosity.config.categories;

import net.minecraftforge.common.config.Config;

public class Content {
	@Config.Name("Angel Ring Flight")
	public boolean ANGEL_RING_FLIGHT = true;

	@Config.Name("Bauble Package Random Drops")
	public boolean BAUBLE_PACKAGE_RANDOM_DROPS = true;

	@Config.Name("Bauble Package Register All Baubles As Drops")
	public boolean BAUBLE_PACKAGE_REGISTER_ALL_BAUBLES_AS_DROPS = false;

	@Config.Name("amulets")
	public final Amulets AMULETS = new Amulets();

	public static class Amulets {
		@Config.Name("Gremorium Amulet Flight")
		public boolean GREMORIUM_AMULET_FLIGHT = true;

		@Config.Name("Gremorium Amulet Removes Bad Effects")
		public boolean GREMORIUM_AMULET_REMOVES_BAD_EFFECTS = true;

		@Config.Name("Himejimarium Amulet Entities Stuck By Lightning")
		public boolean HIMEJIMARIUM_AMULET_ENTITIES_STUCK_BY_LIGHTNING = true;

		@Config.Name("Toujourium Amulet Additional Knockback")
		public boolean TOUJOURIUM_AMULET_ADDITIONAL_KNOCKBACK = true;

		@Config.Name("Toujourium Amulet Knockback Strength")
		@Config.RangeInt(min = 0, max = 100)
		public int TOUJOURIUM_AMULET_KNOCKBACK_STRENGTH = 3;

		@Config.Name("Toujourium Amulet Negates Fall Damage")
		public boolean TOUJOURIUM_AMULET_NEGATES_FALL_DAMAGE = true;

		@Config.Name("Argentorium Amulet Bonus Damage")
		public boolean ARGENTORIUM_AMULET_BONUS_DAMAGE = true;

		@Config.Name("Argentorium Amulet Fast Regeneration")
		public boolean ARGENTORIUM_AMULET_FAST_REGENERATION = true;

		@Config.Name("Quartarium Amulet Life Steal")
		public boolean QUARTARIUM_AMULET_LIFE_STEAL = true;
		
		@Config.Name("Nagatorium Amulet Nasty Effects")
		public boolean NAGATORIUM_AMULET_NASTY_EFFECTS = true;

		@Config.Name("Nagatorium Amulet Levitation")
		public boolean NAGATORIUM_AMULET_LEVITATION = true;

		@Config.Name("Nagatorium Amulet Invert Potion Effects")
		public boolean NAGATORIUM_AMULET_INVERT_POTION_EFFECTS = true;

		@Config.Name("Sakurajimarium Amulet Fast Forward Time")
		public boolean SAKURAJIMARIUM_AMULET_FAST_FORWARD_TIME = true;

		@Config.Name("Sakurajimarium Amulet Time To Skip")
		@Config.RangeInt(min = 0, max = 24000)
		public int SAKURAJIMARIUM_AMULET_TIME_SKIP = 50;

		@Config.Name("Kitagawarium Amulet Set Entities On Fire")
		public boolean KITAGAWARIUM_AMULET_SET_ENTITES_ON_FIRE = true;

		@Config.Name("Kitagawarium Amulet Attack Surrounding Entities")
		public boolean KITAGAWARIUM_AMULET_ATTACK_SURROUNDING_ENTITIES = true;

		@Config.Name("Kitagawarium Amulet Attack Radius")
		@Config.RangeInt(min = 0, max = 100)
		public int KITAGAWARIUM_AMULET_ATTACK_RADIUS = 4;

		@Config.Name("Kitagawarium Amulet Attack Damage")
		@Config.RangeInt(min = 0, max = 1000)
		public int KITAGAWARIUM_AMULET_ATTACK_DAMAGE = 2;
	}
}