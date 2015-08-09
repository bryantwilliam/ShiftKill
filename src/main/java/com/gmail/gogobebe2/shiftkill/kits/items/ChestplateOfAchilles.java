package com.gmail.gogobebe2.shiftkill.kits.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ChestplateOfAchilles extends CustomItemStack {

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.DIAMOND_CHESTPLATE);
        this.setAmount(1);
        this.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        this.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);

        ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Chestplate of Achilles");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "Evasion" + ChatColor.BLUE + ChatColor.BOLD + " - 10% chance.");
        meta.setLore(lore);
        this.setItemMeta(meta);
    }

    /**
     * Handles whether a player should dodge their attack.
     * @param player The {@code Player} that will be tested to dodge.
     * @return Whether or not the {@code player} should dodge their attack.
     */
    public static boolean shouldDodge(Player player) {
        final float EVASION_CHANCE = 0.10F;
        return new Random().nextFloat() <= EVASION_CHANCE;
    }
}
