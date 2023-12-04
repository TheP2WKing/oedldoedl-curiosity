package net.thep2wking.oedldoedlcuriosity.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.content.block.BlockBaublePackage;

public class ModBlocks {
	public static final Block BAUBLE_PACKAGE = new BlockBaublePackage(OedldoedlCuriosity.MODID, "bauble_package", OedldoedlCuriosity.TAB, Material.WOOD, SoundType.WOOD, MapColor.BROWN_STAINED_HARDENED_CLAY, 1, ModToolTypes.AXE, 1.0f, 1.0f, 0);
}