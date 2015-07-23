package com.gmail.gogobebe2.shiftkill.items.armourofachilles;

import com.gmail.gogobebe2.shiftkill.items.EnhancedItemStack;
import org.bukkit.Material;

public class PotionOfAchilles extends EnhancedItemStack {

    @Override
    protected void useAbility() {

    }

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.POTION);
    }
}
