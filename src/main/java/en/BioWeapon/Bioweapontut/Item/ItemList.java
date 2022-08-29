package en.BioWeapon.Bioweapontut.Item;

import en.BioWeapon.Bioweapontut.util.ItemsRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ItemList {

    public static final Item BIOMASS_ITEM = ItemsRegistry.registerItem("CUM",
            new Biomass_ball(new FabricItemSettings()));

    public static void init() {
    }

}
