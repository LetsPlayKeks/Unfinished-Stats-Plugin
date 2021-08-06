package de.keks.statsplugin.main;


import java.util.ArrayList;

import org.bukkit.Bukkit;
//import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import de.keks.statsplugin.recipes.RecipeLoader;
import de.keks.statsplugin.magicweapons.ItemAbilityHandler;
import de.keks.statsplugin.commands.GetStatsCommand;
import de.keks.statsplugin.commands.NotificationsOffCommand;
import de.keks.statsplugin.commands.NotificationsOnCommand;
import de.keks.statsplugin.commands.SetSlayingEXPCommand;
import de.keks.statsplugin.listeners.BlockBreakFarmListener;
import de.keks.statsplugin.listeners.BlockBreakMineListener;
import de.keks.statsplugin.listeners.BlockPlaceListener;
import de.keks.statsplugin.listeners.EntityDeathListener;
import de.keks.statsplugin.listeners.FarmlandChangeListener;
import de.keks.statsplugin.listeners.PickaxeClickListener;

import org.bukkit.plugin.PluginManager;



public class Main extends JavaPlugin {
	
	public ArrayList<Player> players;
	private static Main plugin;
	
	public void onEnable() {
		
		
		plugin = this;
		//FileConfiguration config = Main.getPlugin().getConfig();
		
		players = new ArrayList<>();
		new RecipeLoader().registerRecipes();
		
		/*for(Player allPlayers : players) {
			config.set(allPlayers.getUniqueId() + ".SLAYING_EXP", config.getDouble(allPlayers.getUniqueId() + ".SLAYING_EXP") + 0.1);
			config.set(allPlayers.getUniqueId() + ".SLAYING_LVL", config.getDouble(allPlayers.getUniqueId() + ".SLAYING_LVL") + 0);
			config.set(allPlayers.getUniqueId() + ".MINING_EXP", config.getDouble(allPlayers.getUniqueId() + ".MINING_EXP") + 0.1);
			config.set(allPlayers.getUniqueId() + ".MINING_LVL", config.getDouble(allPlayers.getUniqueId() + ".MINING_LVL") + 0);
			config.set(allPlayers.getUniqueId() + ".FARMING_EXP", config.getDouble(allPlayers.getUniqueId() + ".FARMING_EXP") + 0.1);
			config.set(allPlayers.getUniqueId() + ".FARMING_LVL", config.getDouble(allPlayers.getUniqueId() + ".FARMING_LVL") + 0);
			config.set(allPlayers.getUniqueId() + ".FORAGING_EXP", config.getDouble(allPlayers.getUniqueId() + ".FORAGING_EXP") + 0.1);
			config.set(allPlayers.getUniqueId() + ".FORAGING_LVL", config.getDouble(allPlayers.getUniqueId() + ".FORAGING_LVL") + 0);
		}*/
		
		//FileConfiguration config = Main.getPlugin().getConfig();
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		System.out.println("PLUGIN WURDE GELADEN!");
		System.out.println("Kekse sind lecker!");
		
		getCommand("stats").setExecutor(new GetStatsCommand());
		getCommand("notificationson").setExecutor(new NotificationsOnCommand());
		getCommand("notifyon").setExecutor(new NotificationsOnCommand());
		getCommand("notificationsoff").setExecutor(new NotificationsOffCommand());
		getCommand("notifyoff").setExecutor(new NotificationsOffCommand());
		getCommand("setslaying").setExecutor(new SetSlayingEXPCommand());


		
		PluginManager pluginManager = Bukkit.getPluginManager();

		//pluginManager.registerEvents(new Class Name(this), this);
		pluginManager.registerEvents(new ItemAbilityHandler(this), this);
		pluginManager.registerEvents(new BlockPlaceListener(), this);
		pluginManager.registerEvents(new BlockBreakMineListener(), this);
		pluginManager.registerEvents(new EntityDeathListener(), this);
		pluginManager.registerEvents(new FarmlandChangeListener(), this);
		pluginManager.registerEvents(new BlockBreakFarmListener(), this);
		pluginManager.registerEvents(new PickaxeClickListener(), this);
		

	}
	
	public void onDisable() {
		//FileConfiguration config = Main.getPlugin().getConfig();
		getConfig().options().copyDefaults(true);
		saveConfig();
				
		System.out.println("PLUGIN WURDE ENTLADEN!");
		System.out.println("Kekse sind lecker gewesen!");

	}
	
	public static Main getPlugin() {
		return plugin;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
}
