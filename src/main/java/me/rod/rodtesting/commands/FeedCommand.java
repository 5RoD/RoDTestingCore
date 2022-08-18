package me.rod.rodtesting.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class FeedCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            if (args.length == 0)
                if (player.hasPermission("rodtestingcore.vip")) {
                    player.setFoodLevel(30);
                    player.sendMessage(ChatColor.GREEN + "you have successfully fed yourself");

                } else {

                    player.sendMessage(ChatColor.RED + "You do not have permissions to do that!");

                }
            else {
                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if (target == null)
                    player.sendMessage(ChatColor.RED + "Player not Online!");


                else {
                    player.sendMessage(ChatColor.GREEN + "You have fully fed " +  target.getDisplayName());
                    target.sendMessage(ChatColor.GREEN + "You have been fully fed by " +  player.getDisplayName());
                    target.setFoodLevel(20);

                }

            }


        }
        return false;
    }

}

