package com.gmail.gogobebe2.shiftkill.items.sets;

import com.gmail.gogobebe2.shiftkill.items.ChestplateOfAchilles;
import com.gmail.gogobebe2.shiftkill.items.PotionsOfAchilles;

public final class ArmourOfAchilles extends ItemSet {

    @Override
    public void initItems() {
        getItems().add(new ChestplateOfAchilles());
        getItems().add(new PotionsOfAchilles());
    }
}
