package net.minigameheaven.kitpvp.listeners;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import net.minigameheaven.kitpvp.scoreboard.PvPScoreboard;

public class AttackManager implements Listener {
	
	/**
	 * 
	 * Manages kill streaks and other nice things!
	 * 
	 */
	
	private static boolean eventRunning = false;
	
	Map<String, Integer> streak = new HashMap<String, Integer>();
	
	@EventHandler
	public void onDeath(PlayerDeathEvent d) {
		// TODO Add return here.
		Player DeadPlayer = (Player) d.getEntity();
		Player Killer = (Player) d.getEntity().getKiller();
		String name = Killer.getName();
		String dp = DeadPlayer.getName();
		if (streak.get(name) == null) {
			streak.put(name, 0);
		}
		if (DeadPlayer.isDead()) {
			streak.put(name, streak.get(name) + 1);
			Killer.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "KILL!" + ChatColor.RESET + "" + ChatColor.GRAY + " you killed " + DeadPlayer.getName());
			DeadPlayer.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "DEATH!" + ChatColor.RESET + "" + ChatColor.GRAY + " you were killed by " + Killer.getName());
			// Wipe scoreboard
			String Deadstatus = ChatColor.GREEN + "Loitering";
			boolean DeadisStreak = false;
			Integer Deadstreak = streak.get(name);
			boolean DeadisEvent = false;
			String Deadevent = "";
			PvPScoreboard.createPvPScoreboard(DeadPlayer, DeadisStreak, Deadstatus, DeadisEvent, Deadevent, Deadstreak);
			if (streak.containsKey(dp)) {
				streak.put(dp, 0);
			}
			if (streak.containsKey(name)) {
				if (eventRunning == true) {
					return;
				}
				// Wipe scoreboard
				String status = ChatColor.RED + "Fighting";
				boolean isStreak = true;
				Integer st = streak.get(name);
				boolean isEvent = false;
				String event = "";
				PvPScoreboard.createPvPScoreboard(Killer, isStreak, status, isEvent, event, st);
				
				streak.put(name, streak.get(name) + 1);
				if (streak.get(name) == 5) {
					Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "STREAK!" + ChatColor.RESET + " " + ChatColor.GRAY + name + " of " + ChatColor.RED + streak.get(name) + ChatColor.GRAY + " kills by " + Killer.getName());
				}
				if (streak.get(name) % 10 == 0) {
					String megastreak = ChatColor.AQUA + "" + ChatColor.BOLD + "FISHY";
					PvPScoreboard.createPvPScoreboard(Killer, true, ChatColor.RED + "Fighting", false, "", streak.get(name));
					if (streak.get(name) == 10) {
						Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "STREAK" + ChatColor.RESET + " " + ChatColor.GRAY + name + " has activated " + megastreak);
						return;
					}
					if (streak.get(name) > 10) {
						Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "STREAK" + ChatColor.RESET + " " + ChatColor.YELLOW + name + " has a streak of " + streak.get(name) + " kills");
						return;
					}
				}
				return;
			}
		}
	}
}
