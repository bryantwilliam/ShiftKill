package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.Location;

public interface UsableItemStack {
    /**
     * This method should implement the behaviour of a unique ability.
     *
     * @param target The target at which the ability is performed.
     */
    void useAbility(Location target);
}
