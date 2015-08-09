package com.gmail.gogobebe2.shiftkill;

import com.gmail.gogobebe2.shiftkill.kits.ArmourOfAchilles;
import com.gmail.gogobebe2.shiftkill.kits.items.ChestplateOfAchilles;
import com.gmail.gogobebe2.shiftkill.kits.items.PotionsOfAchilles;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerChatEvent;

public class Listeners implements Listener {
    @EventHandler
    public void onEntityDamagedByEntity(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (new ChestplateOfAchilles().equals(player.getInventory().getArmorContents()[1])) {
                if (ChestplateOfAchilles.shouldDodge(player)) {
                    event.setCancelled(true);
                    player.sendMessage(ChatColor.AQUA + "" + ChatColor.ITALIC + "Dodged!");
                }
            }
        }
    }

/* TODO: Test this out later.

    public void InventoryPickupItemEvent (InventoryPickupItemEvent event) {
        event.setCancelled(true);
        event.getInventory().addItem(event.getItem().getItemStack());
    }*/

    @EventHandler
    public void onPotionSplash(PotionSplashEvent event) {
        Entity thrownPotion = event.getEntity();
        if (new PotionsOfAchilles().equals(event.getEntity().getItem())) {
            event.setCancelled(true);
            PotionsOfAchilles.splash(thrownPotion.getLocation());
        }
    }

    @EventHandler
    public void test(PlayerChatEvent event) {
        if (event.getMessage().equalsIgnoreCase("test shiftkill")){
            new ArmourOfAchilles().giveSet(event.getPlayer());
        }
    }
}
