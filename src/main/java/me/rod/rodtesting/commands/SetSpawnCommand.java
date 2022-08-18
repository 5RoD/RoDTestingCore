package me.rod.rodtesting.commands;

import me.rod.rodtesting.RoDTesting;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private final RoDTesting plugin;

    public SetSpawnCommand(RoDTesting plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player) {

            Player player = (Player) sender;
            Location location = player.getLocation();

            if (player.hasPermission("rodtestingcore.vip")) {
                plugin.getConfig().set("spawn", location);
                plugin.saveConfig();
                player.sendMessage(ChatColor.GREEN + "Spawn location has been set");

            } else {
                player.sendMessage(ChatColor.RED + "You do not have permissions to do that!");

            }

        }
        return true;
    }
}
