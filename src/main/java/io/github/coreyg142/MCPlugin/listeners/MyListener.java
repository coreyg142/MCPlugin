package io.github.coreyg142.MCPlugin.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class MyListener implements Listener {

	@EventHandler
	public void onDiamondHoeBreakObsidian(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Material block = event.getBlock().getType();
		World world = player.getWorld();
		Location loc = player.getLocation();


		if (player.getInventory().getItemInMainHand().getType() == Material.DIAMOND_HOE && block == Material.OBSIDIAN) {
			world.spawnEntity(loc, EntityType.WITHER);
		}
	}

}

