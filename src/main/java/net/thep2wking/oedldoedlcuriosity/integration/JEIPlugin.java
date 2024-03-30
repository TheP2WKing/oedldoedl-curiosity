package net.thep2wking.oedldoedlcuriosity.integration;

import java.util.ArrayList;
import java.util.List;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.config.CuriosityConfig;
import net.thep2wking.oedldoedlcuriosity.init.ModBlocks;

@mezz.jei.api.JEIPlugin
public class JEIPlugin implements IModPlugin {
	@Override
	public void register(IModRegistry registry) {
		if (Loader.isModLoaded("jei")) {
			ModLogger.registeredIntegration("JEI", OedldoedlCuriosity.MODID);
		}

		if (CuriosityConfig.INTEGRATION.JEI.BAUBLE_PACKAGE_RECIPE_CATEGORY
				&& CuriosityConfig.CONTENT.BAUBLE_PACKAGE_RANDOM_DROPS) {
			List<BaublePackageDropsRecipeWrapper> bauble = new ArrayList<>();
			for (ItemStack output : OreDictionary.getOres("bauble")) {
				bauble.add(new BaublePackageDropsRecipeWrapper(output));
				registry.addRecipes(bauble, BaublePackageDropsRecipeCategory.UID);
				bauble.clear();
			}

			registry.addRecipeCatalyst(new ItemStack(ModBlocks.BAUBLE_PACKAGE, 1, 0),
					BaublePackageDropsRecipeCategory.UID);
		}
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		if (CuriosityConfig.INTEGRATION.JEI.BAUBLE_PACKAGE_RECIPE_CATEGORY
				&& CuriosityConfig.CONTENT.BAUBLE_PACKAGE_RANDOM_DROPS) {
			registry.addRecipeCategories(new BaublePackageDropsRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
		}
	}
}