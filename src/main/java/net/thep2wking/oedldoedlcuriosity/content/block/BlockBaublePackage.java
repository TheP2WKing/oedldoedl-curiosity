package net.thep2wking.oedldoedlcuriosity.content.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;
import net.thep2wking.oedldoedlcore.api.block.ModBlockHorizontalBase;
import net.thep2wking.oedldoedlcore.util.ModRandomUtil;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class BlockBaublePackage extends ModBlockHorizontalBase {
	public static final List<ItemStack> DROPS = OreDictionary.getOres("bauble");
	
	public BlockBaublePackage(String modid, String name, CreativeTabs tab, Material material, SoundType sound,
			MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance,
			int lightLevel) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		Random random = new Random();
		ItemStack randomItem = ModRandomUtil.selectRandom(random, DROPS);
		if (randomItem != null) {
			drops.add(randomItem);
		}
	}
}