package com.gmail.gogobebe2.shiftkill.itemsets;

import com.gmail.gogobebe2.shiftkill.itemsets.items.ChestplateOfAchilles;
import com.gmail.gogobebe2.shiftkill.itemsets.items.PotionsOfAchilles;

public final class ArmourOfAchilles extends ItemSet {

    @Override
    public void initItems() {
        getItems().add(new ChestplateOfAchilles());
        getItems().add(new PotionsOfAchilles());
    }
}
