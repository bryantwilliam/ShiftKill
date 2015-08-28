package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Milestone30Kit extends Kit {

    @Override
    protected void initItems() {
        ItemStack randomArmourPiece = KitUtils.getRandomDiamondArmourPiece();
        randomArmourPiece.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        getITEMS().add(randomArmourPiece);

        getITEMS().add(KitUtils.getHealingIISplashPotion(3));
    }

    @Override
    protected String initName() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "30 Kill Milestone Kit";
    }
}
