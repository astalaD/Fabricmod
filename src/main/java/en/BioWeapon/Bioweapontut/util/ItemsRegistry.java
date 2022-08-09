package en.BioWeapon.Bioweapontut.util;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static en.BioWeapon.Bioweapontut.BioweaponGC.MOD_ID;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ItemsRegistry {

    public static Item registerItem(String id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, id), item);
    }

}
