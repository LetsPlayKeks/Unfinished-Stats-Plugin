package de.keks.statsplugin.listeners;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.keks.statsplugin.main.Main;

public class PickaxeClickListener implements Listener{
	
	@EventHandler
	public void onItemInteract (PlayerInteractEvent event) {
		if(event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) return;
		Player player = event.getPlayer();
		//player.sendMessage("throw 1");
		//ItemStack pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
		FileConfiguration config = Main.getPlugin().getConfig();
		ItemStack pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
		
		if(event.getItem() == pickaxe) {
			//player.sendMessage("throw 2");
			if(config.getDouble(player.getUniqueId() + ".MINING_LVL") >= 3) {
				//player.sendMessage("throw 3");
				if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
					//player.sendMessage("throw 4");
					player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 200, 3));
					
				} else return;
				
			} else return;
		}
		
	}
}
