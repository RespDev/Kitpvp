package net.minigameheaven.kitpvp;

import network.palace.core.plugin.Plugin;

import net.minigameheaven.kitpvp.commands.AbuseCommand;
import net.minigameheaven.kitpvp.commands.CreativeCommand;
import net.minigameheaven.kitpvp.commands.DeathsCommand;
import net.minigameheaven.kitpvp.commands.GmCommand;
import net.minigameheaven.kitpvp.commands.ItemCommand;
import net.minigameheaven.kitpvp.commands.KillTestCommand;
import net.minigameheaven.kitpvp.commands.KillsCommand;
import net.minigameheaven.kitpvp.commands.KitCommand;
import net.minigameheaven.kitpvp.commands.StreakCommand;
import net.minigameheaven.kitpvp.commands.SurvivalCommand;
import net.minigameheaven.kitpvp.items.AdminItems;
import net.minigameheaven.kitpvp.items.PlayerItems;
import net.minigameheaven.kitpvp.items.Kits;
import network.palace.core.Core;
import network.palace.core.plugin.PluginInfo;

@PluginInfo(name = "Kitpvp", version = "0.0.1", depend = {"Core"}, canReload=true)
public class Kitpvp extends Plugin {

	@Override
    protected void onPluginEnable() throws Exception {
		Core.logMessage("Kitpvp", "Attempting to load the Kitpvp gamemode");
		registerCommands();
		loadItems();
		Kits.loadKits();
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
		registerCommand(new StreakCommand());
		registerCommand(new KillTestCommand());
		registerCommand(new DeathsCommand());
		registerCommand(new KitCommand());
		
		// Staff commands
		registerCommand(new CreativeCommand());
		registerCommand(new SurvivalCommand());
		registerCommand(new GmCommand());
		registerCommand(new AbuseCommand());
		registerCommand(new ItemCommand());
	}
	private void loadItems() {
		// Admin abuse items
		AdminItems.createFishSlapper();
		// Player items
		PlayerItems.createBuzzy();
	}
}
