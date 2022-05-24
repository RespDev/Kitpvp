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
    	player.setHelmet(Kits.Normalhelmet);
    	player.setChestplate(Kits.Normalchest);
    	player.setLeggings(Kits.Normalleggings);
    	player.setBoots(Kits.Normalboots);
    	player.addToInventory(Kits.Normalsword);
    	player.addToInventory(Kits.steak);
    	player.setInventorySlot(8, Kits.Normalbow);
    }
}
