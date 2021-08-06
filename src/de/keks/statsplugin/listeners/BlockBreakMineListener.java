package de.keks.statsplugin.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import de.keks.statsplugin.main.Main;


public class BlockBreakMineListener implements Listener{
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		
		Player player = event.getPlayer();
		FileConfiguration config = Main.getPlugin().getConfig();
		//player.sendMessage("Block broken");
		
		Block block = event.getBlock();
		Material blockType = block.getType();
		if(block.getMetadata("PLACED") == null) return;
		if(block.getType() == null) return;
		//player.sendMessage("Block broken2");
		
		
		if(block.getMetadata("PLACED") != null) {
			if(blockType == Material.STONE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 50);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +50 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
			
			if(blockType == Material.DIAMOND_ORE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 1500);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +1500 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
			
			if(blockType == Material.IRON_ORE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 500);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +500 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
				
			if(blockType == Material.REDSTONE_ORE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 750);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +750 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.LAPIS_ORE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 750);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +750 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
			/*
			if(block.getType() == Material.GRANITE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 10);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +10 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}*/
		
			if(blockType == Material.DIORITE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 100);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +100 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.ANDESITE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 100);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +100 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.BASALT) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 150);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +150 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.NETHERRACK) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 50);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +50 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.BLACKSTONE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 150);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +150 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.SANDSTONE) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 50);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +50 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.DIRT) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 50);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +50 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.SAND) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 80);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +80 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
		
			if(blockType == Material.GRAVEL) {
				double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 90);
				//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§7 +90 Mining-XP");
				//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
			if(block.getType() != Material.STONE && block.getType() != Material.DIAMOND_ORE && block.getType() != Material.IRON_ORE &&
					 block.getType() != Material.REDSTONE_ORE && block.getType() != Material.LAPIS_ORE && 
					 block.getType() != Material.GRANITE && block.getType() != Material.DIORITE && 
					 block.getType() != Material.ANDESITE && block.getType() != Material.BASALT && 
					 block.getType() != Material.NETHERRACK && block.getType() != Material.BLACKSTONE && 
					 block.getType() != Material.SANDSTONE && block.getType() != Material.DIRT && 
					 block.getType() != Material.SAND && block.getType() != Material.GRAVEL) {
					
					double mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
					config.set(player.getUniqueId() + ".MINING_EXP", mining_exp + 10d);
					
					//double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
					
					player.sendMessage("§7 +1 Mining-XP");
					//player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
			if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 1000d) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 1);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 4200d) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 2);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 69000d) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 3);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 777777d) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 4);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 10000000d ) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 5);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 50000000d ) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 6);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 69000000d ) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 7);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 100000000d ) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 8);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 1000000000d ) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 9);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}if(config.getDouble(player.getUniqueId() + ".MINING_EXP") >= 5000000000d) {
				
				config.set(player.getUniqueId() + ".MINING_LVL", 10);
				//double new_MINING_lvl = config.getDouble(player.getUniqueId() + ".MINING_LVL");
				
				//player.sendMessage("§aUnlocked MINING Level: " + new_MINING_lvl);
				
			}
			if(config.get(player.getUniqueId() + ".Notifications") == "on") {
				double new_mining_exp = config.getDouble(player.getUniqueId() + ".MINING_EXP");
				player.sendMessage("§a Mining-XP: " + new_mining_exp);
			}
			
			
		}
	} 

}
