package net.thep2wking.oedldoedlcuriosity.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;
import net.thep2wking.oedldoedlcuriosity.init.ModBlocks;
import net.thep2wking.oedldoedlcuriosity.init.ModItems;
import net.thep2wking.oedldoedlcuriosity.util.ModCuriosityRecipeHelper;

public class ModRecipes {
	public static void registerOreDict() {
		if (CuriosityConfig.RECIPES.DEFAULT_OREDICT) {
			ModLogger.registeredOreDictLogger(OedldoedlCuriosity.MODID);

			ModRecipeHelper.addOreDict("ringBase", ModItems.BASE_RING, 0);
			ModRecipeHelper.addOreDict("fabric", ModItems.MAGIC_FABRIC, 0);
			ModRecipeHelper.addOreDict("fabricMagic", ModItems.MAGIC_FABRIC, 0);
			ModRecipeHelper.addOreDict("safetyPin", ModItems.SAFETY_PIN, 0);
			ModRecipeHelper.addOreDict("electricalComponent", ModItems.ELECTRICAL_COMPONENT, 0);
			ModRecipeHelper.addOreDict("speaker", ModItems.SPEAKER, 0);
			ModRecipeHelper.addOreDict("rubberBand", ModItems.RUBBER_BAND, 0);
			ModRecipeHelper.addOreDict("glassesLens", ModItems.LENS, 0);

			ModRecipeHelper.addOreDict("bauble", ModItems.BUNNY_EARS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.CAT_EARS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.RED_KYORYUU_HORNS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.BLUE_KYORYUU_HORNS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.DEVIL_HORNS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.PANTSU, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.MEGUMIN_PANTSU, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.KITTY_HEADSET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.MINEPODS_MAX, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.PYLONE, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.PLUNGER, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.TOP_HAT, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.MEGUMIN_HAT, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.CHAINSAW_HAT, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.CROWN, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.FLYING_SHOOTING_BASECAP, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.BUNNY_CAP, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.STRAW_HAT, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.BIRDS_NEST, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.PLUMBOB, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.GLASSES, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.SUNGLASSES, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.FANCY_SUNGLASSES, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.AMAZING_TECHNICOLOR_GLASSES, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.THREE_D_GLASSES, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.LEAF_HEADBAND, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.MONOCLE, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.GOOGLY_EYES, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.MOUSTAGE, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.FAKE_ARROW, 0);

			ModRecipeHelper.addOreDict("bauble", ModItems.WOODEN_BOX, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.TRAVELLERS_WINGS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.DEMONIC_WINGS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.DEVIL_WINGS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.DEVIL_TAIL, 0);

			ModRecipeHelper.addOreDict("bauble", ModItems.MINEPODS, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.MINEPODS_PRO, 0);

			ModRecipeHelper.addOreDict("bauble", ModItems.GREMORIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.HIMEJIMARIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.TOUJOURIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.ARGENTORIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.QUARTARIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.NAGATORIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.SAKURAJIMARIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.KITAGAWARIUM_AMULET, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.BALANCED_NECKLACE, 0);

			ModRecipeHelper.addOreDict("bauble", ModItems.BASE_RING, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.BEDROCKIUM_RING, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.OEDLDOEDL_RING, 0);
			ModRecipeHelper.addOreDict("bauble", ModItems.ANGEL_RING, 0);
		}
	}

