package rrajagopal.suntotem.common.network;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import rrajagopal.suntotem.common.SunTotem;

public class NetworkDispatcher {
    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(new ResourceLocation(SunTotem.MODID, SunTotem.MODID), () -> "1.0", "1.0"::equals, "1.0"::equals);

    public static void init() {
        CHANNEL.registerMessage(0, TimeSetMessage.class, TimeSetMessage::encode, TimeSetMessage::decode, TimeSetMessage::handle);
    }
}
