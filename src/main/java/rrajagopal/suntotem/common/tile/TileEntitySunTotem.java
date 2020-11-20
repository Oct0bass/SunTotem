package rrajagopal.suntotem.common.tile;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.DimensionType;
import net.minecraft.world.Explosion;
import net.minecraft.world.server.ServerWorld;
import rrajagopal.suntotem.common.init.SunTotemTileEntities;

public class TileEntitySunTotem extends TileEntity implements ITickableTileEntity {
    public TileEntitySunTotem() {
        super(SunTotemTileEntities.TILE_SUN_TOTEM());
        //this.setTime(6000);
    }

    public int getTime() {
        return getTileData().getInt("time");
    }

    public void setTime(int time) {
        CompoundNBT data = new CompoundNBT();
        data.putInt("time", time);
        write(data);
    }

    @Override
    public void tick() {
        if (world != null && !world.isRemote()) {
            DimensionType dimType = world.getDimensionType();
            if (dimType.doesFixedTimeExist() && !dimType.hasSkyLight()) {
                world.destroyBlock(pos, false);
                world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 10f, Explosion.Mode.DESTROY);
                world = null;
            } else {
                ((ServerWorld) world).setDayTime(getTime());
            }
        }
    }
}
