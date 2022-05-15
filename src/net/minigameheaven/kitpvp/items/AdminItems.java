package net.minigameheaven.kitpvp.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AdminItems {

	/**
	 * Custom items for Admins only!
	 */
	
	public static ItemStack slapper;
	
	public static void createFishSlapper() {
		// Fish Slapper
		ItemStack fishSlapper = new ItemStack(Material.RAW_FISH);
		ItemMeta fishslapmeta = fishSlapper.getItemMeta();
		fishslapmeta.setDisplayName(ChatColor.AQUA + "Fish Slapper");
		fishslapmeta.addEnchant(Enchantment.KNOCKBACK, 100, true);
		List<String> lo = new ArrayList<>();
		lo.add(ChatColor.RED + "" + ChatColor.BOLD + "UNCRAFTABLE");
		fishslapmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		fishslapmeta.setLore(lo);
		fishSlapper.setItemMeta(fishslapmeta);
		slapper = fishSlapper;
	}
}
