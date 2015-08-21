package com.gmail.gogobebe2.shiftkill.kits.enhanceditems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public final class ApollosBowItem extends CustomItemStack {
    private static final double LIFESTEAL = 2;
    private static final int POISON_DURATION = 7;

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.BOW);
        this.setAmount(1);
        this.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        this.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 7);
        this.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 2);

        ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Apollo's Bow");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "Lifesteal" + ChatColor.GOLD + ChatColor.BOLD + " - " + LIFESTEAL / 2
                + " lifesteal/hit");
        lore.add(ChatColor.GRAY + "Poisoned Arrows" + ChatColor.DARK_GREEN + ChatColor.BOLD + " - " + POISON_DURATION + " seconds");
        meta.setLore(lore);
        this.setItemMeta(meta);
    }

    public static void hit(Player shooter, Player receiver) {
        receiver.addPotionEffect(new PotionEffect(PotionEffectType.POISON, POISON_DURATION, 0));
        double health = shooter.getHealth();
        if (health <= 20 - LIFESTEAL) {
           shooter.setHealth(health + LIFESTEAL);
        }
    }
}
