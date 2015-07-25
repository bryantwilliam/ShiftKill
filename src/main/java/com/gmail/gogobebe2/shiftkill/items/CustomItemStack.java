package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.inventory.ItemStack;

public abstract class CustomItemStack extends ItemStack {
    protected CustomItemStack() {
        initSpecialTraits();
    }

    /**
     * This method should implement the {@code ItemStack}s used.
     */
    protected abstract void initSpecialTraits();
}
