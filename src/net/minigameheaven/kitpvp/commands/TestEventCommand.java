package net.minigameheaven.kitpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.minigameheaven.kitpvp.scoreboard.PvPScoreboard;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;

@CommandMeta(description = "Runs a test event!")
public class TestEventCommand extends CoreCommand {

    public TestEventCommand() {
        super("testevent");
    }

    @Override
    protected void handleCommandUnspecific(CommandSender sender, String[] args) throws CommandException {
    	if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "Attempting to run the event...");
			Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "EVENT" + ChatColor.RESET + "" + ChatColor.GRAY + " In 2 minutes test will happen in the end area!");
			for (Player o : Bukkit.getOnlinePlayers())
				// Reset scoreboard
				PvPScoreboard.createPvPScoreboard(o, false, "Event", true, ChatColor.RED + "Test", 0);
			return;
    	}
    	sender.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
    	return;
    }
}