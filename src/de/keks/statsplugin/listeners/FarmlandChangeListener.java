package de.keks.statsplugin.listeners;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

import de.keks.statsplugin.main.Main;

public class FarmlandChangeListener implements Listener{

	@EventHandler
	public void onFarmlandDestrtoy(EntityChangeBlockEvent event) {
		
		if(event.getBlock().getType().equals(Material.FARMLAND)) {
			if(event.getTo().equals(Material.DIRT)) {
				if(event.getEntityType() == EntityType.PLAYER) {
					Player player = (Player) event.getEntity();
					FileConfiguration config = Main.getPlugin().getConfig();
					if(config.getDouble(player.getUniqueId() + ".FARMING_LVL") >= 3) {
						event.setCancelled(true);
					}
					
				}
			}
		}
		
	}
	
}
