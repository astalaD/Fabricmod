package en.BioWeapon.Bioweapontut.Item;

import en.BioWeapon.Bioweapontut.util.ItemsRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static en.BioWeapon.Bioweapontut.BioweaponGC.MOD_ID;

public class ItemList {

    public static final Item BIOMASS_ITEM = ItemsRegistry.registerItem("CUM",
            new Biomass_ball(new FabricItemSettings()));

    public static Item registerItem(String id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, id), item);
    }

    public static void init() {
    }

}
