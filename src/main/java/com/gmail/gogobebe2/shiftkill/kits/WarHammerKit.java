package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.kits.items.WarHammerItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class WarHammerKit extends Kit {
    // 16421 = healing splash potion II.
    private static final short HEALING_II_SPLASH_POTION_TYPE = 16421;
    // 16471 * 3/8 = regen splash potion II (extended).
    private static final short REGEN_SPLASH_POTION_TYPE = 16449;

    @Override
    protected void initItems() {
        getITEMS().add(new WarHammerItem());

        ItemStack healthIISplashPotion = new ItemStack(Material.POTION, 5);
        healthIISplashPotion.setDurability(HEALING_II_SPLASH_POTION_TYPE);
        getITEMS().add(healthIISplashPotion);

        ItemStack regenSplashPotion = new ItemStack(Material.POTION, 3);
        regenSplashPotion.setDurability(REGEN_SPLASH_POTION_TYPE);
        getITEMS().add(regenSplashPotion);
    }

    @Override
    protected String initName() {
        return null;
    }
}
