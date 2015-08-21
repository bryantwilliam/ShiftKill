package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;

public class Milestone7Kit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(KitUtils.getRandomChainmailArmourPiece());
        getITEMS().add(KitUtils.getHealingSplashPotion(1));
    }

    @Override
    protected String initName() {
        return ChatColor.GRAY + "7 Kill Milestone Kit";
    }
}
