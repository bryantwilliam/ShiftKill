package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public interface EnhancedItemStack {
    Player holder = null;

    /**
     * This method should implement the behaviour of a unique ability.
     */
    void useAbility();

    @Nullable
    Player getHolder();

    void setHolder(@Nullable Player holder);
}
