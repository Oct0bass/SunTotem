package rrajagopal.suntotem.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import rrajagopal.suntotem.common.init.SunTotemTileEntities;

public class BlockSunTotem extends Block {
    public static final BooleanProperty all = BooleanProperty.create("all");

    public BlockSunTotem (Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(all, true));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder.add(all));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return SunTotemTileEntities.TILE_SUN_TOTEM().create();
    }
}
