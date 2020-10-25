package rrajagopal.suntotem.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import rrajagopal.suntotem.common.init.SunTotemTileEntities;

public class BlockSunTotem extends Block {
    public BlockSunTotem (Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return SunTotemTileEntities.TILE_SUN_TOTEM().create();
    }
}
