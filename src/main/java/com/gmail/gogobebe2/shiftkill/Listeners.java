package com.gmail.gogobebe2.shiftkill;

import com.gmail.gogobebe2.shiftkill.items.armourofachilles.ChestplateOfAchilles;
import com.gmail.gogobebe2.shiftkill.items.armourofachilles.PotionOfAchilles;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PotionSplashEvent;

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
        if (event.getEntity().getItem() instanceof PotionOfAchilles) {
            event.setCancelled(true);
            PotionOfAchilles potion = (PotionOfAchilles) event.getEntity().getItem();
            potion.useAbility(thrownPotion.getLocation());
        }
    }
}
