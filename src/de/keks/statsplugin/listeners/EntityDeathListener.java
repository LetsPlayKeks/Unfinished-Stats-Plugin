package de.keks.statsplugin.listeners;


import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import de.keks.statsplugin.main.Main;

public class EntityDeathListener implements Listener{
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent event) {
		
		if(event.getEntityType() == null) return;
		if(event.getEntity().getKiller() == null) return;
		if(event.getEntity().getKiller().getType() != EntityType.PLAYER) return;
		
		LivingEntity entity = event.getEntity();
		Player player = entity.getKiller();
		FileConfiguration config = Main.getPlugin().getConfig();
		//player.sendMessage("Entity killed");
		
		
		if(entity.getType() == EntityType.ZOMBIE) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 20d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +20 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.SKELETON) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 30d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +30 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.SPIDER) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 35d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +35 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.CAVE_SPIDER) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 50d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +50 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.CREEPER) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 25d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +25 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.BLAZE) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 70d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +70 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.PIGLIN) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 70d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +70 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.ZOMBIFIED_PIGLIN) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 75d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +75 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.ENDERMAN) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 50d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +50 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.GHAST) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 100d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +100 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.PLAYER) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp - 200d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 -200 Combat-XP");
			
		}
		
		if(entity.getType() == EntityType.ENDER_DRAGON) {
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 69420d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +69420 Combat-XP");
			
		}
		
		if(entity.getType() != EntityType.PLAYER && entity.getType() != EntityType.GHAST && entity.getType() != EntityType.ENDERMAN &&
			 entity.getType() != EntityType.ZOMBIFIED_PIGLIN && entity.getType() != EntityType.PIGLIN && 
			 entity.getType() != EntityType.BLAZE && entity.getType() != EntityType.CREEPER && 
			 entity.getType() != EntityType.CAVE_SPIDER && entity.getType() != EntityType.SPIDER && 
			 entity.getType() != EntityType.SKELETON && entity.getType() != EntityType.ZOMBIE && 
			 entity.getType() != EntityType.ENDER_DRAGON) {
			
			double slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			config.set(player.getUniqueId() + ".SLAYING_EXP", slaying_exp + 1d);
			
			//double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			
			player.sendMessage("§7 +1 Combat-XP");
			
		}
		if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 100d) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 1);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 420d) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 2);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 69000d) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 3);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 777777d) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 4);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 10000000d ) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 5);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 50000000d ) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 6);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 69000000d ) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 7);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 100000000d ) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 8);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 1000000000d ) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 9);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}if(config.getDouble(player.getUniqueId() + ".SLAYING_EXP") >= 5000000000d) {
			
			config.set(player.getUniqueId() + ".SLAYING_LVL", 10);
			//double new_slaying_lvl = config.getDouble(player.getUniqueId() + ".SLAYING_LVL");
			
			//player.sendMessage("§aUnlocked Slaying Level: " + new_slaying_lvl);
			
		}
		if(config.get(player.getUniqueId() + ".Notifications") == "on") {
			double new_slaying_exp = config.getDouble(player.getUniqueId() + ".SLAYING_EXP");
			player.sendMessage("§a Combat-XP: " + new_slaying_exp);
		}
		
		
		
		
	}
}
