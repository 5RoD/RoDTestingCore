package me.rod.rodtesting.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.hasPlayedBefore()) {

            event.setJoinMessage(ChatColor.GRAY + "Welcome back my friend");

        } else {
            event.setJoinMessage(ChatColor.GRAY + "Welcome to the server my friend!");
        }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {

        Player player = event.getPlayer();

        event.setQuitMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GRAY + "has left the server");
    }


}
