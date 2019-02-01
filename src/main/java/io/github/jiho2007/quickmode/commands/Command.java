package io.github.jiho2007.quickmode.commands;

import io.github.jiho2007.quickmode.QuickMode;
import io.github.jiho2007.quickmode.data.Mode;
import io.github.jiho2007.quickmode.utils.ColorCode;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentText;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.net.URL;
import java.io.IOException;

public class Command implements ICommand {
	
	String usage;
	String colormsg = ColorCode.get("6") + "QuickMode" + ColorCode.get("b") + " :: " + ColorCode.get("3") + this.usage; 
	String name;
	String file;
	
	public Command(String name, String file) {
		this.name = name;
		this.file = file;
		usage = EnumChatFormatting.RED + "Usage: /" + this.name + " <mode>";
	}
	
    @Override
    public String getCommandName() {
		return this.name;
	}

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return this.usage;
    }

    @Override
    public List<String> getCommandAliases() {
        return Arrays.asList();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		Mode d = new Mode(this.file);
		if(args.length == 1) {
			String m = args[0];
			if(d.have(m)) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("/play " + d.get(m));
				return;
			} else if(m == "list" || m == "help") {
				try {
					URL f = new URL(
						"https://raw.githubusercontent.com/jiho2007/QuickMode/master/mode/" + this.file
					);
					Scanner s = new Scanner(f.openStream());
					while(s.hasNext()) {
						String[] q = s.nextLine().split(":");
						String colorlist = ColorCode.get("2") + q[0] + ColorCode.get("b") + " : " + ColorCode.get("4") + q[1];
						Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(colorlist));
					}
				} catch(IOException e) {}
				return;
			}
		}
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(this.colormsg));
	}

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
	
}
