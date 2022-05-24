package net.minigameheaven.kitpvp.commands;

import net.minigameheaven.kitpvp.items.MenuItems;
import net.minigameheaven.kitpvp.menus.MenuManager;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;

@CommandMeta(description = "Games command")
public class GamesCommand extends CoreCommand {

    public GamesCommand() {
        super("games");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	// Reload Items
    	MenuItems.createSkyblockBlock();
    	MenuItems.createKitpvpDirt();
    	// Reload Menu
    	MenuManager.createGamesMenu();
    	// Open Menu
    	player.openInventory(MenuManager.Games);
    }
}