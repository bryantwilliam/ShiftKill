package com.gmail.gogobebe2.shiftkill.items.armourofachilles;

import com.gmail.gogobebe2.shiftkill.items.CustomItemStack;
import com.gmail.gogobebe2.shiftkill.items.EnhancedItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChestplateOfAchilles extends CustomItemStack implements EnhancedItemStack {
    private Player holder;

    private final float EVASION_CHANCE = 0.10F;

    protected ChestplateOfAchilles(@Nullable Player holder) {
        this.holder = holder;
    }

    protected ChestplateOfAchilles() {
        this(null);
    }

    /**
     * This method gives a certain chance of evasion for each attacks.
     */
    @Override
    public void useAbility() {
        if (new Random().nextFloat() <= EVASION_CHANCE) {
            // Add to list of players up for evasion.
        }
    }


    @Nullable @Override
    public Player getHolder() {
        return this.holder;
    }

    @Override
    public void setHolder(@Nullable Player holder) {
        this.holder = holder;
    }

    @Override
    protected void initSpecialTraits() {
        this.setType(Material.DIAMOND_CHESTPLATE);
        this.setAmount(1);
        this.addEnchantment(Enchantment.DURABILITY, 5);
        this.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);

        ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Chestplate of Achilles");

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GOLD + "May Achilles give you");
        lore.add(ChatColor.GOLD + "the courage to slay your");
        lore.add(ChatColor.GOLD + "enemies just as he slayed");
        lore.add(ChatColor.GOLD + "Hector outside the gates");
        lore.add(ChatColor.GOLD + "of Troy, the battleground");
        lore.add(ChatColor.GOLD + "of the Trojan War!");
        meta.setLore(lore);
    }
}
