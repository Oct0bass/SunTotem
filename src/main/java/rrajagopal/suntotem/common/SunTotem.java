package rrajagopal.suntotem.common;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rrajagopal.suntotem.common.init.SunTotemBlocks;
import rrajagopal.suntotem.common.init.SunTotemTileEntities;
import rrajagopal.suntotem.common.tile.TileEntitySunTotem;

@Mod(SunTotem.MODID)
public class SunTotem {
    public static final String MODID = "suntotem";

    private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MODID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<TileEntityType<TileEntitySunTotem>> TILE_SUN_TOTEM = TILES.register("sun_totem", SunTotemTileEntities::TILE_SUN_TOTEM);
    public static final RegistryObject<Block> BLOCK_SUN_TOTEM = BLOCKS.register("sun_totem", SunTotemBlocks::BLOCK_SUN_TOTEM);

    public SunTotem() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        TILES.register(bus);
    }
}
