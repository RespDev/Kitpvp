package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;
import net.minigameheaven.kitpvp.items.PlayerItems;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;
import network.palace.core.player.Rank;

@CommandMeta(description = "Gives the executor enchanted gold!")
public class TestEnchantedGoldCommand extends CoreCommand {

    public TestEnchantedGoldCommand() {
        super("testenchantedgold");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	if (player.getRank().getRankId() >= Rank.DEVELOPER.getRankId()) {
			player.sendMessage(ChatColor.YELLOW + "Giving you 1 enchanted gold!");
        	player.addToInventory(PlayerItems.enchantedGold);
    	}
    	else {
    		player.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
    	}
    }
}