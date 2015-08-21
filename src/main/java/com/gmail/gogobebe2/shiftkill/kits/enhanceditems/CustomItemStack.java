package com.gmail.gogobebe2.shiftkill.kits.enhanceditems;

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

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            return true;
        } else if (object instanceof ItemStack) {
            ItemStack item = (ItemStack) object;
            if (item.getType() == this.getType() && item.hasItemMeta()) {
                ItemMeta meta = item.getItemMeta();
                if (meta.hasDisplayName() && meta.getDisplayName().equals(this.getItemMeta().getDisplayName())) {
                    if (meta.hasLore() && meta.getLore().equals(this.getItemMeta().getLore())) {
                        if (meta.getItemFlags().equals(this.getItemMeta().getItemFlags())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
