package com.gmail.gogobebe2.shiftkill.items.armourofachilles;

import com.gmail.gogobebe2.shiftkill.items.CustomItemStack;
import com.gmail.gogobebe2.shiftkill.items.UsableItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public class PotionOfAchilles extends CustomItemStack implements UsableItemStack {
    @Override
    protected void initSpecialTraits() {
        this.setType(Material.POTION);
        // 16421 = healing splash potion.
        final short POTION_TYPE = 16421;
        this.setDurability(POTION_TYPE);

        List<String> lore = new ArrayList<>(2);
        lore.add(ChatColor.BLUE + "Brewing");
        lore.add(ChatColor.GRAY + "Instant Health III");
        getItemMeta().setLore(lore);

        getItemMeta().setDisplayName(ChatColor.DARK_RED + "Achilles' Splash Potion Of Healing");
    }

    @Override
    public void useAbility(Location target) {
        for (int x = target.getBlockX() - 4; x < target.getBlockX() + 4; x++) {
            for (int y = target.getBlockY() - 4; y < target.getBlockY() + 4; y++) {
                for (int z = target.getBlockZ() - 4; z < target.getBlockZ() + 4; z++) {
                    Block block = target.getWorld().getBlockAt(x, y, z);
                    for (Entity entity : block.getWorld().getEntities()) {
                        if (entity.getLocation().getBlock().equals(block)) {
                            if (entity instanceof Damageable) {
                                Damageable damageable = (Damageable) entity;
                                damageable.setHealth((damageable.getHealth() + 8));
                            }
                        }
                    }
                }
            }
        }
    }
}
