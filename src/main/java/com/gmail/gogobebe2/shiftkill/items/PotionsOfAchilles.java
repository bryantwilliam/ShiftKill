package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public final class PotionsOfAchilles extends CustomItemStack {

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.POTION);
        // 16421 = healing splash potion.
        final short POTION_TYPE = 16421;
        this.setDurability(POTION_TYPE);

        ItemMeta meta = this.getItemMeta();

        meta.setDisplayName(ChatColor.DARK_RED + "Achilles' Splash Potion Of Healing");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);

        List<String> lore = new ArrayList<>(1);
        lore.add(ChatColor.GRAY + "Instant Health III");
        lore.add(ChatColor.BLUE + "Brewing");
        meta.setLore(lore);

        this.setItemMeta(meta);

        setAmount(10);
    }

    /**
     * Handles this {@code CustomItemStack} splash logic.
     * @param destination The destination of where the potion lands.
     */
    public void splash(Location destination) {
        for (int x = destination.getBlockX() - 4; x < destination.getBlockX() + 4; x++) {
            for (int y = destination.getBlockY() - 4; y < destination.getBlockY() + 4; y++) {
                for (int z = destination.getBlockZ() - 4; z < destination.getBlockZ() + 4; z++) {
                    Block block = destination.getWorld().getBlockAt(x, y, z);
                    for (Entity entity : block.getWorld().getEntities()) {
                        if (entity.getLocation().getBlock().getLocation().equals(block.getLocation())) {
                            if (entity instanceof Player) {
                                Player player = (Player) entity;
                                // 16.0 health = 8 hearts
                                final double TOTAL_HEALTH = player.getHealth() + 16;
                                final double FINAL_HEALTH = TOTAL_HEALTH > 20 ? 20 : TOTAL_HEALTH;
                                player.sendMessage(ChatColor.BLUE + "" + ChatColor.ITALIC + "Healed!");
                                player.setHealth(FINAL_HEALTH);
                            }
                        }
                    }
                }
            }
        }
    }
}
