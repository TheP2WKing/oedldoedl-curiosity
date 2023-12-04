package net.thep2wking.oedldoedlcuriosity.init;

import baubles.api.BaubleType;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleBase;
import net.thep2wking.oedldoedlcuriosity.api.ModItemBaubleEffectBase;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemAmazingTechnicolorGlasses;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemAngelRing;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemArgentoriumAmulet;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemBalancedNecklace;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemBedrockiumRing;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemCatEars;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemGremoriumAmulet;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemHimejimariumAmulet;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemMinepodsMax;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemMinepodsPro;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemNagatoriumAmulet;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemOedldoedlRing;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemPlumbob;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemQuartariumAmulet;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemSunglasses;
import net.thep2wking.oedldoedlcuriosity.content.item.bauble.ItemToujouriumAmulet;
import net.thep2wking.oedldoedlcuriosity.content.item.misc.ItemLoadingCase;
import net.thep2wking.oedldoedlcuriosity.content.item.misc.ItemProLoadingCase;
import net.thep2wking.oedldoedlcuriosity.model.ModelAmulet;
import net.thep2wking.oedldoedlcuriosity.model.ModelAnimatedWings;
import net.thep2wking.oedldoedlcuriosity.model.ModelBirdNest;
import net.thep2wking.oedldoedlcuriosity.model.ModelBlueKyoryuuHorns;
import net.thep2wking.oedldoedlcuriosity.model.ModelBunnyEars;
import net.thep2wking.oedldoedlcuriosity.model.ModelCap;
import net.thep2wking.oedldoedlcuriosity.model.ModelCatEars;
import net.thep2wking.oedldoedlcuriosity.model.ModelChainsawHat;
import net.thep2wking.oedldoedlcuriosity.model.ModelCrown;
import net.thep2wking.oedldoedlcuriosity.model.ModelCylinder;
import net.thep2wking.oedldoedlcuriosity.model.ModelDevilHorns;
import net.thep2wking.oedldoedlcuriosity.model.ModelDevilTail;
import net.thep2wking.oedldoedlcuriosity.model.ModelFakeArrow;
import net.thep2wking.oedldoedlcuriosity.model.ModelFancySunglasses;
import net.thep2wking.oedldoedlcuriosity.model.ModelFlatWings;
import net.thep2wking.oedldoedlcuriosity.model.ModelGlasses;
import net.thep2wking.oedldoedlcuriosity.model.ModelGooglyEyes;
import net.thep2wking.oedldoedlcuriosity.model.ModelHeadband;
import net.thep2wking.oedldoedlcuriosity.model.ModelJoint;
import net.thep2wking.oedldoedlcuriosity.model.ModelKittyHeadset;
import net.thep2wking.oedldoedlcuriosity.model.ModelMeguminHat;
import net.thep2wking.oedldoedlcuriosity.model.ModelMinepods;
import net.thep2wking.oedldoedlcuriosity.model.ModelMinepodsMax;
import net.thep2wking.oedldoedlcuriosity.model.ModelMinepodsPro;
import net.thep2wking.oedldoedlcuriosity.model.ModelMonocle;
import net.thep2wking.oedldoedlcuriosity.model.ModelMoustage;
import net.thep2wking.oedldoedlcuriosity.model.ModelPantsu;
import net.thep2wking.oedldoedlcuriosity.model.ModelPlunger;
import net.thep2wking.oedldoedlcuriosity.model.ModelPylone;
import net.thep2wking.oedldoedlcuriosity.model.ModelRedKyoryuuHorns;
import net.thep2wking.oedldoedlcuriosity.model.ModelRing;
import net.thep2wking.oedldoedlcuriosity.model.ModelPlumbob;
import net.thep2wking.oedldoedlcuriosity.model.ModelStrawHat;
import net.thep2wking.oedldoedlcuriosity.model.ModelThreeDGlasses;
import net.thep2wking.oedldoedlcuriosity.model.ModelThugLifeGlasses;
import net.thep2wking.oedldoedlcuriosity.model.ModelWoodenBox;

public class ModItems {
	public static final Item BAUBLE_PACKAGE = new ModItemBlockBase(ModBlocks.BAUBLE_PACKAGE, ModRarities.YELLOW, false, 2, 1);

