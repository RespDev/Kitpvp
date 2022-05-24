package net.minigameheaven.kitpvp.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.minigameheaven.kitpvp.items.MenuItems;
import net.minigameheaven.kitpvp.menus.MenuManager;

public class EnchantListener implements Listener {

	@EventHandler
	public void onUseEnchantingTable(PlayerInteractEvent i) {
		if (i.getClickedBlock().getType() == Material.ENCHANTMENT_TABLE) {
			if (!(i.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
			if (!(i.getClickedBlock().getType() == Material.ENCHANTMENT_TABLE)) return;
			i.setCancelled(true);
			Player p = (Player) i.getPlayer();
			MenuItems.createEnchantingButton();
			p.openInventory(MenuManager.Enchanting);
			return;
		}
	}
}
