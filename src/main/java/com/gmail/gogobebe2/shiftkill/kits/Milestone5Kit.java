package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Milestone5Kit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(new ItemStack(Material.IRON_INGOT, 2));
    }

    @Override
    protected String initName() {
        return ChatColor.GRAY + "" + ChatColor.BOLD + "5 Kill Milestone Kit";
    }
}
