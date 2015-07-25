package com.gmail.gogobebe2.shiftkill;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ShiftKill extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Starting up ShiftKill. If you need me to update this plugin, email at gogobebe2@gmail.com");
        Bukkit.getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling ShiftKill. If you need me to update this plugin, email at gogobebe2@gmail.com");
    }
}
