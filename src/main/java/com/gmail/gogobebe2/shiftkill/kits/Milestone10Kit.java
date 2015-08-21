package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.ChatColor;

public class Milestone10Kit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(KitUtils.getRandomChainmailArmourPiece());
    }

    @Override
    protected String initName() {
        return ChatColor.GRAY + "10 Kill Milestone Kit";
    }
}
