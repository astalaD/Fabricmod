package en.BioWeapon.Bioweapontut;

import en.BioWeapon.Bioweapontut.Item.ItemList;
import net.fabricmc.api.ModInitializer;

public class BioweaponGC implements ModInitializer {

    public static final String MOD_ID = "Itemss";

    public void onInitialize() {

        System.out.println("Hello Fabric world!");
        ItemList.init();
    }

}
