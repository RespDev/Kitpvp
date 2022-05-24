package net.minigameheaven.kitpvp;

import net.minigameheaven.kitpvp.commands.AbuseCommand;
import net.minigameheaven.kitpvp.commands.CreativeCommand;
import net.minigameheaven.kitpvp.commands.DamageCommand;
import net.minigameheaven.kitpvp.commands.DeathsCommand;
import net.minigameheaven.kitpvp.commands.GamesCommand;
import net.minigameheaven.kitpvp.commands.GmCommand;
import net.minigameheaven.kitpvp.commands.ItemCommand;
import net.minigameheaven.kitpvp.commands.KillsCommand;
import net.minigameheaven.kitpvp.commands.KitCommand;
import net.minigameheaven.kitpvp.commands.ShopCommand;
import net.minigameheaven.kitpvp.commands.SurvivalCommand;
import net.minigameheaven.kitpvp.commands.TestEnchantedGoldCommand;
import net.minigameheaven.kitpvp.commands.TestEventCommand;
import net.minigameheaven.kitpvp.items.AdminItems;
import net.minigameheaven.kitpvp.items.Kits;
import net.minigameheaven.kitpvp.items.MenuItems;
import net.minigameheaven.kitpvp.items.PlayerItems;
import net.minigameheaven.kitpvp.listeners.AbilityManager;
import net.minigameheaven.kitpvp.listeners.AttackManager;
import net.minigameheaven.kitpvp.listeners.EnchantListener;
import net.minigameheaven.kitpvp.listeners.GriefPreventionListener;
import net.minigameheaven.kitpvp.listeners.JoinListener;
import net.minigameheaven.kitpvp.listeners.ShopInvClickListener;
import net.minigameheaven.kitpvp.menus.MenuManager;
import network.palace.core.plugin.Plugin;
import network.palace.core.Core;
import network.palace.core.plugin.PluginInfo;

@PluginInfo(name = "Kitpvp", version = "0.0.1", depend = {"Core"}, canReload=true)
public class Kitpvp extends Plugin {

	@Override
    protected void onPluginEnable() throws Exception {
		Core.logMessage("Kitpvp", "Attempting to load the Kitpvp gamemode");
		loadItems();
		registerCommands();
		registerEvents();
		Kits.loadKits();
		MenuManager.loadMenus();
    }

	@Override
    protected void onPluginDisable() throws Exception {
		Core.logMessage("Kitpvp", "Disabling the Kitpvp gamemode");
    }
	
	private void registerCommands() {
		Core.logMessage("Kitpvp", "Loading commands");
		// Player commands
		// TODO Finish the statistic commands!
		registerCommand(new KillsCommand());
		registerCommand(new DamageCommand());
		registerCommand(new DeathsCommand());
		registerCommand(new KitCommand());
		
		// Staff commands
		registerCommand(new CreativeCommand());
		registerCommand(new SurvivalCommand());
		registerCommand(new GmCommand());
		registerCommand(new AbuseCommand());
		registerCommand(new ItemCommand());
		registerCommand(new TestEnchantedGoldCommand());
		registerCommand(new TestEventCommand());
		registerCommand(new ShopCommand());
		registerCommand(new GamesCommand());
	}
	private void loadItems() {
		// Admin abuse items
		AdminItems.createFishSlapper();
		// Player items
		// Swordsd
		PlayerItems.createBuzzy();
		// Currency
		PlayerItems.createEnchantedGold();
		// Menu items
		MenuItems.createDiamondBoots();
		MenuItems.createDiamondChestplate();
		MenuItems.createDiamondSword();
		MenuItems.createObsidian();
		
		// Games Menu
		MenuItems.createSkyblockBlock();
		MenuItems.createKitpvpDirt();
		
		// Enchanting Menu
		MenuItems.createEnchantingButton();
		MenuItems.createBMenuGlass();
	}
	private void registerEvents() {
		Core.logMessage("Kitpvp", "Registering events");
		// Manager's
		registerListener(new AbilityManager());
		registerListener(new AttackManager());
		// Listener's
		registerListener(new JoinListener());
		registerListener(new EnchantListener());
		registerListener(new GriefPreventionListener());
		registerListener(new ShopInvClickListener());
	}
}