	public static final Item BUNNY_EARS = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "bunny_ears", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelBunnyEars(1), false, MobEffects.JUMP_BOOST, 1, false, ModRarities.AQUA, false, 2, 0);
	public static final Item CAT_EARS = new ItemCatEars(OedldoedlCuriosity.MODID, "cat_ears", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelCatEars(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item RED_KYORYUU_HORNS = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "red_kyoryuu_horns", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, BaubleType.HEAD, new ModelRedKyoryuuHorns(1), false, ModRarities.RED, false, 1, 0);
	public static final Item BLUE_KYORYUU_HORNS = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "blue_kyoryuu_horns", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, BaubleType.HEAD, new ModelBlueKyoryuuHorns(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item DEVIL_HORNS = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "devil_horns", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, BaubleType.HEAD, new ModelDevilHorns(1), false, ModRarities.RED, false, 1, 0);
	public static final Item PANTSU = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "pantsu", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelPantsu(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item MEGUMIN_PANTSU = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "megumin_pantsu", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelPantsu(1), false, ModRarities.YELLOW, false, 1, 0);
	public static final Item KITTY_HEADSET = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "kitty_headset", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelKittyHeadset(1), false, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item MINEPODS_MAX = new ItemMinepodsMax(OedldoedlCuriosity.MODID, "minepods_max", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelMinepodsMax(1), false, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item PYLONE = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "pylone", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, BaubleType.HEAD, new ModelPylone(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item PLUNGER = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "plunger", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, BaubleType.HEAD, new ModelPlunger(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item CYLINDER = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "cylinder", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelCylinder(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item MEGUMIN_HAT = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "megumin_hat", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelMeguminHat(1), false, MobEffects.FIRE_RESISTANCE, 0, false, ModRarities.RED, false, 1, 0);
	public static final Item CHAINSAW_HAT = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "chainsaw_hat", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelChainsawHat(1), false, MobEffects.STRENGTH, 1, false, ModRarities.RED, false, 1, 0);
	public static final Item CROWN = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "crown", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.HEAD, new ModelCrown(1), false, MobEffects.LUCK, 4, false, ModRarities.GOLD, false, 1, 0);
	public static final Item FLYING_SHOOTING_BASECAP = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "flying_shooting_basecap", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelCap(1), false, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item BUNNY_CAP = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "bunny_cap", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelCap(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item STRAW_HAT = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "straw_hat", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelStrawHat(1), false, ModRarities.YELLOW, false, 1, 0);
	public static final Item BIRD_NEST = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "bird_nest", OedldoedlCuriosity.TAB, SoundEvents.BLOCK_GRASS_PLACE, BaubleType.HEAD, new ModelBirdNest(1), false, ModRarities.YELLOW, false, 2, 0);
	public static final Item PLUMBOB = new ItemPlumbob(OedldoedlCuriosity.MODID, "plumbob", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.HEAD, new ModelPlumbob(1), false, ModRarities.GREEN, false, 1, 0);
	public static final Item GLASSES = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "glasses", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelGlasses(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item SUNGLASSES = new ItemSunglasses(OedldoedlCuriosity.MODID, "sunglasses", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelGlasses(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item FANCY_SUNGLASSES = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "fancy_sunglasses", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelFancySunglasses(1), false, ModRarities.AQUA, false, 2, 0);
	public static final Item AMAZING_TECHNICOLOR_GLASSES = new ItemAmazingTechnicolorGlasses(OedldoedlCuriosity.MODID, "amazing_technicolor_glasses", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelGlasses(1), false, MobEffects.NIGHT_VISION, 0, false, ModRarities.LIGHT_PURPLE, true, 1, 0);
	public static final Item THREE_D_GLASSES = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "3d_glasses", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelThreeDGlasses(1), false, ModRarities.BLUE, false, 1, 0);
	public static final Item THUG_LIFE_GLASSES = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "thug_life_glasses", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelThugLifeGlasses(1), false, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item JOINT = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "joint", OedldoedlCuriosity.TAB, SoundEvents.BLOCK_GRASS_PLACE, BaubleType.HEAD, new ModelJoint(1), false, ModRarities.GREEN, false, 1, 0);
	public static final Item LEAF_HEADBAND = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "leaf_headband", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelHeadband(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item MONOCLE = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "monocle", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.HEAD, new ModelMonocle(1), false, ModRarities.GOLD, false, 1, 0);
	public static final Item GOOGLY_EYES = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "googly_eyes", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelGooglyEyes(1), false, ModRarities.AQUA, false, 1, 0);
	public static final Item MOUSTAGE = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "moustage", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.HEAD, new ModelMoustage(1), false, ModRarities.YELLOW, false, 1, 0);
	public static final Item FAKE_ARROW = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "fake_arrow", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, BaubleType.HEAD, new ModelFakeArrow(1), false, ModRarities.AQUA, false, 1, 0);

	public static final Item WOODEN_BOX = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "wooden_box", OedldoedlCuriosity.TAB, SoundEvents.BLOCK_WOOD_PLACE, BaubleType.BODY, new ModelWoodenBox(1), true, MobEffects.RESISTANCE, 1, false, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item TRAVELLERS_WINGS = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "travellers_wings", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.BODY, new ModelAnimatedWings(1), true, MobEffects.JUMP_BOOST, 3, false, ModRarities.YELLOW, false, 1, 0);
	public static final Item DEMONIC_WINGS = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "demonic_wings", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.BODY, new ModelAnimatedWings(1), true, MobEffects.JUMP_BOOST, 4, false, ModRarities.LIGHT_PURPLE, false, 2, 0);
	public static final Item DEVIL_WINGS = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "devil_wings", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.BODY, new ModelFlatWings(1), true, ModRarities.LIGHT_PURPLE, false, 1, 0);
	public static final Item DEVIL_TAIL = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "devil_tail", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, BaubleType.BODY, new ModelDevilTail(1), true, ModRarities.AQUA, false, 1, 0);
	
	public static final Item MINEPODS = new ModItemBaubleEffectBase(OedldoedlCuriosity.MODID, "minepods", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.CHARM, new ModelMinepods(1), false, MobEffects.SPEED, 0, false, ModRarities.AQUA, false, 1, 0);
	public static final Item MINEPODS_PRO = new ItemMinepodsPro(OedldoedlCuriosity.MODID, "minepods_pro", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.CHARM, new ModelMinepodsPro(1), false, ModRarities.AQUA, false, 1, 0);

	public static final Item GREMORIUM_AMULET = new ItemGremoriumAmulet(OedldoedlCuriosity.MODID, "gremorium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.DARK_RED, true, 1, 0);
	public static final Item HIMEJIMARIUM_AMULET = new ItemHimejimariumAmulet(OedldoedlCuriosity.MODID, "himejimarium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.DARK_BLUE, true, 1, 0);
	public static final Item TOUJOURIUM_AMULET = new ItemToujouriumAmulet(OedldoedlCuriosity.MODID, "toujourium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.GRAY, true, 1, 0);
	public static final Item ARGENTORIUM_AMULET = new ItemArgentoriumAmulet(OedldoedlCuriosity.MODID, "argentorium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.YELLOW, true, 1, 0);
	public static final Item QUARTARIUM_AMULET = new ItemQuartariumAmulet(OedldoedlCuriosity.MODID, "quartarium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.BLUE, true, 1, 0);
	public static final Item NAGATORIUM_AMULET = new ItemNagatoriumAmulet(OedldoedlCuriosity.MODID, "nagatorium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.DARK_PURPLE, true, 1, 0);
	public static final Item SAKURAJIMARIUM_AMULET = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "sakurajimarium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.DARK_GRAY, true, 1, 0);
	public static final Item KITAGAWARIUM_AMULET = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "kitagawarium_amulet", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.LIGHT_PURPLE, true, 1, 0);

	public static final Item BALANCED_NECKLACE = new ItemBalancedNecklace(OedldoedlCuriosity.MODID, "balanced_necklace", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, BaubleType.AMULET, new ModelAmulet(1), true, ModRarities.LIGHT_PURPLE, true, 1, 1);
		
	public static final Item BASE_RING = new ModItemBaubleBase(OedldoedlCuriosity.MODID, "base_ring", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.RING, new ModelRing(1), false, ModRarities.WHITE, false, 1, 0).setNoRender();
	public static final Item BEDROCKIUM_RING = new ItemBedrockiumRing(OedldoedlCuriosity.MODID, "bedrockium_ring", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.RING, new ModelRing(1), false, ModRarities.AQUA, false, 1, 0).setNoRender();
	public static final Item OEDLDOEDL_RING = new ItemOedldoedlRing(OedldoedlCuriosity.MODID, "oedldoedl_ring", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.RING, new ModelRing(1), false, ModRarities.LIGHT_PURPLE, true, 1, 0).setNoRender();
	public static final Item ANGEL_RING = new ItemAngelRing(OedldoedlCuriosity.MODID, "angel_ring", OedldoedlCuriosity.TAB, SoundEvents.ITEM_ARMOR_EQUIP_IRON, BaubleType.RING, new ModelFlatWings(1), true, ModRarities.YELLOW, false, 1, 0);

	public static final Item LOADING_CASE = new ItemLoadingCase(OedldoedlCuriosity.MODID, "loading_case", OedldoedlCuriosity.TAB, ModRarities.YELLOW, false, 1, 0);
	public static final Item PRO_LOADING_CASE = new ItemProLoadingCase(OedldoedlCuriosity.MODID, "pro_loading_case", OedldoedlCuriosity.TAB, ModRarities.YELLOW, false, 1, 0);
	public static final Item MAGIC_FABRIC = new ModItemBase(OedldoedlCuriosity.MODID, "magic_fabric", OedldoedlCuriosity.TAB, ModRarities.RED, false, 1, 0);
	public static final Item SAFETY_PIN = new ModItemBase(OedldoedlCuriosity.MODID, "safety_pin", OedldoedlCuriosity.TAB, ModRarities.YELLOW, false, 1, 0);
	public static final Item ELECTRICAL_COMPONENT = new ModItemBase(OedldoedlCuriosity.MODID, "electrical_component", OedldoedlCuriosity.TAB, ModRarities.YELLOW, false, 1, 0);
	public static final Item SPEAKER = new ModItemBase(OedldoedlCuriosity.MODID, "speaker", OedldoedlCuriosity.TAB, ModRarities.YELLOW, false, 1, 0);
	public static final Item RUBBER_BAND = new ModItemBase(OedldoedlCuriosity.MODID, "rubber_band", OedldoedlCuriosity.TAB, ModRarities.YELLOW, false, 1, 0);
	public static final Item LENS = new ModItemBase(OedldoedlCuriosity.MODID, "lens", OedldoedlCuriosity.TAB, ModRarities.YELLOW, false, 1, 0);
}