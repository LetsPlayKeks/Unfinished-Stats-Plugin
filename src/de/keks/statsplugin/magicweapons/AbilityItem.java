package de.keks.statsplugin.magicweapons;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
//import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.keks.statsplugin.main.Main;


public abstract class AbilityItem {

	private Main plugin;
	      private Material material;
	      private String name;
	      private long cooldown;
	      private double abilityDamage;
	      private int neededSlayingLevel;
	      private int neededMiningLevel;
	      private int neededFarmingLevel;
	      private int neededForagingLevel;
	      private ArrayList<String> abilityActivated;
	      FileConfiguration config = Main.getPlugin().getConfig();
	      
	      public AbilityItem(Main plugin, Material material, String name, long cooldown, double abilityDamage, int neededSlayingLevel, int neededMiningLevel,
	    		  int neededFarmingLevel, int neededForagingLevel) {
	    	  
	      this.plugin = plugin;
	      this.material = material;
	      this.name = name;
	      this.cooldown = cooldown;
	      this.abilityDamage = abilityDamage;
	      this.neededSlayingLevel = neededSlayingLevel;
	      this.neededMiningLevel = neededMiningLevel;
	      this.neededFarmingLevel = neededFarmingLevel;
	      this.neededForagingLevel = neededForagingLevel;
	      this.abilityActivated = new ArrayList<>();
	      }
	    
	      
	      public void abilityActivate(final Player player) {
	      
	      if(config.getDouble(player.getUniqueId() + ".SLAYING_LVL") >= neededSlayingLevel) {
	      if(config.getDouble(player.getUniqueId() + ".MINING_LVL") >= neededMiningLevel) {
	      if(config.getDouble(player.getUniqueId() + ".FARMING_LVL") >= neededFarmingLevel) {
	      if(config.getDouble(player.getUniqueId() + ".FORAGING_LVL") >= neededForagingLevel) {
	    	  	if (!this.abilityActivated.contains(player.getName())) {
	    	  		this.abilityActivated.add(player.getName());
	    	  		abilityEffects(player);
	    	  		//player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.3F, 1.0F);
	    	  		Bukkit.getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable() {
	    	  			public void run() {
	    	  			AbilityItem.this.abilityActivated.remove(player.getName());
	    	  			}
	    	  				},  this.cooldown);
	    	  			} else {
	    	  				player.sendMessage("§4Ability is not ready yet.");
	    	  			}
	        		} 
	      }
	      }
	      }
	      }
	    
	    
	    
	    
	      
	    public Material getMaterial() { return this.material; }
	    
	    public String getName() { return this.name; }
	      
	    public double getAbilityDamage() { return this.abilityDamage; }
	      
	    public abstract void abilityEffects(Player paramPlayer);
	
}
