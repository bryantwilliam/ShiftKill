package com.gmail.gogobebe2.shiftkill.kits;

import com.gmail.gogobebe2.shiftkill.kits.items.ApollosBowItem;

public final class ApollosBowKit extends Kit {
    @Override
    protected void initItems() {
        getITEMS().add(new ApollosBowItem());
    }

    @Override
    protected String initName() {
        return "Apollo's Bow";
    }
}
