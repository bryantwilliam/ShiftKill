package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Milestone3Kit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(new ItemStack(Material.STONE_SWORD, 1));
    }

    @Override
    protected String initName() {
        return ChatColor.GRAY + "" + ChatColor.BOLD + "3 Kill Milestone Kit";
    }
}
