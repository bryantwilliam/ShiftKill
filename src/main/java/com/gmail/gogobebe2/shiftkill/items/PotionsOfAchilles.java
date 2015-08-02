package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public final class PotionsOfAchilles extends CustomItemStack implements UsableItemStack {
    @Override
    protected void initSpecialTraits() {
        this.setType(Material.POTION);
        // 16421 = healing splash potion.
        final short POTION_TYPE = 16421;
        this.setDurability(POTION_TYPE);

        ItemMeta meta = this.getItemMeta();

        meta.setDisplayName(ChatColor.DARK_RED + "Achilles' Splash Potion Of Healing");
        List<String> lore = new ArrayList<>(2);
        lore.add(ChatColor.GRAY + "Instant Health III");
        meta.setLore(lore);

        this.setItemMeta(meta);

        setAmount(10);
    }

    @Override
    public void useAbility(Location target) {
        for (int x = target.getBlockX() - 4; x < target.getBlockX() + 4; x++) {
            for (int y = target.getBlockY() - 4; y < target.getBlockY() + 4; y++) {
                for (int z = target.getBlockZ() - 4; z < target.getBlockZ() + 4; z++) {
                    Block block = target.getWorld().getBlockAt(x, y, z);
                    for (Entity entity : block.getWorld().getEntities()) {
                        if (entity.getLocation().getBlock().getLocation().equals(block.getLocation())) {
                            if (entity instanceof Damageable) {
                                Damageable damageable = (Damageable) entity;
                                damageable.setHealth((damageable.getHealth() + 8));
                                if (entity instanceof Player) {
                                    Player player = (Player) entity;
                                    player.sendMessage(ChatColor.BLUE + "" + ChatColor.ITALIC + "Healed!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
