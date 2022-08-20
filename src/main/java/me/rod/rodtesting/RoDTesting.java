package me.rod.rodtesting;

import me.rod.rodtesting.commands.*;
import me.rod.rodtesting.listeners.BlockBreakCancel;
import me.rod.rodtesting.listeners.JoinLeaveListener;
import me.rod.rodtesting.listeners.SpawnListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class RoDTesting extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("Plugin Starting...");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new BlockBreakCancel(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new SpawnListener(this), this);
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getCommand("gmc").setExecutor(new GMCCommand());
        getCommand("fly").setExecutor(new Testing());
        getConfig().options().copyDefaults();
        saveDefaultConfig();


    }


}
