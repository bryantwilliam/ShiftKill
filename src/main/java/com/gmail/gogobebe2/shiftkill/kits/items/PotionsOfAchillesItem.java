package com.gmail.gogobebe2.shiftkill.kits.items;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.PotionMeta;

import java.util.ArrayList;
import java.util.List;

public final class PotionsOfAchillesItem extends CustomItemStack {
    private static int HEAL_AMOUNT = 16;
    // 16421 = healing splash potion II.
    private static final short POTION_TYPE = 16421;

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.POTION);
        this.setDurability(POTION_TYPE);
        PotionMeta meta = (PotionMeta) this.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Achilles' Splash Potion Of Healing");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS);
        List<String> lore = new ArrayList<>(1);
        lore.add(ChatColor.GRAY + "Instant Health" + ChatColor.RED + ChatColor.BOLD + " - " + HEAL_AMOUNT / 2 + " hearts.");
        meta.setLore(lore);

        this.setItemMeta(meta);

        setAmount(10);
    }

    /**
     * Handles this {@code CustomItemStack} splash logic.
     *
     * @param destination The destination of where the potion lands.
     */
    public static void splash(Location destination) {
        for (int x = destination.getBlockX() - 4; x < destination.getBlockX() + 4; x++) {
            for (int y = destination.getBlockY() - 4; y < destination.getBlockY() + 4; y++) {
                for (int z = destination.getBlockZ() - 4; z < destination.getBlockZ() + 4; z++) {
                    Block block = destination.getWorld().getBlockAt(x, y, z);
                    for (Player player : block.getWorld().getPlayers()) {
                        if (player.getLocation().getBlock().getLocation().equals(block.getLocation())) {
                            // 16.0 health = 8 hearts
                            double health = player.getHealth();
                            final double MAX_HEALTH = 20;
                            if (health <= MAX_HEALTH - HEAL_AMOUNT) {
                                player.setHealth(health + HEAL_AMOUNT);
                            }
                            else {
                                player.setHealth(MAX_HEALTH);
                            }
                            player.sendMessage(ChatColor.BLUE + "" + ChatColor.ITALIC + "Healed!");
                        }
                    }
                }
            }
        }
    }
}
