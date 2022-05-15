package net.minigameheaven.kitpvp.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Kits {
	/**
	 * Custom kits
	 */
	
	// Normal Kit
	public static ItemStack helmet;
	public static ItemStack chest;
	public static ItemStack leggings;
	public static ItemStack boots;
	public static ItemStack sword;
	public static ItemStack steak;
	
	public static void createHat() {
		ItemStack hat = new ItemStack(Material.IRON_HELMET);
		helmet = hat;
	}	
	public static void createShirt() {
		ItemStack shirt = new ItemStack(Material.IRON_CHESTPLATE);
		chest = shirt;
	}	
	public static void createPants() {
		ItemStack leg = new ItemStack(Material.IRON_LEGGINGS);
		leggings = leg;
	}
	public static void createShoes() {
		ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
		boots = shoe;
	}
	public static void createSword() {
		ItemStack weapon = new ItemStack(Material.IRON_SWORD);
		sword = weapon;
	}
	public static void createFood() {
		ItemStack food = new ItemStack(Material.COOKED_BEEF, 64);
		steak = food;
	}
	
	// Loads all kits
	public static void loadKits() {
		// Normal kit
		createHat();
		createShirt();
		createPants();
		createShoes();
		createSword();
		createFood();
		// TODO make more kits
	}
}
