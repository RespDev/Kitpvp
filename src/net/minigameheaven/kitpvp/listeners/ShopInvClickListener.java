package net.minigameheaven.kitpvp.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import net.minigameheaven.kitpvp.items.MenuItems;
import net.minigameheaven.kitpvp.items.PlayerItems;
import net.minigameheaven.kitpvp.menus.MenuManager;

public class ShopInvClickListener implements Listener {
	
	@EventHandler
	public void onMenuClick(InventoryClickEvent c) {
		if (c.getInventory().equals(MenuManager.Shop)) {
			c.setCancelled(true);
			Player p = (Player) c.getWhoClicked();
			if (c.getSlot() == 10) {
				p.getInventory().addItem(MenuItems.shopSword);
				return;
			}
			if (c.getSlot() == 11) {
				p.getInventory().addItem(MenuItems.shopObsidian);
				return;
			}
			if (c.getSlot() == 15) {
				p.getInventory().addItem(MenuItems.shopChestplate);
				return;
			}
			if (c.getSlot() == 16) {
				p.getInventory().addItem(MenuItems.shopBoots);
				return;
			}
			return;
		}
		if (c.getInventory().equals(MenuManager.Games)) {
			c.setCancelled(true);
			Player p = (Player) c.getWhoClicked();
			if (c.getSlot() == 12) {
				if (p.hasPermission("skyblock.join")) {
					p.sendMessage(ChatColor.GRAY + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
					p.sendMessage(ChatColor.GRAY + "Sending you to the Skyblock dev instance...");
					p.sendMessage(ChatColor.RED + "Connection to the Skyblock dev instance has failed please contact a developer!");
					p.closeInventory();
					return;
				}
				p.sendMessage(ChatColor.RED + "Failed to send you to Skyblock! Because it is currently in maintenance!");
				p.closeInventory();
				return;
			}
			if (c.getSlot() == 13) {
				if (p.hasPermission("kitpvp.join")) {
					p.sendMessage(ChatColor.GRAY + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
					p.sendMessage(ChatColor.GRAY + "Sending you to the Kitpvp dev instance...");
					p.chat("/spawn");
					p.closeInventory();
					return;
				}
				p.sendMessage(ChatColor.RED + "Failed to send you to Kitpvp! Because it is currently in maintenance!");
				p.closeInventory();
				return;
			}
			if (c.getSlot() == 14) {
				p.sendMessage(ChatColor.YELLOW + "Check back later and maybe something will be here!");
				p.closeInventory();
				return;
			}
			return;
		}
		if (c.getInventory().equals(MenuManager.Enchanting)) {
			c.setCancelled(true);
			if (c.getSlot() == 20) {
				c.setCancelled(false);
				return;
			}
			if (c.getSlot() == 24) {
				Player p = (Player) c.getWhoClicked();
				if (c.getInventory().contains(PlayerItems.enchantedGold, 1)); {
					p.sendMessage(ChatColor.LIGHT_PURPLE + "Enchanting...");
					p.sendMessage(ChatColor.GREEN + "Success you have created a Buzzy!");
					Bukkit.broadcastMessage(ChatColor.GRAY + p.getName() + " has created a " + ChatColor.RED + "" + ChatColor.BOLD + "BUZZY" + ChatColor.RESET + "" + ChatColor.GRAY + " sword!");
					p.getInventory().addItem(PlayerItems.buz);
					return;
				}
			}
		}
		return;
	}

}
