package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.kits.enhanceditems.ApollosBowItem;
import org.bukkit.ChatColor;

public class ApollosBowKit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(new ApollosBowItem());
    }

    @Override
    protected String initName() {
        return ChatColor.BLUE + "" + ChatColor.BOLD + ChatColor.ITALIC + "Apollo's Bow";
    }
}
