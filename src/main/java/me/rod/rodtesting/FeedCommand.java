package me.rod.rodtesting;

import org.bukkit.ChatColor;
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
            if (player.hasPermission("rodtestingcore.vip"));
                player.setFoodLevel(30);
            player.sendMessage(ChatColor.GREEN + "you have successfully feed yourself");


        } else { Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "You do not have permission to do that!");
        }

        return false;

        }


    }

