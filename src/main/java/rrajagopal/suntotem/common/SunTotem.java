package rrajagopal.suntotem.common;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import rrajagopal.suntotem.common.init.SunTotemBlocks;
import rrajagopal.suntotem.common.init.SunTotemItems;
import rrajagopal.suntotem.common.init.SunTotemTileEntities;

@Mod(SunTotem.MODID)
public class SunTotem {
    public static final String MODID = "suntotem";

    public SunTotem() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SunTotemBlocks.BLOCKS.register(bus);
        SunTotemTileEntities.TILES.register(bus);
        SunTotemItems.ITEMS.register(bus);
    }
}
