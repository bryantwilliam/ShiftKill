package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Milestone25Kit extends Kit {
    @Override
    protected void initItems() {
        ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD, 1);
        diamondSword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        getITEMS().add(diamondSword);

        ItemStack randomWeapon;
        // random number (1 or 2).
        if ((int) ( Math.random() * 2 + 1) == 2) {
            randomWeapon = new ItemStack(Material.IRON_SWORD, 1);
            randomWeapon.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        }
        else {
            randomWeapon = new ItemStack(Material.BOW);
            randomWeapon.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
        }
        getITEMS().add(randomWeapon);
    }

    @Override
    protected String initName() {
        return ChatColor.DARK_GRAY + "25 Kill Milestone Kit";
    }
}
