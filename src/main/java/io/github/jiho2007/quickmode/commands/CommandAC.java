package io.github.jiho2007.quickmode.commands;

import io.github.jiho2007.quickmode.commands.Command;
import io.github.jiho2007.quickmode.data.Mode;
import io.github.jiho2007.quickmode.data.ModeAC;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class CommandAC extends Command {
	
    @Override
    public String getCommandName() {
        return "ac";
    }
	
	@Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		this.process(args, new ModeAC());
	}
	
}
