package net.minigameheaven.kitpvp.items;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerItems {

	/**
	 * Custom items for normal Players
	 */
	
	public static ItemStack buz;
	public static ItemStack enchantedGold;
	
	public static void createBuzzy() {
		// Buzzy
		ItemStack buzzy = new ItemStack(Material.GOLD_SWORD);
		ItemMeta buzzymeta = buzzy.getItemMeta();
		buzzymeta.setDisplayName(ChatColor.GOLD + "Buzzy");
		buzzymeta.addEnchant(Enchantment.LUCK, 1, false);
		buzzymeta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
		List<String> lo = new ArrayList<>();
		lo.add(ChatColor.GREEN + "Ability: Zap");
		lo.add(ChatColor.GREEN + "Strike lightning when you");
		lo.add(ChatColor.GREEN + "hit your opponent!");
		lo.add(ChatColor.GRAY + "Cooldown 2 seconds");
		lo.add("");
		lo.add(ChatColor.LIGHT_PURPLE + "Crafted from enchanted gold");
		buzzymeta.setUnbreakable(true);
		buzzymeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
		buzzymeta.setLore(lo);
		buzzy.setItemMeta(buzzymeta);
		buz = buzzy;
	}
	
	public static void createEnchantedGold() {
		// Buzzy
		ItemStack ec = new ItemStack(Material.GOLD_BLOCK);
		ItemMeta ecmeta = ec.getItemMeta();
		ecmeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "ENCHANTED GOLD");
		ecmeta.addEnchant(Enchantment.LUCK, 1, false);
		ecmeta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
		List<String> lo = new ArrayList<>();
		lo.add(ChatColor.RED + "" + ChatColor.BOLD + "VERY RARE");
		ecmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
		ecmeta.setLore(lo);
		ec.setItemMeta(ecmeta);
		enchantedGold = ec;
	}
}
