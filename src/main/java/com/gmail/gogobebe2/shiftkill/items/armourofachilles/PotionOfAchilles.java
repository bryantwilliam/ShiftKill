package com.gmail.gogobebe2.shiftkill.items.armourofachilles;

import com.gmail.gogobebe2.shiftkill.items.EnhancedItemStack;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class PotionOfAchilles extends EnhancedItemStack {

    /**
     * @param holder Can be {@code null} if there is no holder.
     */
    protected PotionOfAchilles(Player holder) {
        super(holder);
    }

    @Override
    protected void useAbility() {

    }

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.POTION);
    }
}
