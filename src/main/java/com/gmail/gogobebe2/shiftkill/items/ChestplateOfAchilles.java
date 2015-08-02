package com.gmail.gogobebe2.shiftkill.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public final class ChestplateOfAchilles extends CustomItemStack {

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.DIAMOND_CHESTPLATE);
        this.setAmount(1);
        this.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        this.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);

        ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Diamond Chestplate of Achilles");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GOLD + "May Achilles give you");
        lore.add(ChatColor.GOLD + "the courage to slay your");
        lore.add(ChatColor.GOLD + "enemies just as he slayed");
        lore.add(ChatColor.GOLD + "Hector outside the gates");
        lore.add(ChatColor.GOLD + "of Troy, the battleground");
        lore.add(ChatColor.GOLD + "of the Trojan War!");
        meta.setLore(lore);
        this.setItemMeta(meta);
    }

    /**
     *
     * @param player The {@code Player} that will be tested to dodge.
     * @return Whether or not the {@code player} should dodge their attack.
     */
    public boolean shouldDodge(Player player) {
        final float EVASION_CHANCE = 0.10F;
        return new Random().nextFloat() <= EVASION_CHANCE;
    }
}
