package en.BioWeapon.items.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import en.BioWeapon.items.util.ItemsRegistry;

public class ItemList {

    public static final Item BIOMASS_ITEM = ItemsRegistry.registerItem("ruby",
            new Biomass_ball(new FabricItemSettings()));

    public static void init() {
    }

}