	public static void registerRecipes() {
		if (CuriosityConfig.RECIPES.DEFAULT_RECIPES) {
			ModLogger.registeredRecipesLogger(OedldoedlCuriosity.MODID);

			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "bauble_package",
					new ItemStack(ModBlocks.BAUBLE_PACKAGE, 1, 0), "AAA", "BCB", "AAA", 'A', "slabWood", 'B', "paper",
					'C', "ringBase");

			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "bunny_ears",
					new ItemStack(ModItems.BUNNY_EARS, 1, 0), "A A", "A A", "ABA", 'A', "fabricBlack", 'B',
					"safetyPin");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "cat_ears",
					new ItemStack(ModItems.CAT_EARS, 1, 0), "A A", "BCB", 'A', "fabricPink", 'B', "fabricWhite", 'C',
					"safetyPin");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "red_kyoryuu_horns",
					new ItemStack(ModItems.RED_KYORYUU_HORNS, 1, 0), "A A", "ABA", "ACA", 'A', "bone", 'B', "dyeRed",
					'C', "safetyPin");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "blue_kyoryuu_horns",
					new ItemStack(ModItems.BLUE_KYORYUU_HORNS, 1, 0), "  A", "ABA", "ACA", 'A', "bone", 'B', "dyeBlue",
					'C', "safetyPin");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "pantsu", new ItemStack(ModItems.PANTSU, 1, 0),
					"ABA", " B ", 'A', "fabricWhite", 'B', "fabricLightBlue");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "megumin_pantsu",
					new ItemStack(ModItems.MEGUMIN_PANTSU, 1, 0), "ABA", " A ", 'A', "fabricBlack", 'B', "fabricWhite");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "kitty_headset",
					new ItemStack(ModItems.KITTY_HEADSET, 1, 0), "ABA", "CDC", "AEA", 'A', "fabricPink", 'B',
					"fabricWhite", 'C', "speaker", 'D', "electricalComponent", 'E', "ingotIron");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "minepods_max",
					new ItemStack(ModItems.MINEPODS_MAX, 1, 0), "ABA", "CDC", "AEA", 'A', "ingotIron", 'B',
					"fabricWhite", 'C', "speaker", 'D', "electricalComponent", 'E',
					new ItemStack(Blocks.STONE_BUTTON, 1, 0));
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "pylone", new ItemStack(ModItems.PYLONE, 1, 0),
					" A ", "BBB", "AAA", 'A', new ItemStack(Blocks.CONCRETE, 1, 1), 'B',
					new ItemStack(Blocks.CONCRETE, 1, 0));
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "plunger", new ItemStack(ModItems.PLUNGER, 1, 0),
					" AB", " CA", "C  ", 'A', "dyeRed", 'B', "sponge", 'C', "stickWood");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "top_hat",
					new ItemStack(ModItems.TOP_HAT, 1, 0), " A ", "BAB", "ABA", 'A', "fabricBlack", 'B', "fabricRed");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "megumin_hat",
					new ItemStack(ModItems.MEGUMIN_HAT, 1, 0), " A ", "AAA", "AAA", 'A', "fabricMagic");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "chainsaw_hat",
					new ItemStack(ModItems.CHAINSAW_HAT, 1, 0), "ABB", "CDE", "AEF", 'A', "ingotIron", 'B',
					new ItemStack(Blocks.CONCRETE, 1, 1), 'C', "blockIron", 'D', new ItemStack(Blocks.CONCRETE, 1, 0),
					'E', new ItemStack(Blocks.CONCRETE, 1, 15), 'F', "electricalComponent");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "crown", new ItemStack(ModItems.CROWN, 1, 0),
					"AAA", "BCB", "DAD", 'A', "blockGold", 'B', "blockEmerald", 'C', "blockRedstone", 'D',
					"blockLapis");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "flying_shooting_basecap",
					new ItemStack(ModItems.FLYING_SHOOTING_BASECAP, 1, 0), "ABA", "ACA", " A ", 'A', "fabricBlack", 'B',
					"fabricLightGray", 'C', "fabricLightBlue");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "bunny_cap",
					new ItemStack(ModItems.BUNNY_CAP, 1, 0), "ABA", "ABA", " A ", 'A', "fabricBlack", 'B',
					"fabricWhite");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "straw_hat",
					new ItemStack(ModItems.STRAW_HAT, 1, 0), "AAA", "ABA", 'A', "cropWheat", 'B', "rubberBand");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "birds_nest",
					new ItemStack(ModItems.BIRDS_NEST, 1, 0), "ABA", "CAC", 'A', "stickWood", 'B', "egg", 'C',
					"cropWheat");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "plumbob", new ItemStack(ModItems.PLUMBOB, 1, 0),
					"A", "B", "C", 'A', "dyeLime", 'B', "gemEmerald", 'C', "dyeGreen");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "glasses", new ItemStack(ModItems.GLASSES, 1, 0),
					"A A", "ABA", "CDC", 'A', "ingotIron", 'B', "dyeBlack", 'C', "glassesLens", 'D', "nuggetIron");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "sunglasses",
					new ItemStack(ModItems.SUNGLASSES, 1, 0), " A ", "ABA", " A ", 'A', "dyeBlack", 'B',
					new ItemStack(ModItems.GLASSES, 1, 0));
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "fancy_sunglasses",
					new ItemStack(ModItems.FANCY_SUNGLASSES, 1, 0), " A ", "BCD", " A ", 'A', "dyeBrown", 'B',
					"dyeYellow", 'C', new ItemStack(ModItems.GLASSES, 1, 0), 'D', "dyeGray");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "amazing_technicolor_glasses",
					new ItemStack(ModItems.AMAZING_TECHNICOLOR_GLASSES, 1, 0), "ABC", "DEF", "GHI", 'A', "dyeYellow",
					'B', "dyeOrange", 'C', "dyeRed", 'D', "dyeLime", 'E', new ItemStack(ModItems.GLASSES, 1, 0), 'F',
					"dyeLightBlue", 'G', "dyePurple", 'H', "dyePink", 'I', "dyeBlue");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "3d_glasses",
					new ItemStack(ModItems.THREE_D_GLASSES, 1, 0), " A ", "BCD", " A ", 'A', "dyeWhite", 'B', "dyeRed",
					'C', new ItemStack(ModItems.GLASSES, 1, 0), 'D', "dyeBlue");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "thug_life_glasses",
					new ItemStack(ModItems.THUG_LIFE_GLASSES, 1, 0), " A ", "BCD", " A ", 'A', "dyeBlack", 'B',
					"listAllwater", 'C', new ItemStack(ModItems.GLASSES, 1, 0), 'D', "cobweb");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "joint", new ItemStack(ModItems.JOINT, 1, 0),
					"AB ", "BAB", " BA", 'A', "grassPlant", 'B', "paper");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "leaf_headband",
					new ItemStack(ModItems.LEAF_HEADBAND, 1, 0), "AAA", "BCB", "AAA", 'A', "fabricBlack", 'B',
					"ingotIron", 'C', "dyeGray");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "monocle", new ItemStack(ModItems.MONOCLE, 1, 0),
					" A ", "ABA", " AC", 'A', "ingotGold", 'B', "paneGlass", 'C', "nuggetGold");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "googly_eyes",
					new ItemStack(ModItems.GOOGLY_EYES, 1, 0), "ABA", "CDC", "D D", 'A', "fabricBlack", 'B',
					"safetyPin", 'C', new ItemStack(Items.SPIDER_EYE, 1, 0), 'D', "fabricWhite");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "moustage",
					new ItemStack(ModItems.MOUSTAGE, 1, 0),
					" A ", "BCB", "C C", 'A', "safetyPin", 'B', "string", 'C', "fabricBlack");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "fake_arrow",
					new ItemStack(ModItems.FAKE_ARROW, 1, 0), "  A", " B ", "C  ", 'A', "ingotIron", 'B', "stickWood",
					'C', "feather");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "wooden_box",
					new ItemStack(ModItems.WOODEN_BOX, 1, 0), "ABB", "BCD", "ABB", 'A', "ingotIron", 'B', "plankWood",
					'C', "skull", 'D', "stickWood");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "travellers_wings",
					new ItemStack(ModItems.TRAVELLERS_WINGS, 1, 0), "ABA", "ACA", "ABA", 'A', "leatherTravellers", 'B',
					"feather", 'C', "enderpearl");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "demonic_wings",
					new ItemStack(ModItems.DEMONIC_WINGS, 1, 0), "ABA", "A A", "A A", 'A', "fabricBlack", 'B',
					new ItemStack(ModItems.TRAVELLERS_WINGS, 1, 0));
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "devil_wings",
					new ItemStack(ModItems.DEVIL_WINGS, 1, 0), "AAA", "ABA", "A A", 'A', "fabricBlack", 'B',
					"safetyPin");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "devil_tail",
					new ItemStack(ModItems.DEVIL_TAIL, 1, 0), "AAB", "A  ", "AAA", 'A', "fabricBlack", 'B',
					"safetyPin");

			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.GREMORIUM_AMULET, 1, 0), "gremorium");
			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.HIMEJIMARIUM_AMULET, 1, 0), "himejimarium");
			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.TOUJOURIUM_AMULET, 1, 0), "toujourium");
			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.ARGENTORIUM_AMULET, 1, 0), "argentorium");
			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.QUARTARIUM_AMULET, 1, 0), "quartarium");
			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.NAGATORIUM_AMULET, 1, 0), "nagatorium");
			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.SAKURAJIMARIUM_AMULET, 1, 0), "sakurajimarium");
			ModCuriosityRecipeHelper.addAmuletRecipe(OedldoedlCuriosity.MODID,
					new ItemStack(ModItems.KITAGAWARIUM_AMULET, 1, 0), "kitagawarium");

			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "balanced_necklace",
					new ItemStack(ModItems.BALANCED_NECKLACE, 1, 0), "ABA", "B B", "ACA", 'A', "ingotIron", 'B',
					"nuggetIron", 'C', "balancedClayball");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "base_ring",
					new ItemStack(ModItems.BASE_RING, 1, 0),
					"AAA", "A A", "AAA", 'A', "ingotBase");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "bedrockium_ring",
					new ItemStack(ModItems.BEDROCKIUM_RING, 1, 0), "ABA", "BCB", "ABA", 'A', "nuggetBedrockium", 'B',
					"ingotBedrockium", 'C', "ringBase");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "oedldoedl_ring",
					new ItemStack(ModItems.OEDLDOEDL_RING, 1, 0), "ABA", "ACA", "AAA", 'A', "ingotGold", 'B',
					"gemOedldoedl", 'C', "ringBase");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "angel_ring",
					new ItemStack(ModItems.ANGEL_RING, 1, 0), "ABA", "CDC", "ECE", 'A', "nuggetGold", 'B', "netherStar",
					'C', "ingotGold", 'D', "ringBase", 'E', "feather");

			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "loading_case",
					new ItemStack(ModItems.LOADING_CASE, 1, 0), "ABA", "CDC", "CEC", 'A', "dyeWhite", 'B', "speaker",
					'C', "ingotIron", 'D', "dyeGreen", 'E', "electricalComponent");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "pro_loading_case",
					new ItemStack(ModItems.PRO_LOADING_CASE, 1, 0), " A ", "BCB", " D ", 'A', "speaker", 'B', "wool",
					'C', new ItemStack(ModItems.LOADING_CASE, 1, 0), 'D', "electricalComponent");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "magic_fabric",
					new ItemStack(ModItems.MAGIC_FABRIC, 2, 0), "AB", "C ", 'A', "toolNeedle", 'B', "fabricYellow", 'C',
					"fabricRed");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "safety_pin",
					new ItemStack(ModItems.SAFETY_PIN, 2, 0), " AB", "A A", "AA ", 'A', "nuggetIron", 'B', "ingotIron");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "electrical_component",
					new ItemStack(ModItems.ELECTRICAL_COMPONENT, 1, 0), "ABA", "CDC", "ABA", 'A', "dustRedstone", 'B',
					"gemLapis", 'C', "gemDiamond", 'D', "ingotIron");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "speaker", new ItemStack(ModItems.SPEAKER, 1, 0),
					" A", "AB", " A", 'A', "ingotIron", 'B', "electricalComponent");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "rubber_band",
					new ItemStack(ModItems.RUBBER_BAND, 1, 0), "ABA", "DCD", "DDD", 'A', "dyeRed", 'B', "string", 'C',
					new ItemStack(Items.WATER_BUCKET, 1, 0), 'D', "treeSapling");
			ModRecipeHelper.addShapedRecipe(OedldoedlCuriosity.MODID, "lens", new ItemStack(ModItems.LENS, 1, 0), "ABA",
					"BCB", "ABA", 'A', "dyeBlack", 'B', "nuggetIron", 'C', "paneGlass");
		}
	}
}