package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;

@CommandMeta(description = "Kills command")
public class KillsCommand extends CoreCommand {

    public KillsCommand() {
        super("kills");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	int kills = 0;
    	player.sendMessage(ChatColor.GREEN + "Kills: " + kills);
    }
}

