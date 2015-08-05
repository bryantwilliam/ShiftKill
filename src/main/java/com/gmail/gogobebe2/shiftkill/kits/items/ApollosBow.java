package com.gmail.gogobebe2.shiftkill.kits.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ApollosBow extends CustomItemStack {
    @Override
    protected void initSpecialTraits() {
        this.setType(Material.BOW);
        this.setAmount(1);
        this.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        this.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 7);
        this.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 2);

        ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Apollo's Bow");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lore = new ArrayList<>();
        // TODO: Come up with good lore to add to this item.
        meta.setLore(lore);
        this.setItemMeta(meta);
    }
}
