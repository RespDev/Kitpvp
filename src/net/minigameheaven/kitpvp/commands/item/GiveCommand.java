package net.minigameheaven.kitpvp.commands.item;

import org.bukkit.ChatColor;
import net.minigameheaven.kitpvp.items.PlayerItems;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;
import network.palace.core.player.Rank;

@CommandMeta(description = "Give command!")
public class GiveCommand extends CoreCommand {

    public GiveCommand() {
        super("give");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {     
    	if (player.getRank().getRankId() >= Rank.LEAD.getRankId()) {
    		if (args.length <= 0) {
    			if (args[0].equalsIgnoreCase("buzzy")) {
    				player.sendMessage(ChatColor.YELLOW + "Giving you the " + args[0].toLowerCase() + " item!");
    	        	player.addToInventory(PlayerItems.buz);
    			}
    			else {
    	    		player.sendMessage(ChatColor.GREEN + "---------------------");
    	    		player.sendMessage(ChatColor.GREEN + "/item help - Displays this menu.");
    	    		player.sendMessage(ChatColor.GREEN + "/item give [name] - Gives you items.");
    	    		player.sendMessage(ChatColor.GREEN + "/item list - Opens a menu with all the items.");
    	    		player.sendMessage(ChatColor.GREEN + "---------------------");
    			}
    		}
    		else {
        		player.sendMessage(ChatColor.GREEN + "---------------------");
        		player.sendMessage(ChatColor.GREEN + "/item help - Displays this menu.");
        		player.sendMessage(ChatColor.GREEN + "/item give [name] - Gives you items.");
        		player.sendMessage(ChatColor.GREEN + "/item list - Opens a menu with all the items.");
        		player.sendMessage(ChatColor.GREEN + "---------------------");
    		}
    	}
    	else {
    		player.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
    	}
    }
}