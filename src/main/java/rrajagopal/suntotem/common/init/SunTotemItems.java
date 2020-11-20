package rrajagopal.suntotem.common.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rrajagopal.suntotem.common.SunTotem;
import rrajagopal.suntotem.common.init.SunTotemBlocks;

public class SunTotemItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SunTotem.MODID);

    public static final RegistryObject<BlockItem> ITEM_SUN_TOTEM = ITEMS.register("sun_totem", () -> new BlockItem(
            SunTotemBlocks.BLOCK_SUN_TOTEM.get(), new Item.Properties()
                .group(ItemGroup.BUILDING_BLOCKS)
                .addToolType(ToolType.PICKAXE, 4)
                .maxStackSize(1)
                .rarity(Rarity.EPIC)
        )
    );
}
