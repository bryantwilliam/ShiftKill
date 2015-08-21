package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;

public class Milestone20Kit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(KitUtils.getRandomDiamondArmourPiece());
        getITEMS().add(KitUtils.getHealingSplashPotion(2));
    }

    @Override
    protected String initName() {
        return ChatColor.DARK_GRAY + "20 Kill Milestone Kit";
    }
}
