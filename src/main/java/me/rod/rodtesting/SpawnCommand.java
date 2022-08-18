package me.rod.rodtesting;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    private final RoDTesting plugin;

    public SpawnCommand(RoDTesting plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Location location = (Location) plugin.getConfig().get("spawn");
            if (location != null) {
                player.teleport(location);
                player.sendMessage(ChatColor.GREEN + "You have been teleported to the spawn!");

            }else{
                player.sendMessage(ChatColor.RED + "There is no spawn point set for this server!");

            }
        }

        return false;
    }
}
