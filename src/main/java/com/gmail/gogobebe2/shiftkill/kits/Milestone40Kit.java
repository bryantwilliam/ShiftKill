package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Milestone40Kit extends Kit {

    @Override
    protected void initItems() {
        ItemStack weapon;
        // random number (1 or 2).
        if ((int) ( Math.random() * 2 + 1) == 2) {
            weapon = new ItemStack(Material.DIAMOND_SWORD, 1);
            weapon.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
        }
        else {
            weapon = new ItemStack(Material.BOW, 1);
            weapon.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 4);
        }
        getITEMS().add(weapon);
        getITEMS().add(KitUtils.getHealingIISplashPotion(4));
        getITEMS().add(KitUtils.getRegenSplashPotionExtended(2));
    }

    @Override
    protected String initName() {
        return ChatColor.GOLD + "" + ChatColor.BOLD + "40 Kill Milestone Kit";
    }
}
