package rrajagopal.suntotem.common.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rrajagopal.suntotem.common.tile.TileEntitySunTotem;
import rrajagopal.suntotem.common.SunTotem;

public class SunTotemTileEntities {
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, SunTotem.MODID);

    public static final RegistryObject<TileEntityType<TileEntitySunTotem>> TILE_SUN_TOTEM = TILES.register("sun_totem", () -> TileEntityType.Builder.create(
            TileEntitySunTotem::new, SunTotemBlocks.BLOCK_SUN_TOTEM.get()
    ).build(null));
}

