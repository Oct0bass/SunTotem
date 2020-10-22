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
        this.setTime(6000);
    }

    public int getTime() {
        return this.getTileData().getInt("time");
    }

    public void setTime(int time) {
        CompoundNBT data = new CompoundNBT();
        data.putInt("time", time);
        this.write(data);
    }

    @Override
    public void tick() {
        if (this.world != null) {
            DimensionType dimType = this.world.func_230315_m_();
            if (dimType.func_241514_p_() && !dimType.hasSkyLight()) {
                this.world.createExplosion(null, this.pos.getX(), this.pos.getY(), this.pos.getZ(), 20f, Explosion.Mode.DESTROY);
                this.world.destroyBlock(this.pos, false);
                this.world = null;
            } else {
                if (!this.world.isRemote()) {
                    ((ServerWorld) world).func_241114_a_(this.getTime());
                }
            }
        }
    }
}
