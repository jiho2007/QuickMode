package io.github.jiho2007.quickmode.commands;

import io.github.jiho2007.quickmode.commands.*;

import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;

import java.util.Arrays;
import java.util.List;

public class RegisterCMD  {
	
	public static void register() {
		ClientCommandHandler.instance.registerCommand(new CommandBW());
		ClientCommandHandler.instance.registerCommand(new CommandSW());
		ClientCommandHandler.instance.registerCommand(new CommandAC());
		ClientCommandHandler.instance.registerCommand(new CommandMY());
	}
	
}
