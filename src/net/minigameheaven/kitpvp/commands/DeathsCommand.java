package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;

import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;

@CommandMeta(description = "Deaths command")
public class DeathsCommand extends CoreCommand {

    public DeathsCommand() {
        super("deaths");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	int deaths = 0;
    	player.sendMessage(ChatColor.GREEN + "Deaths: " + deaths);
    }
}
