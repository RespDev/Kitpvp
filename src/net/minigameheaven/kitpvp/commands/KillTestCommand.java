package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;

import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;
import network.palace.core.player.Rank;

@CommandMeta(description = "Kill test command", rank = Rank.DEVELOPER)
public class KillTestCommand extends CoreCommand {

    public KillTestCommand() {
        super("killtest");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	player.sendMessage(ChatColor.RED + "This command is currently in development!");
    }
}

