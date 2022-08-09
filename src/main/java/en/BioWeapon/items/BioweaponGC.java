package en.BioWeapon.items;

import en.BioWeapon.items.Item.ItemList;
import net.fabricmc.api.ModInitializer;

public class BioweaponGC implements ModInitializer {

    public static final String MOD_ID = "Itemss";

    public void onInitialize() {
        ItemList.init();
    }

}
