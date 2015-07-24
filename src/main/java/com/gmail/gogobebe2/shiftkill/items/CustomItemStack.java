package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.inventory.ItemStack;

public abstract class CustomItemStack extends ItemStack {
    protected CustomItemStack() {
        initSpecialTraits();
    }

    /**
     * This method should implement the creation of your EnhancedItemStack.
     */
    protected abstract void initSpecialTraits();
}
