package io.github.jiho2007.quickmode.commands;

import io.github.jiho2007.quickmode.commands.Command;
import io.github.jiho2007.quickmode.data.Mode;
import io.github.jiho2007.quickmode.data.ModeMY;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class CommandMY extends Command {
	
    @Override
    public String getCommandName() {
        return "my";
    }
	
	@Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		this.process(args, new ModeMY());
	}
	
}
