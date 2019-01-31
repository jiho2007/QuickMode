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

public abstract class Command implements ICommand {
	
	String usage = EnumChatFormatting.RED + "Usage: /" + this.getCommandName() + " <mode>";
	
	String colormsg = ColorCode.get("6") + "QuickMode" + ColorCode.get("b") + " :: " + ColorCode.get("3") + this.usage; 
	
    @Override
    public abstract String getCommandName();

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return this.usage;
    }

    @Override
    public List<String> getCommandAliases() {
        return Arrays.asList();
    }

    @Override
    public abstract void processCommand(ICommandSender sender, String[] args) throws CommandException;

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
	
	public void process(String[] args, Mode d) {
		if(args.length == 1) {
			String m = args[0];
			if(d.haveMode(m)) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage("/play " + d.getMode(m));
				return;
			}
		}
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(this.colormsg));
	}
	
}
