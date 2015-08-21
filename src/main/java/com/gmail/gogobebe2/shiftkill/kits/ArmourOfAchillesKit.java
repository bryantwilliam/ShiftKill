package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.kits.enhanceditems.ChestplateOfAchillesItem;
import com.gmail.gogobebe2.shiftkill.kits.enhanceditems.PotionsOfAchillesItem;
import org.bukkit.ChatColor;

public class ArmourOfAchillesKit extends Kit {

    @Override
    protected void initItems() {
        getITEMS().add(new ChestplateOfAchillesItem());
        getITEMS().add(new PotionsOfAchillesItem());
    }

    @Override
    protected String initName() {
        return ChatColor.RED + "" + ChatColor.BOLD + ChatColor.ITALIC + "Armour Of Achilles and Potions Of Achilles";
    }
}
