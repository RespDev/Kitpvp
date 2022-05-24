package net.minigameheaven.kitpvp.listeners;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class AbilityManager implements Listener {

	Map<String, Long> buzzycooldown = new HashMap<String, Long>();
	
	@EventHandler
	public void onAbility(EntityDamageByEntityEvent hit) {
		Player defender = (Player) hit.getEntity();
		Player attacker = (Player) hit.getDamager();
		String name = attacker.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
		
		// Buzzy
		if (name.equals(ChatColor.GOLD + "Buzzy")) {
			Long time = System.currentTimeMillis() / 1000;
			if (buzzycooldown.containsKey(attacker.getName())) {
				if (buzzycooldown.get(attacker.getName()) > time) {
					return;
				}
			}
			buzzycooldown.put(attacker.getName(), time + 2);
			defender.getWorld().strikeLightning(defender.getLocation());
			if (attacker.getLocation() == defender.getLocation()) {
				double ah; 
				ah = attacker.getHealth();
				attacker.setHealth(ah + 1);
			}
		}
		
		// Fish slapper
		if (name.equals(ChatColor.AQUA + "Fish Slapper")) {
			Bukkit.broadcastMessage(ChatColor.AQUA + defender.getName() + " has been slapped by the Fish Slapper!");
		}
		
		// More items comming soon
	}
}
