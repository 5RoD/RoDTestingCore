package me.rod.rodtesting.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("heal")) {

            if (sender instanceof Player) {

                Player p = (Player) sender;
                if (p.hasPermission("rodtestingcore.admin")) {
                    p.setHealth(p.getMaxHealth());
                    p.sendMessage(ChatColor.GREEN + "You have Fully Healed! :D");

                } else {
                    p.sendMessage(ChatColor.RED + "You do not have permissions!");
                }
            }


        }
        return true;
    }
}
