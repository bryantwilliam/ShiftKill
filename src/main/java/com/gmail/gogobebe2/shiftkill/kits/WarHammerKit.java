package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.enhanceditems.WarHammerItem;
import org.bukkit.ChatColor;

public class WarHammerKit extends Kit {

    @Override
    protected void initItems() {
        getITEMS().add(new WarHammerItem());
        getITEMS().add(KitUtils.getHealingIISplashPotion(5));
        getITEMS().add(KitUtils.getRegenSplashPotionExtended(3));
    }

    @Override
    protected String initName() {
        return ChatColor.GOLD + "" + ChatColor.ITALIC + ChatColor.BOLD + "War hammer and potions";
    }
}
