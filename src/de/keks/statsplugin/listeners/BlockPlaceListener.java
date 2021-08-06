package de.keks.statsplugin.listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.metadata.FixedMetadataValue;

import de.keks.statsplugin.main.Main;

public class BlockPlaceListener implements Listener{
	
	@EventHandler
	public void blockPlaced(BlockPlaceEvent event) {
	Block block = event.getBlock();
	block.setMetadata("PLACED", new FixedMetadataValue(Main.getPlugin(), "blockisplaced"));
	}

}
