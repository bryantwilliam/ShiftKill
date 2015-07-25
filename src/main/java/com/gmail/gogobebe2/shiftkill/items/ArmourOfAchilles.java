package com.gmail.gogobebe2.shiftkill.items;

public final class ArmourOfAchilles extends ItemSet {

    @Override
    public void initItems() {
        getItems().add(new ChestplateOfAchilles());
        getItems().add(new PotionsOfAchilles());
    }
}
