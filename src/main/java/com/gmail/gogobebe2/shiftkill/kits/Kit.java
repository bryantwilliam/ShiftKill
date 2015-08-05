package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Kit {
    // Sorted by priority.
    private final Queue<ItemStack> ITEMS = new LinkedList<>();
    private final String NAME = initName();

    protected Kit() {
        initItems();
    }

    /**
     * This method should implement the prioritization and inclusion of the specific {@code ItemStack}.
     */
    protected abstract void initItems();

    /**
     * This method should return the name of the {@code Kit}.
     */
    protected abstract String initName();

    /**
     * Gives {@code player} a set based on each individual item's priority.
     * @param player The {@code Player} to recieve the ItemStacks.
     */
    public void giveSet(Player player) {
        for (ItemStack item : ITEMS) {
            for (ItemStack drop : player.getInventory().addItem(item).values()) {
                player.getWorld().dropItemNaturally(player.getLocation().clone().subtract(0, 1, 0), drop);
            }
        }
        player.sendMessage(ChatColor.DARK_GREEN + NAME + ChatColor.DARK_GREEN + " received!");
    }

    /**
     * @return The queue that holds each ItemStack prioritized.
     */
    protected final Queue<ItemStack> getITEMS() {
        return this.ITEMS;
    }

    protected final String getNAME() {
        return this.NAME;
    }
}
