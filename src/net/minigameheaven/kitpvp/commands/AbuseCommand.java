package net.minigameheaven.kitpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import net.minigameheaven.kitpvp.items.AdminItems;
import net.minigameheaven.kitpvp.items.PlayerItems;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;
import network.palace.core.player.Rank;

@CommandMeta(description = "Crazy item!")
public class AbuseCommand extends CoreCommand {

    public AbuseCommand() {
        super("abuse");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	if (player.getRank().getRankId() >= Rank.LEAD.getRankId()) {
        	player.sendMessage(ChatColor.RED + "Giving you the abuse kit!");
        	Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has abused his permissions!");
        	player.addToInventory(AdminItems.slapper);
        	player.addToInventory(PlayerItems.buz);
    	}
    	else {
    		player.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
    	}
    }
}