package rrajagopal.suntotem.common.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rrajagopal.suntotem.common.block.BlockSunTotem;

public class SunTotemBlocks {
    public static Block BLOCK_SUN_TOTEM() {
        return new BlockSunTotem(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(50, 100));
    }
}
