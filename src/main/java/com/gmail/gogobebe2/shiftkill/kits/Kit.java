package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Kit {
    // Sorted by priority.
    private Queue<ItemStack> items = new LinkedList<>();

    protected Kit() {
        initItems();
    }

    /**
     * This method should implement the prioritization and inclusion of the specific {@code ItemStack}.
     */
    protected abstract void initItems();

    /**
     * Gives {@code player} a set based on each individual item's priority.
     * @param player The {@code Player} to recieve the ItemStacks.
     */
    public void giveSet(Player player) {
        PlayerInventory inventory = player.getInventory();
        for (ItemStack item : items) {
            for (ItemStack drop : inventory.addItem(item).values()) {
                player.getWorld().dropItemNaturally(player.getLocation(), drop);
            }
        }
        player.updateInventory();
    }

    /**
     * @return The queue that holds each ItemStack prioritized.
     */
    protected Queue<ItemStack> getItems() {
        return items;
    }
}
