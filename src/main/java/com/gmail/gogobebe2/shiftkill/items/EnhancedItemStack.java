package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class EnhancedItemStack extends ItemStack {
    private Player holder = null;

    /**
     * @param holder Can be {@code null} if there is no holder.
     */
    protected EnhancedItemStack(Player holder) {
        initSpecialTraits();
    }

    /**
     * This method should implement the behaviour of a unique ability.
     */
    protected abstract void useAbility();

    /**
     * This method should implement the creation of your EnhancedItemStack.
     */
    protected abstract void initSpecialTraits();

    /**
     * @return Can return {@code null} if there is no one holding this item.
     */
    protected Player getHolder() {
        return this.holder;
    }

    /**
     * This method should be called whenever a new {@code Player} gets this item in their inventory or drops the item.
     * @param holder Can be {@code null} if there is no holder.
     */
    protected void setHolder(Player holder) {
        this.holder = holder;
    }
}
