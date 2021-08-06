package de.keks.statsplugin.magicweapons;

import de.keks.statsplugin.main.Main;
import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
//import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
	     
	     
	     public class ItemAbilityHandler
	       implements Listener
	     {
	       private ArrayList<AbilityItem> abilityItems;
	       FileConfiguration config = Main.getPlugin().getConfig();
	       
	       public ItemAbilityHandler(Main plugin) {
	       this.abilityItems = new ArrayList<>();
	       this.abilityItems.add(new JalapenoSword(plugin, Material.WOODEN_SWORD, "§l§cJalapeno Sword", 20L, 4.0D, 2, 0, 0, 0));
	       
	       }
	     
	     
	       
	       @EventHandler
	       public void handleWeaponShot(PlayerInteractEvent event) {
	    	
	        //if (event.getAction() != Action.RIGHT_CLICK_AIR) return;  
	       AbilityItem abilityItem = checkAbilityItemMaterial(event.getItem().getType(), event.getItem().getItemMeta().getDisplayName());
	       if (abilityItem != null) {
	    	   abilityItem.abilityActivate(event.getPlayer());
	         }
	       }
	       
	       @EventHandler
	       public void handleWeaponDamage(EntityDamageByEntityEvent event) {
	       if (!(event.getDamager() instanceof Projectile))
	         return;  Projectile projectile = (Projectile)event.getDamager();
	       if (!(projectile.getShooter() instanceof Player))
	         return;  Player player = (Player)projectile.getShooter();
	       @SuppressWarnings("deprecation")
	       AbilityItem abilityItem = checkAbilityItemMaterial(player.getItemInHand().getType(), player.getItemInHand().getItemMeta().getDisplayName());
	       if (abilityItem != null) {
	         event.setDamage(abilityItem.getAbilityDamage());
	         }
	       }
	     
	       
	       private AbilityItem checkAbilityItemMaterial(Material material, String name) {
	       for (AbilityItem current : this.abilityItems) {
	         if (current.getMaterial() == material) {
	        	 if(current.getName() == name) {
	           return current;
	           }
	       	 }
	         } 
	       return null;
	       }
	     
	     
}
