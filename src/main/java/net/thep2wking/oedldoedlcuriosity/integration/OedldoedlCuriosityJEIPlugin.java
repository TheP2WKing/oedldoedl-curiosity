package net.thep2wking.oedldoedlcuriosity.integration;

import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.api.integration.ModJEIPluginBase;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;
import net.thep2wking.oedldoedlcuriosity.init.ModBlocks;

@JEIPlugin
public class OedldoedlCuriosityJEIPlugin extends ModJEIPluginBase {
	@Override
	public String getModId() {
		return OedldoedlCuriosity.MODID;
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		if (CuriosityConfig.INTEGRATION.JEI.BAUBLE_PACKAGE_RECIPE_CATEGORY
				&& CuriosityConfig.CONTENT.BAUBLE_PACKAGE_RANDOM_DROPS) {
			addRecipeCategory(registry, new BaublePackageDropsRecipeCategory(getGuiHelper(registry)));
		}
	}

	@Override
	public void register(IModRegistry registry) {
		super.register(registry);

		if (CuriosityConfig.INTEGRATION.JEI.BAUBLE_PACKAGE_RECIPE_CATEGORY
				&& CuriosityConfig.CONTENT.BAUBLE_PACKAGE_RANDOM_DROPS) {
			addRecipeCatalyst(registry, new ItemStack(ModBlocks.BAUBLE_PACKAGE, 1, 0),
					BaublePackageDropsRecipeCategory.UID);
			addRecipes(registry, BaublePackageDropsRecipeWrapper.getDrops(), BaublePackageDropsRecipeCategory.UID);
		}
	}
}