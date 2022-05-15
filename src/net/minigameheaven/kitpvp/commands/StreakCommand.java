package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;

@CommandMeta(description = "Kills command")
public class StreakCommand extends CoreCommand {

    public StreakCommand() {
        super("streak");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	int streak = 0;
    	player.sendMessage(ChatColor.GREEN + "Streak: " + streak);
    }
}
