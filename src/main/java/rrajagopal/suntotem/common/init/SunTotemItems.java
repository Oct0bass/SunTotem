package rrajagopal.suntotem.common.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import rrajagopal.suntotem.common.init.SunTotemBlocks;

public class SunTotemItems {
    public static Item ITEM_SUN_TOTEM() {
        return new BlockItem(SunTotemBlocks.BLOCK_SUN_TOTEM(), new Item.Properties()
                .group(ItemGroup.BUILDING_BLOCKS)
                .addToolType(ToolType.PICKAXE, 4)
                .maxStackSize(1)
                .rarity(Rarity.EPIC)
        );
    }
}
