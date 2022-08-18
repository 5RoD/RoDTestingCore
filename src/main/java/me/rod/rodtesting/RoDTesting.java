package me.rod.rodtesting;

import me.rod.rodtesting.commands.FeedCommand;
import me.rod.rodtesting.commands.HealCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RoDTesting extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("Plugin Starting...");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new BlockBreakCancel(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("sex").setExecutor(new HealCommand());
        getConfig().options().copyDefaults();
        saveDefaultConfig();



    }

 }

