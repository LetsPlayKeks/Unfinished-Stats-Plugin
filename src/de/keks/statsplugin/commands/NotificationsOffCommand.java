package de.keks.statsplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.keks.statsplugin.main.Main;

public class NotificationsOffCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player)sender;
		FileConfiguration config = Main.getPlugin().getConfig();
		
		config.set(player.getUniqueId() + ".Notifications", "off");
		return false;
	}

}
