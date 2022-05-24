package net.minigameheaven.kitpvp.commands;

import net.minigameheaven.kitpvp.menus.MenuManager;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;

@CommandMeta(description = "Kit command")
public class ShopCommand extends CoreCommand {

    public ShopCommand() {
        super("shop");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	player.openInventory(MenuManager.Shop);
    }
}