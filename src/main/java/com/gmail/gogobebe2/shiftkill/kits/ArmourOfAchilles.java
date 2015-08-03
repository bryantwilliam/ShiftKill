package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.kits.items.ChestplateOfAchilles;
import com.gmail.gogobebe2.shiftkill.kits.items.PotionsOfAchilles;

public final class ArmourOfAchilles extends Kit {

    @Override
    public void initItems() {
        getItems().add(new ChestplateOfAchilles());
        getItems().add(new PotionsOfAchilles());
    }
}
