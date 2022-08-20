package me.rod.rodtesting.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMCCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("gmc")) {
            if (sender instanceof Player) {
                if (args.length == 0)
                    if (player.hasPermission("rodtestingcore.admin")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.GREEN + "You have changed your gamemode to" + ChatColor.BOLD + " Creative");
                    } else {
                        player.sendMessage(ChatColor.RED + "You do not have permissions to do that!");
                    String playerName = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playerName);
                    if (target == null)
                        player.sendMessage(ChatColor.RED + "Player not Online!");


                    else {
                        player.sendMessage(ChatColor.GREEN + "You have changed " + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + " gamemode to creative");
                        target.sendMessage(ChatColor.GREEN + "Your gamemode have been changed by " + ChatColor.BOLD + player.getDisplayName());
                        target.setGameMode(GameMode.CREATIVE);
                    }
                }
            }
        }
        return true;
    }
}