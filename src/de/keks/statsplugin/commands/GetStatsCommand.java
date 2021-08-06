package de.keks.statsplugin.commands;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.keks.statsplugin.main.Main;

public class GetStatsCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			
			//if(args.length != 1) return false;
			
			Player player = (Player) sender;
			FileConfiguration config = Main.getPlugin().getConfig();
			
					if(args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						UUID playerUUID = target.getUniqueId();
						
						
						if(config.contains(playerUUID + ".SLAYING_EXP")) {
							player.sendMessage("Slaying-XP: " + config.getDouble(playerUUID + ".SLAYING_EXP"));
							player.sendMessage("Slaying Level: " + config.getDouble(playerUUID + ".SLAYING_LVL"));
							player.sendMessage("");
						}
						
						if(config.contains(playerUUID + ".MINING_EXP")) {
							player.sendMessage("Mining-XP: " + config.getDouble(playerUUID + ".MINING_EXP"));
							player.sendMessage("Mining Level: " + config.getDouble(playerUUID + ".MINING_LVL"));
							player.sendMessage("");
						}
						if(config.contains(playerUUID + ".FARMING_EXP")) {
							player.sendMessage("Farming-XP: " + config.getDouble(playerUUID + ".FARMING_EXP"));
							player.sendMessage("Farming Level: " + config.getDouble(playerUUID + ".FARMING_LVL"));
							player.sendMessage("");
						}
						if(config.contains(playerUUID + ".FORAGING_EXP")) {
							player.sendMessage("Foraging-XP: " + config.getDouble(playerUUID + ".FORAGING_EXP"));
							player.sendMessage("Foraging Level: " + config.getDouble(playerUUID + ".FORAGING_LVL"));
							player.sendMessage("");
						}
						
						
					}else
						player.sendMessage("Incorrect spelling!");
		}
		return false;
	}

}
