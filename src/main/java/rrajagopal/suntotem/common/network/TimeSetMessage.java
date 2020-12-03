package rrajagopal.suntotem.common.network;

import net.minecraft.network.PacketBuffer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;
import rrajagopal.suntotem.common.tile.TileEntitySunTotem;

import java.util.Objects;
import java.util.function.Supplier;

public class TimeSetMessage {
    private BlockPos pos;
    private int time;

    public TimeSetMessage(BlockPos pos, int time) {
        this.pos = pos;
        this.time = time;
    }

    public static void handle(TimeSetMessage message, Supplier<NetworkEvent.Context> ctx) {
        ServerWorld world = Objects.requireNonNull(ctx.get().getSender()).getServerWorld();
        MinecraftServer server = world.getServer();
        server.deferTask(() -> {
            TileEntity tile = world.getTileEntity(message.pos);
            if (tile instanceof TileEntitySunTotem) {
                ((TileEntitySunTotem) tile).setTime(message.time);
            }
        });
    }

    public static void encode(TimeSetMessage msg, PacketBuffer buffer) {
        buffer.writeBlockPos(msg.pos);
        buffer.writeInt(msg.time);
    }

    public static TimeSetMessage decode(PacketBuffer buffer) {
        return new TimeSetMessage(buffer.readBlockPos(), buffer.readInt());
    }
}
