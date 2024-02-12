package net.thep2wking.oedldoedlcuriosity.util;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;

public class ModCuriosityRecipeHelper {
	public static void addAmuletRecipe(String modid, @Nonnull ItemStack output, String material) {
		ModRecipeHelper.addShapedRecipe(modid, material + "_amulet", output, "ABA", "BCB", "DBD", 'A', "ingotIron", 'B',
				material + "Star", 'C', "gem" + material.substring(0, 1).toUpperCase() + material.substring(1), 'D',
				"nugget" + material.substring(0, 1).toUpperCase() + material.substring(1));
	}
}