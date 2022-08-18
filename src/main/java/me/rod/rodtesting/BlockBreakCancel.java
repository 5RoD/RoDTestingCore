package me.rod.rodtesting;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;


public class BlockBreakCancel implements Listener {


    @EventHandler
    public void BlockBreakEvent(BlockBreakEvent event) {
        event.setCancelled(true);


    }

    @EventHandler
    public void BlockPlaceEvent(BlockPlaceEvent event) {

        event.setCancelled(true);

    }
}


















