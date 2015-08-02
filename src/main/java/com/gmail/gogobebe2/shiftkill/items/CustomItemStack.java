package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class CustomItemStack extends ItemStack {
    protected CustomItemStack() {
        initSpecialTraits();
    }

    /**
     * This method should initialize the {@code ItemStack}s used.
     */
    protected abstract void initSpecialTraits();

    /**
     * Should be used the same as {@code instanceof}. Simply compares DisplayName and Lore.
     * @param item The item stack comparing against
     * @return Whether an ItemStack should be considered one of the instances {@code this}.
     */
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
