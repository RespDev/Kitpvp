package net.minigameheaven.kitpvp.commands;

import net.minigameheaven.kitpvp.commands.item.GiveCommand;
import net.minigameheaven.kitpvp.commands.item.HelpCommand;
import net.minigameheaven.kitpvp.commands.item.ListCommand;
import network.palace.core.command.CommandMeta;
import network.palace.core.command.CoreCommand;

@CommandMeta(description = "Item command!")
public class ItemCommand extends CoreCommand {

    public ItemCommand() {
        super("item");
        registerSubCommand(new HelpCommand());
        registerSubCommand(new GiveCommand());
        registerSubCommand(new ListCommand());
    }
    
    @Override
    protected boolean isUsingSubCommandsOnly() {
        return true;
    }
}