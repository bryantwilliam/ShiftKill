package com.gmail.gogobebe2.shiftkill;

import com.gmail.gogobebe2.shiftkill.kits.ApollosBowKit;
import com.gmail.gogobebe2.shiftkill.kits.ArmourOfAchillesKit;
import com.gmail.gogobebe2.shiftkill.kits.items.ApollosBowItem;
import com.gmail.gogobebe2.shiftkill.kits.items.ChestplateOfAchillesItem;
import com.gmail.gogobebe2.shiftkill.kits.items.PotionsOfAchillesItem;
import com.gmail.gogobebe2.shiftkill.kits.items.WarHammerItem;
import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerChatEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onEntityDamagedByEntity(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            Player damager = null;
            if (event.getDamager() instanceof Arrow) {
                Arrow arrow = (Arrow) event.getDamager();
                if (arrow.getShooter() instanceof Player) {
                    damager = (Player) arrow.getShooter();
                }
            }
            else if (event.getDamager() instanceof Player) {
                damager = (Player) event.getDamager();
            }

            if (damager != null) {
                if (new ApollosBowItem().equals(damager.getItemInHand())) {
                    ApollosBowItem.hit(damager, player);
                }
                else if (new WarHammerItem().equals(damager.getItemInHand())) {
                    WarHammerItem.damageArmour(player);
                }
            }
        }
    }

    @EventHandler
    public void onEntityDamaged(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (new ChestplateOfAchillesItem().equals(player.getInventory().getChestplate())) {
                if (ChestplateOfAchillesItem.shouldDodge(player)) {
                    event.setCancelled(true);
                    player.sendMessage(ChatColor.AQUA + "" + ChatColor.ITALIC + "Dodged!");
                }
            }
        }
    }

/*    public void InventoryPickupItemEvent (InventoryPickupItemEvent event) {
        event.setCancelled(true);
        event.getInventory().addItem(event.getItem().getItemStack());
    }*/

    @EventHandler
    public void onPotionSplash(PotionSplashEvent event) {
        Entity thrownPotion = event.getEntity();
        if (new PotionsOfAchillesItem().equals(event.getEntity().getItem())) {
            event.setCancelled(true);
            PotionsOfAchillesItem.splash(thrownPotion.getLocation());
        }
    }

    @EventHandler
    public void test(PlayerChatEvent event) {
        if (event.getMessage().equalsIgnoreCase("test shiftkill")){
            new ArmourOfAchillesKit().giveSet(event.getPlayer());
            new ApollosBowKit().giveSet(event.getPlayer());
        }
    }
}
