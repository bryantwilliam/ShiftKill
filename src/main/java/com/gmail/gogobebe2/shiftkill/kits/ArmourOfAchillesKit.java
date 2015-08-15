package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.kits.items.ChestplateOfAchillesItem;
import com.gmail.gogobebe2.shiftkill.kits.items.PotionsOfAchillesItem;
import org.bukkit.ChatColor;

public final class ArmourOfAchillesKit extends Kit {

    @Override
    protected void initItems() {
        getITEMS().add(new ChestplateOfAchillesItem());
        getITEMS().add(new PotionsOfAchillesItem());
    }

    @Override
    protected String initName() {
        return ChatColor.RED + "" + ChatColor.BOLD + "Armour Of Achilles";
    }
}
