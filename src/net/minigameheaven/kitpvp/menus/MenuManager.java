package net.minigameheaven.kitpvp.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

import net.minigameheaven.kitpvp.items.MenuItems;

public class MenuManager {

	public static Inventory Shop;
	public static Inventory Games;
	public static Inventory Enchanting;
	
	public static void createShop() {
		Shop = Bukkit.createInventory(null, 27, ChatColor.DARK_GRAY + "Items");
		Shop.setItem(10, MenuItems.shopSword);
		Shop.setItem(11, MenuItems.shopObsidian);
		Shop.setItem(15, MenuItems.shopChestplate);
		Shop.setItem(16, MenuItems.shopBoots);
	}
	
	public static void createGamesMenu() {
		Games = Bukkit.createInventory(null, 27, ChatColor.DARK_GRAY + "Games");
		Games.setItem(12, MenuItems.gamesSkyblock);
		Games.setItem(13, MenuItems.gamesKitpvp);
		Games.setItem(14, MenuItems.shopSword);
	}
	
	public static void createEnchantMenu() {
		Enchanting = Bukkit.createInventory(null, 45, ChatColor.DARK_GRAY + "Enchanting");
		// First Row
		Enchanting.setItem(10, MenuItems.menuGlass);
		Enchanting.setItem(11, MenuItems.menuGlass);
		Enchanting.setItem(12, MenuItems.menuGlass);
		
		// Second Row
		Enchanting.setItem(19, MenuItems.menuGlass);
		Enchanting.setItem(21, MenuItems.menuGlass);
		// Enchanting Button
		Enchanting.setItem(24, MenuItems.enchantingButton);
		
		// Third Row
		Enchanting.setItem(28, MenuItems.menuGlass);
		Enchanting.setItem(29, MenuItems.menuGlass);
		Enchanting.setItem(30, MenuItems.menuGlass);
	}
	
	public static void loadMenus() {
		createShop();
		createGamesMenu();
		createEnchantMenu();
	}
}
