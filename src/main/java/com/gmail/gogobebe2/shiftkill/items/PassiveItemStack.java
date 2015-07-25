package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.entity.Player;

public interface PassiveItemStack {
    /**
     * This method should implement the behaviour of a unique ability.
     *
     * @param holder The player using the ability.
     */
    void useAbility(Player holder);
}
