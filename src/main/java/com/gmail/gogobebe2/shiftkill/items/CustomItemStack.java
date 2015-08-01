package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class CustomItemStack extends ItemStack {
    protected CustomItemStack() {
        initSpecialTraits();
    }

    /**
     * This method should implement the {@code ItemStack}s used.
     */
    protected abstract void initSpecialTraits();

    public boolean is(ItemStack item) {
        if (item.hasItemMeta()) {
            ItemMeta meta = item.getItemMeta();
            if (meta.hasDisplayName() && meta.getDisplayName().equals(this.getItemMeta().getDisplayName())) {
                if (meta.hasLore() && meta.getLore().equals(this.getItemMeta().getLore())) {
                    return true;
                }
            }
        }
        return false;
    }
}
