package net.minigameheaven.kitpvp.commands.item;

import org.bukkit.ChatColor;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;
import network.palace.core.player.Rank;

@CommandMeta(description = "List command!")
public class ListCommand extends CoreCommand {

    public ListCommand() {
        super("list");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {     
    	if (player.getRank().getRankId() >= Rank.LEAD.getRankId()) {
    		player.sendMessage(ChatColor.RED + "Sorry " + player.getName() + " if you really want this soon just spam Res! - Res");
    	}
    	else {
    		player.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
    	}
    }
}