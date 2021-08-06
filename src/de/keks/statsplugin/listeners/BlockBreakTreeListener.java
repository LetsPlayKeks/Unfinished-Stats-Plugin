package de.keks.statsplugin.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import de.keks.statsplugin.main.Main;


public class BlockBreakTreeListener implements Listener{
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		
		Player player = event.getPlayer();
		FileConfiguration config = Main.getPlugin().getConfig();
		//player.sendMessage("Block broken");
		
		Block block = event.getBlock();
		//Material blockType = block.getType();
		if(block.getType() == null) return;
		//player.sendMessage("Block broken2");
		if(block.getType() == Material.WHEAT) {
			
			double farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			config.set(player.getUniqueId() + ".FARMING_EXP", farming_exp + 0.1);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			player.sendMessage("§7 +0,1 Farming-XP");
			
		}
		
		if(block.getType() == Material.CARROT) {
	
			double farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			config.set(player.getUniqueId() + ".FARMING_EXP", farming_exp + 0.1);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			player.sendMessage("§7 +0,1 Farming-XP");
	
		}

		if(block.getType() == Material.MELON) {
	
			double farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			config.set(player.getUniqueId() + ".FARMING_EXP", farming_exp + 0.5);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			player.sendMessage("§7 +0,1 Farming-XP");
	
		}

		if(block.getType() == Material.PUMPKIN) {
			
			double farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			config.set(player.getUniqueId() + ".FARMING_EXP", farming_exp + 0.5);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			player.sendMessage("§7 +0,1 Farming-XP");
			
		}
		
		if(block.getType() == Material.SUGAR_CANE) {
			
			double farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			config.set(player.getUniqueId() + ".FARMING_EXP", farming_exp + 0.1);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			player.sendMessage("§7 +0,1 Farming-XP");
			
		}
		
		if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 100d) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 1);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 420d) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 2);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 1337d) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 3);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 777777d) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 4);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 10000000d ) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 5);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 50000000d ) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 6);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 69000000d ) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 7);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 100000000d ) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 8);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 1000000000d ) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 9);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FARMING_EXP") >= 5000000000d) {
			
			config.set(player.getUniqueId() + ".FARMING_LVL", 10);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FARMING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}
		if(config.get(player.getUniqueId() + ".Notifications") == "on") {
			double new_farming_exp = config.getDouble(player.getUniqueId() + ".FARMING_EXP");
			player.sendMessage("§a Farming-XP: " + new_farming_exp);
		}
		
	} 

}
