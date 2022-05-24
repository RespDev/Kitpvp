package net.minigameheaven.kitpvp.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.minigameheaven.kitpvp.scoreboard.PvPScoreboard;

public class JoinListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent j) {
		Player p = (Player) j.getPlayer();
		p.sendMessage(ChatColor.YELLOW + "Welcome to " + ChatColor.BLUE + "" + ChatColor.BOLD + "MINIGAME HEAVEN" + ChatColor.RESET + "" + ChatColor.YELLOW + "\nYou are on the Kitpvp server!");
		// First creation
		String status = ChatColor.GREEN + "Loitering";
		boolean isStreak = false;
		Integer streak = 0;
		boolean isEvent = false;
		String event = "";
		PvPScoreboard.createPvPScoreboard(p, isStreak, status, isEvent, event, streak);
	}
}
