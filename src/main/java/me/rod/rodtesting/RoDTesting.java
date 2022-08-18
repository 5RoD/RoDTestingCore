package me.rod.rodtesting;

import me.rod.rodtesting.commands.FeedCommand;
import me.rod.rodtesting.commands.HealCommand;
import me.rod.rodtesting.commands.SetSpawnCommand;
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
        getConfig().options().copyDefaults();
        saveDefaultConfig();


    }

}

