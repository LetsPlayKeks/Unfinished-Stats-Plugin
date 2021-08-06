package de.keks.statsplugin.commands;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.keks.statsplugin.main.Main;

public class SetSlayingEXPCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			
			//if(args.length != 1) return false;
			
			Player player = (Player) sender;
			FileConfiguration config = Main.getPlugin().getConfig();
			
					if(args.length == 2) {
						Player target = Bukkit.getPlayer(args[0]);
						String var = args[1].toString();
						UUID playerUUID = target.getUniqueId();
						
						
						if(config.contains(playerUUID + ".SLAYING_EXP")) {
							double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
							config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + var);
							//config.set(playerUUID + ".SLAYING_EXP", config.getDouble(playerUUID + ".SLAYING_EXP") + var);
						}
						
					}else
						player.sendMessage("Incorrect spelling!");
		}
		return false;
	}

}
