package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.inventory.ItemStack;

public abstract class SpecialItem extends ItemStack {
    /**
     * This method should implement the behaviour of a unique ability.
     */
    protected abstract void useAbility();
}
