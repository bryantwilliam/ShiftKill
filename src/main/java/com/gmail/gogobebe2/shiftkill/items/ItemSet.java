package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public abstract class ItemSet {
    // Sorted by priority.
    private Queue<ItemStack> items = new LinkedList<>();

    protected ItemSet() {
        initItems();
    }

    /**
     * This method should implement the prioritization and inclusion of the specific {@code ItemStack}.
     */
    public abstract void initItems();

    public void giveSet(Player player) {
        PlayerInventory inventory = player.getInventory();
        Map<Integer, ItemStack> drops = new HashMap<>();
        for (ItemStack item : items) {
            drops.putAll(inventory.addItem(item));
        }
        for (int slot : drops.keySet()) {
            ItemStack item = drops.get(slot);
            player.getWorld().dropItemNaturally(player.getLocation(), item);
            item.setType(Material.AIR);
            inventory.setItem(slot, item);
        }
        player.updateInventory();
    }

    protected Queue<ItemStack> getItems() {
        return items;
    }
}