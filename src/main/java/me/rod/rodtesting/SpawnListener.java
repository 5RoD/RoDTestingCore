package me.rod.rodtesting;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class SpawnListener implements Listener {

    private final RoDTesting plugin;

    public SpawnListener(RoDTesting plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {

        Location location = (Location) plugin.getConfig().get("spawn");
        event.setRespawnLocation(location);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Location location = (Location) plugin.getConfig().get("spawn");
        event.getPlayer().teleport(location);

    }

}

