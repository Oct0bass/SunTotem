package rrajagopal.suntotem.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import rrajagopal.suntotem.common.init.SunTotemTileEntities;

public class BlockSunTotem extends Block {
    public BlockSunTotem() {
        super(AbstractBlock.Properties.create(Material.GLASS)
                .notSolid()
                .hardnessAndResistance(50, 100)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(4)
        );
    }

    private static final VoxelShape BASE = Block.makeCuboidShape(0, 0, 0, 16, 8, 16);
    private static final VoxelShape POINT_1 = Block.makeCuboidShape(4, 8, 4, 12, 9, 12);
    private static final VoxelShape POINT_2 = Block.makeCuboidShape(5, 9, 5, 11, 10, 11);
    private static final VoxelShape POINT_3 = Block.makeCuboidShape(6, 10, 6, 10, 12, 10);
    private static final VoxelShape POINT_4 = Block.makeCuboidShape(7, 12, 7, 9, 16, 9);

    private static final VoxelShape TOTEM_SHAPE = VoxelShapes.or(BASE, POINT_1, POINT_2, POINT_3, POINT_4);

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return TOTEM_SHAPE;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return SunTotemTileEntities.TILE_SUN_TOTEM.get().create();
    }
}
