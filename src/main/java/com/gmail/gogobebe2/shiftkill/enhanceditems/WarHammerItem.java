package com.gmail.gogobebe2.shiftkill.enhanceditems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public final class WarHammerItem extends CustomItemStack {
    private static final short ARMOUR_DAMAGE = 38;

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.DIAMOND_AXE);
        this.setAmount(1);
        this.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        this.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);

        ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "War Hammer");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "Armour Damage" + ChatColor.DARK_RED + ChatColor.BOLD + " - " + ARMOUR_DAMAGE + " durability points");
        meta.setLore(lore);
        this.setItemMeta(meta);
    }

    public static void damageArmour(Player victim) {
        ItemStack[] armour = victim.getInventory().getArmorContents();
        if (armour.length != 0) {
            for (ItemStack armourPiece : armour) armourPiece.setDurability((short) (armourPiece.getDurability() + ARMOUR_DAMAGE));
            victim.getWorld().playSound(victim.getLocation(), Sound.ITEM_BREAK, 0.7F, 1);
        }
    }
}
