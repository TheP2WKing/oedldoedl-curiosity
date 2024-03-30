package net.thep2wking.oedldoedlcuriosity.integration;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.init.ModBlocks;

public class BaublePackageDropsRecipeCategory  implements IRecipeCategory<BaublePackageDropsRecipeWrapper> {
	public static final String UID = OedldoedlCuriosity.MODID + "." + "bauble_package_drops";
	public static final String TITLE = I18n.format("jei." + OedldoedlCuriosity.MODID + "." + "bauble_package_drops.category");
	public static final String MOD = OedldoedlCuriosity.NAME;
	public static final ResourceLocation BACKGROUND = new ResourceLocation(OedldoedlCuriosity.MODID,
			"textures/gui/jei/bauble_package_drops.png");

	public IDrawable background;
	public IDrawable icon;

	public BaublePackageDropsRecipeCategory(IGuiHelper guiHelper) {
		background = guiHelper.drawableBuilder(BACKGROUND, 0, 0, 96, 44).build();
		icon = guiHelper.createDrawableIngredient(new ItemStack(ModBlocks.BAUBLE_PACKAGE, 1, 0));
	}

	@Override
	public String getUid() {
		return UID;
	}

	@Override
	public String getModName() {
		return MOD;
	}

	@Override
	public String getTitle() {
		return TITLE;
	}

	@Override
	public IDrawable getIcon() {
		return icon;
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	public double getDropPercentage() {
		if (OreDictionary.getOres("bauble").size() > 0) {
			double dropPercentage = 100.0 / OreDictionary.getOres("bauble").size();
			return Math.round(dropPercentage * 100.0) / 100.0;
		}
		return 0;
	}

	@Override
	public void drawExtras(Minecraft minecraft) {
		minecraft.fontRenderer.drawString(I18n.format("jei." + OedldoedlCuriosity.MODID + ".bauble_package_drops.tip3") + " "
				+ getDropPercentage() + "%", 8, 34, 0xFF808080, false);
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, BaublePackageDropsRecipeWrapper recipeWrapper,
			IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		guiItemStacks.init(0, false, 66, 7);
		guiItemStacks.init(12, true, 8, 7);
		guiItemStacks.set(ingredients);
	}
}