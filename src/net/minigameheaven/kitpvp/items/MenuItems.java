package net.minigameheaven.kitpvp.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuItems {
	
	public static ItemStack shopChestplate;
	public static ItemStack shopBoots;
	public static ItemStack shopSword;
	public static ItemStack shopObsidian;
	
	// Games Menu
	public static ItemStack gamesKitpvp;
	public static ItemStack gamesSkyblock;
	
	// Enchanting Menu
	public static ItemStack menuGlass;
	public static ItemStack enchantingButton;
	
	public static void createDiamondChestplate() {
		ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta chestMeta = chestplate.getItemMeta();
		chestMeta.setUnbreakable(true);
		chestplate.setItemMeta(chestMeta);
		shopChestplate = chestplate;
	}
	
	public static void createDiamondBoots() {
		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta bootMeta = boots.getItemMeta();
		bootMeta.setUnbreakable(true);
		boots.setItemMeta(bootMeta);
		shopBoots = boots;
	}
	
	public static void createDiamondSword() {
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta swordMeta = sword.getItemMeta();
		swordMeta.setUnbreakable(true);
		sword.setItemMeta(swordMeta);
		shopSword = sword;
	}
	
	public static void createObsidian() {
		ItemStack obsidian = new ItemStack(Material.OBSIDIAN, 8);
		shopObsidian = obsidian;
	}
	
	// Games Menu
	public static void createKitpvpDirt() {
		ItemStack dirt = new ItemStack(Material.DIRT, 1);
		ItemMeta dirtmeta = dirt.getItemMeta();
		dirtmeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "KITPVP");
		List<String> lo = new ArrayList<>();
		lo.add(ChatColor.RED + "" + ChatColor.BOLD + "EARLY DEVELOPMENT");
		dirtmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		dirtmeta.setLore(lo);
		dirt.setItemMeta(dirtmeta);
		gamesKitpvp = dirt;
	}
	
	public static void createSkyblockBlock() {
		// Player Count
		int count = Bukkit.getOnlinePlayers().size();
		
		ItemStack skyblock = new ItemStack(Material.GRASS, 1);
		ItemMeta skyblockmeta = skyblock.getItemMeta();
		skyblockmeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "SKYBLOCK");
		List<String> lo = new ArrayList<>();
		lo.add(ChatColor.GREEN + "" + count + " Playing");
		lo.add(ChatColor.GRAY + " ");
		lo.add(ChatColor.RED + "" + ChatColor.BOLD + "EARLY DEVELOPMENT");
		skyblockmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		skyblockmeta.setLore(lo);
		skyblock.setItemMeta(skyblockmeta);
		gamesSkyblock = skyblock;
	}
	
	// Enchanting Menu
	public static void createBMenuGlass() {
		ItemStack m = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 1);
		menuGlass = m;
	}
	public static void createEnchantingButton() {
		ItemStack b = new ItemStack(Material.ENCHANTMENT_TABLE, 1);
		ItemMeta bmeta = b.getItemMeta();
		bmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Click to enchant your items!");
		List<String> lo = new ArrayList<>();
		lo.add(ChatColor.GREEN + "");
		lo.add(ChatColor.LIGHT_PURPLE + "Look around the map to");
		lo.add(ChatColor.LIGHT_PURPLE + "find fresh items to");
		lo.add(ChatColor.LIGHT_PURPLE + "enchant.");
		bmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		bmeta.setLore(lo);
		b.setItemMeta(bmeta);
		enchantingButton = b;		
	}
	
	// TODO Add more!
}
