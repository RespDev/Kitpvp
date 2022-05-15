package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;
import network.palace.core.player.Rank;

@CommandMeta(description = "Gm command")
public class GmCommand extends CoreCommand {

    public GmCommand() {
        super("gm");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	if (player.getRank().getRankId() >= Rank.CM.getRankId()) {
    		if (player.getGamemode() == GameMode.CREATIVE) {
    			player.setGamemode(GameMode.SURVIVAL);
            	player.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to survival!");
    		}
    		else {
    			player.setGamemode(GameMode.CREATIVE);
            	player.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to creative!");
    		}
    	}
    	else {
    		player.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
    	}
    }
}