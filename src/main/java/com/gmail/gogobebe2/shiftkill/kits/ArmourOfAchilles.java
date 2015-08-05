package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.kits.items.ChestplateOfAchilles;
import com.gmail.gogobebe2.shiftkill.kits.items.PotionsOfAchilles;
import org.bukkit.ChatColor;

public final class ArmourOfAchilles extends Kit {

    @Override
    protected void initItems() {
        getITEMS().add(new ChestplateOfAchilles());
        getITEMS().add(new PotionsOfAchilles());
    }

    @Override
    protected String initName() {
        return ChatColor.RED + "" + ChatColor.BOLD + "Armour Of Achilles";
    }
}
