package rrajagopal.suntotem.common.init;

import net.minecraft.tileentity.TileEntityType;
import rrajagopal.suntotem.common.tile.TileEntitySunTotem;
import rrajagopal.suntotem.common.SunTotem;

public class SunTotemTileEntities {
    public static TileEntityType<TileEntitySunTotem> TILE_SUN_TOTEM() {
        return TileEntityType.Builder.create(TileEntitySunTotem::new, SunTotem.BLOCK_SUN_TOTEM.get()).build(null);
    }
}

