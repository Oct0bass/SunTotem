package rrajagopal.suntotem.common.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rrajagopal.suntotem.common.SunTotem;
import rrajagopal.suntotem.common.block.BlockSunTotem;

public class SunTotemBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SunTotem.MODID);

    public static final RegistryObject<Block> BLOCK_SUN_TOTEM = BLOCKS.register("sun_totem", BlockSunTotem::new);
}
