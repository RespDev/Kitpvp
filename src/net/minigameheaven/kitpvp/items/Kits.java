package net.minigameheaven.kitpvp.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Kits {
	/**
	 * Custom kits
	 */
	
	// Normal Kit
	public static ItemStack Normalhelmet;
	public static ItemStack Normalchest;
	public static ItemStack Normalleggings;
	public static ItemStack Normalboots;
	public static ItemStack steak;
	public static ItemStack Normalbow;
	public static ItemStack Normalsword;
	
	public static void createNormalHat() {
		ItemStack hat = new ItemStack(Material.IRON_HELMET);
		Normalhelmet = hat;
	}	
	public static void createNormalShirt() {
		ItemStack shirt = new ItemStack(Material.IRON_CHESTPLATE);
		Normalchest = shirt;
	}	
	public static void createNormalPants() {
		ItemStack leg = new ItemStack(Material.IRON_LEGGINGS);
		Normalleggings = leg;
	}
	public static void createNormalShoes() {
		ItemStack shoe = new ItemStack(Material.IRON_BOOTS);
		Normalboots = shoe;
	}
	public static void createNormalFood() {
		ItemStack food = new ItemStack(Material.COOKED_BEEF, 64);
		steak = food;
	}
	public static void createNormalSword() {
		ItemStack weapon = new ItemStack(Material.IRON_SWORD);
		Normalsword = weapon;
	}
	public static void createNormalBow() {
		ItemStack bow = new ItemStack(Material.BOW);
		Normalbow = bow;
	}
	
	// Loads all kits
	public static void loadKits() {
		// Normal kit
		createNormalHat();
		createNormalShirt();
		createNormalPants();
		createNormalShoes();
		createNormalFood();
		createNormalSword();
		createNormalBow();
		// TODO make more kits
	}
}
