package me.rod.rodtesting;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("sex")){

            if (sender instanceof Player) {

                Player p = (Player) sender;
                if (p.hasPermission("rodtestingcore.vip"))
                    p.setHealth(20);
                p.sendMessage(ChatColor.GREEN + "You have Fully Healed! :D");

            }else{
                Player p = (Player) sender;
                p.sendMessage(ChatColor.RED + "You do not have permission to do that!");
            }
        }


        return true;
    }
}
