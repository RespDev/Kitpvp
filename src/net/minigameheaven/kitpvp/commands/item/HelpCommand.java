package net.minigameheaven.kitpvp.commands.item;

import org.bukkit.ChatColor;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;
import network.palace.core.player.Rank;

@CommandMeta(description = "Help Command!")
public class HelpCommand extends CoreCommand {

    public HelpCommand() {
        super("help");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {     
    	if (player.getRank().getRankId() >= Rank.LEAD.getRankId()) {
    		player.sendMessage(ChatColor.GREEN + "---------------------");
    		player.sendMessage(ChatColor.GREEN + "/item help - Displays this menu.");
    		player.sendMessage(ChatColor.GREEN + "/item give [name] - Gives you items.");
    		player.sendMessage(ChatColor.GREEN + "/item list - Opens a menu with all the items.");
    		player.sendMessage(ChatColor.GREEN + "---------------------");
    	}
    	else {
    		player.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
    	}
    }
}