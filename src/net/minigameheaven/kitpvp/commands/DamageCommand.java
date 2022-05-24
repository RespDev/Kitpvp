package net.minigameheaven.kitpvp.commands;

import org.bukkit.ChatColor;
import org.bukkit.Statistic;

import network.palace.core.command.CommandException;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;
import network.palace.core.player.CPlayer;

@CommandMeta(description = "Damage command")
public class DamageCommand extends CoreCommand {

    public DamageCommand() {
        super("damage");
    }

    @Override
    protected void handleCommand(CPlayer player, String[] args) throws CommandException {
    	int damage = player.getBukkitPlayer().getStatistic(Statistic.DAMAGE_DEALT);
    	player.sendMessage(ChatColor.GREEN + "Damage Dealt: " + damage);
    }
}
