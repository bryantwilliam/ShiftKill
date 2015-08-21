package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Milestone15Kit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(new ItemStack(Material.DIAMOND_SWORD, 1));
        getITEMS().add(KitUtils.getHealingSplashPotion(1));
    }

    @Override
    protected String initName() {
        return ChatColor.DARK_GRAY + "15 Kill Milestone Kit";
    }
}
