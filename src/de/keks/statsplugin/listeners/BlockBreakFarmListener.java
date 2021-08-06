package de.keks.statsplugin.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import de.keks.statsplugin.main.Main;


public class BlockBreakFarmListener implements Listener{
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		
		Player player = event.getPlayer();
		FileConfiguration config = Main.getPlugin().getConfig();
		//player.sendMessage("Block broken");
		
		Block block = event.getBlock();
		//Material blockType = block.getType();
		if(block.getType() == null) return;
		//player.sendMessage("Block broken2");
		if(block.getType() == Material.OAK_LOG) {
			
			double foraging_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			config.set(player.getUniqueId() + ".FORAGING_EXP", foraging_exp + 10);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			player.sendMessage("§7 +10 Foraging-XP");
			
		}
		
		if(block.getType() == Material.SPRUCE_LOG) {
	
			double foraging_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			config.set(player.getUniqueId() + ".FORAGING_EXP", foraging_exp + 10);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			player.sendMessage("§7 +10 Foraging-XP");
	
		}

		if(block.getType() == Material.DARK_OAK_LOG) {
	
			double foraging_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			config.set(player.getUniqueId() + ".FORAGING_EXP", foraging_exp + 10);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			player.sendMessage("§7 +10 Foraging-XP");
	
		}

		if(block.getType() == Material.JUNGLE_LOG) {
			
			double foraging_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			config.set(player.getUniqueId() + ".FORAGING_EXP", foraging_exp + 10);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			player.sendMessage("§7 +10 Foraging-XP");
			
		}
		
		if(block.getType() == Material.ACACIA_LOG) {
			
			double foraging_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			config.set(player.getUniqueId() + ".FORAGING_EXP", foraging_exp + 10);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			player.sendMessage("§7 +10 Foraging-XP");
			
		}
		
		if(block.getType() == Material.BIRCH_LOG) {
			
			double foraging_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			config.set(player.getUniqueId() + ".FORAGING_EXP", foraging_exp + 10);
			//double new_farming_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			player.sendMessage("§7 +10 Foraging-XP");
			
		}
		
		if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 100d) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 1);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 420d) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 2);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 1337d) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 3);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 777777d) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 4);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 10000000d ) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 5);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 50000000d ) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 6);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 69000000d ) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 7);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 100000000d ) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 8);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 1000000000d ) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 9);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".FORAGING_EXP") >= 5000000000d) {
			
			config.set(player.getUniqueId() + ".FORAGING_LVL", 10);
			//double new_Farming_lvl = config.getDouble(player.getUniqueId() + ".FORAGING_LVL");
			
			//player.sendMessage("§aUnlocked Farming Level: " + new_Farming_lvl);
			
		}
		if(config.get(player.getUniqueId() + ".Notifications") == "on") {
			double new_foraging_exp = config.getDouble(player.getUniqueId() + ".FORAGING_EXP");
			player.sendMessage("§a Foraging-XP: " + new_foraging_exp);
		}
		
	} 

}
