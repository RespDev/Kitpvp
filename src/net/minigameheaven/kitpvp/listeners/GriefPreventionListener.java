package net.minigameheaven.kitpvp.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class GriefPreventionListener implements Listener {
	
	@EventHandler
	public void onBreakBlock(BlockBreakEvent b) {
		if (b.getPlayer().getGameMode() == GameMode.SURVIVAL) {
			b.setCancelled(true);
			return;
		}
		
	}
}
