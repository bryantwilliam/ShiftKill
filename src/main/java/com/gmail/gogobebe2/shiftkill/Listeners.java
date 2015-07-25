package com.gmail.gogobebe2.shiftkill;

import com.gmail.gogobebe2.shiftkill.items.ArmourOfAchilles;
import com.gmail.gogobebe2.shiftkill.items.ChestplateOfAchilles;
import com.gmail.gogobebe2.shiftkill.items.PotionsOfAchilles;
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
            if (ChestplateOfAchilles.getPotentialEvasivePlayers().contains(player)) {
                if (player.getInventory().getArmorContents()[1] instanceof ChestplateOfAchilles) {
                    event.setCancelled(true);
                }
                ChestplateOfAchilles.getPotentialEvasivePlayers().remove(player);
            }
        }
    }

    @EventHandler
    public void onPotionSplash(PotionSplashEvent event) {
        Entity thrownPotion = event.getEntity();
        if (event.getEntity().getItem() instanceof PotionsOfAchilles) {
            event.setCancelled(true);
            PotionsOfAchilles potion = (PotionsOfAchilles) event.getEntity().getItem();
            potion.useAbility(thrownPotion.getLocation());
        }
    }

    @EventHandler
    public void test(PlayerChatEvent event) {
        new ArmourOfAchilles().giveSet(event.getPlayer());
        event.getPlayer().sendMessage(ChatColor.GREEN + "Sent!");
    }
}
