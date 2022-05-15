package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;
import net.minigameheaven.kitpvp.items.Kits;
import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;

@CommandMeta(description = "Kit command")
public class KitCommand extends CoreCommand {

    public KitCommand() {
        super("kit");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	player.sendMessage(ChatColor.YELLOW + "Giving you kit normal!");
    	player.setHelmet(Kits.helmet);
    	player.setChestplate(Kits.chest);
    	player.setLeggings(Kits.leggings);
    	player.setBoots(Kits.boots);
    	player.addToInventory(Kits.sword);
    	player.addToInventory(Kits.steak);
    }
}
