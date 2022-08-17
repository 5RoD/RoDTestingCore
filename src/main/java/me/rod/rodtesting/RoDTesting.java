package me.rod.rodtesting;

import com.avaje.ebeaninternal.server.cluster.mcast.Message;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
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


    }


 }

