package net.minigameheaven.kitpvp.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class PvPScoreboard {
	
	public static String createSpace() {
		String space = ChatColor.WHITE + " " + ChatColor.translateAlternateColorCodes('&', "&f");
		return space;
	}
	
	public static void createPvPScoreboard(Player p, Boolean isStreak, String status, Boolean isEvent, String event, Integer streak) {
		ScoreboardManager PvPM = Bukkit.getScoreboardManager();
		Scoreboard PvPBoard = PvPM.getNewScoreboard();
		Objective PvPO = PvPBoard.registerNewObjective("PvP", "dummy");
		PvPO.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "KITPVP");
		PvPO.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		if (!isEvent == true) {
			// Empty
			Score s11 = PvPO.getScore(ChatColor.YELLOW + ChatColor.translateAlternateColorCodes('&', "&c&l&c&c "));
			s11.setScore(11);
		}
		
		// Check if event
		if (isEvent == true) {
			Score s4e = PvPO.getScore(ChatColor.WHITE + " " + ChatColor.DARK_RED + "   ");
			s4e.setScore(13);
			
			Score s3e = PvPO.getScore(ChatColor.WHITE + "Event: " + ChatColor.RED + "" + ChatColor.BOLD + event);
			s3e.setScore(12);
			
			Score s2e = PvPO.getScore(ChatColor.DARK_PURPLE + "   " + ChatColor.translateAlternateColorCodes('&', "&f"));
			s2e.setScore(11);
		}
		
		// Player prestige
		Score s10s = PvPO.getScore(ChatColor.WHITE + "Prestige: " + ChatColor.AQUA + "0");
		s10s.setScore(10);
		
		// Player level
		Score s9 = PvPO.getScore(ChatColor.WHITE + "Level: " + ChatColor.GRAY + "[0]");
		s9.setScore(9);
		
		// Player xp
		Score s8 = PvPO.getScore(ChatColor.WHITE + "XP Needed: " + ChatColor.AQUA + "6");
		s8.setScore(8);
		
		Score s7 = PvPO.getScore(ChatColor.DARK_GREEN + "    " + "" + ChatColor.RED + "  ");
		s7.setScore(7);
		
		
		// Displays the players money
		String money = "10,000";
		Score s6 = PvPO.getScore(ChatColor.WHITE + "Money: " + ChatColor.GOLD + money);
		s6.setScore(6);
		
		// Empty
		Score s5 = PvPO.getScore(ChatColor.YELLOW + ChatColor.translateAlternateColorCodes('&', "&c&l&c&c ") + ChatColor.GRAY + "  ");
		s5.setScore(5);
		
		// Player status
		Score s4 = PvPO.getScore(ChatColor.WHITE + "Status: " + status);
		s4.setScore(4);
		
		if (isStreak == true && isEvent == false) {
			// Load streak
			Score s3 = PvPO.getScore(ChatColor.WHITE + "Streak: " + streak);
			s3.setScore(3);
		}
				
		Score s2 = PvPO.getScore(ChatColor.WHITE + " " + ChatColor.translateAlternateColorCodes('&', "&f"));
		s2.setScore(2);

		Score s1 = PvPO.getScore(ChatColor.YELLOW + "Playing: Kitpvp");
		s1.setScore(1);
		
		// Set scoreboard
		p.setScoreboard(PvPBoard);
		}
	}